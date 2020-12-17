package Visitor;

public class LoginCredentials implements Exportable {
    
    private String email;
    private String password;
    private int userId;
    
    public LoginCredentials(String email, String password, int userId) {
        this.email = email;
        this.password = password;
        this.userId = userId;
        
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
    public void accept(Exporter exporter) {
        exporter.export(this);
    }
    
}
