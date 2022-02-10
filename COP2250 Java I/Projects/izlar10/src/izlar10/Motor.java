// SPC ID 00002491103 Tristan Izlar

// this class creates Motor instances 
// and has a composition that is utilized by the Vehicle class

package izlar10;

public class Motor {
	
	// instance attributes
	private int cylinders;
	private int hp;
	private String type;
	
	// constructor for class
	Motor(int cylinders, int hp, String type){
		this.cylinders = cylinders;
		this.hp = hp;
		this.type = type;
	}
	
	// cylinder getter
	public int getCylinders() {
		return cylinders;
	}
	
	// horsepower getter
	public int getHp(){
		return hp;
	}
	
	// type getter
	public String getType() {
		return type;
	}
	
	// method to return status of an instance
	public String toString(){
		return String.format("Cylinders: %d Horsepower: %d Type: %s", cylinders, hp, type);
	}
}
