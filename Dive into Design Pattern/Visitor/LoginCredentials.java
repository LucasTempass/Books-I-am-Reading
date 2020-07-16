package Visitor;

public class LoginCredentials implements Exportable {
    
    private String email;
    private String password;
    private int userId;
    
    public LoginCredentials(String iEmail, String iPassword, int iUserId) {
        email = iEmail;
        password = iPassword;
        userId = iUserId;
        
    }
    
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public int getUserId() {
        return userId;
    }
    
    @Override
    public void accept(Exporter iExporter) {
        iExporter.export(this);
    }
    
}
