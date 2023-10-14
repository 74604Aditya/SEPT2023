class FinallyDemo
{
	public static void main(String args[])
	{
		System.out.println("Program exection started");
		int arr[] = {2,4,6,8,10};

		try
		{
			for(int i = 0; i < 5; i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Exception caught and handled");
		}
		finally
		{
			System.out.println("finally block executed");
		}

		System.out.println("Program executd Succcessfully!!");
	}
}
