package Mediator;

import java.util.ArrayList;

//||| Observer maybe more appropriate pattern |||
public class SuggestionBox implements Mediator {
    
    private Company company;
    private ArrayList<Tester> testers;
    
    public SuggestionBox() {
        testers = new ArrayList<Tester>();
    }
    
    public SuggestionBox(Company iCompany) {
        company = iCompany;
        testers = new ArrayList<Tester>();
        
    }
    
    public void setCompany(Company iCompany) {
        company = iCompany;
    }
    
    public void addTester(Tester iTester) {
        testers.add(iTester);
    }
    
    @Override
    public void notify(String iContent) {
        company.handleFeedback(iContent);
    }
    
    @Override
    public void notifyRequest(String iRequest) {
        for (Tester tester : testers) tester.test(iRequest);
    }
    
}
