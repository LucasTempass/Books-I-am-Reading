package State;

public class Game {
    
    private String title;
    private State stage;
    
    public Game(String iTitle) {
        title = iTitle;
    }
    
    public void runTests(){
        stage.test();
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String iTitle) {
        title = iTitle;
    }
    
    public State getStage() {
        return stage;
    }
    
    public void setStage(State iStage) {
        stage = iStage;
    }
    
}


