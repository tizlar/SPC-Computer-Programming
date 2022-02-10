// Tristan Izlar
// August 30, 2021
// COP2220
// Chapter 4 Programming Challenge

#include <iostream>
#include <iomanip>

using namespace std;

int main() 
{
	// define variables/constants
	const double PRICE = 99.00;
	const double DISCOUNT_1 = .2;
	const double DISCOUNT_2 = .3;
	const double DISCOUNT_3 = .4;
	const double DISCOUNT_4 = .5;
	int numUnits, discountPrecentage;
	double totalCost, totalDiscount = 0;

	// prompt/accept user input and assign to numUnits
	cout << "Please provide how many software packages you wish to purchase. Each package retails for $99\n";
	cin >> numUnits;

	// handles invalid input
	if (numUnits < 1) {
		cout << "Invalid user input. Please rerun program and try again.";
	}
	// handles calculations if input is valid
	else {
		// no discount
		if (numUnits < 10) {
			totalDiscount = PRICE * numUnits * 0;
			totalCost = PRICE * numUnits - totalDiscount;
			discountPrecentage = 0;
		}
		// discount level 1
		else if (numUnits >= 10 && numUnits <= 19) {
			totalDiscount = PRICE * numUnits * DISCOUNT_1;
			totalCost = PRICE * numUnits - totalDiscount;
			discountPrecentage = static_cast<int>(DISCOUNT_1 * 100);
		}
		// discount level 2
		else if (numUnits >= 20 && numUnits <= 49) {
			totalDiscount = PRICE * numUnits * DISCOUNT_2;
			totalCost = PRICE * numUnits - totalDiscount;
			discountPrecentage = static_cast<int>(DISCOUNT_2 * 100);
		}
		// discount level 3
		else if (numUnits >= 50 && numUnits <= 99) {
			totalDiscount = PRICE * numUnits * DISCOUNT_3;
			totalCost = PRICE * numUnits - totalDiscount;
			discountPrecentage = static_cast<int>(DISCOUNT_3 * 100);
		}
		// discount level 4
		else if (numUnits >= 100) {
			totalDiscount = PRICE * numUnits * DISCOUNT_4;
			totalCost = PRICE * numUnits - totalDiscount;
			discountPrecentage = static_cast<int>(DISCOUNT_4 * 100);
		}

		// order cost & discount results
		cout << fixed << showpoint << setprecision(2)
		<< "Total cost of purchase: $" << totalCost;
		cout << "\nDiscount Percentage: " << discountPrecentage << "%";
		cout << "\nDiscount Total: $" << totalDiscount;
	}
}