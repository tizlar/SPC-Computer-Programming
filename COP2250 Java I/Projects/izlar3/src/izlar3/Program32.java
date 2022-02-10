// SPC ID 00002491103 Tristan Izlar

// This program uses a switch statement
// to look for valid inputs from a user
// when prompted with a request.
// The default entry handles incorrect entries.

package izlar3;
import java.util.*;


public class Program32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter any one of the three branches of the USA government: ");
		String branch = input.next();
		
		switch(branch) {
		case "Legislative":
		case "legislative": System.out.println("The Legislative branch is allowed 435 elected member.");break;
		case  "Executive":
		case  "executive": System.out.println("The Executive branch is allowed 16 members including the cabinet member.");break;
		case "Judicial":
		case "judicial": System.out.println("The Judicial branch is allowed nine Justices.");break;
		default: System.out.println("Your entry was not valid, please try again.");
		}
		
	}

}
