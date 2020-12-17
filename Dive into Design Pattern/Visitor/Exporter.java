package Visitor;

public interface Exporter {
    
    void export(Token token);
    
    void export(LoginCredentials credentials);
    
}
