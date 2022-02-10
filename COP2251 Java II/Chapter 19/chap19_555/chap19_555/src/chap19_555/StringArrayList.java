package chap19_555;

import java.util.ArrayList;

public class StringArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> innovators = new ArrayList<String>();
		
		innovators.add("Torvalds");
		innovators.add("Stroustrup");
		innovators.add("Lerdorf");
		innovators.add("Ritchie");
		innovators.add("Gosling");
		innovators.add("Wall");		
		
		innovators.remove(3);
		innovators.set(3, "Jobs");
	
		// process list in reverse order
		for(int i = innovators.size()-1; i >= 0; i--) {
			// Note no casting to String needed on next line
			System.out.print(innovators.get(i) + " ");
			innovators.remove(i);
		}
		System.out.println("\nIs list empty? " + innovators.isEmpty());
	}
}
