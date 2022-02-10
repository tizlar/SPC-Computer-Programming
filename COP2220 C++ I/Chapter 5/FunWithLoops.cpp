//darlene westberg
//August 30, 2018 ©
//Fun with Loops
#include <iostream>
using namespace std;
int main()
{
	short choice;
	do{
	cout << "1.	Play Games" << endl;
	cout << "2.	Go Home and to Bed" << endl;
	cout << "3.	Play on the Internet" << endl;
	cout << endl;
	cout << "Choose one of the above" << endl;
	cin >> choice;
	system("cls");
	switch (choice)
	{
	case 0:
		cout << "Thank you for playing" << endl;
		break;
	case 1:
		cout << "1.	You chose to Play Games" << endl;
		break;
	case 2:
		cout << "2.	You chose to Go Home and Go to Bed" << endl;
		break;
	case 3:
		cout << "3.	You chose to Play on the Internet…Go To the Hard Drive Cafe" << endl;
		break;
	default:
		cout << "You chose poorly" << endl;
		break;

	}
	} while (choice != 0);

	/*4.	Using the “standard data processing loop” ask the user to enter a number. 
a.	Display that number multiplied by itself.
b.	 Continue to ask the user for input until he/she enters negative one ( -1).
*/
	int num;
	cout << "Enter a number or -1 to Quit and I will give you its square" << endl;
	cin >> num;
	while (num != -1)
	{
		cout << num * num << " is your number squared"<<endl;
		cout << "Enter a number or -1 to Quit and I will give you its square" << endl;
		cin >> num;

	}
	/*5.	Use a For Loop to print only the even numbers between 1 and 10 inclusively.
a.	 Print the numbers all on the same line and after the loop go to a new line. 
b.	Increment the counter by one only.
*/
	for (int counter = 1; counter < 11;counter++)
		if (counter % 2 == 0)
			cout << counter << " ";
	cout << endl;
	/*6.	Same as the previous problem, but make it a While Loop.
(Use a While Loop to print only the even numbers between 1 and 10 inclusively.
a.	 Print the numbers all on the same line and after the loop go to a new line. 
b. Increment the counter by one only)
*/
	num = 1;
	while (num < 11)
	{
		if (num % 2 == 0)
			cout << num << " ";
		num++;
	}
	cout << endl;
	/*7. Create nested for loops
Outer loop will go from 1 to 9
Inner loop will go from 0 to 4
Print out the value of the counters within the loop.
*/
	for (int num1 = 1; num1 < 10;num1++)
	{
		for (int num2 = 0; num2 < 5; num2++)
			cout << num1 << " " << num2 << endl;
	}
	/*8. Create nested for loops
		To print a multiplication table from 1’s to 14’s
		1 * 1 = 1
		1 * 2 = 2
*/
	for (int num1 = 1; num1 < 15;num1++)
	{
		for (int num2 = 1; num2 < 15; num2++)
			cout << num1 << " * " << num2 << " = "<<num1*num2<<endl;
	}
	
	system("pause");
	return 0;
}