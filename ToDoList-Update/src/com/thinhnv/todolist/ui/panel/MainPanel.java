package com.thinhnv.todolist.ui.panel;

import java.awt.CardLayout;

public class MainPanel extends BasePanel {
	private ToDoPanel toDo;
	private TaskPanel taskPanel;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		setLayout(new CardLayout());
	}

	@Override
	public void addEvents() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCompts() {
		// TODO Auto-generated method stub
		toDo = new ToDoPanel();
		add(toDo);
		taskPanel = new TaskPanel();
		add(taskPanel);
	}

	public void goNext() {
		// TODO Auto-generated method stub
		this.toDo.setVisible(false);
		this.taskPanel.setVisible(true);
	}

	public void goToDoPanel(String noiDung, String thoiGian) {
		// TODO Auto-generated method stub
		this.toDo.setVisible(true);
		this.taskPanel.setVisible(false);
		this.toDo.addTask(noiDung, thoiGian);
	}

}
