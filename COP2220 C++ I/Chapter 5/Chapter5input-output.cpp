//darlene westberg
//August 30, 2018 ©
//Chapter 5 input-output
#include <iostream>
#include <fstream>
#include <iomanip>
using namespace std;
int main()
{
	ofstream outfile;
	ifstream infile;
	char name[31];
	outfile.open("rockstar.txt");
	outfile << "Mick Jagger" << endl;
	outfile << "Jim Morrison" << endl;
	outfile << "Alanis Morriset" << endl;
	outfile << "Lady Gaga" << endl;
	outfile.close();
	cout << "finished writing to rockstar.txt" << endl;

	cout << "reading from file rockstar.txt" << endl;
	infile.open("rockstar.txt");
	/*infile >> name;
	cout << name << endl;
	infile >> name;
	cout << name << endl;
	infile >> name;
	cout << name << endl;
	infile >> name;
	cout << name << endl;*/
	infile.getline(name, 31);
	while (!infile.eof())
	{
		cout << name << endl;
		infile.getline(name, 31);
	}
	infile.close();


	system("pause");
	return 0;
}