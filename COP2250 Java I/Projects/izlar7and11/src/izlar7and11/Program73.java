// SPC ID 00002491103 Tristan Izlar

// use a foreach loop & next() to read each name entered
// Separated by a space. Add those to an array.
// Create a method to process the array (sort, and add/remove some values)

package izlar7and11;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Program73 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five first names");
		
		// array declaration 
		String[] names = new String[5];
		
		// adding values to array
		int namesAdded = 0;
		for(String e: names) {
			names[namesAdded]= input.next();
			namesAdded++;
		}
		
		// call method 
		processer(names);
	}

	// method creation
	public static void processer(String[] names) {
		System.out.println("Sorted array of names");
		java.util.Arrays.sort(names);
		for(String e: names) {
			System.out.print(e + " ");
		}
		System.out.println("\nFinal list of names");
		ArrayList<String> namesList = new ArrayList<>();
		for(String e: names) {
			namesList.add(e);
		}
		namesList.add(0, "Mike");
		namesList.remove(5);
		for(String e: namesList) {
			System.out.print(e + " ");
		}
	}
}
