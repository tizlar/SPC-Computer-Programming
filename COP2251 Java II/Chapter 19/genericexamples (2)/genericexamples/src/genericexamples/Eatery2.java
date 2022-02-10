package genericexamples;

import java.util.ArrayList;
import java.util.Arrays;

public class Eatery2 {

	public static void main(String[] args) {
		
		ArrayList<Sandwich> burgers = new ArrayList<>();
		Sandwich hamburger = new Sandwich("1/4 pounder",2.49,"beef",690);
		burgers.add(hamburger);
		burgers.add(new Sandwich("Fish Filet",2.19,"fish",480));
		burgers.add(new Sandwich("Chicken Burger",2.89,"chicken",518));
		
		ArrayList<Side> sides = new ArrayList<>();
		sides.add(new Side("fries",1.59,"potato",333));
		Side salad = new Side("Fruit salad",2.19,"various fruit",180);
		sides.add(salad);
		
		showList(sides);
		showList(burgers);
		
		String[] cities = {"Tampa","New York","Atlanta","Chicago","Orlando"};
		
		// make ArrayList from array
		ArrayList<String> usCities = new ArrayList<String>(Arrays.asList(cities));
		showList(usCities);
		
		// FYI, one way to convert an Arraylist to an array
		String[] ara = usCities.stream().toArray(String[]::new);
		System.out.println(ara[2]);
		
	}
	// a generic method, works for an arraylist of an object type
	public static <E> void showList(ArrayList<E> list) {
		System.out.println("\nRun time array is type: " + list.get(0).getClass());
		for(E ob : list) {
			System.out.println(ob);
		}
	}
}
