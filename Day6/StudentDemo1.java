class Student
{
	int rollNo = 1;
	int age = 20;
	double marks = 70.00;


	public void setDetails( int r, int a, double m)
	{
		rollNo = r;
		age = a;
		marks = m;
	}

	public void printDetails()
	{
		System.out.println(rollNo);
		System.out.println(age);
		System.out.println(marks);
	}

}


class StudentDemo1
{
	public static void main(String args[])
	{
		Student stud1;
		Student stud2;

		stud1 = new Student();
		stud2 = new Student();
		 
		stud1.setDetails(1,21,78.5);
		stud2.setDetails(2,23,74.5);

		System.out.println("Student1 Details:");
		stud1.printDetails();

		System.out.println("Student2 Details:");
		stud2.printDetails();
	}
}
