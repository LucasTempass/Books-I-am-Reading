package Bridge;

public class Demo {
    
    public static void main(String[] args) {
        CreditCardTerminal iTerminal = new CreditCardTerminal(2);
        iTerminal.charge(20, new BankOfAmericard(new MasterCard(), 302012332));
        System.out.println();
        iTerminal.charge(29, new BankOfAmericard(new VisaCard(), 502323202));
        
    }
    
}
