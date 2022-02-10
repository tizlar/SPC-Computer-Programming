//darlene westberg
//October 10, 2017 ©
//Chapter 9 review
#include <iostream>
#include <iomanip>
#include <memory>//C++11 smart pointers needs this header
using namespace std;
int main()
{
	//Step 1: create the arrays
	double dArr[5];//explict
	long lArr[] = { 100000, 134567, 123456, 9, -234567, -1, 123489 };//implicit array definition
		//must have initialization list
	int iArr[3][5];
	char sName[31];//for 30 typable characters must be 31 to make room for the null terminator
	//Step 2:
	short cnt1, cnt2;
	long double total = 0;//initialize accumutlator to 0
	//Step 3:
	long highest;
	//Step 4: . a for loop to put a random number into each of the 
	//elements of the array of double, dArr. Use rand() and seed a 
	//random starting point with srand
	srand((unsigned int)time(NULL));
	for (cnt1 = 0; cnt1 < 5; cnt1++)
	{
		dArr[cnt1] = rand();
	}
	//Step 5: another for loop to add up the array of double, dArr, into the variable total
	for (cnt1 = 0; cnt1 < 5; cnt1++)
	{
		total += dArr[cnt1];
	}
	//Step 6:one cout to print the total and another cout to print the average of the double array, 
	//dArr.
	cout << "The total of the elements of dArr is " << total << " using subscript notation" << endl;
	cout << "The average of the elements of dArr is " <<total/5<< " using subscript notation" << endl;
	//Step 5a: another for loop to add up the array of double, using point notation
	for (cnt1 = 0; cnt1 < 5; cnt1++)
	{
		total += *(dArr+cnt1);
	}
	cout << "The total of the elements of dArr is " << total << " using pointer notation" << endl;
	//Step 7:a for loop similar to the following for the long array, lArr:
	//for (cnt1 = 1, highest = lArr[0]; cnt1 < 7; cnt1++)
	//{
		//logic to compare each array element, starting with lArr[1], with highest
		//replace highest if the value in lArr[cnt]  is higher than the value in variable highest
	//}
	for (cnt1 = 1, highest = lArr[0]; cnt1 < 7; cnt1++)
	{
		if (lArr[cnt1] > highest)
			highest = lArr[cnt1];
	}
	//8. a cout to print highest as derived in the above code
	cout << "The highest value in lArr is " << highest << endl;
	//9. a for loop to put a random number, each with a value no lower than 1 and no 
	//higher than 53, into each element of iArr, the array of integer, seed the random 
	//generator Use the modulo operator similar to the way you did with dice rolls in Project 2.
	for (cnt1 = 0; cnt1 < 3; cnt1++)
	{
		for (cnt2 = 0; cnt2 < 5; cnt2++)
			iArr[cnt1][cnt2] = rand() % 53 + 1;
	}
	//10. a separate loop to print iArr with 3 rows on your screen. Each row has 5 numbers. 
	//Use setw to control the width of each column. See Chapter 3 for an example of 
	//a program using setw. Print row by row.
	for (cnt1 = 0; cnt1 < 3; cnt1++)
	{
		for (cnt2 = 0; cnt2 < 5; cnt2++)
			cout << setw(8) << iArr[cnt1][cnt2];
		cout << endl;
	}
	//11. a loop to print the 2 dimensional array, iArr, so that all 3 numbers in column 0 
	//are printed and then on the next line all 3 numbers in column 1, etc.thru column 4. 
	//Print column by column.
	cout << endl;
	for (cnt2 = 0; cnt2 < 5; cnt2++)
	{
		for (cnt1 = 0; cnt1 < 3; cnt1++)
			cout << setw(8) << iArr[cnt1][cnt2];
		cout << endl;
	}
	//12. Use cin.getline(......) to type another name into the variable sName.
	cout << "Please type another name into the variable sName" << endl;
	cin.getline(sName, 31);
	//13. Print the ascii value of each character in the char array, 
		//1 per line. Use a while loop and look for the '\0' as a signal to end.
	cnt1 = 0;
	while (sName[cnt1] != '\0')
	{
		cout << int(sName[cnt1]) << endl;
		cnt1++;		
	}
	//14. make the array of char, sName, have 
		//the name "Albert Einstein" in it.You must use strcpy or strcpy_s function.
	strcpy_s(sName, "Albert Einstein");
	//15. print the ascii value of the 12th character of the string sName
	cout << "The 12th character's ASCII value is " << (int)sName[11] << endl;
	//16. Define a pointer to a double, pdArray.
	double *pdArray;
	//17. Assign the pointer, pdArray, to contain the address of the double array, dArr:
	pdArray = dArr;
	//18. Use the array name, dArr, to print out the array elements with 
	//subscript notation, [].All on 1 line a space between each.
	cout << "The elements of dArr using subscript notation are:" << endl;
	for (cnt1 = 0; cnt1 < 5; cnt1++)
	{
		cout<< dArr[cnt1] << " ";
	}
	cout << endl;
	//19. Use the pointer to print out the array elements with pointer notation while 
	//not changing the pointer itself.Use a for loop. *(pdArray + Cnt1) would be an example.
	//All on 1 line a space between each.
	cout << "Using pointer notation while not changing the pointer" << endl;
	for (cnt1 = 0; cnt1 < 5; cnt1++)
		cout << *(pdArray + cnt1) << " ";
	cout << endl;
	//20. Use the pointer to print out the array elements with pointer notation but 
	//change the pointer to point to the actual array element rather than the method in 18. 
	//All on 1 line. 
//*pdArray would do this if the loop has the following post loop operation : pdArray++
	cout << "The address stored in pdArray before the loop is " << pdArray << endl;
	for (cnt1 = 0; cnt1 < 5; cnt1++, pdArray++)
		cout << *pdArray << " ";
	cout << endl;
	cout << "The address stored in pdArray after the loop is " << pdArray << endl;
	//21. Use the array name for the double array and pointer notation to 
	//print the entire array, all on one line.
	for (cnt1 = 0; cnt1 < 5; cnt1++)
		cout << *(dArr + cnt1) << " ";
	cout << endl;
	//22. Using a different pointer, piArray, 
	//allocate enough memory for 100 int's and assign the address to the pointer.
	int *piArray;
	piArray = new int[100];
	//23. In a for loop assign every item in the array to be a random number 
	//from 1 to 49 (hint: rand() % 6 + 1 gives random numbers from 1 to 6)
	for (cnt1 = 0; cnt1 < 100; cnt1++)
		*(piArray + cnt1) = rand() % 49 + 1;
	//24. Using cout print the first 10 items in the array, all on 1 line.
	for (cnt1 = 0; cnt1 < 10; cnt1++)
		cout << piArray[cnt1] << " ";
	cout << endl;
	//C++11 smart pointers
	short many;
	cout << "How many new doubles do you want?" << endl;
	cin >> many;
	unique_ptr<double[]>ptr(new double[many]);
	for (cnt1 = 0; cnt1 < many; cnt1++)
		ptr[cnt1] = cnt1 + 5;
	for (cnt1 = 0; cnt1 < many; cnt1++)
		cout << ptr[cnt1] << " ";
	cout << endl;
	delete []piArray;//free up dynamically allocated memory using new keyword
	system("pause");
	return 0;
}