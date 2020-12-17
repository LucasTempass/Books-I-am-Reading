package Bridge;

public class BankOfAmericard extends CreditCard {
    
    private final int accountNumber;
    
    public BankOfAmericard(CreditCardBrand brand, int accountNumber) {
        super(brand);
        this.accountNumber = accountNumber;
        
    }
    
    public void pay(double amount, int id) {
        if (this.brand.isValidTransaction((int) (Math.random() * 1000.0D))) {
            System.out.println(amount + " dolars sent to id: " + id + ". Via your account " + this.accountNumber + " on the Bank Of America");
            this.brand.chargeCommission(amount);
        }
        else System.out.println("Invalid transaction");
        
    }
    
    public int getAccountNumber() {
        return this.accountNumber;
    }
    
}
