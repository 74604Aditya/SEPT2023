class PrintStackTraceDemo
{
	public static void myFun()
	{
		anotherFun();
	}

	public static void anotherFun()
	{
		int res = 5/0;
	}

	public static void main(String args[])
	{
		System.out.println("Program started");

		try
		{
			myFun();
		}

		catch(Exception ae)
		{
			System.out.println("Exception caught here");
			ae.printStackTrace();
		}
		System.out.println("Program executed successfully");
	}
}

