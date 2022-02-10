package genericexamples;

import java.util.ArrayList;

public class Introduction {
	
/*	Generics enable error detection at compile time, not runtime.
	The data type that a class can use is specified inside <>.
	If an incompatible type is used, the program won't compile.
	This eliminates surprises and makes programs more reliable.
	NOTE: Only REFERENCE TYPES can be specified. NO PRIMITIVES. 
*/
	public static void main(String[] args) {
		// ArrayList is a generic class in the Java API
		// See some methods of ArrayList on page 739
		// ArrayList<int> nums = new ArrayList<>();  	// NO GOOD, primitive
		ArrayList<Integer> nums = new ArrayList<>(); 	// OK, reference type

		nums.add(new Integer(25)); 						// constructor now deprecated	
		nums.add(10); 									// okay, called autoboxing
		int number = nums.get(1); 						// this autounboxing is also okay
		
		//nums.add("Java"); remove comment and note well the error message
		if(nums.contains(number)) {
			System.out.println("Found " + number + " at index " + nums.indexOf(number));
		}
	}
}
