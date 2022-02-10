// SPC ID 00002491103 Tristan Izlar

// this is the tester class for our package.
// the sale method in here takes an inventory object and adjusts the price according to the 
// sale percentage that a user gives us.
// in the main method we get the user input, create our inventory objects,
// add them to an array, recalculate and update the price accordingly + print to console. 
// Then we convert to an Arraylist and print new inventory object states to console
// last we provide the inventory value to the user.

package izlar9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class InventoryTest {

		public static void sale(Inventory object, double percentReduction) {
			double discount = object.getPrice() * (percentReduction / 100);
			double newPrice = object.getPrice() - discount;
			//newPrice = (double)Math.round(newPrice * 100) / 100;
			object.setPrice(newPrice);
		}
		
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			double percent;
			
			System.out.println("By what % will blouses be reduced for the sale?");
			percent = input.nextDouble();
			System.out.println("Chica's Clothing");
			
			Inventory item1 = new Inventory("blouse", "B8X12", 24.99, 8);
			Inventory item2 = new Inventory("tunic", "T2A32", 49.99, 10);
			Inventory item3 = new Inventory("pullover", "P6D40", 34.99, 12);
			Inventory item4 = new Inventory("vest", "V9M04", 29.99, 16);
			Inventory item5 = new Inventory("blouse", "B3G12", 34.99, 6);
			Inventory item6 = new Inventory("crops", "C0XS52", 14.99, 20);
			Inventory item7 = new Inventory("skirt", "K6R77", 29.99, 10);
			Inventory item8 = new Inventory("blouse", "B9Z93", 24.99, 10);
			
			Inventory[] clothingArray = new Inventory[] {item1, item2, item3, item4, item5, item6, item7, item8};
			
			double saleValue = 0;
			
			for (int i = 0; i < clothingArray.length; i++) {
				System.out.println(clothingArray[i].toString());
				
				if(clothingArray[i].getSku().startsWith("B")) {
				sale(clothingArray[i], percent);
				}
				saleValue += clothingArray[i].getPrice() * clothingArray[i].getQty();
			}

			System.out.println("After reducing blouses, using ArrayList");
			
			ArrayList<Inventory> list = new ArrayList<>(Arrays.asList(clothingArray));
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).toString());
			}
			
			System.out.println("Total inventory value is $" + saleValue);
		}
		
		

	}

