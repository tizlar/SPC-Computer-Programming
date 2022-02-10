// SPC ID 00002491103 Tristan Izlar

// This program takes an input from the user
// and checks the input in a boolean expression contained
// within the if statement. The program then confirms if the input
// was valid or not.

package izlar3;
import java.util.*;

public class Program31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a odd multiple of 19, between 100 and 200: ");
		int entry = input.nextInt();
		//program uses only one long boolean expression in the if statement 
		if (entry % 2 != 0 && entry >= 100 && entry <= 200 && entry % 19 == 0) {
			System.out.println("Valid Number Entered.");
		}
		else {
			System.out.println("Invalid Number Entered.");
		}

	}

}
