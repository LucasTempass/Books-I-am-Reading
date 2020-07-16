package Bridge;

public class CreditCardTerminal {
    
    private final int ownerId;
    
    public CreditCardTerminal(int iOwnerId) {
        this.ownerId = iOwnerId;
    }
    
    public void charge(double iAmount, CreditCard iCreditCard) {
        iCreditCard.pay(iAmount, this.ownerId);
    }
    
}
