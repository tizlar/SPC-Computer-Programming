// SPC ID 00002491103 Tristan Izlar

// this class creates Vehicle instances 
// and has a composition that utilizes the Motor class

package izlar10;

public class Vehicle {

	// instance attributes
	private String make;
	private String model;
	private int year;
	private double price;
	private Motor motor;
	
	// constructor for class
	Vehicle(String make, String model, int year, double price, Motor motor){
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.motor = motor;
	}
	
	// price setter
	public void setPrice(double price) {
		this.price = price;
	}
	
	// price getter
	public double getPrice() {
		return price;
	}
	
	// method to return status of an instance
	public String toString(){
		return String.format("Make: %s Model: %s Year: %d Price: $%,.2f %s", make, model, year, price, motor.toString());
	}
}
