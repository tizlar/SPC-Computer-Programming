// SPC ID# 00002491103
// Tristan Izlar

// this test class makes use of our Ships class/subclasses
// we demonstrate an abstract method in action in our subclasses
// we also implement the Comparable inferface and see how it affects our sort

package izlar13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestShips {

	public static void main(String[] args) {
		
		// create 6 ship objects
		CruiseShip ship1 = new CruiseShip("Magic", 1998, 83338, 2700, "Caribbean");
		CruiseShip ship2 = new CruiseShip("Titanic", 1912, 46328, 2435, "Atlantic Ocean");
		CargoShip ship3 = new CargoShip("Algeciras", 2020, 228283, "containers", 391);
		CargoShip ship4 = new CargoShip("Seawise Giant", 1979, 260941, "crude oil", 564763);
		WarShip ship5 = new WarShip("USS Nimitz", 1972, 97000, "super carrier", "United States Navy");
		WarShip ship6 = new WarShip("USS Zumwalt DDG 1000", 2013, 15656, "destroyer", "United States Navy");
		
		// throw the ships into an array
		Ship[] shipArray = {ship1, ship2, ship3, ship4, ship5, ship6};
		
		System.out.println("An unordered fleet of various ships\n");
		
		// enhanced for loop to display ship information
		for (Ship o: shipArray) {
			System.out.println(o.getClass());
			System.out.println(o.toString());
			System.out.println(o.purpose());
			System.out.println();
		}
		
		// create an array list from the array
		ArrayList<Ship> shipArrayList = new ArrayList<>(Arrays.asList(shipArray));
		
		// create/add new ship to the arraylist
		CruiseShip ship7 = new CruiseShip("Symphony of the Seas", 2018, 228081, 6680, "Alantic Ocean");
		shipArrayList.add(ship7);
		
		// sort arraylist
		Collections.sort(shipArrayList);
		
		// report the value in numShips variable
		System.out.println("Fleet size is now " + Ship.numShips);
		System.out.println("Fleet sorted by tonnage after adding Symphony of the Seas\n");
		
		// regular for loop to display ship information
		for (int i = 0; i < 7; i++) {
			System.out.println(shipArrayList.get(i).toString());
			System.out.println();
		}

	}


}
