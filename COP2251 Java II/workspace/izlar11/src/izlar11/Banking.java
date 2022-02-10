// SPC ID# 00002491103
// Tristan Izlar

// this program demonstrates inheritance by extending the class Account, using
// Savings and Checking classes. In general we test this by entering in three 
// accounts and testing different methods from each class.
// savings can hold a interest rate attribute & checking can hold a count of 
// transactions.

package izlar11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		
		// initializing account objects
		Savings account1 = new Savings("college", "S1234", 5000.00, .0175);
		Account account2 = new Checking("bills", "C2311", 8000.00);
		Savings account3 = new Savings("new car", "S2567", 2000.00, .02125);
		
		// basic array to hold account objects
		Account[] arr = new Account[3];
		arr[0] = account1;
		arr[1] = account2;
		arr[2] = account3;
		
		// for each loop to display the contents of each array object
		for (Account e: arr) {
			System.out.println(e.toString());
			
		}
		
		// using deposit, transfer, & withdraw methods
		account1.deposit(1500);
		account3.transfer(800, account2);
		System.out.println("Paid $350 from checking for groceries, etc.");
		account2.withdraw(350);
		System.out.println();
		
		// using add interest methods
		account1.addInterest();
		account3.addInterest();
		System.out.println();
		
		// taking user input for a account withdraw
		Scanner input = new Scanner(System.in);
		System.out.print("Enter checking account withdrawal amount: ");
		account2.withdraw(input.nextDouble());
		System.out.println();
		
		// turning our array into an ArrayList & displaying the contents
		System.out.println("My ArrayList of accounts");
		ArrayList<Account> accountList = new ArrayList<>(Arrays.asList(arr));
		for (int i = 0; i < 3; i++) {
			System.out.println(accountList.get(i).toString());
		}
	}

}
