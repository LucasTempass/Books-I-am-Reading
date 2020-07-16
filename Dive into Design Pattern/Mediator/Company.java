package Mediator;

public class Company {
    
    private Mediator medium;
    
    public Company(Mediator iMedium) {
        medium = iMedium;
    }
    
    public void makeTrial() {
        medium.notifyRequest("New Trial");
    }
    
    public void handleFeedback(String iFeedback) {
        System.out.println("Feedback received: " + iFeedback);
    }
    
}
