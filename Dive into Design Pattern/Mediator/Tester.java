package Mediator;

public class Tester {
    
    private Mediator medium;
    
    public Tester(Mediator iMedium) {
        medium = iMedium;
    }
    
    public void makeSuggestion(String iSuggestion) {
        medium.notify(iSuggestion);
    }
    
    public void test(String iTrial) {
        System.out.println("Performing: " + iTrial);
        makeSuggestion(((int) (Math.random() * 100)) % 2 == 0  ? "Nothing to add" : "Maybe a free version would be great");
        
    }
    
}
