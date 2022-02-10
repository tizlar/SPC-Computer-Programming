// Tristan Izlar
// November 29, 2021 © Windows
// Chapter 17 Assignment

#include <fstream>
#include <set>
#include <iostream>

using namespace std;

int main() {

	set<string> words;
	string word;
	ifstream inputFile("forChap12.txt");

	// loop through file word by word and try inserting into set
	while (inputFile >> word) {
		words.insert(word);
	}

	// close file
	inputFile.close();

	// looping through set and displaying set elements
	for (auto element : words) {
		cout << element << " ";
	}

	cout << endl;

	// word count
	cout << "\nCount of Unique Words: " << words.size() << endl;
}