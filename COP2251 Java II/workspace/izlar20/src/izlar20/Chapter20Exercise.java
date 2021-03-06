package izlar20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Chapter20Exercise {

	public static void main(String[] args) {
		
		// array of Car objects
		Car[] cars = {
				new Car("12345", "Toyota", "Carrola", 2020, 15000),
				new Car("67890", "Nissan", "Frontier", 2020, 16000),
				new Car("11534", "Nissan", "Murano", 2020, 20000),
				new Car("14834", "Ford", "Fiesta", 2020, 5000),
				new Car("18462", "Toyota", "Sienna", 2021, 75000),
				new Car("14083", "Chevy", "Bolt", 2020, 8000),
				new Car("17842", "Ford", "F-150", 2020, 16000.75),
				new Car("18764", "Chevy", "Silverado", 2005, 14060),
				new Car("39459", "Toyota", "Takoma", 2021, 1000),
				new Car("80684", "Nissan", "Leaf", 2000, 10000),	
		};
		
		// converting array of Cars to ArrayList
		ArrayList<Car> arrCars = new ArrayList<>(Arrays.asList(cars));
		
		// shuffle of arrCars
		Collections.shuffle(arrCars);
		
		// sorting arrCars on year and then price
		Collections.sort(arrCars, Comparator.comparing(Car::getYear).thenComparing(Car::getPrice));
		
		// displaying arrCars with forEach method
		System.out.println("Printing ArrayList sorted on year and then price: ");
		arrCars.forEach(e -> System.out.println(e));
		
		// turning arrCars to a LinkedList
		LinkedList<Car> linkedCars = new LinkedList<Car>(arrCars);
		
		// creating iterator for new LinkedList
		ListIterator<Car> iterCars = linkedCars.listIterator();
		
		// iterating forward through LinkedList
		while ( iterCars.hasNext() )  {
			 iterCars.next();
	        }
		
		// iterating backward through LinkedList and printing objects
		System.out.println("\nIterating through LinkedList Backward: ");
		while ( iterCars.hasPrevious() )  {
	            System.out.println(iterCars.previous());
	        }
	}
}
