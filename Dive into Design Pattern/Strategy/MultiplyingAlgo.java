package Strategy;

public class MultiplyingAlgo implements SquareAlgorithm {
    
    @Override
    public int square(int iNumber) {
        System.out.println("Multiplied: " +iNumber + " * " + iNumber);
        return iNumber * iNumber;
        
    }
    
}
