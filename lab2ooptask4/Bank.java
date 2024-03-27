package lab2ooptask4;
import java.util.Vector;
public class Bank {
	private Vector<Account> accounts;
	
	public Bank() {
		accounts = new Vector<Account>();
	}
	public void openAccount(Account account) {
		accounts.add(account);
	}
	public void removeAccount(Account account) {
		accounts.remove(account);
	}
	
	public void update() {
		for(Account account: accounts) {
			if(account instanceof SavingsAccount) {
				SavingsAccount savingsAccount = (SavingsAccount)account;
				savingsAccount.addInterest();
			}
			else if(account instanceof CheckingAccount) {
				CheckingAccount checkingAccount = (CheckingAccount)account;
				checkingAccount.deduct_fee();
			}
		}
	}
}
