package com.thinhnv.hoccomparator.student;

public class Student {
	private String name;
	private int age;
	public static int stt;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public String toString() {
		return ++this.stt + " Student [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean equals(Student s1) {
		boolean dk2 = this.getName().equals(s1.getName());
		return dk2;
	}

}
