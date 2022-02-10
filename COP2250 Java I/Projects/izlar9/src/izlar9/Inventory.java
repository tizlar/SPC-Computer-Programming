// SPC ID 00002491103 Tristan Izlar

// this class exists in the same package as my testing class "InventoryTest"
// four private class members are made to hold data on each inventory object
// a public static member is made to track the value of the inventory as new objects are made
// a constructor is made to assign values to each member when an Inventory object is instantiated
// this constructor also updates the static inventory value member with each addition to the class
// getters and setters are established to allow us to get and set certain class members
// a toString function is made to return our objects state as a string.

package izlar9;

public class Inventory {

	private String descrip, sku;
	private double price;
	private int qty;
	public static double value = 0;
	
	Inventory(String descrip, String sku, double price, int qty){
		this.descrip = descrip;
		this.sku = sku;
		this.price = price;
		this.qty = qty;
		this.value += price * qty;
	}
	public String getSku(){
		return sku;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String toString() {
		return String.format("%s, sku %s, price $%.2f, in stock %d", descrip, sku, price, qty);
	}
	
	
}
