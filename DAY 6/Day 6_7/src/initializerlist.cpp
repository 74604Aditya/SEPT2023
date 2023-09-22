#include<string>
#include<iostream>
#include<iomanip>
using namespace std;

using Employee{
private :
	char name[20];
	int empid;
	float salary;
public :
	Employee ( const char *name = "", int empid = 0, float salary = 0.0f);

	void printrecord( void );

};

Employee :: Employee ( const char *name, int empid, float salary ) :
		empid (empid), salary(salary){
	strcpy ( this -> name, name);
}
void Employee {
	const char 8name, int empid, float salary):
		empid( empid ),salary (salary);
	strcpy ( this -> name,name);

	void Employee :: printRecord( void){
		cout << "Name :" << this -> name << endl;
		cout << "Empid :" <<this -> empid << endl;
		cout << "Salary :"<<fixed -> setpricision ( 2 )<<this-> salary << endl;

	}
	int main( void ){
		Employee emp1;
		emp1.printrRecord( );

		Employee emp2( "Sandeep ", 5466, 659656.25f);
		emp2.printRecord();

		return 0;
	};
