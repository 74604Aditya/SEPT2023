class Student
{
	int rollNo;
	int age;
	double marks;
}

class StudentDemo
{
	public static void main( String args[] )
	{
		Student stud1;
		stud1 = new Student();

		stud1.rollNo = 1;
		stud1.age = 23;
		stud1.marks = 78.5;

		System.out.println(stud1.rollNo);
		System.out.println(stud1.age);
		System.out.println(stud1.marks);
	}
}
	       	
