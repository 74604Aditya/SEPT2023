#include<iostream>
using namespace std;

class Complex{
private :
	int real;
	int img;
public :
	int getReal(void){
		return this -> real;
	}

	void setReal(int real){
		this ->real=real;
	}

	int getImg(void){
			return this -> img;
		}

		void setImg(int img){
			this -> img=img;
		}
};
int main (void){
	Complex c1;

	c1.setReal( 10 );
	c1.setImg( 20 );

	cout <<"Real Number : " << c1.getReal( ) << endl;
	cout <<"Img Number : " << c1.getImg( ) << endl;
	return 0;
}

int main1( void ){
	Complex c1;
	c1.setReal( 10 );
	c1.setImg( 20 );

	int real = c1.getReal( );
	cout <<" Real Number : "<< real << endl;

	int img = c1.getImg( );
	cout <<" Img Number : "<< img << endl;
	return 0;

}
