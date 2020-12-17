package ChainOfResponsability;

public abstract class TextValidator {
    
    private TextValidator nextComponent;
    
    protected TextValidator(TextValidator next) {
        nextComponent = next;
    }
    
    private void next(String iValidatable) {
        if (nextComponent != null)
            nextComponent.validate(iValidatable);
        else System.out.println("Chain completely transversed");
        
    }
    
    protected abstract boolean isValid(String toValidate);
    
    public void validate(String toValidate) {
        if (isValid(toValidate))
            next(toValidate);
        else System.out.println("Validation failed");
        
    }
    
}
