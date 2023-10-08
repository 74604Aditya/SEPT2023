class Student
{
	int roll;
	double marks;
	String name;
	String mobNo;


	Student(){
		System.out.println("Students Details: ");
	}

	Student(int roll){
		this();
		this.roll = roll;
	}

	Student(int roll, double marks){
		this(roll);
		this.marks = marks;
	}

	Student(int roll, double marks, String name){
		this(roll,marks);
		this.name = name;
	}

	Student(int roll, double marks, String name, String mobNo){
		this(roll,marks,name);
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

class ConstructorChainingDemo2
{
	public static void main(String args[])
	{
		Student stud1 = new Student(1,80.0,"Aditya","655615416");
		stud1.printDetails();

		Student stud2 = new Student(5,75.5,"Abhi","6566221516");
                stud2.printDetails();
	}
}
