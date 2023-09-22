#include<iostream>
using namespace std;

class Complex{
private :
	int real;
	int img;
public :
	void acceptRecord( int n1, int n2){
		cout << "Enter Real Number : "<< endl;
		cin >> this -> real ;
		cout << "Enter Img Number;"<< endl;
		cin >> this -> img ;
	}
};
int main(void){
	Complex c1;
	c1.acceptRecord(10 , 20);
return 0;
}
