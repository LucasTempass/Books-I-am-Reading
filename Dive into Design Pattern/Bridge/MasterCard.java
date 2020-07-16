package Bridge;

public class MasterCard implements CreditCardBrand {
   
    public MasterCard() { }
    
    public boolean isValidTransaction(int iOrderId) {
        return iOrderId % 3 == 0;
    }
    
    public void chargeCommission(double iValue) {
        System.out.println("Commission value: " + (double)iValue * 0.01D + " payed to MasterCard");
    }
}
