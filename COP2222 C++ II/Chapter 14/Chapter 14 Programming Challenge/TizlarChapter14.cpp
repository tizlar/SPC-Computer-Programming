// Tristan Izlar
// November 8, 2021 ©
// COP2222
// Chapter 14 Programming Challenge

#include <iostream>
#include <iomanip>
#include <string>

using namespace std;


// NumDays Class definitions & declarations
class NumDays {

private:
	int hoursWorked;
	int daysWorked;

public:
	// constructor 
	NumDays(int hours = 0) {
		hoursWorked = hours;
		daysWorked = hours / 8;
	}

	// function to recalculate days if desired
	void calcDays() {
		daysWorked = (hoursWorked / 8);
	}

	// mutators
	void setHoursWorked(int hours) {
		hoursWorked = hours;
		daysWorked = hours / 8;
	}

	void setDaysWorked(int days) {
		daysWorked = days;
		hoursWorked = days * 8;
	}

	// accessors
	int getHoursWorked() const {
		return hoursWorked;
	}

	int getDaysWorked() const {
		return daysWorked;
	}

	//overloaded + / -operators
	NumDays operator +(const NumDays& right) {
		NumDays temp;
		temp.setHoursWorked(hoursWorked + right.getHoursWorked());
		return temp;
	}

	NumDays operator -(const NumDays& right) {
		NumDays temp;
		temp.setHoursWorked(hoursWorked - right.getHoursWorked());
		return temp;
	}

	// overloaded ++ prefix & postfix
	NumDays operator ++() {
		++hoursWorked;
		calcDays();
		return *this;
	}

	NumDays operator ++(int) {
		hoursWorked++;
		NumDays temp(hoursWorked);
		calcDays();
		return temp;
	}

	// overloaded -- prefix & postfix
	NumDays operator --() {
		--hoursWorked;
		calcDays();
		return *this;
	}

	NumDays operator --(int) {
		hoursWorked--;
		NumDays temp(hoursWorked);
		calcDays();
		return temp;
	}
};

// TimeOff Class definitions & declarations
class TimeOff {

private:
	int maxSickDays;
	int sickTaken;
	int maxVacation;
	int vacTaken;
	int maxUnpaid;
	int unpaidTaken;
	int idNum;
	string name;
	
public:
	//constructor
	TimeOff(int ms = 0, int st = 0, int mv = 0, int vt = 0, int mu = 0, int ut = 0, int id = 0, string n = "") {
		maxSickDays = ms;
		sickTaken = st;
		if (mv * 8 > 240) {
			cout << "Employees may not accumulate more than 240 hours (30 days) of paid vacation. Vacation days set to 30." << endl;
			maxVacation = 30;
		}
		else
			maxVacation = mv;
		vacTaken = vt;
		maxUnpaid = mu;
		unpaidTaken = ut;
		idNum = id;
		name = n;
	}

	// mutators
	void setMaxSickDays(int ms) {maxSickDays = ms; }
	void setSickTaken(int st) { sickTaken = st; }

	void setMaxVacation(int mv) { 
		if (mv*8 > 240) {
			cout << "Employees may not accumulate more than 240 hours (30 days) of paid vacation. Vacation days set to 30." << endl;
			maxVacation = 30;
		}
		else
		maxVacation = mv;
	}
	void setVacTaken(int vt) { vacTaken = vt; }
	void setMaxUnpaid(int mu) { maxUnpaid = mu; }
	void setUnpaidTaken(int ut) { unpaidTaken = ut; }
	void setIdNum(int id) { idNum = id; }
	void setName(string n) { name = n; }

	// accessors
	int getMaxSickDays() const { return maxSickDays; }
	int getSickTaken() const { return sickTaken;  }
	int getMaxVacation() const { return maxVacation;  }
	int getVacTaken() const { return vacTaken;  }
	int getMaxUnpaid() const { return maxUnpaid;  }
	int getUnpaidTaken() const { return unpaidTaken; }
	int getIdNum() const { return idNum; }
	string getName() const { return name; }
};



// main (Personnel Report)
int main() {

	TimeOff employee;
	int months;

	// prompt for user
	cout << "Please enter the number of months an employee has worked: " << endl;
	cin >> months;

	// calculate days using NumDays class
	NumDays vacLeave(months * 12);
	NumDays sickLeave(months * 8);

	// set employee vacation & sick time off
	employee.setMaxVacation(vacLeave.getDaysWorked());
	employee.setMaxSickDays(sickLeave.getDaysWorked());

	// report amount of time off
	cout << "This employee has " << employee.getMaxVacation() << " vacation days,"
	<< " and " << employee.getMaxSickDays() << " sick days accumulated.";

	return 0;
	
}
