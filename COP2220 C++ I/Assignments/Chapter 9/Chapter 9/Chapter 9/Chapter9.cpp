// Tristan Izlar
// COP2220
// October 4, 2021
// Chapter 9 Program

#include <iostream>
#include <iomanip>
#include <string>
#include <cstdlib>
#include <ctime>
#include <cstring>
#include <string.h>

using namespace std;

int main()
{

	//step 1.
	double dArr[5];
	long lArr[7] = { 100000, 134567, 123456, 9, -234567, -1, 123489 };
	int iArr[3][5];
	char sName[31] = { 'T','r','i','s','t','a','n' };

	//step 2.
	short cnt1, cnt2;
	long double total = 0;

	//step 3.
	long highest;

	//step 4.
	unsigned seed = time(0);
	srand(seed);

	cout << "dArr values: ";
	for (int i = 0; i < 5; i++)
	{
		dArr[i] = rand();
		cout << dArr[i] << " ";
	}

	//step 5.
	for (int i = 0; i < 5; i++)
	{
		total += dArr[i];
	}

	//step 6.
	cout << "\nTotal of dArr is: " << total;
	cout << "\nAverage of dArr is: " << total / 5;

	//step 7.
	for (cnt1 = 1, highest = lArr[0]; cnt1 < 7; cnt1++)
	{
		//logic to compare each array element, starting with lArr[1], with highest
		//replace highest if the value in lArr[cnt]  is higher than the value in variable highest
		if (lArr[cnt1] > highest)
		{
			highest = lArr[cnt1];
		}
	}

	//step 8.
	cout << "\nHighest value in lArr: " << highest << "\n";

	//step 9.
	srand((unsigned)time(NULL));
	for (int a = 0; a < 3; a++)
	{
		for (int b = 0; b < 5; b++)
		{
			iArr[a][b] = (rand() % (53 - 1 + 1)) + 1;
		}
	}

	//step 10.
	for (int a = 0; a < 3; a++)
	{
		for (int b = 0; b < 5; b++)
		{
			cout << setw(4) << iArr[a][b];
		}
		cout << endl;
	}

	cout << endl;

	//step 11.
	for (int b = 0; b < 5; b++)
	{
		for (int a = 0; a < 3; a++)
		{
			cout << setw(4) << iArr[a][b];
		}
		cout << endl;
	}

	//step 12.
	cout << "\nPlease enter another name: ";
	cin.getline(sName, 30);

	//step 13.
	int letter = 0;
	while (sName[letter] != '\0')
	{
		cout << static_cast<int>(sName[letter]) << endl;
		letter++;
	}

	//step 14.
	strcpy_s(sName, "Albert Einstein");

	//step 15.
	cout << "\nAscii value of 12th character of string sName: " << static_cast<int>(sName[11]) << endl;

	//step 16.
	double *pdArray;

	//step 17.
	pdArray = dArr;

	//step 18.
	for (int i = 0; i < 5; i++)
	{
		cout << dArr[i] << " ";
	}
	cout << endl;

	//step 19.
	for (int i = 0; i < 5; i++)
	{
		cout << *(pdArray + i) << " ";
	}
	cout << endl;

	//step 20.
	for (int i = 0; i < 5; i++, pdArray++)
	{
		cout << *pdArray << " ";
	}
	cout << endl;

	//step 21.
	for (int i = 0; i < 5; i++)
	{
		cout << *(dArr+i) << " ";
	}
	cout << endl;

	//step 22.
	int *piArray = new int[100];

	//step 23.
	for (int i = 0; i < 100; i++)
	{
		piArray[i]= rand() % 49 + 1;
	}

	//step 24.
	for (int i = 0; i < 10; i++)
	{
		cout << piArray[i] << " ";
	}
	cout << endl;

}