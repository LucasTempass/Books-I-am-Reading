package Bridge;

public class MasterCard implements CreditCardBrand {
    
    public MasterCard() { }
    
    public boolean isValidTransaction(int orderId) {
        return orderId % 3 == 0;
    }
    
    public void chargeCommission(double value) {
        System.out.println("Commission value: " + value * 0.01D + " payed to MasterCard");
    }
    
}
