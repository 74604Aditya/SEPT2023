class MyGen <T>
{
	T Ob;

	MyGen()
	{
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

class NonGenDemo
{
	public static void main(String args[])
	{
		MyGen<Integer> mg1 = new MyGen<Integer>(100);
		int a = mg1.getOb();
		System.out.println(a);

		MyGen<String> mg2 = new MyGen<String>("Welcome");
		String s = mg2.getOb();
		System.out.println(s);

		//mg1 = mg2;
	}
}
