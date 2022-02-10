// SPC ID 00002491103 Tristan Izlar


// to demonstrate overloading of functions, I made an overloaded method
// which will calculate the Hypotenuse of a triangle regardless of if the method arguments
// are integers or doubles. The overloaded method chooses the correct version of the method to run
// based off the inputs.

package izlar6;

public class Program64 {
	public static void main(String[] args) {
		
		
		// these are two scenarios where my method findHypotenuse() is called. As you can see scenario 1 calls the method with integer values, 
		// and scenario 2 calls the method with double values.
		
		// scenario 1
		System.out.println("Side C is equal to length " + findHypotenuse(12, 13));
		
		// scenario 2
		System.out.println("Side C is equal to length " + findHypotenuse(5.64, 11.54));
		
	}
	
	// the following lines are the creation of my findHypotenuse() method, where I demonstrate method overloading
	// by using different types of parameters in methods with the same name (findHypotenuse).
	
	// this version of the overloaded method accepts int values in its parameters 
	public static int findHypotenuse(int sideA, int sideB) {
		int sideC = (int) Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
		return sideC;
	}
	// this version of the overloaded method accepts double values in its parameters 
	public static double findHypotenuse(double sideA, double sideB) {
		double sideC = Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
		return sideC;
	}
	
	// as we can see when we run the code, the call of my methods chooses the correct version of 
	// the overloaded method, depending on what the parameters data types are. The return type is not required to match
	// and this helps show which method was called. In scenario 1, the parameters are ints and the overloaded method
	// returns an int variable (17). If it was ran through a method that returns doubles, the returned value would
	// actually be ~17.69. This just goes to show that because findHypotenuse() was called with int arguments, the 
	// findHypotenuse(int A, int B) method version was used.
	
	// all in all overloading gives our program users some flexibility when inputing values into methods we might make.

}
