package EditDistance;

import java.util.List;

public class Match {
    
    private List<String> storedWords;
    private int distance;
    
    public Match(List<String> iStoredWords, int iDistance) {
        storedWords = iStoredWords;
        distance = iDistance;
    }
    
    public List<String> getStoredWords() {
        return storedWords;
    }
    
    public int getDistance() {
        return distance;
    }
    
}
