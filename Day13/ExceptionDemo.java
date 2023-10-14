import java.util.Scanner;

class ExceptionDemo {

	public static void main(String args[]) {

		System.out.println("Pogram execution started...");

		int a;
		int b;
	    
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the value for a & b ");
	        a = sc.nextInt();
	        b = sc.nextInt();  
	  
	        int res = 0;
	        
	        res	= a/b;

		System.out.println("res = " + res);
		System.out.println("Program executed successfully!!");
	}
}
