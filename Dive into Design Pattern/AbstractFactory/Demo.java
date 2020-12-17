package AbstractFactory;

public class Demo {
    
    public static void main(String[] args) {
        AndroidUIFactory androidUIFactory = new AndroidUIFactory();
        androidUIFactory.makeButton().press();
        WebUIFactory webUIFactory = new WebUIFactory();
        webUIFactory.makeDialog().show();
    
    }
    
}
