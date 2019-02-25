package com.thinhnv.studentmanager.sm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

import com.thinhnv.studentmanager.student.Student;

public class StudentManager {
	ArrayList<Student> listStudent = new ArrayList<Student>();

	public void addStudentFromFile(String path) throws IOException {
		String gio = "";
		try {
			FileInputStream fileInputStream = new FileInputStream(path);
			int kyTu = fileInputStream.read();
			while (kyTu != -1) {
				if (kyTu == 10) {
					kyTu = fileInputStream.read();
					continue;
				}
				gio += (char) kyTu;
				kyTu = fileInputStream.read();
			}
			fileInputStream.close();
			JOptionPane.showMessageDialog(null, "Doc file thanh cong");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return;
		}
		String[] listStudent = gio.split(",");
		for (String student : listStudent) {
			String[] result = student.split("-");
			System.out.println(Arrays.toString(result));
			if (result.length < 4) {
				this.listStudent.add(new Student(result[0], result[1], result[2], 0.0));

			} else {
				this.listStudent.add(new Student(result[0], result[1], result[2], Double.parseDouble(result[3])));
			}

		}
	}

	public void printStudentList() {
		for (Student student : this.listStudent) {
			student.print();
		}
	}
}
