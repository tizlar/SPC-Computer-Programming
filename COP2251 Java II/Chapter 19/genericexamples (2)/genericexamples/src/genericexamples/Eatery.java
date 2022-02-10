package genericexamples;

import java.util.ArrayList;

public class Eatery {

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
		
		for(Sandwich b : burgers) {
			System.out.println(b);
		}
		System.out.println();
		for(Side s : sides) {
			System.out.println(s);
		}
	}
}
