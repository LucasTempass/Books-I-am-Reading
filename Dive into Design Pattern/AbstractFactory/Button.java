package AbstractFactory;

public abstract class Button {
    
    protected boolean isPressed = false;
    
    public Button() {
    }
    
    public void press() {
        this.onClick();
    }
    
    public boolean isPressed() {
        return this.isPressed;
    }
    
    abstract void onClick();
    
}
