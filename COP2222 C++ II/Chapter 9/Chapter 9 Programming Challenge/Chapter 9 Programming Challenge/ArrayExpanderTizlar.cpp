// Tristan Izlar
// October 14, 2021 © Windows
// Chapter 9 Assignment

/*
INSTRUCTIONS:
Array Expander
Write a function that accepts an int array and the array’s size as arguments. 
The function should create a new array that is twice the size of the argument array. 
The function should copy the contents of the argument array to the new array and initialize the unused elements of the second array with 0. 
The function should return a pointer to the new array.

Use Pointer Notation for the function and within the function. 
Use a main function and return the pointer from the ArrayExpander function to main.
*/

#include <iostream>
#include <iomanip>
#include <string>
#include <cstdlib>
#include <ctime>
#include <cstring>
#include <string.h>

using namespace std;

// prototyping function
int *arrayExpander(int[], int);


// main function
int main() {
	
	int arr[5] = {1,2,3,4,5};
	int *newArr = arrayExpander(arr, 5);


	for (int count = 0; count < 10; count++) {
		cout << newArr[count] << " ";
	}

	delete newArr;


}

// creating expander function
int *arrayExpander(int origArray[], int size) {

	// initialize variables to use
	int *newArray = nullptr, newSize = size * 2, count;

	//  dynamically allocate newArray
	newArray = new int[newSize];

	// for loop to assign values to newArray
	for (count = 0; count < newSize; count++) {

		if (count < 5) {
			*(newArray + count) = *(origArray + count);
		}
		else {
			*(newArray + count) = 0;
		}
	}

	// return array as pointer
	return newArray;

}

