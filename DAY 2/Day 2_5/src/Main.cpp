#include<cstdio>

int main(void){

        struct Employee{
                char Name[20];
                int EmpID;
                float Salary;
        };

        struct Employee emp;
        struct Employee *ptr = &emp;

                        printf("Name :");
                        scanf("%s", ptr -> Name);
                        printf("EmpID :");
                        scanf("%d", &ptr -> EmpID);
                        printf("Salary :");
                        scanf("%f", &ptr -> Salary);




                        printf("Name   : %s\n", ptr -> Name);
                        printf("EmpID  : %d\n", ptr -> EmpID);
                        printf("Salary : %f\n", ptr -> Salary);

        return 0;
}
