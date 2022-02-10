// Tristan Izlar
// November 23, 2021 © Windows
// Chapter 16 Assignment

// Specification for the Employee class
#include <string>
#include <iostream>
#include <iomanip>
using namespace std;

class Employee
{
private:
	string name;		// Employee name
	int number;		// Employee number
	string hireDate;	// Hire date
public:
	// Exception class
	class InvalidEmployeeNumber {};

	// Default constructor
	Employee()
	{
		name = ""; number = 0; hireDate = "";
	}

	// Constructor
	Employee(string aName, int aNumber, string aDate)
	{
		name = aName; 
		if (aNumber < 0 || aNumber > 9999) {
			throw InvalidEmployeeNumber();
		}
		else {
			number = aNumber;
		}
		hireDate = aDate;
	}

	// Mutators
	void setName(string n)
	{
		name = n;
	}

	void setNumber(int num)
	{
		if (num < 0 || num > 9999) {
			throw InvalidEmployeeNumber();
		}
		else {
			number = num;
		}
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

	int getNumber() const
	{
		return number;
	}

	string getHireDate() const
	{
		return hireDate;
	}
};

// ProductionWorker class
class ProductionWorker : public Employee
{
private:
	int shift;	// The worker's shift
	double payRate;	// The worker's hourly pay rate

public:
	// Exception classs
	class InvalidShift {};
	class InvalidPayRate {};

	// Default constructor
	ProductionWorker() : Employee()
	{
		shift = 0; payRate = 0.0;
	}

	// Constructor
	ProductionWorker(string aName, int aNumber, string aDate,
		int aShift, double aPayRate) : Employee(aName, aNumber, aDate)
	{
		if ((aShift == 1) || (aShift == 2)) {
			shift = aShift;
		}
		else {
			throw InvalidShift();
		}
		if (aPayRate >= 0) {
			payRate = aPayRate;
		}
		else {
			throw InvalidPayRate();
		}
	}

	// Mutators
	void setShift(int s)
	{
		if ((s == 1) || (s == 2)) {
			shift = s;
		}
		else {
			throw InvalidShift();
		}
	}

	void setPayRate(double r)
	{
		if (r >= 0) {
			payRate = r;
		}
		else {
			throw InvalidPayRate();
		}
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

// ShiftSupervisor class
class ShiftSupervisor : public Employee {

private:
	double salary;
	double bonus;
public:
	// Default Constructor
	ShiftSupervisor() : Employee() {
		salary = 0; bonus = 0;
	}

	// Constructor
	ShiftSupervisor(string aName, int aNumber, string aDate,
		int s, double b) : Employee(aName, aNumber, aDate)
	{
		salary = s; bonus = b;
	}

	// Mutators
	void setSalary(double s) {
		salary = s;
	}

	void setBonus(double b) {
		bonus = b;
	}

	// Accessors
	double getSalary() {
		return salary;
	}

	double getBonus() {
		return bonus;
	}

};

class TeamLeader : public ProductionWorker {
private:
	double monthlyBonus;
	int reqHours;
	int attnHours;

public:
	// Default Constructor
	TeamLeader() : ProductionWorker() {
		monthlyBonus = 0; reqHours = 0; attnHours = 0;
	}

	// Constructor
	TeamLeader(string aName, int aNumber, string aDate, int aShift, double aPayRate, double mb, int rh, int ah) : ProductionWorker(aName, aNumber, aDate, aShift, aPayRate)
	{
		monthlyBonus = mb; reqHours = rh; attnHours = ah;
	}

	// Mutators
	void setMonthlyBonus(double mb) {
		monthlyBonus = mb;
	}

	void setReqHours(int rh) {
		reqHours = rh;
	}

	void setAttnHours(int ah) {
		attnHours = ah;
	}

	// Accessors
	double getMonthlyBonus() {
		return monthlyBonus;
	}

	int getReqHours() {
		return reqHours;
	}

	int getAttnHours() {
		return attnHours;
	}
};

// Function prototype
void displayInfoPW(ProductionWorker);
void displayInfoSS(ShiftSupervisor e);
void displayInfoTL(TeamLeader e);


// main driver
int main()
{
	// Exception # 1 Test
	try {
		TeamLeader InvalidEmployeeNumberTest("Tristan Izlar", 15000, "11/15/2021", 1, 35.00, 1000, 40, 21);
		displayInfoTL(InvalidEmployeeNumberTest);
	}
	catch (Employee::InvalidEmployeeNumber) {
		cout << "Invalid Employee Number Entered!" << endl;
	}

	// Exception # 2 Test
	try {
		ProductionWorker InvalidShiftTest("John Jones", 123, "10/12/2010", 0, 18.00);
		displayInfoPW(InvalidShiftTest);
	}
	catch (ProductionWorker::InvalidShift) {
		cout << "Invalid Shift Entered!" << endl;
	}

	// Exception # 3 Test
	try {
		ProductionWorker InvalidPayRateTest("John Jones", 123, "10/12/2010", 1, -2);
		displayInfoPW(InvalidPayRateTest);
		return 0;
	}
	catch (ProductionWorker::InvalidPayRate) {
		cout << "Invalid Pay Rate Entered!" << endl;
	}
}


//******************************************************
// The displayInfo functions displays employment information. *
//******************************************************
void displayInfoPW(ProductionWorker e)
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

void displayInfoSS(ShiftSupervisor e)
{
	cout << setprecision(2) << fixed << showpoint;
	cout << "Name: "
		<< e.getName() << endl;
	cout << "Employee number: "
		<< e.getNumber() << endl;
	cout << "Hire date: "
		<< e.getHireDate() << endl;
	cout << "Salary: $"
		<< e.getSalary() << endl;
	cout << "Bonus Amount: $"
		<< e.getBonus() << endl;
}

void displayInfoTL(TeamLeader e)
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
	cout << "Monthly Bonus: $"
		<< e.getMonthlyBonus() << endl;
	cout << "Required Training Hours: "
		<< e.getReqHours() << endl;
	cout << "Attended Training Hours: "
		<< e.getAttnHours() << endl;
}