package AbstractFactory;

public class Demo {
    
    public static void main(String[] args) {
        AndroidUIFactory iAndroidUIFactory = new AndroidUIFactory();
        iAndroidUIFactory.makeButton().press();
        WebUIFactory iWebUIFactory = new WebUIFactory();
        iWebUIFactory.makeDialog().show();
    
    }
    
}
