package State;

public class AlphaStage implements State {
    
    @Override
    public void test() {
        System.out.println("Asking testers...");
        System.out.println("Some bugs have been found");
    }
    
}
