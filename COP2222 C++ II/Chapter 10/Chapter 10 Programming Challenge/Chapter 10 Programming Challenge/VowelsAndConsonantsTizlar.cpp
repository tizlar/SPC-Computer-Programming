// Tristan Izlar
// October 15, 2021 © Windows
// Chapter 10 Assignment

/*
INSTRUCTIONS:
Write a function that accepts a pointer to a C-string as its argument. The function should count the number of vowels appearing in the string and return that number.
Write another function that accepts a pointer to a C-string as its argument. This function should count the number of consonants appearing in the string and return that number.
Demonstrate these two functions in a program that performs the following steps:
	The user is asked to enter a string.
	The program displays the following menu:
		Count the number of vowels in the string
		Count the number of consonants in the string
		Count both the vowels and consonants in the string
		Enter another string
		Exit the program
	The program performs the operation selected by the user and repeats until the user selects E to exit the program.
*/


#include <iostream>
#include <iomanip>
#include <string>
#include <cstdlib>
#include <ctime>
#include <cstring>
#include <string.h>
#include <cctype>

using namespace std;

// prototype functions
int vowelCounter(char *str);
int consonantsCounter(char* str);

// main function
int main() { 
	
	// pointer
	char* ptr;

	// sentinal
	char userChoice = 'A';

	// create c-string
	const int SIZE = 101;
	char cString[SIZE];

	cout << "Please enter a string to be tested (max size is 100 characters): ";
	cin.getline(cString, SIZE);

	
	
	while (userChoice != 'E') {
		cout << "Please select from the following options:" << endl;
		cout << "A. Count the number of vowels in the string" << endl;
		cout << "B. Count the number of consonants in the string" << endl;
		cout << "C. Count both the vowels and consonants in the string" << endl;
		cout << "D. Enter another string" << endl;
		cout << "E. Exit the program" << endl;
		cin >> userChoice;
		ptr = cString;

		switch (userChoice) {
		case 'A':
			cout << "Vowels: " << vowelCounter(ptr) << endl;
			cout << endl;
			break;
		case 'B':
			cout << "Consonants: " << consonantsCounter(ptr) << endl;
			cout << endl;
			break;
		case 'C':
			cout << "Vowels: " << vowelCounter(ptr) << endl;
			cout << "Consonants: " << consonantsCounter(ptr) << endl;
			cout << endl;
			break;
		case 'D':
			cout << "Please enter a new string to be tested: ";
			cin.get();
			cin.getline(cString, SIZE);
			cout << endl;
			break;
		case 'E':
			break;

		}

	}


}

// vowel function
int vowelCounter(char* str) {
	
	int count = 0;
	char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

	while (*str != 0) {
		for (int i = 0; i < 5; i++) {

			if (isalpha(*str) && tolower(*str) == vowels[i]) {
				count++;
			}
		}
		str++;
	}
	return count;
	}


// consonants function
int consonantsCounter(char* str) {

	int count = 0, length = strlen(str);
	char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
	while (*str != 0) {
		for (int i = 0; i < 5; i++) {

			if (isalpha(*str) && tolower(*str) == vowels[i]) {
				count++;
			}
		}
		if (isspace(*str)) {
			count++;
		}
		str++;
	}
	count = length - count;
	return count;
	}