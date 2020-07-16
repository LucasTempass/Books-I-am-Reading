package Bridge;

public interface CreditCardBrand {
    
    boolean isValidTransaction(int iId);
    
    void chargeCommission(double iAmount);
    
}
