package Proxy;

public abstract class Representative {
    
    protected String name;
    protected String country;
    
    public Representative(String iName, String iCountry) {
        name = iName;
        country = iCountry;
    }
    
    abstract String negotiate(Representative representative);
    
    public String getName() {
        return name;
    }
    
    public String getCountry() {
        return country;
    }
    
}
