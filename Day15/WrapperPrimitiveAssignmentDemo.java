class WrapperPrimitiveAssignmentDemo
{
	public static void main(String args[])
	{
		Integer iobj1 = 100;
		Integer iobj2 = new Integer(100);
		Integer iobj3 = 100;

		System.out.println(iobj1 = iobj2);
		System.out.println(iobj1 = iobj3);

		System.out.println(iobj1.equals(iobj2));

		Object obj = 100;
		System.out.println(obj);
	}
}
