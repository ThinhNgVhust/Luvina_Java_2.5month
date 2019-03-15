package com.thinhnv.ungdunghoctienganh.main;

import com.thinhnv.ungdunghoctienganh.manager.Manager;
import com.thinhnv.ungdunghoctienganh.student.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager();
		Student thinh = new Student("thinh", "1992", "student", "phone", "userName", "password");
		thinh.dangKy(m);
		thinh.dangNhap("userName", "password");
		System.out.println("----------");
	}

}
