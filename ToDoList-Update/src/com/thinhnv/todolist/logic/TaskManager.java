package com.thinhnv.todolist.logic;

import java.util.ArrayList;

public class TaskManager {
	private ArrayList<Task> lsTask;

	public TaskManager() {
		// TODO Auto-generated constructor stub
		this.lsTask = new ArrayList<Task>();
	}

	public void addTask(int stt, String noiDung, String thoiGian) {
		this.lsTask.add(new Task(stt, noiDung, thoiGian));
	}

	public void xoaTask(int x) {
		this.lsTask.set(x, null);
	}

	public ArrayList<Task> getLsTask() {
		return this.lsTask;
	}

}
