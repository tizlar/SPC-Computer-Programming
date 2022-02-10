package chap19_555;

import java.util.ArrayList;

public class IntArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<Integer>();
		int random;
		
		// add 10 random integers
		while(intList.size() < 11) {
			random = (int)(Math.random() * 100) + 1;
			intList.add(random);	// autoboxed int to Integer
		}
		
		for(int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + " "); // auto-unboxed
		}
		
		System.out.println("\nList contains 50? " + intList.contains(50));
		intList.add(3, 500); // insert 500 at index 3
		
		for(int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + " ");
		}
	}
}
