//darlene westberg
//August 30, 2018 ©
//Chapter 5 for loops
#include <iostream>
using namespace std;

int main()
{
	/*
	for (initialization; test; post loop operation)
	{
		statement(s);
	}
	*/
	int a, b, c;
	a = b = c = 0;
	for (a = 1; a < 10; a++)
		cout << a << endl;
	cout << "a is now " << a << endl;
	for (a = 1; a < 11; a++)
		cout << a << endl;
	cout << "a is now " << a << endl;
	for (int x = 0; x < 25; x++)
		cout << x << endl;
	//cout << "x is now " << x << endl; block scope
	for (; b < 11; b++)
		cout << "b is now " << b << endl;
	/*for (; ;)
		cout << "Hello world!" << endl;*/
	for (b = 1; b < 26; b++)
		cout << b << " ";
	cout << endl;
	//nested for loops
	for (a = 1; a < 3; a++)
		for (b = 1; b < 5; b++)
			cout << "a is now " << a << " and b is now " << b << endl;
	//times table
	for (a = 1; a < 14; a++)
		for (b = 1; b < 14; b++)
			cout << a << " * " << b << " = " << a * b << endl;
	//print odd values between 0 and 50 inclusively
	for (a = 0; a < 51; a++)
		if (a % 2)//return odd values since 1 equates to true
			cout << a << endl;
	for (a = 0; a < 51; a++)
		if (a % 2==1)//return odd values since 1 equates to true
			cout << a << endl;
	//print even values between 0 and 50 inclusively
	for (a = 0; a < 51; a++)
		if (!(a % 2))//returns even values
			cout << a << endl;


	system("pause");
	return 0;
	}