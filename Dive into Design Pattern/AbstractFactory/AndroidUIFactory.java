package AbstractFactory;

public class   AndroidUIFactory implements UIFactory {
    
    public AndroidUIFactory() {
    }
    
    public Dialog makeDialog() {
        return new AndroidDialog();
    }
    
    public Button makeButton() {
        return new AndroidButton();
    }
}
