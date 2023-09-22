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

                        printf("Name   : ");
                        scanf("%s", name);
                        printf("Empid  : ");
                        scanf("%d", &empid);
                        printf("Salary : ");
                        scanf("%f", &salary);
                }

                void printRecord( void ){
                       printf("Name    : %s\n", name);
                       printf("Empid   :  %d\n", empid);
                       printf("Salary  : %f\n", salary);
                }
};

int main( void ){

        Employee emp;

        emp.acceptRecord();
        printf("\n Recorded Data : \n");
        emp.printRecord();

        return 0;
}
