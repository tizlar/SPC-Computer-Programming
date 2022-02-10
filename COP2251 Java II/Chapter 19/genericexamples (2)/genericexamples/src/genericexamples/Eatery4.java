package genericexamples;

import java.util.ArrayList;
import java.util.Arrays;

public class Eatery4 {

	public static void main(String[] args) {

		Food bread = new Food("bread",2.49);
		Food spread = new Food("salad",3.99);	
		Food[] meal = {bread,spread};	
		ArrayList<Food> food = new ArrayList<>(Arrays.asList(meal));
		show1(food);
		show2(food);
	}

	public static void show1(ArrayList <? super Side> f ) {
		System.out.println(f.get(1).getClass());
		System.out.println(f);
	}
	
	public static void show2(ArrayList <? super Sandwich> f ) {
		System.out.println(f.get(0).getClass());
		System.out.println(f);
	}	
}

