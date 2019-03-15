package com.thinhnv.todolist.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TaskPanel extends BasePanel implements ActionListener {
	private static final String BTN_ADD = "addTask";
	private JTextField tfNoiDung, tfThoiGian;
	private JLabel lbThoiGian;
	private JButton btnAdd;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		this.setLayout(null);
		setBackground(Color.CYAN);

	}

	@Override
	public void addEvents() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCompts() {
		// TODO Auto-generated method stub
		Font fNormal = new Font("Tahoma", Font.PLAIN, 15);
		Font fHeader = new Font("Tahoma", Font.BOLD, 25);
		boolean isEditable = true;
		tfNoiDung = initTextField(400, fHeader, Color.BLACK, isEditable);
		tfNoiDung.setLocation(50, 50);

		add(tfNoiDung);

		lbThoiGian = initLabel("Thời gian", fNormal, Color.BLACK);
		lbThoiGian.setLocation(tfNoiDung.getX(), tfNoiDung.getY() + tfNoiDung.getHeight() + 50);
		add(lbThoiGian);

		tfThoiGian = initTextField(400 - lbThoiGian.getX() - lbThoiGian.getWidth() - 30, fHeader, Color.black,
				isEditable);
		tfThoiGian.setSize(tfThoiGian.getWidth() + 50, tfNoiDung.getHeight());
		tfThoiGian.setLocation(lbThoiGian.getX() + lbThoiGian.getWidth() + 30,
				lbThoiGian.getY() - tfThoiGian.getInsets().top - 5);

		add(tfThoiGian);
		btnAdd = initButton("Add Task", fHeader, Color.black, BTN_ADD, this);
		btnAdd.setSize(tfNoiDung.getWidth(), tfNoiDung.getHeight());
		btnAdd.setLocation(tfNoiDung.getX(), tfThoiGian.getY() + tfThoiGian.getHeight() + 50);
		btnAdd.setBackground(Color.YELLOW);
		add(btnAdd);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();
		String name = btn.getName();
		if (name == BTN_ADD) {
			String noiDung = tfNoiDung.getText();
			String thoiGian = tfThoiGian.getText();

			if (noiDung.isEmpty() || thoiGian.isEmpty()) {
				showNotify("Vui lòng nhập đủ trường");
				return;
			}
			goBack(noiDung, thoiGian);
			tfNoiDung.setText(null);
			tfThoiGian.setText(null);
		}
	}

	private void goBack(String noiDung, String thoiGian) {
		// TODO Auto-generated method stub
		MainPanel main = (MainPanel) getParent();
		main.goToDoPanel(noiDung, thoiGian);
	}

}
