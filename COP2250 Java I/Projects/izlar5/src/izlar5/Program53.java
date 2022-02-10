// SPC ID 00002491103 Tristan Izlar

// make a program that generates the area/circumference of 8 circles
// and places the values in a table. The radius used must be a random value 10-30
// radius should in a column 6 characters wide, area 12 characters wide with 4 decimals
// and circumference 10 characters wide with 3 decimals

package izlar5;
import java.util.*;
public class Program53 {

	public static void main(String[] args) {
		//String header1 = "Radius", header2 = "Area", header3 = "Circumference";
		//System.out.printf("%6s%12s%10s", header1, header2, header3);
		System.out.println("---------------------------------");
		int radius, count = 0;
		double area, circ;
		
		while(count < 8) {
		radius = 10 + (int)(Math.random() * 21);	
		area = Math.PI * (Math.pow(radius, 2));
		circ = 2 * Math.PI * radius;
		System.out.printf("\n%6d%12.4f%10.3f", radius, area, circ);
		count++;
		}
		System.out.println();
		System.out.println("\n---------------------------------");
	}

}
