package ChainOfResponsability;

public class EmailValidator extends TextValidator {
    
    public EmailValidator(TextValidator next) {
        super(next);
    }
    
    @Override
    protected boolean isValid(String toValidate) {
        System.out.println(!toValidate.isEmpty() ? "Email validated" : "Email is not valid");
        return !toValidate.isEmpty();
    }
    
}
