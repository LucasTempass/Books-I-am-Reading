package AbstractFactory;

public class WebDialog implements Dialog {
    
    private boolean isShowing = false;
    
    public WebDialog() {
    }
    
    public void show() {
        System.out
                .println("\n/*|||||||| WEB UI DIALOG ||||||||||\n|||                             |||\n|||                             |||\n|||               " +
                        "              |||\n|||                             |||\n|||||||||||||||||||||||||||||||||*/");
        this.isShowing = true;
    
    }
    
    public void close() {
        if (this.isShowing)
            System.out.println("Closing dialog");
        this.isShowing = false;
    
    }
    
}
