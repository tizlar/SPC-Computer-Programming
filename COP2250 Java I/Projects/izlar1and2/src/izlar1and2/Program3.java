//Tristan Izlar SPC# 00002491103

// The following prompts a user to enter an amount of centimeters
// After this is entered the program converts the results to inches and displays it

package izlar1and2;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double CONVERSION = .393701;
		System.out.print("Enter a length in centimeters, to be converted to inches: ");
		double centimeters = input.nextDouble();
		System.out.println(centimeters + " centimeters is " + centimeters * CONVERSION  + " inches.");
	}

}
