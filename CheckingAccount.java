//package Lab6_BankAccount;

/**
 * Class that represents a Checking Account.
 * It extends BankAccount
 * @author David Rodrguez
 *
 */
public class CheckingAccount extends BankAccount{

	private static final double FEE= 0.15;
	
	public CheckingAccount(String name, double initial) {
		super(name,initial);
		setAccountNumber(getAccountNumber() + "-10");
		
	}
	
	@Override
	public boolean withdraw(double amount) {
		double newAmount = amount + FEE;
		
		return super.withdraw(newAmount);
	}
	
}
