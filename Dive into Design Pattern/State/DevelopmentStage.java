package State;

public class DevelopmentStage implements State {
    
    @Override
    public void test() {
        System.out.println("Running unit test...");
        System.out.println("A lot of bugs were found");
    }
    
}
