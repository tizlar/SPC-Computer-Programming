//Tristan Izlar SPC# 00002491103

// The following code takes a numerator and denominator value from a user
// after this the code gives the result as a mixed number using division and remainder operands

package izlar1and2;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a numerator: ");
		int numerator = input.nextInt();
		System.out.print("Enter a denominator: ");
		int denominator = input.nextInt();
		System.out.println(numerator + " / " + denominator + " as a mixed number is " + numerator / denominator + " and " + numerator % denominator + " / " + denominator);

	}

}
