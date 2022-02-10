// Tristan Izlar
// October 25, 2021 © Windows
// Chapter 12 Assignment

//Instructions:
/*
Write a program that asks the user for the name of a file. 
The program should display the contents of the file on the screen. 
Each line of screen output should be preceded with a line number, followed by a colon. 
The line numbering should start at 1. Here is an example:
1:George Rolland
2:127 Academy Street
3:Brasstown, NC 28706

If the file’s contents won’t fit on a single screen, the program should display 24 lines of output at a time, and then pause. 
Each time the program pauses, it should wait for the user to strike a key before the next 24 lines are displayed.
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

int main() {

	string fileName, line;
	int count = 1, limit = 24;
	bool pause = false; 

	cout << "Pleas enter a file name (including file extension): " << endl;
	cin >> fileName;
	cin.ignore();
	cout << endl;

	ifstream inputFile(fileName);

	while (getline(inputFile, line)) {
		if (count % 24 == 0) {
			pause = true;
		}

		cout << count << ": " << line << endl;
		count++;

		if (pause) {
			cout << "\nPress enter to view the next 24 lines.";
			cin.get();
			pause = 0;
		}
			
		}

	inputFile.close();

}