package AbstractFactory;

public class WebUIFactory implements UIFactory {
    
    public WebUIFactory() {
    }
    
    public Dialog makeDialog() {
        return new WebDialog();
    }
    
    public Button makeButton() {
        return new WebButton();
    }
    
}
