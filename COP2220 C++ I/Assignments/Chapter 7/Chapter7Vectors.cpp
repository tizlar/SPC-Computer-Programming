//darlene westberg
//November 20, 2019 ©
//Chapter 7 Vectors
#include <iostream>
#include <vector>
using namespace std;

int main()
{
	vector<int>values;
	short num;
	cout << "How many numbers do you want in your vector? " << endl;
	cin >> num;
	for (int cnt = 0; cnt < num; cnt++)
	{
		int tempValue;
		cout << "Enter a value " << endl;
		cin >> tempValue;
		values.push_back(tempValue);
	}
	for (int val : values)//range based for loop
		cout << val << endl;
	cout << "The number of elements in the values vector is \n" << values.size() << endl;
	cout << "popping a value from the vector " << endl;
	values.pop_back();
	for (int val : values)//range based for loop
		cout << val << endl;
	int StudentNums[24];
	cout << "The number of bytes in the array is ";
	cout << sizeof(StudentNums) << endl;
	cout << "The number of elements in StudentNums is ";
	cout << sizeof(StudentNums) / sizeof(StudentNums[0]) << endl;
	cout << size(StudentNums) << endl;
	system("pause");
	return 0;
}