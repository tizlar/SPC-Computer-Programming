// SPC ID# 00002491103
// Tristan Izlar

package izlar11;

public class Checking extends Account {

	public static final double OVER_LIMIT = 500.00;
	private int transactions;

	public Checking(String purpose, String number, double balance) {
		super(purpose, number, balance);
	}

	public int getTransactions() {
		return transactions;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if (amount - super.getBalance() > OVER_LIMIT) {
			System.out.println("Denied. Insufficent funds!");
		} else {
			super.setBalance(super.getBalance() - amount);
			transactions++;
		}
		System.out.printf("%s balance is $%,.2f\n", super.getNumber(), super.getBalance());
	}

	@Override
	public String toString() {
		String str = String.format("Checking Account #%s for %s\nBalance $%,.2f, # of transactions: %d\n", super.getNumber(), super.getPurpose(), super.getBalance(), transactions);
		return str;
	}

}
 