// SPC ID 00002491103 Tristan Izlar

// create 30 element array of random ints
// range must be 10-75 inclusive
// create method that that takes the array,
// and prints it in 6 rows of 5 columns (7 characters wide)
// in the loop count how many temps are < 32 degrees
// process the array again using a foreach loop, and 
// add each freezing temp to a new freezing array
// return the new array to main.  Report the number of
// temps and print them all on one line.

package izlar7and11;
import java.util.Arrays;

public class Program71 {

	public static void main(String[] args) {
		
		System.out.println("Thirty random Fahrenheit temperatures...");
		
		// create new array to hold random temps
		int[] allTemps = new int[30];
		
		for(int i = 0; i < allTemps.length; i++) {
			allTemps[i] = 10 + (int)(Math.random() * 66);
		}
		
		//call info generator
		int[] freezing = infoGenerator(allTemps);
		int found = freezing.length;
		
		// report # of freezing temps & list/sort the values
		System.out.println("\nFound " + freezing.length + " temperatures below freezing.");
		System.out.println("Here they are sorted ascending...");
		java.util.Arrays.sort(freezing);
		for(int i = 0; i < freezing.length; i++) {
			System.out.print(freezing[i] + " ");
		}	
	}
	
	// method to display allTemps array & create freezing array
	public static int[] infoGenerator(int[] newArray) {
		int count = 0;
		
		for(int i = 0; i < newArray.length; i++) {
			if(i % 5 == 0) {
				System.out.println();
			}
			
			if (newArray[i] < 32) {
				count++;
			}
			
			System.out.printf("%7d", newArray[i]);
		}
		
		int[] freezing = new int[count];
		
		int added = 0;
		
		for (int e: newArray) {
			if (e < 32) {
				freezing[added] = e;
				added++;
			}
		}
		
		return freezing;
			
	}
}
		

