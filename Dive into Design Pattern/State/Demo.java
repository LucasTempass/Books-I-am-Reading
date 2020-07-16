package State;

public class Demo {
    
    public static void main(String[] args) {
        Game iGame = new Game("The Lorem Ipsum");
        iGame.setStage(new DevelopmentStage());
        iGame.runTests();
        System.out.println();
        iGame.setStage(new StableVersion());
        iGame.runTests();
    
    }
    
}
