package TF_IDF;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Phaser;

public class KeywordExtractionTask implements Runnable {
    
    private ConcurrentHashMap<String, Word> globalVoc;
    private ConcurrentHashMap<String, Integer> globalKeywords;
    private ConcurrentLinkedDeque<File> fileList;
    private ConcurrentLinkedDeque<File> fileListCopy;
    private Phaser phaser;
    private boolean isMain;
    private int parsedDocuments;
    private int numDocuments;
    private int id;
    private static int counter = 0;
    
    public KeywordExtractionTask(
            ConcurrentLinkedDeque<File> fileList,
            ConcurrentLinkedDeque<File> fileListCopy,
            Phaser phaser,
            ConcurrentHashMap<String, Word> globalWords,
            ConcurrentHashMap<String, Integer> globalKeywords,
            int numDocuments,
            boolean isMain) {
        this.fileList = fileList;
        this.fileListCopy = fileListCopy;
        this.globalVoc = globalWords;
        this.globalKeywords = globalKeywords;
        this.phaser = phaser;
        this.isMain = isMain;
        this.numDocuments = numDocuments;
        this.id = counter++;
        
    }
    
    private static void addKeyword(Map<String, Integer> globalKeywords, String word) {
        globalKeywords.merge(word, 1, Integer::sum);
    }
    
    @Override
    public void run() {
        File file;
        phaser.arriveAndAwaitAdvance();
        
        while ((file = fileList.poll()) != null) {
            for (Word word : DocumentParser.parse(file.getAbsolutePath()).getContent().values())
                globalVoc.merge(word.getValue(), word, Word::merge);
            parsedDocuments++;
        }
        phaser.arriveAndAwaitAdvance();
        
        while ((file = fileListCopy.poll()) != null)
            DocumentParser.parse(file.getAbsolutePath()).getContent().values()
                          .stream()
                          .peek(word -> word.updateDFRatio(globalVoc.get(word.getValue()).getDF(), numDocuments))
                          .sorted()
                          .limit(10)
                          .forEach(word -> addKeyword(globalKeywords, word.getValue()));
        
        
        if (handleLastPhase())
            globalKeywords
                    .entrySet()
                    .stream()
                    .map(entry -> new Keyword(entry.getKey(), entry.getValue()))
                    .parallel()
                    .sorted()
                    .limit(100)
                    .forEachOrdered(x -> System.out.println(x.getValue() + ": " + x.getDF()));
        
    }
    
    private boolean handleLastPhase() {
        if (isMain)
            phaser.arriveAndAwaitAdvance();
        else
            phaser.arriveAndDeregister();
        return isMain;
        
    }
    
}
