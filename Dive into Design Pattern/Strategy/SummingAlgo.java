package Strategy;

public class SummingAlgo implements SquareAlgorithm {
    
    @Override
    public int square(int n) {
        int sum = 0;
        System.out.println("Summed: " + n + " times");
        for (int i = 0; i < n; i++)
            sum += n;
        return sum;
    
    }
    
}
