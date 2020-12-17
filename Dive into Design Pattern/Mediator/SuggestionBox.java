package Mediator;

import java.util.ArrayList;

//||| Observer maybe more appropriate pattern |||
public class SuggestionBox implements Mediator {
    
    private Company company;
    private ArrayList<Tester> testers;
    
    public SuggestionBox() {
        testers = new ArrayList<>();
    }
    
    public SuggestionBox(Company company) {
        this.company = company;
        testers = new ArrayList<>();
        
    }
    
    public SuggestionBox(Company company, ArrayList<Tester> testers) {
        this.company = company;
        this.testers = testers;
        
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }
    
    public void addTester(Tester tester) {
        testers.add(tester);
    }
    
    @Override
    public void notify(String content) {
        company.handleFeedback(content);
    }
    
    @Override
    public void notifyRequest(String request) {
        for (Tester tester : testers) tester.test(request);
    }
    
}
