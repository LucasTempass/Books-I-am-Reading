package InvertedIndex;

import java.util.Map;
import java.util.concurrent.*;

public class InvertedIndexTask implements Runnable {
    
    private CompletionService<Document> completionService;
    private ConcurrentHashMap<String, ConcurrentLinkedDeque<String>> invertedIndex;
    
    public InvertedIndexTask(CompletionService<Document> completionService, ConcurrentHashMap<String, ConcurrentLinkedDeque<String>> invertedIndex) {
        this.completionService = completionService;
        this.invertedIndex = invertedIndex;
        
    }
    
    public void run() {
        try {
            Document document;
            while (!Thread.interrupted()) {
                document = completionService.take().get();
                updateInvertedIndex(document.getContent(), invertedIndex, document.getTitle());
                
            }
            while (true) {
                Future<Document> future = completionService.poll();
                if (future == null)
                    break;
                document = future.get();
                updateInvertedIndex(document.getContent(), invertedIndex, document.getTitle());
            }
        }
        catch (InterruptedException | ExecutionException e) { System.out.println("Ended execution."); }
        
    }
    
    private void updateInvertedIndex(Map<String, Integer> content, ConcurrentHashMap<String, ConcurrentLinkedDeque<String>> invertedIndex, String title) {
        for (String word : content.keySet())
            if (word.length() >= 3)
                invertedIndex.computeIfAbsent(word, k -> new ConcurrentLinkedDeque<>()).add(title);
        
    }
    
}
