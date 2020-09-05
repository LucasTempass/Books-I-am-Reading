package EditDistance;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Matcher {
    
    public static boolean hasExactMatch(String word, List<String> dictionary) throws InterruptedException, ExecutionException {
        int numCores = Runtime.getRuntime().availableProcessors();
        var executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(numCores);
        int step = dictionary.size() / numCores;
        int startIndex, endIndex;
        List<Future<Match>> futures = new ArrayList<>();
        for (int i = 0; i < numCores; i++) {
            startIndex = i * step;
            if (i == numCores - 1)
                endIndex = dictionary.size();
            else
                endIndex = (i + 1) * step;
            var task = new MatcherTask(startIndex, endIndex, dictionary, word, true);
            futures.add(executor.submit(task));
        }
        executor.shutdown();
        
        for (Future<Match> future : futures)
            if (future.get() != null)
                return true;
        return false;
        
    }
    
    public static Match computeBestMatches(String word, List<String> dictionary) throws InterruptedException, ExecutionException {
        int numCores = Runtime.getRuntime().availableProcessors();
        var executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(numCores);
        int step = dictionary.size() / numCores;
        int startIndex, endIndex;
        List<Future<Match>> futures = new ArrayList<>();
        for (int i = 0; i < numCores; i++) {
            startIndex = i * step;
            if (i == numCores - 1)
                endIndex = dictionary.size();
            else
                endIndex = (i + 1) * step;
            var task = new MatcherTask(startIndex, endIndex, dictionary, word, false);
            futures.add(executor.submit(task));
        }
        executor.shutdown();
        
        List<String> results = new ArrayList<>();
        int minDistance = Integer.MAX_VALUE;
        Match data;
        for (Future<Match> future : futures)
            if ((data = future.get()).getDistance() < minDistance) {
                results.clear();
                minDistance = data.getDistance();
                results.addAll(data.getStoredWords());
            }
            else if (data.getDistance() == minDistance)
                results.addAll(data.getStoredWords());
        return new Match(results, minDistance);
        
    }
    
    public static void main(String[] args) {
    
    }
    
}
