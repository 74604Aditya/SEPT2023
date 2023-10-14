class MyGen <T>
{
	T Ob;

	MyGen()
	{
		Ob = null;
	}

	MyGen(T Ob)
	{
		this.Ob = Ob;
	}

	T getOb()
	{
		return Ob;
	}
}

class First
{
	int val = 10;
	public String toString()
	{
		return "First[Val =" + val + "]";
	}
}

class GenericDemo
{
	public static void main(String args[])
	{
		MyGen<Integer> mg1 = new MyGen<Integer>(100);
		int a = mg1.getOb();
		System.out.println(a);

		MyGen<Double> mg2 = new MyGen<Double>(25.5);
                double d = mg2.getOb();
                System.out.println(d);

		MyGen<String> mg3 = new MyGen<String>("Welcome");
                String s = mg3.getOb();
                System.out.println(s);

		First f1 = new First();
		MyGen<First> mg4 = new MyGen<First>(f1);
		First f = mg4.getOb();
		System.out.println(f);
	}
}
