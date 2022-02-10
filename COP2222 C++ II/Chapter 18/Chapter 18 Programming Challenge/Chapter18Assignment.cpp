//Tristan Izlar
//December 7, 2021 © Windows
//Chapter 18 Programming Challenge

#include <iostream>

using namespace std;

class IntList
{

private:

	struct ListNode
	{
		int value;
		ListNode* next;
	};

	ListNode* head;

public:

	// Constructor
	IntList()
	{
		head = nullptr;
	}

	// Destructor
	~IntList()
	{
		ListNode* nodePtr;   // To traverse the list
		ListNode* nextNode;  // To point to the next node

		// Position nodePtr at the head of the list.
		nodePtr = head;

		// While nodePtr is not at the end of the list...
		while (nodePtr != nullptr)
		{
			// Save a pointer to the next node.
			nextNode = nodePtr->next;

			// Delete the current node.
			delete nodePtr;

			// Position nodePtr at the next node.
			nodePtr = nextNode;
		}
	}

	// Linked list operations
	void appendNode(int val)
	{
		ListNode* newNode;  // To point to a new node
		ListNode* nodePtr;  // To move through the list

		// Allocate a new node and store num there.
		newNode = new ListNode;
		newNode->value = val;
		newNode->next = nullptr;

		// If there are no nodes in the list
		// make newNode the first node.
		if (!head)
			head = newNode;
		else  // Otherwise, insert newNode at end.
		{
			// Initialize nodePtr to head of list.
			nodePtr = head;

			// Find the last node in the list.
			while (nodePtr->next)
				nodePtr = nodePtr->next;

			// Insert newNode as the last node.
			nodePtr->next = newNode;
		}
	}

	void insertNode(int val)
	{
		ListNode* newNode;					// A new node
		ListNode* nodePtr;					// To traverse the list
		ListNode* previousNode = nullptr;	// The previous node

		// Allocate a new node and store num there.
		newNode = new ListNode;
		newNode->value = val;

		// If there are no nodes in the list
		// make newNode the first node
		if (!head)
		{
			head = newNode;
			newNode->next = nullptr;
		}
		else  // Otherwise, insert newNode
		{
			// Position nodePtr at the head of list.
			nodePtr = head;

			// Initialize previousNode to nullptr.
			previousNode = nullptr;

			// Skip all nodes whose value is less than num.
			while (nodePtr != nullptr && nodePtr->value < val)
			{
				previousNode = nodePtr;
				nodePtr = nodePtr->next;
			}

			// If the new node is to be the 1st in the list,
			// insert it before all other nodes.
			if (previousNode == nullptr)
			{
				head = newNode;
				newNode->next = nodePtr;
			}
			else  // Otherwise insert after the previous node.
			{
				previousNode->next = newNode;
				newNode->next = nodePtr;
			}
		}
	}


	void deleteNode(int val)
	{
		ListNode* nodePtr;       // To traverse the list
		ListNode* previousNode = nullptr;  // To point to the previous node

		// If the list is empty, do nothing.
		if (!head)
			return;

		// Determine if the first node is the one.
		if (head->value == val)
		{
			nodePtr = head->next;
			delete head;
			head = nodePtr;
		}
		else
		{
			// Initialize nodePtr to head of list
			nodePtr = head;

			// Skip all nodes whose value member is not equal to num.
			while (nodePtr != nullptr && nodePtr->value != val)
			{
				previousNode = nodePtr;
				nodePtr = nodePtr->next;
			}

			// If nodePtr is not at the end of the list, 
			// link the previous node to the node after
			// nodePtr, then delete nodePtr.
			if (nodePtr)
			{
				previousNode->next = nodePtr->next;
				delete nodePtr;
			}
		}
	}

	void printList()
	{
		ListNode* nodePtr = head;       // To traverse the list

		while (nodePtr) // while nodePtr is observing a node
		{
		cout << nodePtr->value << " "; // print value in console
		nodePtr = nodePtr->next; // move to next node
		}
	}
};


// driver program
int main()
{
	// create IntList object.
	IntList list;

	// demonstrating appending to the list
	list.appendNode(1);
	list.appendNode(2);
	list.appendNode(3);
	list.appendNode(4);
	list.appendNode(5);

	// demonstrating inserting into the list
	list.insertNode(6);

	// demonstrating deleting from the list
	list.deleteNode(3);

	// demonstrating printing the list
	cout << "Printing altered list: " << endl;
	list.printList();

	return 0;
};