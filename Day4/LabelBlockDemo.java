class LabelBlockDemo{

	public static void myFun()
	{
		boolean b = true;

                block1:
		{
			System.out.println("Inside block1");
		}
		System.out.println("Out of block1");

                block2:
		{
			System.out.println(" Inside block2");

                        block3:
			{
				System.out.println("Inside block3");
				if( b == true);
				break block3;
			}

			System.out.println("Out of block3");
		}

		System.out.println("out of block2");
	
	}

	public static void main(String args[]){
		myFun();
	}
}
