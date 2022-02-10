package genericexamples;

public class Side extends Food {
	private String base;
	private int calories;
	
	public Side(String name, double price, String base, int calories) {
		super(name, price);
		this.base = base;
		this.calories = calories;
	}
	public int getCalories() {
		return calories;
	}
	@Override
	public String toString() {
		return super.toString() + "\nBase " + base + ", calories = " + calories;
	}
}
