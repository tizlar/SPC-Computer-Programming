// SPC ID# 00002491103
// Tristan Izlar

package izlar13;

public class CargoShip extends Ship {

	// class specific fields
	private String cargo;
	private int capacity;
	
	// object constructor
	public CargoShip(String name, int year, int tons, String cargo, int capacity) {
		super(name, year, tons);
		this.cargo = cargo;
		this.capacity = capacity;
	}

	// getters
	public int getCapacity() {
		return capacity;
	}

	// ??
	public boolean equals(CargoShip o) {
		return true;
	}

	// ship purpose
	@Override
	public String purpose() {
		return "Hauling cargo across the seas";
	}

	// toString()
	@Override
	public String toString() {
		return "Ship name: " + super.getName() + ", year launched: " + super.getYear() + ", tons: " + super.getTons() + "\nCapacity of " + cargo + " is " + capacity;
	}
	
	
	
	
	
	

}
