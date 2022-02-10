// SPC ID 00002491103 Tristan Izlar


// For a set amount of products (4)
// allow the user to iterate through them and 
// enter a price/quantity for each.
// Give the value of each product in stock and
// at the end of the process give the grand total 
// of the inventory stock.

package izlar5;
import java.util.Scanner;

public class Program54 {

	public static void main(String[] args) {
	int quantity;
	double price, value, total = 0;
	Scanner input = new Scanner(System.in);
	
	for(int product = 1; product <= 4; product++) {
		System.out.println("Enter the price and quantity in stock for product " + product + ":");
		price = input.nextDouble();
		quantity = input.nextInt();
		value = price * quantity;
		System.out.printf("Product " + product + " inventory value is $%,.2f", value);
		System.out.println();
		total += value;
	}
	System.out.printf("Total inventory value is $%,.2f", total);
	

	}

}
