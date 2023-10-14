class TwoNumbers
{
	int a;
	int b;

	TwoNumbers()
	{
	}
	TwoNumbers(int a, int b )
	{
		this.a = a;
		this.b = b;
	}

	int getSum()
	{
		return a+b;
	}
}

class NumberSumDemo
{
	public static void main(String args[])
	{
		TwoNumbers tn1 = new TwoNumbers(4,5);
		System.out.println(tn1.getSum());
	}
}
