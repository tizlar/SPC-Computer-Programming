// SPC ID# 00002491103
// Tristan Izlar

package izlar11;

public class Account {

	private String purpose;
	private String number;
	private double balance;
	

	public Account(String purpose, String number, double balance) {
		super();
		this.purpose = purpose;
		this.number = number;
		this.balance = balance;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getPurpose() {
		return purpose;
	}


	public String getNumber() {
		return number;
	}
	
	public void deposit (double amount) {
		balance += amount;
		System.out.printf("Deposited $%,.2f into account #%s\n", amount, number);
	} 
	
	public void withdraw (double amount) {
		if (balance < amount) {
			System.out.println("Denied. Insufficent funds!");
		}
		else {
			balance = balance - amount; 
		}
	}
	
	public void transfer (double amount, Account account) {
		this.withdraw(amount);
		account.deposit(amount);
		System.out.printf("Transferred $%,.2f from #%s to #%s\n", amount, this.getNumber(), account.getNumber());
	}


	@Override
	public String toString() {
		return "Account [purpose=" + purpose + ", number=" + number + ", balance=" + balance + "]";
	}
	
	
}
