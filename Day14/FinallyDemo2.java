class FinallyDemo2
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
	               
			try
			{
				int res = 5/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exception caught here");
			}
		}
		System.out.println("Program terminated successfully");


        }
}
