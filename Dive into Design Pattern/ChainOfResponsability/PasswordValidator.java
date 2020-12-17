package ChainOfResponsability;

public class PasswordValidator extends TextValidator {
    
    public PasswordValidator(TextValidator next) {
        super(next);
    }
    
    @Override
    protected boolean isValid(String toValidate) {
        System.out.println(!toValidate.isEmpty() ? "Password validated" : "Password is not valid");
        return !toValidate.isEmpty();
        
    }
    
}
