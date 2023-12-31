#include<iostream>
#include<string>
using namespace std;

class Product{
private:
	string title;
	float price;
public:
	Product( void ){
		this->title = " ";
		this->price = 0;
	}
	virtual void acceptRecord( void ){
		cout<<" Title  : ";
		cin >>this->title;
		cout<<" Price  : ";
		cin >>this->price;
	}

	virtual void printRecord( void ){
		cout<<" Title : "<< this->title <<endl;
		cout<<" Price : "<< this->price <<endl;
	}
};

class Book : public Product{
private:
	int pageCount;
public:
	Book( void ){
		this->pageCount = 0;
	}

	virtual void acceptRecord( void ){
		Product::acceptRecord();
		cout<<" Page Count : ";
		cin >>this->pageCount;
	}
	virtual void printRecord( void ){
		Product::printRecord();
		cout<<" Page Count : "<<this->pageCount<<endl;
	}
};

class Tape : public Product{
private:
	int PlayTime;
public:
	Tape( void ){
		this->PlayTime = 0;
	}

	virtual void acceptRecord( void ){
		Product::acceptRecord();
		cout<<" PlayTime : ";
		cin >>this->PlayTime;
	}

	virtual void printRecord( void ){
		Product::printRecord();
		cout<<" PlayTime : "<<this->PlayTime<<endl;
	}

};

int menu_list( void){
	int choice;
	cout<<"0.Exit"<<endl;
	cout<<"1.Book"<<endl;
	cout<<"2.Tape"<<endl;
	cout<<"Enter Choice : ";
	cin>>choice;
	return choice;
}
int main( void ){
	int choice;
	while(( choice = ::menu_list()) != 0 ){
		Product *ptr = nullptr;
		switch(choice){
		case 1:
			ptr = new Book( );
			break;
		case 2:
			ptr = new Tape( );
			break;
		}
		if( ptr != nullptr){
			ptr->acceptRecord( );
			ptr->printRecord( );
			delete ptr;
			ptr = nullptr;
		}

	}
	return 0;
}

int main2( void ){
	int choice;
	while( ( choice = ::menu_list( ) ) != 0 ){
		Book *book = nullptr;
		Tape *tape = nullptr;
		switch( choice ){
		case 1:
			book = new Book( );
			book->acceptRecord( );
			book->printRecord( );
			delete book;
			break;
		case 2:
			tape = new Tape( );
			tape->acceptRecord( );
			tape->printRecord( );
			delete tape;
			break;
		}
	}
	return 0;
}
int main1( void ){
	int choice;
	while( ( choice = ::menu_list( ) ) != 0 ){
		Book book;	//32
		Tape tape;	//32
		switch( choice ){
		case 1:
			book.acceptRecord( );
			book.printRecord( );
			break;
		case 2:
			tape.acceptRecord( );
			tape.printRecord( );
			break;
		}
	}
	return 0;
}
