class AddCalculator
{
	void add(int a, int b)
	{
		System.out.println("add(double,double) method called");
		System.out.println(a+b);

	}
}

class OverloadingDemo
{
	public static void main( String args[])
	{
		AddCalculator addCal = new AddCalculator();
		addCal.add(2.5,3.7);
	}
}
