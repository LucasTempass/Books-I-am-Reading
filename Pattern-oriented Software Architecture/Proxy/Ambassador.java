package Proxy;

public class Ambassador extends Representative {
    
    private President president;
    
    public Ambassador(String name, String country, President president) {
        super(name, country);
        this.president = president;
        
    }
    
    public President getPresident() {
        return president;
    }
    
    String arrangeMeeting(Representative representative) {
        return ("A meeting has been arranged between the president of " + country + " and the " + (representative instanceof Ambassador ? "Ambassador"
                : "President") + " of" +
                " " + representative
                .getCountry());
        
    }
    
    @Override
    public String negotiate(Representative representative) {
        System.out.println("The ambassador from " + country + " is negotiating with a representative of " + representative.getCountry());
        return arrangeMeeting(representative instanceof Ambassador ? ((Ambassador) representative).getPresident() : representative);
        
    }
    
}
