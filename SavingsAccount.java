//package Lab6_BankAccount;

/**
 * Class that represents a Savings Account.
 * It extends the BankAccount class.
 * @author David Rodriguez
 *
 */
public class SavingsAccount extends BankAccount{
	private final double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double initial){
		super(name,initial);
		accountNumber = super.getAccountNumber() + "-"+savingsNumber;
				
	}
	
	public SavingsAccount(SavingsAccount account, double amount) {
		super(account,amount);
		savingsNumber = account.savingsNumber + 1;
		accountNumber = super.getAccountNumber()+"-"+savingsNumber;
	}
	
	public void postInterest() {
		double amount = (rate * getBalance())/12;
		deposit(amount);
	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	
	
	
}
