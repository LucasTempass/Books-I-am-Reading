package Visitor;

public class Demo {
    
    public static void main(String[] args) {
        new Token(2,true,20).accept(new XMLExporter());
        new LoginCredentials("lorem@ipsum.com","ipsum",20).accept(new JSONExporter());
        
    }
    
}
