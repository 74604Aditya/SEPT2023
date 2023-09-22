#include<iostream>
#include<string>
#include"../include/Student.h"
using namespace std;

using namespace st;
int main(void){
   Student s1;
   s1.setName("Aditya");
   s1.setRollN(002);
   s1.setMarks(80);
   s1.calculateGrade();
   s1.printRecord();

}
