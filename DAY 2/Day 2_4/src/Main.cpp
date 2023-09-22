#include<cstdio>

        struct Employee{
                char Name[20];
                int EmpID;
                float Salary;

                void accept_record( void ){

                        printf("Name :");
                        scanf("%s", Name);
                        printf("EmpID :");
                        scanf("%d", &EmpID);
                        printf("Salary :");
                        scanf("%f", &Salary);
                }

                void print_record( void){

                        printf("Name   : %s\n", Name);
                        printf("EmpID  : %d\n", EmpID);
                        printf("Salary : %f\n", Salary);
                }
        };

int main(void){

        struct Employee emp;

        emp.accept_record( );

        emp.print_record( );

        return 0;
}
