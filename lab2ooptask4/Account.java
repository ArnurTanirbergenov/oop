package lab2ooptask4;

public class Account {
	private double balance;
	private int accNumber;
	
	public Account(int a) {
		balance =0.0;
		accNumber = a;
	}
	
	public void deposit(double sum) {
		balance += sum;
	}
	public void withdraw(double sum) {
		if(balance - sum >= 0) {
			balance -= sum;
		}
		else System.out.println("Not enough money");
	}
	
	public double getBalance() {
		return balance;
	}
	public double getAccountNumber() {
		return accNumber;
	}
	
	public void transfer(double amount, Account other) {
		System.out.println(getBalance());
		System.out.println(amount);
		if(this.balance >= amount) {
			other.deposit(amount);
			this.withdraw(amount);
		}
		else System.out.println("Not enough money");
	}
	
	public String toString() {
		return "Account number: " + accNumber + " Balance: " + balance;
	}
	public final void print() {
		System.out.println(toString());
	}
}
