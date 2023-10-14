class First
{
	final int val;      // initialize only at one place

	First()
	{
		val = 5;
	}
       
	final void print()             //overridden method
	{
		System.out.println(val);
	}
}

class Second extends First
{
	int num = 10;

	void print()       //overridding method
	{
		super.print();
		System.out.println(num);
	}
}


class FinalDemo4
{
	public static void main(String args[])
	{
	final int a ;
       	a = 10;
	//a = 15

	System.out.println(a);
	
	First f = new First();
	f.print();

	Second s = new Second();
	s.print();

	}
}
