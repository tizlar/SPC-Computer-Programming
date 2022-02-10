//darlene westberg
//September 9, 2019 ©
//Chapter 4 if Statements
#include <iostream>
using namespace std;
int main()
{
	int a = 3, b = 4, c = 5;
	/*
	if ( test )
	{
		statement(s);
	}
	2 most common errors:
	1) ; after the test...only statement under the control of the if test is a NULL statement
	2) using a single equal sign when testing for equality instead of ==
	*/
	if (a == b)
		cout << "a is equal to b" << endl;//does not execute because a is NOT equal to b
	if (a = b)
		cout << "a is equal to b" << endl;//executes because test is true since 4 is a non-zero value
	cout << "a is now " << a << endl;
	a = 3;
	if (a == b);
	cout << "a is equal to b" << endl;//executes because the only statement under the control of the if
	//is a NULL statement

	//if with an alternative else
	if (a == c)
		cout << "a is equal to c" << endl;
	else
		cout << "a is NOT equal to c" << endl;
	//if with an if else and default else
	if (a == c)
		cout << "a is equal to c" << endl;
	else if (a == b)
		cout << "a is equal to b" << endl;
	else
		cout << "a is not equal to c and a is not equal to b" << endl;
	//logical operators allow us to build compound if tests
	int num1 = 1, num2 = 3, num3 = 3;
	if (num1 == 1 && num3 == 1)
		cout << "compound if test 1 is true" << endl;//logical && true only if both are true
	if (num1 == 1 || num3 == 1)
		cout << "compound if test 2 is true" << endl;//logical || results in true if either are true
	//don't change the value inside a conditional
	if (++num1 == 1 && num2 == 2 && num3 == 3)
		cout << "not good to change values inside an if statement" << endl;
	cout << "num1 is now " << num1 << endl;
	//conditional operator   ? : ;
	num1 == 1 ? cout << "num1 is equal to 1 " : cout << "num1 is not equal to 1\n";
	c = num1 == 2 ? 100 : 0;
	cout << "c is now " << c << endl;
	system("pause");
	return 0;
}