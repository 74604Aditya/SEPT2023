#include<iostream>
using namespace std;

void print(int number){
	cout << "int : "<< number <<endl;
}

void print(float number){
	cout << "float : " << number << endl;
}

int main (void){
	print((int)10.5);
	return 0;

}
