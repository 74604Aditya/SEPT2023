#include <stdio.h>

int findMax(int *num1, int *num2) {
    if (*num1 > *num2) {
        return *num1;
    } else {
        return *num2;
    }
}

int main() {
    int number1 = 5;
    int number2 = 6;

    printf("Number 1 = %d\n", number1);
    printf("Number 2 = %d\n", number2);


    int *ptr1 = &number1;
    int *ptr2 = &number2;

    int max = findMax(ptr1, ptr2);

    printf("The maximum number is: %d\n", max);

    return 0;
}
