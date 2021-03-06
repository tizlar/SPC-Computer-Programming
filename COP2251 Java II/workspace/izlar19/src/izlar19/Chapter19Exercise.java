// SPC ID# 00002491103
// Tristan Izlar

package izlar19;

import java.util.Scanner;

public class Chapter19Exercise {

	public static <E extends Comparable<E>> E max(E[] list) {
		
		// initialize maxVal
		E maxVal = list[0];

		// loop through list, using compareTo to reassign the maxVal as needed
		for (int i = 0; i < list.length; i++) {
			if (maxVal.compareTo(list[i]) < 0) {
				maxVal = list[i];
			}
		}
		
		// return the maxVal (E)
		return maxVal;
}
		
	public static void main(String[] args) {
		
		// declare variables
		Integer[] userIntegers = new Integer[10];
		Scanner input = new Scanner(System.in);
		
		// prompt user to enter ten integers
		for (int i = 0; i < 10; i++){
			System.out.println("Please enter integer #" + (i + 1));
			userIntegers[i] = input.nextInt();
		}
		input.close();
		
		// invoke max() on array
		System.out.println("Max of entered integers: " + max(userIntegers));
	}

}
