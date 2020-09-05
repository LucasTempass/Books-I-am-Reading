package EditDistance;

public class Levenshtein {
    
    public static int computeDistance(String rowString, String columnString) {
        int[][] distances = new int[rowString.length() + 1][columnString.length() + 1];
        
        for (int i = 1; i <= rowString.length(); i++)
            distances[i][0] = i;
        for (int i = 1; i <= columnString.length(); i++)
            distances[0][i] = i;
        
        for (int i = 1; i <= rowString.length(); i++)
            for (int j = 1; j <= columnString.length(); j++)
                distances[i][j] = (rowString.charAt(i - 1) == columnString.charAt(j - 1))
                                  ? distances[i - 1][j - 1]
                                  : minimum(distances[i - 1][j], distances[i][j - 1], distances[i - 1][j - 1]) + 1;
        return distances[rowString.length()][columnString.length()];
        
    }
    
    private static int minimum(int i, int j, int k) {
        return Math.min(i, Math.min(j, k));
    }
    
}
