// SPC ID# 00002491103
// Tristan Izlar

package izlar13;

public abstract class Ship implements Comparable<Ship> {

	// class specific fields
	private String name;
	private int year;
	private int tons;
	public static int numShips;
	
	// object constructor
	public Ship(String name, int year, int tons) {
		super();
		this.name = name;
		this.year = year;
		this.tons = tons;
		numShips++;
	}

	// getters
	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public int getTons() {
		return tons;
	}
	
	// abstract class purpose
	public abstract String purpose();

	// implementing comparable using the compareTo method for Ship tonnage
	@Override
	public int compareTo(Ship o) {
		if (tons > o.getTons()) {
			return 1;
		}
		else if (tons < o.getTons()) {
			return -1;
		}
		else
		return 0; 
	}

	@Override
	public String toString() {
		return "Ship name: " + name + ", year launched: " + year + ", tons: " + tons;
	}
	
	
	
	
	
}
