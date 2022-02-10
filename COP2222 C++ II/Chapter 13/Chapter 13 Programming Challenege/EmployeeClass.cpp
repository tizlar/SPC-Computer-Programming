// Tristan Izlar
// November 1, 2021 © Windows
// Chapter 13 Assignment


#include <iostream>
#include <string>
#include <fstream>
#include <iostream>
#include <iomanip>
#include <string>
#include <cstdlib>
#include <ctime>
#include <cstring>
#include <string.h>
#include <cctype>
#include <typeinfo>

using namespace std;

// employee class declaration
class Employee
{

private:
	string name;
	int idNumber;
	string department;
	string position;
	
public:
	void setName(string);
	void setIdNumber(int);
	void setDepartment(string);
	void setPosition(string);
	string getName() const;
	int getIdNumber() const;
	string getDepartment() const;
	string getPosition() const;
	
	// default constructor
	Employee() {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}

	// overloaded constructor #1
	Employee(string nm, int id) {
		name = nm;
		idNumber = id;
		department = "";
		position = "";
	}
	
	// overloaded constructor #2
	Employee(string nm, int id, string dept, string pos) {
		name = nm;
		idNumber = id;
		department = dept;
		position = pos;
	}
};

// mutator functions
void Employee::setName(string nm)
{
	name = nm;
}

void Employee::setIdNumber(int id)
{
	idNumber = id;
}

void Employee::setDepartment(string dept)
{
	department = dept;
}

void Employee::setPosition(string pos)
{
	position = pos;
}

// accessor functions
string Employee::getName() const
{
	return name;
}

int Employee::getIdNumber() const
{
	return idNumber;
}

string Employee::getDepartment() const
{
	return department;
}

string Employee::getPosition() const
{
	return position;
}


int main()
{
	Employee employees[3] = {
		Employee("Susan Meyers", 47899, "Accounting", "Vice President"),
		Employee("Mark Jones", 39119, "IT", "Programmer"),
		Employee("Joy Rogers", 81774, "Manufacturing", "Engineer") };

	cout << setw(20) << "Name" << setw(20) << "ID" << setw(20) << "Department" << setw(20) << "Position\n";

	cout << "------------------------------------------------------------------------------------\n";

	for (int i = 0; i < 3; i++)
	{
		cout << setw(20) << employees[i].getName();
		cout << setw(20) << employees[i].getIdNumber();
		cout << setw(20) << employees[i].getDepartment();
		cout << setw(20) << employees[i].getPosition() << endl;
	}

	return 0;


}