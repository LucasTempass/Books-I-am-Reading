package Strategy;

public class SummingAlgo implements SquareAlgorithm {
    
    @Override
    public int square(int iNumber) {
        int sum = 0;
        System.out.println("Summed: " + iNumber + " times");
        for (int i = 0; i < iNumber; i++)
            sum += iNumber;
        return sum;
        
    }
    
}
