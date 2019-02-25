package com.thinhnv.studentmanager.main;

import java.io.IOException;

import com.thinhnv.studentmanager.sm.StudentManager;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StudentManager studentManager = new StudentManager();
		studentManager.addStudentFromFile("/home/thinhnv/Desktop/ListStudent.txt");
		studentManager.printStudentList();
	}

}
