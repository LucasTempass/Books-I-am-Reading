package Bridge;

public class VisaCard implements CreditCardBrand {
    
    public VisaCard() {
    }
    
    public boolean isValidTransaction(int orderId) {
        return orderId % 2 == 0;
    }
    
    public void chargeCommission(double value) {
        System.out.println("Commission value: " + value * 0.02D + " payed to Visa");
    }
    
}