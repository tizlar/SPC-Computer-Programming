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

// ProductionWorker class
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
	ShiftSupervisor(string aName, string aNumber, string aDate,
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

class TeamLeader : public ProductionWorker{
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
	TeamLeader(string aName, string aNumber, string aDate, int aShift, double aPayRate, double mb, int rh, int ah) : ProductionWorker(aName, aNumber, aDate, aShift, aPayRate)
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

int main()
{
	ProductionWorker pw("John Jones", "123", "10/12/2010", 2, 18.00);
	displayInfoPW(pw);
	ShiftSupervisor ss("Bob Boberts", "456", "12/15/2017", 70000, 1500);
	displayInfoSS(ss);
	TeamLeader tl("Tristan Izlar", "789", "11/15/2021", 1, 35.00, 1000, 40, 21);
	displayInfoTL(tl);
	return 0;
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