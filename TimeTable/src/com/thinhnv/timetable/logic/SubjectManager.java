package com.thinhnv.timetable.logic;

import java.util.ArrayList;

public class SubjectManager {
	private ArrayList<Subject> listSubject;

	public SubjectManager() {
		this.listSubject = new ArrayList<Subject>();
	}

	public boolean addSubject(String time, String subject) {
		Subject subject2 = new Subject(time, subject);
		if (this.listSubject.indexOf(subject2) == -1) {
			return this.listSubject.add(subject2);
		} else
			return false;
	}

	public ArrayList<Subject> getListSubject() {
		return this.listSubject;
	}
}
