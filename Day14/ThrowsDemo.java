import java.io.*;
class ThrowsDemo
{
	static void myFun() throws ArithmeticException,IOException
	{
		System.out.println("myFun called");
		int res =5/0;
	}

	public static void main(String args[])
	{
		try
		{
			myFun();
		}


		catch(IOException excp)
		{
			System.out.println("IOException caught inside main");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("AritheticException caught inside main");
		}
		System.out.println("Program terminated successfully");

		}
}


