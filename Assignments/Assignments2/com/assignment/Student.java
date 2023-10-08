package com.assignment;

public class Student extends Person {
        
	private int studentId;
        protected char grade;

        public Student(String name, int age, char gender, int studentId,char grade){

                super("Aditya",23,'M');
                this.studentId = studentId;
                this.grade = grade;
        }

        public void displayStudentDetails() {

                System.out.println("Age : "+ studentId);
                System.out.println("Grade : "+ grade);
        }
}
