// SPC ID 00002491103 Tristan Izlar

// get positive byte value from user
// cast this value to a char value if it is between 32-122
// inform the user of what this value is in ASCII
// prompt the user that the input was bad if that is the case

package izlar12;
import java.util.*;

public class Program12_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int byteVal;
		char charVal;
		
		try {
		System.out.println("Enter a positive byte value");
		byteVal = input.nextByte();
		if (byteVal >= 32 && byteVal <= 122) {
			charVal = (char)(byteVal);
			System.out.println("In ASCII, that is character " + charVal);
		}
		else {
			System.out.println("Bad input. Please run program again.");
		}
		}
		catch (InputMismatchException ex){
			System.out.println("Bad input. Please run program again.");
		}
		

	}

}
