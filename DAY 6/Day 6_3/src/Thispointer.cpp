#include<iostream>
using namespace std;

class Complex{
private :
	int real;
	int img;
public :
	Complex ( void ){

		this -> real = 0;
		this -> img = 0;
	}

	Complex ( int value ){
		this -> real = value;
		this -> img = value;
	}

	Complex ( int real , int img){
		this -> real = real;
		this -> img = img;
	}

	void printRecord( void){
		cout << "Real Number : " << this -> real << endl;
		cout << "Img Number : " << this -> img << endl;
	}
};

