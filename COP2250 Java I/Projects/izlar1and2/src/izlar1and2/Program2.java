//Tristan Izlar SPC# 00002491103

// The following prompts a user to enter the cost of a unit and how many they want
// After this the program returns a subtotal of the order

package izlar1and2;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price of one unit: ");
		double price = input.nextDouble();
		System.out.print("Enter how many units you want: ");
		int amount = input.nextInt();
		System.out.println("The subtotal of your order is $" + price * amount);
	}

}
