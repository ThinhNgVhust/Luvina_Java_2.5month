package com.thinhnv.studentmanager.student;

public class Student {
	private String ten;
	private String id;
	private String dob;
	private double point;

	public Student(String ten, String id, String dob, double point) {
		this.ten = ten;
		this.id = id;
		this.dob = dob;
		this.point = point;
	}

	public void print() {
		System.out.println("\n----------------------Student infomation----------------------");
		System.out.println("Tên: "+ten);
		System.out.println("Mã: "+id);
		System.out.println("Ngày sinh: "+dob);
		System.out.println("Điểm số: "+point);
		System.out.println("----------------------------------------------------------------");
	}
	
}
