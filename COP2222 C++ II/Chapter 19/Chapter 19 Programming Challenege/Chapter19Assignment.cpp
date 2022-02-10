//Tristan Izlar
//December 7, 2021 © Windows
//Chapter 19 Programming Challenge

#include <iostream>

using namespace std;


class IntStack
{
private:
	int* stackArray;  // Pointer to the stack array
	int stackSize;    // The stack size
	int top;          // Indicates the top of the stack

public:
	// Constructor
	IntStack(int size)
	{
		stackArray = new int[size];
		stackSize = size;
		top = -1;
	}

	// Copy constructor
	IntStack(const IntStack& obj)
	{
		// Create the stack array.
		if (obj.stackSize > 0)
			stackArray = new int[obj.stackSize];
		else
			stackArray = nullptr;

		// Copy the stackSize attribute.
		stackSize = obj.stackSize;

		// Copy the stack contents.
		for (int count = 0; count < stackSize; count++)
			stackArray[count] = obj.stackArray[count];

		// Set the top of the stack.
		top = obj.top;
	}

	// Destructor
	~IntStack()
	{
		delete[] stackArray;
	}

	// Stack operations
	void push(int num)
	{
		if (isFull())
		{
			cout << "The stack is full.\n";
		}
		else
		{
			top++;
			stackArray[top] = num;
		}
	}

	void pop(int& num)
	{
		if (isEmpty())
		{
			cout << "The stack is empty.\n";
		}
		else
		{
			num = stackArray[top];
			top--;
		}
	}

	bool isFull() const
	{
		bool status;

		if (top == stackSize - 1)
			status = true;
		else
			status = false;

		return status;
	}

	bool isEmpty() const
	{
		bool status;

		if (top == -1)
			status = true;
		else
			status = false;

		return status;
	}
};

class MathStack : public IntStack
{
public:
	// Constructor
	MathStack(int s) : IntStack(s) {}

	// MathStack add
	void add()
	{
		int num, sum;

		// Pop the first two values off the stack.
		pop(sum);
		pop(num);

		// Add the two values, store in sum.
		sum += num;

		// Push sum back onto the stack.
		push(sum);
	}

	// MathStack subtract
	void sub()
	{
		int num, diff;

		// Pop the first two values off the stack.
		pop(diff);
		pop(num);

		// Subtract num from diff.
		diff -= num;

		// Push diff back onto the stack.
		push(diff);
	}

	// MathStack mult
	void mult()
	{
		int num1, num2, product;

		pop(num1);
		pop(num2);
		
		product = num1 * num2;

		push(product);
	}
	// MathStack div
	void div()
	{
		int num1, num2, quotient;

		pop(num1);
		pop(num2);

		quotient = num2 / num1;

		push(quotient);
	}
	// MathStack addAll
	void addAll()
	{
		int sum = 0, num;

		while (!isEmpty()) {
			pop(num);
			sum += num;
		}
		push(sum);
	}
	// MathStack multAll
	void multAll()
	{
		int product = 1, num;

		while (!isEmpty()) {
			pop(num);
			product *= num;
		}
		push(product);
	}
};

// driver program
int main()
{
	int demoVar;

	// texting mult
	MathStack stack1(3);
	stack1.push(1);
	stack1.push(2);
	stack1.push(3);
	stack1.mult();
	cout << "The result of mult is a value of ";
	stack1.pop(demoVar);
	cout << demoVar << endl;

	// testing div 
	MathStack stack2(2);
	stack2.push(10);
	stack2.push(5);
	stack2.div();
	cout << "The result of div is a value of ";
	stack2.pop(demoVar);
	cout << demoVar << endl;

	// testing addAll
	MathStack stack3(3);
	stack3.push(7);
	stack3.push(8);
	stack3.push(9);
	stack3.addAll();
	cout << "The result of addAll is a value of ";
	stack3.pop(demoVar);
	cout << demoVar << endl;

	// testing multAll
	MathStack stack4(3);
	stack4.push(4);
	stack4.push(5);
	stack4.push(6);
	stack4.multAll();
	cout << "The result of multAll is a value of ";
	stack4.pop(demoVar);
	cout << demoVar << endl;
}
