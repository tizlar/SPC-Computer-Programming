//Tristan Izlar SPC# 00002491103

// The following code prints a real number with four decimals
// After this the program print this number if it is cast as an int

package izlar1and2;

public class Program4 {

	public static void main(String[] args) {
		double fourDecimal = 2.1234;
		System.out.println("Four decimal place number: " + fourDecimal);
		int castedVariable = (int)fourDecimal;
		System.out.println("Four decimal place number casted as an int: " + castedVariable);

	}

}
