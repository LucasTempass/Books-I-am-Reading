package Proxy;

public class President extends Representative {
    
    public President(String iName, String iCountry) {
        super(iName, iCountry);
    }
    
    @Override
    public String negotiate(Representative representative) {
        if (representative instanceof President)
            return ("First encounters must be interceded by the ambassador");
        System.out.println("The president from " + country + " is negotiating with a representative of " + representative.getCountry());
        return ((Ambassador) representative).arrangeMeeting(this);
        
    }
    
}
