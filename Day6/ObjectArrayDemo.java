class Student 
{
	int roll;
	double marks;

	Student(int roll,double marks){

		this.roll = roll;
		this.marks = marks;
	}

	void printDetails(){
		System.out.println(this.roll + "\t" + this.marks);
	}

}

class ObjectArrayDemo
{
	public static void main(String args[]){

		Student stud[] = new Student[5];
		stud[0] = new Student(1,80.00);
		stud[0].printDetails();

		for (int i = 0;i < stud.length; i++){

			stud[i] = new Student(i+1,75.0);
		}
		
		for(int i = 0; i < stud.length ; i++){
		 
		stud[i].printDetails();
		}
	}
}

