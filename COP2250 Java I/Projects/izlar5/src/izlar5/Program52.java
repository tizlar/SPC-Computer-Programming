package izlar5;
import java.util.*;

// allow the user to enter a binary
// number from 3-8 bits as a string
// convert the binary number to a base-10 decimal number.
// use a for loop.

public class Program52 {
	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		String binaryNum, subStr;
		int baseTenNum = 0, length, parsedInt;
		System.out.println("Please enter a binary number from 3 to 8 bits: ");
		binaryNum = input.next();
		length = binaryNum.length();
		
		
		
		while (length < 3 || binaryNum.length() > 8)
		{
			System.out.println("Please enter a binary number from 3 to 8 bits: ");
			binaryNum = input.next();
			length = binaryNum.length();
		}

		
		
		
		for (int i = 0; i < binaryNum.length(); i++) {
			subStr = binaryNum.substring(i, i + 1);
			parsedInt = Integer.parseInt(subStr);
			--length;
			int converted = (int) (parsedInt * Math.pow(2, length));
			baseTenNum += converted;

		}
		System.out.println(binaryNum + " converted to base 10 is " + baseTenNum);
	
	
	
	}
}
	


