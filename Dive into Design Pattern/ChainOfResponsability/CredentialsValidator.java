package ChainOfResponsability;

public class CredentialsValidator extends TextValidator {
    
    public CredentialsValidator(TextValidator iNext) {
        super(iNext);
    }
    
    @Override
    protected boolean isValid(String text) {
        System.out.println(text.isEmpty() ? "Credentials validated" : "Credentials are not valid");
        return text.isEmpty();
    
    }
    
}
