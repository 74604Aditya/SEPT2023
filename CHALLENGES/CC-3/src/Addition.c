#include<stdio.h>

int main(){

        int number1 = 5;
        int number2 = 7;

        int *ptr1 = &number1;
        int *ptr2 = &number2;

        int sum = *ptr1 + *ptr2;
        printf("The sum is : %d\n",sum);

        return 0;
}