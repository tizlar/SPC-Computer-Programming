package izlar21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class Chapter21Assignment {

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
			new Car("80684", "Nissan", "Leaf", 2000, 10000)
		};
		
		// converting array of Cars to ArrayList
		ArrayList<Car> arrCars = new ArrayList<>(Arrays.asList(cars));
		
		// enhanced for loop to print arrCars
		for (Car o : arrCars) {
			System.out.println(o.toString());
		}
		
		// create TreeMap
		TreeMap<String, Car> carsMap = new TreeMap<>();
		
		// loop through ArrayList and add elements to map
		for (Car o : arrCars) {
			carsMap.put(o.getVin(), o);
		}
		
		System.out.println();
		
		// using carsMap forEach to print out cars (auto sorts as a tree map) 
		carsMap.forEach((k,v) -> System.out.println(v));
			
			
}
}