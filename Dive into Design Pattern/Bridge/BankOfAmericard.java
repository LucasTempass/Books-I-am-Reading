package Bridge;

public class BankOfAmericard extends CreditCard {
    
    private final int accountNumber;
    
    public BankOfAmericard(CreditCardBrand iBrand, int iAccountNumber) {
        super(iBrand);
        this.accountNumber = iAccountNumber;
    }
    
    public void pay(double iValue, int iReceiverId) {
        if (this.brand.isValidTransaction((int) (Math.random() * 1000.0D))) {
            System.out.println(iValue + " dolars sent to id: " + iReceiverId + ". Via your account " + this.accountNumber + " on the Bank Of America");
            this.brand.chargeCommission(iValue);
        }
        else {
            System.out.println("Invalid transaction");
        }
        
    }
    
    public int getAccountNumber() {
        return this.accountNumber;
    }
    
}
