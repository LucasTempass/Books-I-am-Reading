package Template;

public abstract class BasePattern {
    
    public BasePattern() { }
    
    protected abstract void explain();
    
    public void showInnerWorkings() {
        System.out.print("||| ");
        explain();
        System.out.print(" |||\n");
        
    }
    
}
