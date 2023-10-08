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

class ObjectArrayDemo1
{
	public static void main(String args[]){

		Student stud[] = new Student[5];
		stud[0] = new Student(0,0.0);
		stud[0].printDetails();

		for (int i = 0; i < 5; i++){

			stud[i] = new Student(i+1, 80.00+i*2);
		}

		for(int i = 0; i < 5; i++){
			stud[i] = new Student(i + 1,70.00+(i + 5)*2);
		}
		
		for(int i = 0; i < stud.length ; i++){
			stud[i].printDetails();
		}
	}
	
}


