package com.thinhnv.todolist.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.thinhnv.todolist.logic.Task;
import com.thinhnv.todolist.logic.TaskManager;

public class ToDoPanel extends BasePanel implements ActionListener {
	protected static final int TABLE_COL = 4;
	protected static final String[] COL_NAME = new String[] { "STT", "Task", "Thời gian", "Xác nhận hoàn thành" };
	private static final String BTN_ADD = "add";
	private static final String BTN_DEL = "delete";
	private static final String BTN_XACNHAN = "xacnhan";
	private JTable tbTime;
	private JButton btnAdd, btnDelete, btnXacNhan;
	private TaskManager taskMngr;
	private int countTask;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		setLayout(null);
		setBackground(Color.cyan);
		countTask = 0;
	}

	@Override
	public void addEvents() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCompts() {
		// TODO Auto-generated method stub
		Font fNormal = new Font("Tahoma", Font.PLAIN, 10);
		Font fHeader = new Font("Tahoma", Font.BOLD, 12);
		taskMngr = new TaskManager();
		tbTime = initTable(fNormal, fHeader, Color.LIGHT_GRAY, Color.LIGHT_GRAY, true);
		tbTime.setSize(460, 250);
		tbTime.setLocation(20, 20);
		tbTime.setRowHeight(30);
		JScrollPane jScrollPane = new JScrollPane(tbTime);
		jScrollPane.setSize(460, 250);
		jScrollPane.setLocation(20, 20);
		add(jScrollPane);
		initTableModel();

		btnAdd = initButton("Thêm Task", fHeader, Color.LIGHT_GRAY, BTN_ADD, this);
		btnDelete = initButton("Xóa Task", fHeader, Color.LIGHT_GRAY, BTN_DEL, this);
		btnXacNhan = initButton("Xác nhận hoàn thành", fHeader, Color.LIGHT_GRAY, BTN_XACNHAN, this);

		btnAdd.setSize(130, 40);
		btnAdd.setLocation(tbTime.getX(), btnAdd.getY() + tbTime.getHeight() + 20);
		add(btnAdd);

		btnDelete.setSize(130, 40);
		btnDelete.setLocation(btnAdd.getX() + btnAdd.getWidth() + 10, btnAdd.getY());
		add(btnDelete);

		btnXacNhan.setSize(180, 40);
		btnXacNhan.setLocation(btnDelete.getX() + btnDelete.getWidth() + 10, btnAdd.getY());
		add(btnXacNhan);
		btnAdd.setBackground(Color.GREEN);
		btnDelete.setBackground(Color.ORANGE);
		btnXacNhan.setBackground(Color.YELLOW);
	}

	private void initTableModel() {
		// TODO Auto-generated method stub
		DefaultTableModel model = new DefaultTableModel() {
			public int getColumnCount() {
				// TODO Auto-generated method stub
				return TABLE_COL;
			}

			public String getColumnName(int column) {

				return COL_NAME[column];
			}

		};
		tbTime.setModel(model);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();
		String name = btn.getName();

		switch (name) {
		case BTN_ADD:
			goToTaskPanel();
			break;
		case BTN_DEL:
			deleteData();
			break;
		case BTN_XACNHAN:
			xacNhan();
			break;

		default:
			break;
		}
	}

	private void xacNhan() {
		// TODO Auto-generated method stub
		int index = tbTime.getSelectedRow();
		if (index == -1) {
			showNotify("Vui lòng chọn dòng để xác nhận");
			return;
		}
		Task task = this.taskMngr.getLsTask().get(index);
		task.setXacNhan(true);
		updateData();
	}

	private void deleteData() {
		// TODO Auto-generated method stub
		int index = tbTime.getSelectedRow();
		if (index == -1) {
			showNotify("Vui lòng chọn dòng để xóa");
			return;
		}
		this.taskMngr.xoaTask(index);
		updateData();
	}

	private void goToTaskPanel() {
		// TODO Auto-generated method stub
		MainPanel main = (MainPanel) getParent();

		main.goNext();
	}

	public void addTask(String noiDung, String thoiGian) {
		// TODO Auto-generated method stub
		countTask++;
		this.taskMngr.addTask(countTask, noiDung, thoiGian);
		updateData();
	}

	private void updateData() {
		// TODO Auto-generated method stub
		DefaultTableModel model = (DefaultTableModel) tbTime.getModel();
		model.setRowCount(0);
		for (Task task : taskMngr.getLsTask()) {
			String xacNhan = task.isXacNhan() == false ? "Chưa làm" : "Hoàn thành";
			model.addRow(new Object[] { task.getSTT(), task.getNoiDung(), task.getThoiGian(), xacNhan });
		}
	}

}
