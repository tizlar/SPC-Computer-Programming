// Tristan Izlar
// COP2220
// September 20, 2021
// Chapter 6 Programming Challenge – Lowest Score Drop

#include <iostream>
#include <cstdlib>
#include <iomanip> 
using namespace std;

// validates score provided by user. Ends the program is the score is not valid.
void getScore(int score)
{
	int testScore = score;
	if (score < 0 || score > 100)
	{
		cout << "Invalid score. Scores must be between 0 and 100. Please run program again.";
		exit(0);
	}
}
// finds the lowest score
int findLowest(int score1, int score2, int score3, int score4, int score5)
{
	int testScore1 = score1;
	int testScore2 = score2;
	int testScore3 = score3;
	int testScore4 = score4;
	int testScore5 = score5;
	int lowest;
	lowest = testScore1;
	if (testScore2 < lowest)
		lowest = testScore2;
	if (testScore3 < lowest)
		lowest = testScore3;
	if (testScore4 < lowest)
		lowest = testScore4;
	if (testScore5 < lowest)
		lowest = testScore5;

	cout << "The lowest test score was " << lowest << ". This score will be dropped." << endl;

	return lowest;
	
}
// calculates the average of the four highest scores
void calcAverage(int score1, int score2, int score3, int score4, int score5)
{
	int lowest;
	double average;
	int testScore1 = score1;
	int testScore2 = score2;
	int testScore3 = score3;
	int testScore4 = score4;
	int testScore5 = score5;

	lowest = findLowest(testScore1, testScore2, testScore3, testScore4, testScore5);
	average = (testScore1 + testScore2 + testScore3 + testScore4 + testScore5 - lowest) / 4.0;
	cout << fixed << showpoint << setprecision(2);
	cout << "The average test score was " << average << endl;

}



int main() 
{
	int testScore1;
	int testScore2;
	int testScore3;
	int testScore4;
	int testScore5;

	// getScore() to get each score run 5x
	cout << "Please enter test score 1: ";
	cin >> testScore1;
	getScore(testScore1);
	cout << "Please enter test score 2: ";
	cin >> testScore2;
	getScore(testScore2);
	cout << "Please enter test score 3: ";
	cin >> testScore3;
	getScore(testScore3);
	cout << "Please enter test score 4: ";
	cin >> testScore4;
	getScore(testScore4);
	cout << "Please enter test score 5: ";
	cin >> testScore5;
	getScore(testScore5);

	// calcAveratestScore4ge() gets the average of the four highest scores and displays it. run 1x
	calcAverage(testScore1, testScore2, testScore3, testScore4, testScore5);
		
}