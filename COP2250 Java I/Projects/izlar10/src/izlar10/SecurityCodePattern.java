// SPC ID 00002491103 Tristan Izlar

// using String match method and regex table H.1 on page 1176 from text,
// create a procedure to check if a user entered pattern is acceptable.

package izlar10;
import java.util.Scanner;

public class SecurityCodePattern {

	public static void main(String[] args) {
		
		// new scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt for user
		System.out.println("Enter the code pattern");
		
		//gathering user input
		String code = input.next();
		
		// checking if the entry returns true
		if (code.matches("[A-Z][a-z][A-Z][a-z][\\d]{4}[a-z]{2}[A-Z]{2}[\\d]")) {
			System.out.println("Yes, " + code + " matches the pattern");
		}
		else if (code.matches("[A-Z][a-z][A-Z][a-z][\\d]{4}[a-z]{3}[A-Z]{2}[\\d]")) {
			System.out.println("Yes, " + code + " matches the pattern");
		}
		else {
			System.out.println("Pattern not matched");
		}
		
	}

}
