// Specification for the Employee class
#include <string>
#include <iostream>
#include <iomanip>
using namespace std;

class Employee
{
private:
	string name;		// Employee name
	string number;		// Employee number
	string hireDate;	// Hire date

public:
	// Default constructor
	Employee()
	{
		name = ""; number = ""; hireDate = "";
	}

	// Constructor
	Employee(string aName, string aNumber, string aDate)
	{
		name = aName; number = aNumber; hireDate = aDate;
	}

	// Mutators
	void setName(string n)
	{
		name = n;
	}

	void setNumber(string num)
	{
		number = num;
	}

	void setHireDate(string date)
	{
		hireDate = date;
	}

	// Accessors
	string getName() const
	{
		return name;
	}

	string getNumber() const
	{
		return number;
	}

	string getHireDate() const
	{
		return hireDate;
	}
};


// Specification for the ProductionWorker Class

#include <string>
using namespace std;

class ProductionWorker : public Employee
{
private:
	int shift;	// The worker's shift
	double payRate;	// The worker's hourly pay rate

public:
	// Default constructor
	ProductionWorker() : Employee()
	{
		shift = 0; payRate = 0.0;
	}

	// Constructor
	ProductionWorker(string aName, string aNumber, string aDate,
		int aShift, double aPayRate) : Employee(aName, aNumber, aDate)
	{
		shift = aShift; payRate = aPayRate;
	}

	// Mutators
	void setShift(int s)
	{
		shift = s;
	}

	void setPayRate(double r)
	{
		payRate = r;
	}

	// Accessors
	int getShiftNumber() const
	{
		return shift;
	}

	string getShiftName() const
	{
		if (shift == 1)
			return "Day";
		else if (shift == 2)
			return "Night";
		else
			return "Invalid";
	}
	double getPayRate() const
	{
		return payRate;
	}
};


// Chapter 15, Programming Challenge 1: Employee and ProductionWorker classes
// Function prototype
void displayInfo(ProductionWorker);

int main()
{
	ProductionWorker pw("John Jones", "123", "10/12/2010", 2, 18.00);
	displayInfo(pw);
	return 0;
}

//******************************************************
// The displayInfo function displays a production      *
// worker's employment information.                    *
//******************************************************
void displayInfo(ProductionWorker e)
{
	cout << setprecision(2) << fixed << showpoint;
	cout << "Name: "
		<< e.getName() << endl;
	cout << "Employee number: "
		<< e.getNumber() << endl;
	cout << "Hire date: "
		<< e.getHireDate() << endl;
	cout << "Shift: "
		<< e.getShiftName() << endl;
	cout << "Shift number: "
		<< e.getShiftNumber() << endl;
	cout << "Pay rate: "
		<< e.getPayRate() << endl;
}