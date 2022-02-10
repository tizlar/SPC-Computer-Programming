package genericexamples;

public class Food {
	private String name;
	private double price;
	
	public Food(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Food " + name + ", price=" + price;
	}

}
