package com.thinhnv.studentmanagetapp.studentmanager;

import java.util.Arrays;
import java.util.Comparator;

public class StudentManager {
	private Student[] sList;
	private int nElements;

	private Comparator<Student> tcNameAsc = new Comparator<Student>() {// xay dung mot tieu chi so sanh tcNameAsc
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	};
	private Comparator<Student> tcScoreDes = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return -o1.compareTo(o2);
		}
	};
	private Comparator<Student> tcNameAscScoreDes = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			int result = tcNameAsc.compare(o1, o2);
			if (result == 0) {
				result = tcScoreDes.compare(o1, o2);
			}
			return result;
		}
	};

	public StudentManager() {
		sList = new Student[5];
		this.nElements = 0;
		this.add(1, "Nguyen Van Thinh", 70);
		this.add(2, "Nguyen Van Thinh", 80);
		this.add(3, "Nguyen Quang Hai", 90);
		this.add(4, "Phan Van Duc", 100);
		this.add(5, "An Cong Phuong", 10);
	}

	private void add(int id, String name, int score) {
		this.sList[nElements++] = new Student(id, name, score);
	}

	public void printList() {
		System.out.println("Danh sach hoc sinh");
		for (int i = 0; i < sList.length; i++) {
			System.out.println(sList[i]);
		}
	}

	public Student[] findStudentByScore(int score) {
		int count = 0;
		for (int i = 0; i < sList.length; i++) {
			if (sList[i].getScore() == score) {
				count++;
			}
		}
		if (count == 0)
			return null;
		else {
			Student kq[] = new Student[count];
			count = 0;
			for (int i = 0; i < sList.length; i++) {
				if (sList[i].getScore() == score) {
					kq[count++] = sList[i];
				}
			}
			return kq;
		}
	}

	public void sortByNameAsc() {
		Arrays.sort(this.sList, this.tcNameAsc);
	}

	public void sortByScoreDes() {
		Arrays.sort(this.sList, this.tcScoreDes);
	}

	public void sortByNameAscScoreDes() {
		Arrays.sort(this.sList, this.tcNameAscScoreDes);
	}
}
