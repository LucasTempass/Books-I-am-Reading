package Mediator;

public class Demo {
    
    public static void main(String[] args) {
        SuggestionBox iSuggestionBox = new SuggestionBox();
        Company iCompany = new Company(iSuggestionBox);
        iSuggestionBox.addTester(new Tester(iSuggestionBox));
        iSuggestionBox.addTester(new Tester(iSuggestionBox));
        iSuggestionBox.addTester(new Tester(iSuggestionBox));
        iSuggestionBox.addTester(new Tester(iSuggestionBox));
        iSuggestionBox.setCompany(iCompany);
        iCompany.makeTrial();
        
    }
    
}
