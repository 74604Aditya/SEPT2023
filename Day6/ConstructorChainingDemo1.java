class Student
{
	int roll;
	double marks;
	String name;
	String mobNo;


	Student(){
		System.out.println("zero-arg constructor called");
	}

	Student(int roll){
		this();
		System.out.println("one-arg constructor called");
		this.roll = roll;
	}

	Student(int roll, double marks){
		this(roll);
		System.out.println("two-arg constructor called");
		this.marks = marks;
	}

	Student(int roll, double marks, String name){
		this(roll,marks);
		System.out.println("three-arg constructor called");
		this.name = name;
	}

	Student(int roll, double marks, String name, String mobNo){
		this(roll,marks,name);
		System.out.println("four-arg constructor called");
                this.mobNo = mobNo;
        }

	void printDetails()
	{
		System.out.println(this.roll);
		System.out.println(this.marks);
		System.out.println(this.name);
		System.out.println(this.mobNo);
	}
}

class ConstructorChainingDemo1
{
	public static void main(String args[])
	{
		Student stud1 = new Student(1,80.0,"Aditya","655615416");
		stud1.printDetails();

		Student stud2 = new Student(5,75.5,"Abhi","6566221516");
                stud2.printDetails();
	}
}
