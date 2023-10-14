class IndexOutOfBoundsExceptionDemo
{
	public static void main(String args[])
	{
		System.out.println("Program execution started");
		int arr[] = {2,4,6,8,10};

		try
		{
			for(int i = 0; i < 6; i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("caught and handled");
		}
		
		System.out.println("Program executed Successfully!!");
	}
}

