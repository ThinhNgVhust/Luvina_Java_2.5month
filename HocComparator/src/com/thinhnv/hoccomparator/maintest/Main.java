package com.thinhnv.hoccomparator.maintest;

import com.thinhnv.hoccomparator.student.Student;
import com.thinhnv.hoccomparator.student.StudentManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManager studentManager = new StudentManager();
		studentManager.hienThi();
		studentManager.add("Thịnh", 30);
		studentManager.add("An", 23);
		studentManager.add("An", 24);
		studentManager.add("An", 25);
		studentManager.add("Thoại", 24);
		studentManager.add("Lan", 10);
		studentManager.add("Quang", 19);
		studentManager.add("Thịnh", 32);
		studentManager.add("Khải", 21);
		studentManager.add("Tuấn", 22);
		studentManager.add("Phương", 23);
		Student thinh = new Student("Thịnh");
		studentManager.removeAll(thinh);
		studentManager.hienThi();

	}

}
