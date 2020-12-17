package State;

public class Demo {
    
    public static void main(String[] args) {
        Game game = new Game("The Lorem Ipsum");
        game.setStage(new DevelopmentStage());
        game.runTests();
        System.out.println();
        game.setStage(new StableVersion());
        game.runTests();
    
    }
    
}
