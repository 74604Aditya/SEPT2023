class First
{
	int val = 20;

	void myFun(int x)
	{
		System.out.println("myFun of First");
	}
}

class Second extends First
{
	int val = 30;

	void myFun(int x)
	{
		System.out.println("myFun of Second");
		super.myFun(10);
		System.out.println(super.val);
	}
}
class Third extends Second
{
	int val = 40;

	void myFun(int x)
	{
		System.out.println("myFun of Third");
                super.myFun(10);System.out.println(val);
                System.out.println(super.val);
        }
}

class OverridingDemo
{
	public static void main(String args[])
	{
		Third tobj = new Third();
		tobj.myFun(5);
	}
}
