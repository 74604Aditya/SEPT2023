class Demo
{
        int a;
        int b;
        static int c;

	static void increment(){
		c++;
	}

	static void myFun(){
		Demo d = new Demo();
		d.print();
		//print();
	}

        void print(){

                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
		increment();
        }
}

class StaticMethodDemo
{
        public static void main(String args[]){

                Demo.increment();

                Demo d1 = new Demo();
		d1.print();
        }
}

