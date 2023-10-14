class MyNonGen
{
	Object ob;

	MyNonGen()
	{
	}

	MyNonGen(Object ob)
	{
		this.ob = ob;
	}

	Object getOb()
	{
		return ob;
	}
}

class NonGenDemo
{
	public static void main(String args[])
	{
		MyNonGen mg1 = new MyNonGen(100);
		int a = (Integer)mg1.getOb();
		System.out.println(a);

		MyNonGen mg2 = new MyNonGen("Welcome");
                String s = (String)mg2.getOb();
                System.out.println(s);

		mg1 =mg2;
                a = (Integer)mg1.getOb();
                System.out.println(a);
	}
}



