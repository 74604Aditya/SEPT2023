class MyGen<T>
{
	T ob;

	MyGen()
	{
	}
	
	MyGen(T ob)
        {
                this.ob = ob;
        }

        void myFun(MyGen<? super Number> x)
        {
                System.out.println();
        }

        public String toString()
        {
                if(ob == null) return null;
                return ob.toString();
        }
}

class GenericUseDemo
{
	public static void main(String args[])
	{
		MyGen<Integer> mg1 = new MyGen<Integer>(100);
		MyGen<Integer> mg2 = new MyGen<Integer>(50);

		MyGen<String> mg3 = new MyGen<String>("Welcome");
                MyGen<Double> mg4 = new MyGen<Double>(50.5);
		
		MyGen<Object> mg5 = new MyGen<Object>();

		mg1.myFun(mg5);
	}
}

	


