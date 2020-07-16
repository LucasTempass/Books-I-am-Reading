package Decorator;

public class WholeGrainDough implements Pizza {
    private String name;
    
    public WholeGrainDough(String iName) {
        this.name = iName;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String iName) {
        this.name = iName;
    }
    
    public String getDescription() {
        return this.name + ": whole grain dough";
    }
}
