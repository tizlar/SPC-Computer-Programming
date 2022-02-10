package izlar20;

public class Car {

	private String vin;
	private String make;
	private String model;
	private int year;
	private double price;
	
	public Car(String vin, String make, String model, int year, double price) {
		super();
		this.vin = vin;
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public String getVin() {
		return vin;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "vin = " + vin + ", make = " + make + ", model = " + model + ", year = " + year + ", price = " + price;
	}
	
	
}
