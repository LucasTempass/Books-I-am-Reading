package Visitor;

public class JSONExporter implements Exporter {
    
    @Override
    public void export(Token token) {
        System.out.println("Token {" +
                "d uration: " + token.getDuration() +
                ", isAdmin: " + token.isAdmin() +
                ", userId: " + token.getUserId() +
                " }");
    
    }
    
    @Override
    public void export(LoginCredentials credentials) {
        System.out.println("LoginCredentials {" +
                " email: " + credentials.getEmail() +
                ", password: " + credentials.getPassword() +
                ", userId: " + credentials.getUserId() + " }"
        );
        
    }
    
}
