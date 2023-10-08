class ReturnDemo{

	public static void myFun(int a){

		int res = a + 5;

		if( a < 10 ){
		return;
		}
		System.out.println(res);
	}

	public static void main(String args[]){
	
	myFun( 10 );

	}

}

