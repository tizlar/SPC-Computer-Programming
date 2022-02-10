// SPC ID# 00002491103
// Tristan Izlar

package izlar13;

public class WarShip extends Ship {

	// class specific fields
	private String type;
	private String nation;
	
	// object constructor
	public WarShip(String name, int year, int tons, String type, String nation) {
		super(name, year, tons);
		this.type = type;
		this.nation = nation;
	}
	
	// ship purpose
	@Override
	public String purpose() {
		return "A ship for defense or possibly attack";
	}

	// toString()
	@Override
	public String toString() {
		return "Ship name: " + super.getName() + ", year launched: " + super.getYear() + ", tons: " + super.getTons() + "\nType: " + type + ", operated by " + nation;
	}

	
}
