// Tristan Izlar
// COP2220
// September 6, 2021
// Chapter 5 Program

#include <iostream>

using namespace std;

int main()
{
	// defining variables
	int DieRoll, Guess, cnt1, cnt2;

	// sets random number generator to random starting point
	srand((unsigned int)time(NULL));

	// 2. prompt for user input
	cout << "Please enter a whole number between 1 and 6.\n";
	// 3. accept the user guess
	cin >> Guess;

	// 4.  generate a random value between 1 and 6
	DieRoll = rand() % 6 + 1;    //Note: rand is a function returning 0 thru 32767.

	// check if valid entry
	if (Guess < 1 || Guess > 6) {
		cout << "Invalid user entry. Rerun program and try again.";
	}
	// if valid entry
	else {


		// 5. display the guess vs roll
		cout << "Your guess was " << Guess << " and the die roll was " << DieRoll << ".\n";

		// 5. if statement to check if guess was correct
		if (Guess == DieRoll) {
			cout << "WINNER! You guessed correctly.\n";
		}

		// 6. if statement to see if the roll was odd, meaning double winner
		if (DieRoll % 2 != 0) {
			cout << "DOUBLE WINNER! The die roll was odd.\n";
		}



	}

	// 7. complex if test, to see if the guess plus to die roll is greater than or equal to 10 AND even.
	if ((DieRoll + Guess) >= 10 && (DieRoll + Guess) % 2 == 0) {
		cout << "YOU ARE A LUCKY PERSON!\n";
	}
	cout << endl;

	// 8. this for loop prints number 1-5 on a single line. Uses cnt1 as its control variable
	for (cnt1 = 1; cnt1 <= 5; cnt1++) {
		cout << cnt1 << "\t";
	}
	cout << endl;

	// 9.this for loop counts backwards from 100-0 on a single line showing only numbers that are evenly divisible by 17. Uses cnt2 as its control variable
	for (cnt2 = 100; cnt2 >= 0; cnt2--) {
		if (cnt2 % 17 == 0)
			cout << cnt2 << "\t";
	}
	cout << endl;

	// 10. the following while loop counts backwards from 100-0 on a single line showing only numbers that are evenly divisible by 17. 
	int num = 100;
	while (num >= 0) {
		if (num % 17 == 0)
			cout << num << "\t";
		num--;
	}
	cout << endl;

	// 11. the following do-while loop accepts user input and returns a remainder value, until the user presses 0
	do {
		cout << "\nPlease enter a number (Press 0 to end loop): " << endl;
		cin >> Guess;
		cout << "Remainder of number divided by 5: " << (Guess % 5) << endl;
	} while (Guess != 0);
	cout << endl;

	// 12.this loop outputs a table like structure of the multiples of 1-5 & 1-6 by use of for loops. Uses cnt1 & cnt2 as its control variables.
	for (cnt1 = 1; cnt1 <= 5; cnt1++) {
		for (cnt2 = 1; cnt2 <= 6; cnt2++) {
			cout << (cnt1 * cnt2) << "\t";
		}
		cout << endl;
	}
}