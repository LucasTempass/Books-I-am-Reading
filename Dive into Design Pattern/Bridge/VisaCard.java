package Bridge;

public class VisaCard implements CreditCardBrand {
    public VisaCard() {
    }
    
    public boolean isValidTransaction(int iOrderId) {
        return iOrderId % 2 == 0;
    }
    
    public void chargeCommission(double iValue) {
        System.out.println("Commission value: " + (double)iValue * 0.02D + " payed to Visa");
    }
}