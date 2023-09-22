#include<iostream>
#include<bits/stdc++.h>

using namespace std;

class BankAccount{
private:
	int accountNumber;
	string accountHolderName;
	double balance;

public:

     void deposit(float amount){
		cout<<"Enter Account Holder name : ";
		cin>>accountHolderName;
		cout<<"Enter Account number : ";
		cin>> accountNumber;
		balance = amount;
     }

     void withdraw(float wd){
    	 balance = (balance - wd);
     }

     void displayAccountDetails(){
		 cout<<"Account Number : "<<accountNumber<<endl;
		 cout<<"Account Holder Name : "<<accountHolderName<<endl;
		 cout<<"Balance : "<<balance<<endl;
     }

     string getAccountHolderName(){
    	 return accountHolderName;
     }
     void setAccountHolderName(string n){
    	 getline(cin,n);
    	 accountHolderName=n;
     }
     int getAccountNumber(){
		 return accountNumber;
	  }
     void setAccountNumber(int an){
    	 accountNumber = an;
          }

     double getBalance(){
		 return balance;
	  }
     void setBalance(double b){
    	 balance = b;
       }



};

int main(){
	BankAccount bank;
	int c;

	do{
		cout<<"1.Deposit money into an existing account."<<endl;
		cout<<"2.Withdraw money from an existing account."<<endl;
		cout<<"3.Display the account details."<<endl;
		cout<<"4.Exit the program"<<endl;
		cin>>c;

		switch(c){
		case 1:
			cout<<"Enter amount to be deposited : "<<endl;
			float amt;
			cin>>amt;
			bank.deposit(amt);
		    break;

		case 2:
			cout<<"Enter amount to be withdrawn : "<<endl;
			float wd;
			cin>>wd;
			bank.withdraw(wd);
			break;

		case 3:
			bank.displayAccountDetails();
			break;

		case 4:
			cout<<"Exit!!";
			break;
		}
	}while(c!=4);

	return 0;
}
