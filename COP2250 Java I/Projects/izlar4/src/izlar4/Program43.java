// SPC ID 00002491103 Tristan Izlar

// this program takes the provided data items
// and performs all calculations within a printf method.
// All results are to be shown using only a printf method.


package izlar4;

public class Program43 {

	public static void main(String[] args) {
		String item = "ear buds";
		char Dept = 'A';
		double price = 149.99;
		int quantity = 3;
		boolean taxable = true;
		System.out.printf("Purchase: %s, quantity %d @ $%.2f" +
		 "\nDept %c, taxable? %b" +
		 "\nSubtotal $%.2f" +
		 "\n7 %% sales tax is $%.2f" +
		 "\nTotal payable $%.2f", item, quantity, price, Dept, taxable, quantity * price, 
		 (quantity * price * .07),  ((quantity * price) + (quantity * price * .07)));

	}

}
