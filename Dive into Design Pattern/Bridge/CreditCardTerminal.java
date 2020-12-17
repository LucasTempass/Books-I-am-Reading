package Bridge;

public class CreditCardTerminal {
    
    private final int ownerId;
    
    public CreditCardTerminal(int ownerId) {
        this.ownerId = ownerId;
    }
    
    public void charge(double amount, CreditCard card) {
        card.pay(amount, this.ownerId);
    }
    
}
