class AddCalculator
{
	void add(int a, int b)
	{
		System.out.println("add(int,int) method called");
		System.out.println(a+b);

	}
}

class OverloadingDemo
{
	public static void main( String args[])
	{
		AddCalculator addCal = new AddCalculator();
		addCal.add(2,3);
	}
}
