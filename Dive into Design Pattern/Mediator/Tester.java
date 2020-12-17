package Mediator;

import java.util.Random;

public class Tester {
    
    private Mediator mediator;
    
    public Tester(Mediator mediator) {
        this.mediator = mediator;
    }
    
    public void makeSuggestion(String suggestion) {
        mediator.notify(suggestion);
    }
    
    public void test(String iTrial) {
        System.out.println("Performing: " + iTrial);
        makeSuggestion(new Random().nextInt(100) % 2 == 0 ? "Nothing to add" : "Maybe a free version would be great");
        
    }
    
}
