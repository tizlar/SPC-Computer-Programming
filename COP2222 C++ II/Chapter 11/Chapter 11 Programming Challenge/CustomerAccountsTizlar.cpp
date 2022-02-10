// Tristan Izlar
// October 25, 2021 © Windows
// Chapter 11 Assignment

//Instructions:
/*
Customer Accounts
Write a program that uses a structure to store the following data about a customer account:
Name, Address, City, State, and ZIP, Telephone Number, Account Balance, Date of Last Payment
The program should use an array of at least 10 structures. It should let the user enter data into the array, change the contents of any element, and display all the data stored in the array. The program should have a menu-driven user interface.
Input Validation: When the data for a new account is entered, be sure the user enters data for all the fields. No negative account balances should be entered.

Search Function for Customer Accounts Program
Add a function to Programming Challenge 7 (Customer Accounts) that allows the user to search the structure array for a particular customer’s account. 
It should accept part of the customer’s name as an argument then search for an account with a name that matches it. 
All accounts that match should be displayed. If no account matches, a message saying so should be displayed.
*/

#include <iostream>
#include <string>
#include <fstream>
#include <iostream>
#include <iomanip>
#include <string>
#include <cstdlib>
#include <ctime>
#include <cstring>
#include <string.h>
#include <cctype>
#include <typeinfo>

using namespace std;

// structure declaration 
struct accountInfo {
	string name, address, city, state, phone, lastPayDt, zip;
	double balance;
};

// prototyping functions
void addData(accountInfo& acct);
void editData(accountInfo& acct);
void accountSearch(accountInfo accounts[]);

// main
int main() {
	accountInfo accounts[2];
	int choice = 0, choice2, choice3;

	// user menu
	while (choice != 5) {
		cout << "\n\nPlease select an option below:" << endl;
		cout << "1. Add data to array" << endl;
		cout << "2. Edit data in array" << endl;
		cout << "3. Display array data" << endl;
		cout << "4. Search for an account by name" << endl;
		cout << "5. Exit" << endl;
		cin >> choice;
		
		if (choice < 1 || choice > 5) {
			cout << "Please enter a valid choice.";
		}
		// switch to control events after the user makes a choice
		switch (choice) {
		case 1:
			cout << "Choose an account to add data to (enter number 0-1): ";
			cin >> choice2;
			addData(accounts[choice2]);
			break;
		case 2:
			cout << "Choose an account to edit (enter number 0-1): ";
			cin >> choice3;
			editData(accounts[choice3]);
			break;
		case 3: 
			cout << "Displaying available array data...";
			for (int count = 0; count < 2; count++) {
				// accounts that have not been filled out yet will be skipped in the data display
				if (accounts[count].name == "")
					cout << "\n\n\nAccount " << (count + 1) << " Data: Not Yet Entered";
				else {
					cout << "\n\n\nAccount " << (count + 1) << " Data:";
					cout << "\nName: " << accounts[count].name;
					cout << "\nFull Address: " << accounts[count].address << " " << accounts[count].city << " " << accounts[count].state << " " << accounts[count].zip;
					cout << "\nPhone Number: " << accounts[count].phone;
					cout << "\nLast Payment Date: " << accounts[count].lastPayDt;
					cout << "\nAccount Balance: $" << fixed << setprecision(2) << accounts[count].balance;
				}
			}
			break;
		case 4:
			accountSearch(accounts);
			break;
		case 5: 
			exit(0);


		}
	}
}

// function to add data to the array
void addData(accountInfo &acct) {
	int valid = 0;

	cout << "Please enter name on account: \n";
	cin.ignore();
	getline(cin, acct.name);
	cout << "Please enter address on account: \n";
	getline(cin, acct.address);
	cout << "Please enter city for account: \n";
	getline(cin, acct.city);
	cout << "Please enter state for account: \n";
	getline(cin, acct.state);
	cout << "Please enter zip for account: \n";
	getline(cin, acct.zip);
	cout << "Please enter phone for account: \n";
	getline(cin, acct.phone);
	cout << "Please enter the last payment date on account: \n";
	getline(cin, acct.lastPayDt);

	while (valid == 0) {
		cout << "Please enter account balance: \n";
		cin >> acct.balance;
		if (acct.balance < 0) {
			cout << "Invalid balance entered. Please try again.\n";
		}
		else {
			valid = 1;
		}
	}
}

// function to edit existing array items
void editData(accountInfo& acct) {
	int valid = 0, choice = 0;
	cout << "\nSelect an account element to edit: \n";
	cout << "1. Name\n";
	cout << "2. Address\n";
	cout << "3. City\n";
	cout << "4. State\n";
	cout << "5. Zip\n";
	cout << "6. Phone\n";
	cout << "7. Last Payment Date\n";
	cout << "8. Account Balance\n";
	cin >> choice;
	switch (choice) {
	case 1:
		cout << "New Value: ";
		cin.ignore();
		getline(cin, acct.name);
		break;
	case 2:
		cout << "New Value: ";
		cin.ignore();
		getline(cin, acct.address);
		break;
	case 3:
		cout << "New Value: ";
		cin.ignore();
		getline(cin, acct.city);
		break;
	case 4:
		cout << "New Value: ";
		cin.ignore();
		getline(cin, acct.state);
		break;
	case 5:
		cout << "New Value: ";
		cin.ignore();
		getline(cin, acct.zip);
		break;
	case 6:
		cout << "New Value: ";
		cin.ignore();
		getline(cin, acct.phone);
		break;
	case 7:
		cout << "New Value: ";
		cin.ignore();
		getline(cin, acct.lastPayDt);
		break;
	case 8:
		while (valid == 0) {
			cout << "New Value: ";
			cin >> acct.balance;
			if (acct.balance < 0) {
				cout << "Invalid balance entered. Please try again.\n";
			}
			else {
				valid = 1;
			}
		}
		break;
	}
}

// function to search for an account by name, and display any findings.
void accountSearch(accountInfo accounts[]) {
	string searchName;
	int foundCount = 0, found = -1;
	cout << "\nPlease enter a name to search for: \n";
	cin.ignore();
	getline(cin, searchName);

	for (int count = 0; count < 2; count++) {
		string tempStr = accounts[count].name;
		found = tempStr.find(searchName);

		if (found != -1)
		{
			cout << "\n\n\nFound Potential Match!";
			cout << "\nAccount " << (count + 1) << " Data:";
			cout << "\nName: " << accounts[count].name;
			cout << "\nFull Address: " << accounts[count].address << " " << accounts[count].city << " " << accounts[count].state << " " << accounts[count].zip;
			cout << "\nPhone Number: " << accounts[count].phone;
			cout << "\nLast Payment Date: " << accounts[count].lastPayDt;
			cout << "\nAccount Balance: $" << fixed << setprecision(2) << accounts[count].balance;
			foundCount++;
		}
	}
	if (foundCount == 0) {
		cout << "No account matches found.";
	}
}
	

