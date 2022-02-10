// SPC ID 00002491103 Tristan Izlar

// this program generates a random 
// number from 20-40, and checks if 
// it is below freezing or not using 
// a conditional operator.
package izlar3;

public class Program33 {

	public static void main(String[] args) {
		int temp = 20 + (int)(Math.random() * 21);
		System.out.println(temp + ((temp <= 32)? " is below freezing": " is not a below freezing"));
	}

}
