class First				//Parent class
{
	int a = 5;
	int b = 10;

	static
	{
		System.out.println("static block of First");
	}

	{
		System.out.println("non-static block of First");
	}

	
	void myFun()
	{
		System.out.println("myFun of First");
	}
}

class Second extends First 		//Child class of First
{
	int c = 15;
	
	void anotherFun()
	{
		System.out.println("anotherFun of Second");	
	}

	void print()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
}

public class InheritanceDemo
{
	public static void main(String args[])
	{
		//child class object
		First f = new First(); 
		Second s = new Second();
		s.print();
		s.myFun();
	
	}
}
