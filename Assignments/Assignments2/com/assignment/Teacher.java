package com.assignment;

public class Teacher extends Person {
        
	private int employeeId;
        protected String subject;

 
        public Teacher(String name,int age,char gender,int employeeId,String subject) {

                super("Aditya",23,'M');
                this.employeeId = employeeId;
                this.subject = subject;
        }

        public void displayTeacherDetails() {
 
		System.out.println("Employee ID : "+ employeeId);
                System.out.println("Subject : "+ subject);
        }
}
