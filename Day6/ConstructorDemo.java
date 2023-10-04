class Student
{
	int roll;
	double marks;

	Student()
	{
		System.out.println("zero-arg constructor called");
		roll = -1;
		marks = 0.0;
	}

	Student(int roll,double marks)
	{
		System.out.println("two-arg constructor called");
		this.roll = roll;
		this.marks = marks;
	}

	void printDetails()
	{
		System.out.println(this.roll + "\t" + this.marks);
	}
}

public class ConstructorDemo
{
	public static void main( String args[])
	{
		Student stud1  = new Student(1,78.5);
		Student stud2  = new Student();

		stud1.printDetails();
		stud2.printDetails();
	}
}
