package ChainOfResponsability;

public class PasswordValidator extends  TextValidator   {
    
    public PasswordValidator(TextValidator iNext) {
        super(iNext);
    }
    
    @Override
    protected boolean isValid(String text) {
        System.out.println(!text.isEmpty() ? "Password validated" : "Password is not valid");
        return !text.isEmpty();
        
    }
    
}
