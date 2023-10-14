class RethrowDemo
{
	public static void myFun()
	{
		try
		{
			int res = 5/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception caught here ");
			throw ae;
		}
	}

	public static void main(String args[])
	{
		System.out.println("Program execution started..");
		try{
			myFun();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("AE caught here");
		}
		System.out.println("Program execution completed!!");
	}
}
