package genericexamples;

import java.util.ArrayList;
import java.util.Date;

public class WhyGenerics {

	public static void main(String[] args) {
										// okay pre JDK 5 because arraylists stored Objects
		ArrayList list = new ArrayList();
		list.add("Java rocks!");
		list.add(new Date());   		// ANY object type could be added
		
		//String s = list.get(0); 		// but this wouldn't compile without casting
		String s = (String)list.get(0); // to the actual type like this.
		//Date d = list.get(1);			// also, this wouldn't compile
		Date d = (Date)list.get(1);		// unless cast to right type, Date.
		
		/*
		 * So class ArrayList (and many Java classes and interfaces)
		 * were made generic...meaning that an arraylist could be any
		 * ANY type but it had to be identified within <> at COMPILE time.
		 * Code not conforming will not compile.
		 */
		
		ArrayList<String> words = new ArrayList<>();
		words.add("Hello world");		// okay
		words.add(new Date());			// compiler knows this is forbidden
	}
}
