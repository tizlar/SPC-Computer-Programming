// SPC ID 00002491103 Tristan Izlar

// this class holds our main method and tests the two class
// made in other files (Motor & Vehicle)

package izlar10;
import java.util.ArrayList;

public class TestVehicle {

	// executable class
	public static void main(String[] args) {
		
		// creating instances of Motor class
		Motor motor1 = new Motor(2, 150, "hybrid");
		Motor motor2 = new Motor(4, 175, "gas");
		Motor motor3 = new Motor(4, 180, "diesel");
		Motor motor4 = new Motor(4, 200, "electric");
		
		// creating instances of Vehicle class
		Vehicle vehicle1 = new Vehicle("Toyota", "Prius", 2012, 15000, motor1);
		Vehicle vehicle2 = new Vehicle("Tesla", "ModelS", 2016, 35000, motor4);
		Vehicle vehicle3 = new Vehicle("Ford", "F-150", 2008, 10000, motor2);
		Vehicle vehicle4 = new Vehicle("Nissan", "Leaf", 2015, 14000, motor4);
		Vehicle vehicle5 = new Vehicle("Chevrolet", "Express", 2019, 40000, motor3);
		
		//ArrayList to hold Vehicle instances
		ArrayList<Vehicle> vehicleList = new ArrayList<>();
		
		// adding vehicles to ArrayList
		vehicleList.add(vehicle1);
		vehicleList.add(vehicle2);
		vehicleList.add(vehicle3);
		vehicleList.add(vehicle4);
		vehicleList.add(vehicle5);

		// for each loop to display the status of each vehicle instance
		for(Vehicle i: vehicleList) {
			System.out.println(i.toString());
		}

	}

}
