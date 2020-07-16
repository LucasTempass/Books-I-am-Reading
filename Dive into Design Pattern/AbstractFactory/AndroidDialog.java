package AbstractFactory;

public class AndroidDialog implements Dialog {
    private boolean isShowing = false;
    
    public AndroidDialog() {
    }
    
    public void show() {
        System.out.println("\n/*|||||| ANDROID UI DIALOG ||||||||\n|||                             |||\n|||                             |||\n|||                             |||\n|||                             |||\n|||                             |||\n|||                             |||\n|||||||||||||||||||||||||||||||||*/");
        this.isShowing = true;
    }
    
    public void close() {
        if (this.isShowing) {
            System.out.println("Closing dialog");
        }
        
        this.isShowing = false;
    }
}
