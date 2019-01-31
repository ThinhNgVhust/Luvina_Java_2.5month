package com.thinhnv.arrayobject.object;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public void displayInfor() {
		System.out.print(" Last Name: " + this.lastName + ", ");
		System.out.print("First Name: " + this.firstName + ", ");
		System.out.print(" Age: " + this.age + ". ");
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getAge() {
		return this.age;
	}

}
