package com.assignment;

public class Person
{
	String name;
	int age;
	char gender;

	public Person(String name,int age,char gender){
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void displayPersonDetails(){

		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
	}
}

