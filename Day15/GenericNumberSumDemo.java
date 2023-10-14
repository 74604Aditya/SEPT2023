class TwoNumbers <T>
{
	T a;
	T b;

	TwoNumbers()
	{
	}

	TwoNumbers(T a, T b )
	{
		this.a = a;
		this.b = b;
	}

	T getA()
	{
		return a;
	}

	T getB()
	{
		return b;
	}
}

class GenericNumberSumDemo
{
	public static void main(String args[])
	{
		TwoNumbers<Integer> tn1 = new TwoNumbers<Integer>(4,5);
		System.out.println(tn1.getA());
		System.out.println(tn1.getB());

		TwoNumbers<Double> tn2 = new TwoNumbers<Double>(4.2,7.5);
                System.out.println(tn2.getA());
                System.out.println(tn2.getB());
	}
}
