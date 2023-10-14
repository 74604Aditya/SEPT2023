import com.assignment.*;
import com.assignment2.*;

public class Main {
	
	public static void main(String args[]) {

		Student s1 = new Student("Aditya",23,'M',23,'A');
		System.out.println("Student Details:");
		s1.displayStudentDetails();

		Teacher t1 =  new Teacher("Aditya",23,'M',28,"Java");
		System.out.println("Teacher Details:");
		t1.displayTeacherDetails();
        
		Course course = new Course("Computer Science", "CS101");
		System.out.println("Course Details:");
		course.displayCourseDetails();

	}
}
