package ChainOfResponsability;

public class Demo {
    
    public static void main(String[] args) {
        new EmailValidator(new PasswordValidator(new CredentialsValidator(null))).validate("Lorem Ipsum");
    }
    
}
