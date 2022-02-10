//darlene westberg
//November 20, 2019 ©
//Chapter 7 Arrays
#include <iostream>
using namespace std;

int Product(int x, int y);
void FillArray(int x[], short size);
void PrintArray(int x[], short size);
void PrintArray(int x[][3], short rows, short cols);
void ChangeElement(int& x);

int main() 
{
	int a = 5, b = 10;
	int iProduct;
	const short arrNum = 5;
	char myName[31] = "darlene westberg";//need extra element to hold the NULL terminator
	int StudentNums[24];//explicit array definition 
	int iNums[] = { 98,  97, 80, 67 };//implicit definition must have an initialization list
	int iValues[2] = { 1,2 };//can be both implicit and explicit
	int iKeys[arrNum];//must be a const, not a variable
	int iStuff[3] = { 5,4 };
	int widgets[2][3] = { {900,888,777},
	{100,200,300} };

	iProduct = Product(a, b);
	cout << myName << endl;
	cout << "The return from the function Product is " << iProduct << endl;
	cout << "The value of a in main after calling the Product function is " << a << endl;
	strcpy_s(myName, "Tonjua Williams");
	cout << myName << endl;
	cout << StudentNums[0] << endl;//uninitalized array prints gabage
	cout << StudentNums << endl;//prints the address because the name of an array is a pointer to the first element of the array
	iKeys[0] = 99;
	cout << "iKeys[0] is now " << iKeys[0] << endl;
	cout << "iKeys[1] is now " << iKeys[1] << endl;//2nd element is still garbage
	cout << "iStuff[2] is now " << iStuff[2] << endl;
	for (int i = 0; i < 24; i++)
		StudentNums[i] = i + 1;
	for (int i = 0; i < 24; i++)
		cout << StudentNums[i] << " ";
	cout << endl;
	FillArray(StudentNums, 24);
	PrintArray(StudentNums, 24);
	PrintArray(widgets, 2, 3);
	cout << "iStuff[0] is now " << iStuff[0] << endl;
	ChangeElement(iStuff[0]);
	cout << "iStuff[0] is now " << iStuff[0] << endl;

	system("pause");
	return 0;
}
int Product(int x, int y)//passing by value
{
	int answer;
	answer = x * y;
	x = 2000;
	return answer;
}
void FillArray(int x[], short size)//the name of an array is a pointer to the first element of the array so changes in the function are known back in main
{
	for (int i = 0; i < size; i++)
		x[i] = i * 2;
}
void PrintArray(int x[], short size)
{
	for (int i = 0; i < 24; i++)
		cout << x[i] << " ";
	cout << endl;
}
void PrintArray(int x[][3], short rows, short cols)
{
	int row, col;
	for (row = 0; row <2; row++)
	{
		for (col = 0; col < cols; col++)
			cout << x[row][col] << " ";
		cout << endl;
	}
}
void ChangeElement(int& x)//passed by reference
{
	x = 200;
}
