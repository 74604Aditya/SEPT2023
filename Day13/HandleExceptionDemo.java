import java.util.Scanner;

class HandleExceptionDemo {

	public static void main(String args[]) {

		System.out.println("Program execution started ...");
		int a ;
		int b ;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value for a & b");
		a = sc.nextInt();
		b = sc.nextInt();

		int res = 0;

		try 
		{
			res = a/b;
			System.out.println("result calculation done!!");
		}

		catch(ArithmeticException ae) 
		{
			System.out.println("Exception caught successfully");
		}

		System.out.println("res " + res);
		System.out.println("Program executed successfuly");
	}
}
