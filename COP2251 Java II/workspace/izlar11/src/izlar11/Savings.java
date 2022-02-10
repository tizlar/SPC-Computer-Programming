// SPC ID# 00002491103
// Tristan Izlar

package izlar11;

public class Savings extends Account{

	private double intRate;

	public Savings(String purpose, String number, double balance, double intRate) {
		super(purpose, number, balance);
		this.intRate = intRate;
		// TODO Auto-generated constructor stub
	}

	public double getIntRate() {
		return intRate;
	}

	public void setIntRate(double intRate) {
		this.intRate = intRate;
	}
	
	public void addInterest() {
		System.out.printf("Savings account #%s earned $%.2f interest\n", super.getNumber(), (super.getBalance() * intRate));
		super.deposit((super.getBalance() * intRate));
		
	}

	@Override
	public String toString() {
		String str = String.format("Savings Account #%s for %s\nBalance $%,.2f, interest rate: %,.3f%%\n", super.getNumber(), super.getPurpose(), super.getBalance(), (intRate * 100));
		return str;
	}
	
	
	
}
