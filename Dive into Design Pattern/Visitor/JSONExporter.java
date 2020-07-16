package Visitor;

public class JSONExporter implements Exporter {
    
    @Override
    public void export(Token iToken) {
        System.out.println("Token {" +
                "d uration: " + iToken.getDuration() +
                ", isAdmin: " + iToken.isAdmin() +
                ", userId: " + iToken.getUserId() +
                " }");
        
    }
    
    @Override
    public void export(LoginCredentials iCredentials) {
        System.out.println("LoginCredentials {" +
                " email: " + iCredentials.getEmail() +
                ", password: " + iCredentials.getPassword() +
                ", userId: " + iCredentials.getUserId() + " }"
        );
        
    }
    
}
