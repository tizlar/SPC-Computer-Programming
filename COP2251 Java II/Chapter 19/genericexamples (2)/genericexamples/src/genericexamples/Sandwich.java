package genericexamples;

public class Sandwich extends Food {
	private String meat;
	private int carbs;
	
	public Sandwich(String name, double price, String meat, int carbs) {
		super(name, price);
		this.meat = meat;
		this.carbs = carbs;
	}
	public int getCarbs() {
		return carbs;
	}
	@Override
	public String toString() {
		return super.toString() + "\n" + "Meat " + meat + ", carbs = " + carbs;
	}


}
