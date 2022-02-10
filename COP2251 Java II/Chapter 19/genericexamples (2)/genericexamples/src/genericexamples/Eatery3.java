package genericexamples;

import java.util.ArrayList;

public class Eatery3 {

	public static void main(String[] args) {
		
		ArrayList<Food> order1 = new ArrayList<>();
		Sandwich hamburger = new Sandwich("1/4 pounder",2.49,"beef",690);
		order1.add(hamburger);
		order1.add(new Sandwich("Fish Filet",2.19,"fish",480));
		Side salad = new Side("Fruit salad",2.19,"various fruit",180);
		order1.add(salad);
		
		System.out.println("Here is your order");
		int carbs = showList(order1);
		System.out.println(carbs + " carbs in those sandwiches");

	}

	public static <E extends Food> int showList(ArrayList<E> list) {
		int totalCarbs = 0;
		for(E ob : list) {
			System.out.println("\nArrayList element is type: " + ob.getClass());
			System.out.println(ob);	
			if(ob instanceof Sandwich) {
				totalCarbs += ((Sandwich) ob).getCarbs();
			}
		}
		return totalCarbs;
	}
}
