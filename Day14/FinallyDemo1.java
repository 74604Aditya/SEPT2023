class FinallyDemo1
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("try block");
			System.exit(0);
		}
		finally
		{
			System.out.println("finally block");
		}
	}
}
