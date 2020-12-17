package Visitor;

public class XMLExporter implements Exporter {
    
    @Override
    public void export(Token token) {
        System.out.println("<token>" + "\n" +
                "    <admin>" + token.isAdmin() + "</admin>" + "\n" +
                "    <duration>" + token.getDuration() + "</duration>" + "\n" +
                "    <userid>" + token.getUserId() + "</userid>" + "\n" +
                "</token>");
    
    }
    
    @Override
    public void export(LoginCredentials credentials) {
        System.out.println("<credentials>" + "\n" +
                "    <email>" + credentials.getEmail() + "</email>" + "\n" +
                "    <password>" + credentials.getPassword() + "</password>" + "\n" +
                "    <userid>" + credentials.getUserId() + "</userid>" + "\n" +
                "</credentials>");
        
    }
    
}
