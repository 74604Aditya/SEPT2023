#include<iostream>
#include<bits/stdc++.h>

using namespace std;

class Student{
private:
     string name;
     int rollNumber;
     float marks;
     char grade;

public:

     void acceptRecord(){
		cout<<"Enter name : ";
		cin>>name;
		cout<<"Enter roll number : ";
		cin>> rollNumber;
		cout<<"Enter marks : ";
		cin>>marks;
		//cout<<"Enter grade : ";
		//cin>>grade;

     }

     void displayRecord(){
		 cout<<"Student name : "<<name<<endl;
		 cout<<"Student roll number : "<<rollNumber<<endl;
		 cout<<"Student marks : "<<marks<<endl;
	     cout<<"Grade : "<<grade<<endl;
     }

     string getName(){
    	 return name;
     }
     void setName(string n){
    	 getline(cin,n);
    	 name=n;
     }
     int getRoll(){
		 return rollNumber;
	  }
     void setRoll(int rn){
         	 rollNumber = rn;
          }

     float getMarks(){
		 return marks;
	  }
     void setMarks(float m){
         	 marks = m;
          }
     char getGrade(){
		 return grade;
	  }
     void setGrade(char g){
         	 grade = g;
          }

     void calculateGrade(){
    	 if(marks>=90 && marks<=100){
    		 grade = 'A';
    	 }
    	 else if(marks>=80 && marks<=89){
    		 grade = 'B';
    	 }
    	 else if(marks>=70 && marks<=79){
    		 grade = 'C';
    	 }
    	 else if(marks>=60 && marks<=69){
    		 grade = 'D';
    	 }
    	 else{
    		 grade = 'F';
    	 }


     }
};

int main(){
	Student stud;
	int c;

	do{
		cout<<"1. Accept information"<<endl;
		cout<<"2. Display info"<<endl;
		cout<<"3. Calculate grade"<<endl;
		cout<<"4. Exit the program"<<endl;
		cin>>c;

		switch(c){
		case 1:
			stud.acceptRecord();
		    break;

		case 2:
			stud.displayRecord();
			break;

		case 3:
			stud.calculateGrade();
			break;

		case 4:
			cout<<"Exit!!";
			break;
		}
	}while(c!=4);

	return 0;
}
