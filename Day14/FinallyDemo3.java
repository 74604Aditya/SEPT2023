class FinallyDemo3
{
        public static void myFun()
        {
		System.out.println("myFun called");

                try
                {
                        int res = 5/5;
			if(true)
				return;
                }
                finally
                {
                        System.out.println("finally block");
		}

		System.out.println("Out of try-finally");
	}
		
		public static void main(String args[])
		{
			System.out.println("Program started Execution");
			
			myFun();
			
			System.out.println("Program terminated successfully");
		
		}
}
