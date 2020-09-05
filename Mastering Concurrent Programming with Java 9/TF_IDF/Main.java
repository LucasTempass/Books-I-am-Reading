package TF_IDF;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Phaser;

public class Main {
    
    public static void main(String[] args) {
        ConcurrentHashMap<String, Word> words = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, Integer> keywords = new ConcurrentHashMap<>();
        File[] files = new File("./Mastering Concurrent Programming with Java 9", "data")
                .listFiles(f -> f.getName().endsWith(".txt"));
        if (files == null && handleNull())
            return;
        var fileList = new ConcurrentLinkedDeque<>(Arrays.asList(files));
        var fileListCopy = new ConcurrentLinkedDeque<>(Arrays.asList(files));
        int numDocuments = files.length;
        int numTasks = Math.min(Runtime.getRuntime().availableProcessors(), numDocuments);
        Phaser phaser = new Phaser(numTasks);
        Thread[] threads = new Thread[numTasks];
        for (int i = 0; i < numTasks; i++)
            (threads[i] = new Thread(new KeywordExtractionTask(fileList, fileListCopy, phaser, words, keywords, fileList.size(), i == 0))).start();
        for (int i = 0; i < numTasks; i++)
            try {
                threads[i].join();
            }
            catch (InterruptedException ignored) { }
        System.out.println("Words Size: " + words.size());
        
    }
    
    private static boolean handleNull() {
        System.err.println("The 'data' folder not found!");
        return true;
    }
    
}
