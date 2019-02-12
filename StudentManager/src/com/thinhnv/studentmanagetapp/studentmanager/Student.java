package com.thinhnv.studentmanagetapp.studentmanager;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int score;

	public Student(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", score=" + score;
	}

	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		int result = this.getName().compareTo(student.getName());// ten tang dan
		if (result == 0) {// neu
			result = -this.getScore() + student.getScore();// diem giam dan
		}
		return result;
	}
}
