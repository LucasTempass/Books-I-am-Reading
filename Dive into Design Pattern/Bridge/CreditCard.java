package Bridge;

public abstract class CreditCard {
    
    final CreditCardBrand brand;
    
    CreditCard(CreditCardBrand iBrand) {
        this.brand = iBrand;
    }
    
    abstract void pay(double iAmount, int iId);
    
    public CreditCardBrand getOwnerId() {
        return this.brand;
    }
    
}