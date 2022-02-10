// SPC ID 00002491103 Tristan Izlar


// prompt user for a name
// using a void method, print the name backwards as many times as the length of the name

package izlar6;
import java.util.*;

public class Program62 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.println("Please enter a name :");
		String name = input.next();
		flipper(name);

	}
	public static void flipper(String name) {
		int times = name.length();
		
		for(int t = 1; t <= times; t++) {
			for(int i = name.length() - 1; i >= 0; i--) {
				System.out.print(name.charAt(i));
			}
			System.out.println();	
		}
		
	}

}
