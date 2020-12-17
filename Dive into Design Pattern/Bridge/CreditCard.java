package Bridge;

public abstract class CreditCard {
    
    final CreditCardBrand brand;
    
    CreditCard(CreditCardBrand brand) {
        this.brand = brand;
    }
    
    abstract void pay(double amount, int id);
    
    public CreditCardBrand getOwnerId() {
        return this.brand;
    }
    
}