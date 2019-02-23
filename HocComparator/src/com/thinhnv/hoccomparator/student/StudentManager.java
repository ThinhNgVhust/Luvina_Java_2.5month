package com.thinhnv.hoccomparator.student;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentManager {
	ArrayList<Student> sList = new ArrayList<Student>();

	public void add(Student s) {
		this.add(s);
	}

	public void add(String name, int age) {
		Student student = new Student(name, age);
		this.sList.add(student);
		System.out.println("Add " + student + " successfully in to List");
	}

	private Comparator<Student> ascName = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	};

	private Comparator<Student> ascAge = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.getAge() - o2.getAge();
		}
	};

	public void sortNameAscAgeDec() {
		Comparator<Student> nameAscAgeDec = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				int result = ascName.compare(o1, o2);
				if (result != 0) {
					return result;
				} else {
					return ascAge.compare(o1, o2);
				}
			}
		};
		this.sList.sort(nameAscAgeDec);
	}

	public void hienThi() {
		int size = this.sList.size();
		if (size == 0) {
			System.out.println("Danh sách trống");
			return;
		}
		System.out.println("\n\n----------------Danh sách sinh viên----------------");
		this.sList.get(0).stt = 0;
		for (int i = 0; i < size; i++) {
			System.out.println(this.sList.get(i));
		}
	}

	public void removeAll(Student c) {
		int size = this.sList.size();
		if (size == 0)
			return;
		for (int i = 0; i < size; i++) {
			if (this.sList.get(i).equals(c)) {
				this.sList.remove(i);
				--i;
				--size;
				System.out.println("Remove succesfully a student named " + c.getName() + " from Student List!");
			}
		}
	}

	public void sortByName() {
		this.sList.sort(ascName);
	}

	public void sortByAge() {
		this.sList.sort(ascAge);
	}
}
