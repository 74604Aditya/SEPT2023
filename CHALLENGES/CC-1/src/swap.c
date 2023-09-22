#include<stdio.h>

void swap(int *a, int *b, int *c) {
    int temp = *a;
    *a = *c;
    *c = *b;
    *b = temp;
}


int main(void){

        int a=5, b=6, c=7 ;

        printf("Value before Swapping :\n");
        printf(" a = %d \n b = %d \n c = %d \n", a, b, c);

        swap(&a, &b, &c);

        printf("Value after swapping : \n ");
        printf("a = %d \n b = %d \n c = %d \n", a,b,c);

        return 0;
}
