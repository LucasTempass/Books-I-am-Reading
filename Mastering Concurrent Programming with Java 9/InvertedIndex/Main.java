package InvertedIndex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.concurrent.*;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        File[] files = new File("./Mastering Concurrent Programming with Java 9", "data").listFiles();
        if (files == null) {
            System.out.println("No found files");
            return;
        }
        int numOfCores = Math.max(Runtime.getRuntime().availableProcessors() - 1, 1);
        var executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(numOfCores);
        var completionService = new ExecutorCompletionService<Document>(executor);
        var invertedIndex = new ConcurrentHashMap<String, ConcurrentLinkedDeque<String>>();
        
        System.out.println("Starting...");
        for (File file : files) {
            completionService.submit(new IndexingTask(file));
            if (executor.getQueue().size() > 100) {
                do {
                    try {
                        TimeUnit.MILLISECONDS.sleep(50);
                    }
                    catch (InterruptedException ignored) { }
                } while (executor.getQueue().size() > 1000);
            }
        }
        
        Thread thread1 = new Thread(new InvertedIndexTask(completionService, invertedIndex));
        Thread thread2 = new Thread(new InvertedIndexTask(completionService, invertedIndex));
        thread1.start();
        thread2.start();
        executor.shutdown();
        try {
            executor.awaitTermination(20, TimeUnit.SECONDS);
            thread1.interrupt();
            thread2.interrupt();
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        var out = new PrintStream(new File("./Mastering Concurrent Programming with Java 9", "result.txt"));
        invertedIndex.forEach((key, content) -> out.println(key + " : " + content));
        System.out.println("results.txt has been created.");
        
    }
    
}
