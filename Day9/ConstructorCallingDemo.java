class First
{
	First()
	{
		System.out.println("First constructor");
	}
}

class Second extends First
{
	Second()
	{
		System.out.println("Second constructor");
	}
}

class Third extends Second
{
	Third()
	{
		System.out.println("Third constructor");
	}
}

class ConstructorCallingDemo
{
	public static void main(String args[])
	{
		new Third();
	}
}

