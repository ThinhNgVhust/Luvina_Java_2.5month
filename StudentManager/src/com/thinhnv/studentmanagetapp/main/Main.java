package com.thinhnv.studentmanagetapp.main;

import com.thinhnv.studentmanagetapp.studentmanager.Student;
import com.thinhnv.studentmanagetapp.studentmanager.StudentManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManager sManager = new StudentManager();
		sManager.printList();
		Student kq[] = sManager.findStudentByScore(100);
		System.out.println("\nDanh sach sinh vien co ket qua 100");
		for (int i = 0; i < kq.length; i++) {
			System.out.println(kq[i]);
		}
	}

}
