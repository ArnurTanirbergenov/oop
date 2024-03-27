package lab2ooptask4;

public class Tester {
	 public static void main(String[] args) {
		  SavingsAccount savingsAccount = new SavingsAccount(2, 10);
		  CheckingAccount checkingAccount = new CheckingAccount(3, 2);
		  savingsAccount.deposit(500);
		  savingsAccount.transfer(200, checkingAccount);
		  checkingAccount.print();
		  savingsAccount.print();
		  Account account = new Account(1);
		  account.deposit(2000.0);
		  
		  checkingAccount.deposit(3000.0);
		  
		  checkingAccount.withdraw(123.0);
		  checkingAccount.print();
		 }
}
