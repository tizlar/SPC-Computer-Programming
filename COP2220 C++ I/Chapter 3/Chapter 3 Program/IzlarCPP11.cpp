// Tristan Izlar
// August 23, 2021
// Chapter 3 Program

#include <iostream>

using namespace std;

int main()
{
	int usPop;
	float avgFamIncome, hourlyWage, floridaGNP;
	short int studentCount;
	char gender;

	cout << "Please respond to the following questions, and DO NOT use commas in your responses.\n";
	cout << "What is the population of the US is?: ";
	cin >> usPop;
	cout << "What is the average family income in the US?: ";
	cin >> avgFamIncome;
	cout << "What is the hourly wage of 1 family member?: ";
	cin >> hourlyWage;
	cout << "What is the count of the total student attending SPC?: ";
	cin >> studentCount;
	cout << "What is the total GNP of Florida?: ";
	cin >> floridaGNP;
	cout << "What is your gender?: ";
	cin >> gender;
	cout << "US Population: " << usPop << "\n";
	cout << "Average Family Income:" << avgFamIncome << "\n";
	cout << "Hourly Wage: " << hourlyWage << "\n";
	cout << "SPC Students: " << studentCount << "\n";
	cout << "Florida GNP: " << floridaGNP << "\n";
	cout << "Gender: " << gender << "\n";

	cout << "\a";
	system("pause");
	cout << "\a";
	system("pause");
	cout << "\a";
	system("pause");
	cout << "\a";
	system("pause");
	cout << "\a";


	return 0;



}