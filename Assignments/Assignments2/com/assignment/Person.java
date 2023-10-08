package com.assignment;

public class Person
{
	private String name;
	private int age;
	private char gender;

	public Person(String name,int age,char gender){
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	protected void displayPersonDetails(){

		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
	}
}
