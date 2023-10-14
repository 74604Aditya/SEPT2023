class First
{
	final int val;

	First()
	{
		val = 5;
	}


	void print()
	{
		System.out.println(val);
	}
}

class FinalDemo2
{
	public static void main(String args[])
	{
	final int a ;
       	a = 10;
	//a = 15

	System.out.println(a);
	
	First f = new First();
	f.print();

	}
}
