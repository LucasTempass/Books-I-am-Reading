package Bridge;

public abstract class CreditCard {
    
    protected final CreditCardBrand brand;
    
    public CreditCard(CreditCardBrand iBrand) {
        this.brand = iBrand;
    }
    
    abstract void pay(double iAmount, int iId);
    
    public CreditCardBrand getOwnerId() {
        return this.brand;
    }
    
}