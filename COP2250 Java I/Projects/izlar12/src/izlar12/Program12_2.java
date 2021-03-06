// SPC ID 00002491103 Tristan Izlar

// create a small array of 6-10 values
// display on one line for user
// prompt them to enter an index of the array
// catch if the entry was either out of bounds 
// or if it was bad input
// if valid return the value at the index

package izlar12;
import java.util.*;

public class Program12_2 {

	public static void main(String[] args) {
		
		int[] smallArray = {1,2,3,4,5,6,7};
		for (int i: smallArray) {
			System.out.print(i + " ");
		}
		
		Scanner input = new Scanner(System.in);
		System.out.print("\n\nEnter any index of the array: ");
		
		try {
			int index = input.nextInt();
			System.out.println("\nElement at index " + index + " is " + smallArray[index]);
		}
		catch (InputMismatchException ex) {
			System.out.println("\nBad input. Try again.");
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println("\nError. Array index was out of bounds.");
		}

	}
}
