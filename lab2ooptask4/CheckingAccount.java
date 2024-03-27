package lab2ooptask4;

public class CheckingAccount extends Account{
	 private int counter;
	 private final int FREE_TRANSACTIONS;
	public CheckingAccount(int accNumber, int FREE_TRANSACTIONS) {
		super(accNumber);
		this.counter = 0;
		this.FREE_TRANSACTIONS = FREE_TRANSACTIONS;
	}
	public void deduct_fee() {
		if(counter > FREE_TRANSACTIONS) {
			double fee = (counter - FREE_TRANSACTIONS) * 0.02;
			counter = 0;
			withdraw(fee);
		}
	}
	public void deposit(double amount) {
		super.deposit(amount);
		counter++;
		deduct_fee();
	}
	public void withdraw(double sum) {
		super.withdraw(sum);
		counter++;
	}
	public String toString() {
		return super.toString() + " Number of Transactions: " + counter + " Number of Free transactions: " + this.FREE_TRANSACTIONS;
	}
}
