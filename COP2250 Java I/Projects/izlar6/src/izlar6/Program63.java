// SPC ID 00002491103 Tristan Izlar


// prompt for the number of different items being purchased.
// use a loop to process each item by prompting for the unit price, quantity and taxable status.
// call the item method with these inputs as arguments.
// accumulate the value returned by item to get the total bill for all items.
// print the grand total for all items. 
// In the item method:
// calculate the subtotal, 7% sales tax if applicable, and total for each item.
// print all three of these calculations in currency format.
// return the total. 


package izlar6;
import java.util.Scanner;


public class Program63 {

	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
	System.out.print("How many different items are being purchased? ");
	int itemCount = input.nextInt();
	double grandTotal = 0;
	
	for (int i = 1; i <= itemCount; i++) {
		System.out.printf("\nEnter price of item %d: ", i);
		double price = input.nextDouble();
		System.out.print("Enter the quantity of this item: ");
		int quant = input.nextInt();
		System.out.print("Is the item taxable true/false ? ");
		boolean taxable = input.nextBoolean();
		grandTotal += item(price, quant, taxable);
		
	}
	
	System.out.printf("\nPlease pay $%.2f", grandTotal);
	
	}
	
	public static double item(double price, int quant, boolean taxable) {
		double subtotal = price * quant;
		double salesTax = 0;
		double total;
		if (taxable) {
			salesTax = subtotal * .07;
		}
		else 
			salesTax = 0;
		
		total = subtotal + salesTax;
		System.out.printf("Subtotal $%.2f", subtotal);
		System.out.printf("\nSales tax $%.2f", salesTax);
		System.out.printf("\nTotal $%.2f", total);
	
		return total;
	}
	
}
