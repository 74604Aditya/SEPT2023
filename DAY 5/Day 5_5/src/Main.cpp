#include<iostream>
using namespace std;
#include"../include/ArithmeticOperation"
#include"../iclude/Calculator"

ArithmeticOperation_t menu list(void){
	int choice;

	cout<< "0.Exit." <<endl;
	cout<< "1.Sum." <<endl;
	cout<< "2.Sub." <<endl;
	cout<< "3.Multiplication." <<endl;
	cout<< "4.Division." <<endl;
	cin >> choice;
	return ArithmeticOperation_t( choice );
}
int main( void ){
	ArithmeticOperation_t choice;
	while (( choice = :: menu_list ()) != 0){

		int result = 0 ;
		switch( choice ){
		case SUM:
			result = sum( 100, 20);
			break;
		case SUB:
			result = sub( 100, 20);
			break;
		case MULTIPLICATION:
			result = sum( 100, 20);
			break;
		case DIVISION:
			result = division( 100, 20);
			break;
		}
		cout << "Result : "<< result << endl;
		}
	return 0;
}
