package com.thinhnv.studentmanagetapp.studentmanager;

public class StudentManager {
	private Student[] sList;
	private int nElements;

	public StudentManager() {
		sList = new Student[5];
		this.nElements = 0;
		this.add(1, "Nguyen Van Thinh", 70);
		this.add(2, "Nguyen Van Thanh", 80);
		this.add(3, "Nguyen Quang Hai", 90);
		this.add(4, "Phan Van Duc", 100);
		this.add(5, "Nguyen Cong Phuong", 100);

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
}
