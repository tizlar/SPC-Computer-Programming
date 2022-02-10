// SPC ID 00002491103 Tristan Izlar

// The program is taking a user input of a full name
// and breaking that name in three separate variables to 
// be manipulated through various methods.

package izlar4;
import java.util.Scanner;

public class Program41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a first, middle, and last name: ");
		String fullName = input.nextLine();
		System.out.println("Number of chatacters in name: " + fullName.length());
		int firstSpace = fullName.indexOf(" ");
		int lastSpace = fullName.lastIndexOf(" ");
		String firstName = fullName.substring(0, firstSpace);
		String middleName = fullName.substring(firstSpace + 1, lastSpace);
		String lastName = fullName.substring(lastSpace + 1);
		System.out.println("The entered middle name was " + middleName + " and the number of characters in it is " + middleName.length());
		String fInitial = firstName.substring(0,1);
		String mInitial = middleName.substring(0,1);
		String lInitial = lastName.substring(0,1);
		String initials = fInitial.toUpperCase() + "." + mInitial.toUpperCase() + "." + lInitial.toUpperCase();
		System.out.println("The initials of the entered name are " + initials);
		System.out.println("The entered last name in all upper case is " + lastName.toUpperCase());
		System.out.println("The name in alphabetical format is " + lastName + ", " + firstName + " " + middleName);

	}

}
