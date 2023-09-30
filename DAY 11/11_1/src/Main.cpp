#include<iostream>
using namespace std;


	class Complex{
	private:
		int real;
		int imag;
	public:
		Complex( void );
2

		Complex( int real, int imag );

		int getReal( void )const;

		void setReal( const int real );

		int getImag( void )const;

		void setImag( const int imag );

		friend istream& operator>>( istream &cin, Complex &other );

		friend ostream& operator<<( ostream &cout, const Complex &other );

	};

Complex::Complex( void ) : real( 0 ), imag( 0 ){
}

Complex::Complex( int real, int imag ) : real( real ), imag( imag ){
}

int Complex::getReal( void )const{
	return this->real;
}

void Complex::setReal( const int real ){
	this->real = real;
}

int Complex::getImag( void )const{
	return this->imag;
}

void Complex::setImag( const int imag ){
	this->imag = imag;
}

istream& operator>>( istream &cin, Complex &other ){
	cout << "Enter real number	:	";
	cin >> other.real;
	cout << "Enter imag number	:	";
	cin >> other.imag;
	return cin;
}

ostream& operator<<( ostream &cout, Complex &other ){
	cout << "Real Number	:	"<< other.real <<endl;
	cout << "Imag Number	:	"<< other.imag <<endl;
	return cout;
}
int main( void ){
	Complex c1;
	cin >> c1;	//operator>>( cin, c1 )
ss
	c1.setReal( c1.getReal() + 5 );
	c1.setImag( c1.getImag() + 5 );

	cout << c1;	//operator<<( cout, c1 );
	return 0;
}
