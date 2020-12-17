package Strategy;

public class MultiplyingAlgo implements SquareAlgorithm {
    
    @Override
    public int square(int n) {
        System.out.println("Multiplied: " + n + " * " + n);
        return n * n;
    
    }
    
}
