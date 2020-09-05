package EditDistance;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MatcherTask implements Callable<Match> {
    
    private int startIndex;
    private int endIndex;
    private List<String> dictionary;
    private String word;
    private boolean isExactMatch;
    
    public MatcherTask(int startIndex, int endIndex, List<String> dictionary, String word, boolean isExactMatch) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.dictionary = dictionary;
        this.word = word;
        this.isExactMatch = isExactMatch;
        
    }
    
    @Override
    public Match call() {
        var results = new ArrayList<String>();
        int minDistance = Integer.MAX_VALUE;
        int distance;
        for (int i = startIndex; i < endIndex; i++) {
            distance = Levenshtein.computeDistance(word, dictionary.get(i));
            if (distance < minDistance) {
                minDistance = distance;
                results.clear();
                results.add(dictionary.get(i));
            }
            else if (distance == minDistance) results.add(dictionary.get(i));
        }
        if (isExactMatch && minDistance != 0)
            return null;
        return new Match(results, minDistance);
        
    }
    
}