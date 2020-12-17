package ChainOfResponsability;

public class CredentialsValidator extends TextValidator {
    
    public CredentialsValidator(TextValidator next) {
        super(next);
    }
    
    @Override
    protected boolean isValid(String toValidate) {
        System.out.println(toValidate.isEmpty() ? "Credentials validated" : "Credentials are not valid");
        return toValidate.isEmpty();
        
    }
    
}
