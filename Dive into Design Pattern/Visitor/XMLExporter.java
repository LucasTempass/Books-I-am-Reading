package Visitor;

public class XMLExporter implements Exporter {
    
    @Override
    public void export(Token iToken) {
        System.out.println("<token>" + "\n" +
                "    <admin>" + iToken.isAdmin() + "</admin>" + "\n" +
                "    <duration>" + iToken.getDuration() + "</duration>" + "\n" +
                "    <userid>" + iToken.getUserId() + "</userid>" + "\n" +
                "</token>");
        
    }
    
    @Override
    public void export(LoginCredentials iCredentials) {
        System.out.println("<credentials>" + "\n" +
                "    <email>" + iCredentials.getEmail() + "</email>" + "\n" +
                "    <password>" + iCredentials.getPassword() + "</password>" + "\n" +
                "    <userid>" + iCredentials.getUserId() + "</userid>" + "\n" +
                "</credentials>");
        
    }
    
}
