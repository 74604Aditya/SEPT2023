class ScopeDemo{

	public static void myFun(){
		int a = 10;
		System.out.println(a);
		{
			int b = 15;
			System.out.println(b);
		}
	}

	public static void main(String[] args0){
                
		myFun();
                //System.out.println(a);
        }
}
