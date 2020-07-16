package Observer;

public class Graph implements Listener {
    
    private String title;
    
    public Graph(String iTitle) {
        title = iTitle;
    }
    
    //||| Data retrieval removed for brevity |||
    @Override
    public void update() {
        System.out.println(title + ": content updated");
    }
    
}
