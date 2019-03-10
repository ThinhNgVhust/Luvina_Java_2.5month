package com.thinhnv.timetable.logic;

public class Subject {
	private String time;
	private String subject;

	public Subject(String time, String subject) {
		this.time = time;
		this.subject = subject;
	}

	public String getTime() {
		return time;
	}

	public String getSubject() {
		return subject;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Subject) {

			return this.time.equals(((Subject) obj).time)
					&& this.subject.equalsIgnoreCase(((Subject) obj).getSubject());
		}
		return false;
	}
}
