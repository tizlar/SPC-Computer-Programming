// SPC ID 00002491103 Tristan Izlar


// prompt user for three dimensions in inches
// call a method that calculates volume in cubic feet and returns the value
// print the result for the user


package izlar6;
import java.util.*;

public class Program61 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.println("Please enter three inside dimensions, in inches, of a shipping box: ");
		double dimOne = input.nextDouble();
		double dimTwo = input.nextDouble();
		double dimThree = input.nextDouble();
		
		System.out.printf("The volume in cubic feet is %.3f", volumeCalc(dimOne, dimTwo, dimThree));
	}
	
	public static double volumeCalc(double dimension1, double dimension2, double dimension3) {
		double cubicInches = dimension1 *  dimension2 * dimension3;
		double cubicFeet = cubicInches / 1728;
		return cubicFeet;
	}

}
