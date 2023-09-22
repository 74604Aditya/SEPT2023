#include<cstdio>
#include<iostream>

using namespace std;

class Employee{

        private :
                char name[30];
                int empid;
                float salary;


        public :
                void acceptRecord(void) {

                        cout << "Name   :";
                        cin>> name;
                        cout << "Empid  :";
                        cin >> empid;
                        cout << "Salary : ";
                        cin >> salary;
                }

                void printRecord( void ){
                       cout << "Name : " << name << endl;
                       cout << "Empid :" << empid << endl;
                       cout << "Salary :" << salary << endl;
                }
};

int main( void ){

        Employee emp;

        emp.acceptRecord();
        printf("\n Recorded Data : \n");
        emp.printRecord();

        return 0;
}
