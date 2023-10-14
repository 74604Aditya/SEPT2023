class ThrowDemo
{
	public static void main(String args[])
	{
		System.out.println("Program execution started");
		
		try
		{
		
			System.out.println("try block");
		
			throw new ArithmeticException("No division by zer0");

		}
		
		catch(Exception ae)
		{
		
			ae.printStackTrace();
	
		}

	
		System.out.println("Program execution completed successfully" );
	}
}

