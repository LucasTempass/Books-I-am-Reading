package Decorator;

public class NormalDough implements Pizza {
    
    private String name;
    
    public NormalDough(String iName) {
        this.name = iName;
    }
    
    public String getDescription() {
        return this.name + ": normal dough with";
    }
    
}
