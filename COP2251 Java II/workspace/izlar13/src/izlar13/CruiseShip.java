// SPC ID# 00002491103
// Tristan Izlar

package izlar13;

public class CruiseShip extends Ship {
    
	// class specific fields
	private int passengers;
	private String zone;
	
	// object constructor
	public CruiseShip(String name, int year, int tons, int passengers, String zone) {
		super(name, year, tons);
		this.passengers = passengers;
		this.zone = zone;
	}

	// getters
	public int getPassengers() {
		return passengers;
	}

	public String getZone() {
		return zone;
	}
	
	// ship purpose
	@Override
	public String purpose() {
		return "A holiday vessel for vacationers";
	}

	// toString()
	@Override
	public String toString() {
		return "Ship name: " + super.getName() + ", year launched: " + super.getYear() + ", tons: " + super.getTons() + "\n" + passengers + " passenger capacity, operating in the " + zone;
	}
	
	
	
	
	
	
}
