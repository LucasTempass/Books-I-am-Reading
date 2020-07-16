package State;

public class StableVersion implements State {
    
    @Override
    public void test() {
        System.out.println("Receiving bug reports...");
        System.out.println("All tests passed");
    
    }
    
}
