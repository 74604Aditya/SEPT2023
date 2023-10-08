class Student
{
	int rollNo = 3;
	int age = 20;
	double marks = 90.00;

	public void getDetails( int r, int a, double m)
	{
		rollNo = r;
		age = a;
		marks = m;
	}

	public void printDetails()
	{
		System.out.println( rollNo);
		System.out.println( age );
	        System.out.println( marks );
	}
}


class StudentDemo3
{

	public static void main( String args[] )
	{
		Student stud1;
		stud1 = new Student();

		/*stud1.rollNo = 1;
		stud1.age = 23;
		stud1.marks = 78.5;

		System.out.println(stud1.rollNo);
		System.out.println(stud1.age);
		System.out.println(stud1.marks);*/

		
		Student stud2;
		stud2 = new Student();

		/* stud2.rollNo = 2;
                stud2.age = 22;
                stud2.marks = 80.5; 

                System.out.println(stud2.rollNo);
                System.out.println(stud2.age);
                System.out.println(stud2.marks);*/

		System.out.println( "Student1 Details : ");
		stud1.printDetails();

		System.out.println( "Student2 Details : ");
                stud2.printDetails();
	}
}
	       	
