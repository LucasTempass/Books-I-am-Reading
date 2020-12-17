package Decorator;

public class WholeGrainDough implements Pizza {
    
    private String name;
    
    public WholeGrainDough(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return this.name + ": whole grain dough";
    }
    
}
