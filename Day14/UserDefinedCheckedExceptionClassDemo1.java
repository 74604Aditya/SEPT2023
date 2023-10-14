class MyException extends Exception		//Checked exception
{
	
	MyException()
	{
	}
		
	MyException(String msg)
	{
		super(msg);
	}
}

class UserDefinedCheckedExceptionClassDemo
{
	public static void main(String args[])
	{
		try
		{
			throw new MyException("MyException due to some logical error");
	}
		catch(MyException me)
		{
			System.out.println("MyException caught here");
			System.out.println(me.getMessage());
		}
		
		System.out.println("Program terminated successfully");
	}
}

