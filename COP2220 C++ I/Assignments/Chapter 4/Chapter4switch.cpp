//darlene westberg
//October 23, 2019 ©
//Chapter 4 switch page 204
#include<iostream>
#include <iomanip>
using namespace std;
int main()
{
	/*
	switch( integer test )
	{
	case testData1:
		execute if test is true;
		break;
	case testData2:
		execute if test is true;
		break;
	case testData3:
		execute if test is true;
		break;
	default:
		executes if all above are false;
		break;//don't have to break here
	*/
	int randNum;
	srand(unsigned(time(NULL)));
	randNum = rand()% 12 + 1;
	cout << "My dice roll is " << randNum << endl;
	switch (randNum)
	{
	case 12:
		cout << "Box cars!" << endl;
		break;
	case 7:
	case 11:
		cout << "Craps!!!" << endl;
		break;
	case 3:
	case 4:
	case 5:
	case 6:
	case 8:
	case 9:
	case 10:
		cout << "Throw again" << endl;
		break;
	case 2:
		cout << "Snake Eyes!!" << endl;
		break;
	default:
		cout << "Invalid throw" << endl;
		break;
	}

	if (randNum % 2 == 0)
		cout << "Your dice roll is even " << randNum << endl;
	else
		cout << "Your dice roll is odd " << randNum << endl;



	system("pause");
	return 0;
}