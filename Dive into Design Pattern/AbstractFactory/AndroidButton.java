package AbstractFactory;

public class AndroidButton extends Button {
    public AndroidButton() {
    }
    
    public boolean isPressed() {
        return this.isPressed;
    }
    
    void onClick() {
        System.out.println("Starting intent");
    }
}
