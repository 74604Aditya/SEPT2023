#include<iostream>
using namespace std;

int main(){
	int num1,num2;
	int sum ,sub ,mult ,mod;
	float div;
	cout << "Enter First num : ";
	cin >> num1;

	cout << "Enter Second num : ";
	cin >> num2;

	sum = num1 + num2;
	sub = num1 - num2;
	mult = num1 * num2;
	mod = num1 % num2;
	div = (float)num1/num2;

	cout << "Addition is : "<< sum <<endl;
	cout << "Difference is : "<< sub <<endl;
	cout << "Multiplication is : "<< mult <<endl;
	cout << "Modulus is : "<< mod <<endl;
	cout << "Division is : "<< div <<endl;

	return 0;
}
