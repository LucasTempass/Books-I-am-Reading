package ChainOfResponsability;

public class EmailValidator extends TextValidator {
    
    public EmailValidator(TextValidator iNext) {
        super(iNext);
    }
    
    @Override
    protected boolean isValid(String text) {
        System.out.println(!text.isEmpty() ? "Email validated" : "Email is not valid");
        return !text.isEmpty();
    }
    
}
