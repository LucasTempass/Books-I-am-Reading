package ChainOfResponsability;

public abstract class TextValidator {
    
    private TextValidator nextComponent;
    
    protected TextValidator(TextValidator iNext) {
        nextComponent = iNext;
    }
    
    public void setNext(TextValidator iNext) {
        nextComponent = iNext;
    }
    
    private void next(String iValidatable) {
        if (nextComponent != null)
            nextComponent.validate(iValidatable);
        else System.out.println("Chain completely transversed");
        
    }
    
    protected abstract boolean isValid(String iValidatable);
    
    public void validate(String iValidatable) {
        if (isValid(iValidatable)) next(iValidatable);
        else System.out.println("Validation failed");
        
    }
    
}
