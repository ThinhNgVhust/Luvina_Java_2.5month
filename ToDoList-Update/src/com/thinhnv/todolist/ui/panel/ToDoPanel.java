package com.thinhnv.todolist.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.thinhnv.todolist.logic.Task;
import com.thinhnv.todolist.logic.TaskManager;

public class ToDoPanel extends BasePanel implements ActionListener {
	protected static final int TABLE_COL = 4;
	private static final int COL_1 = 60;
	private static final int COL_2 = 100;
	private static final int COL_3 = 100;
	private static final int COL_4 = 210;
	protected static final int[] COL_WIDTH = new int[] { COL_1, COL_2, COL_3, COL_4 };
	protected static final String[] COL_NAME = new String[] { "STT", "Task", "Thời gian", "Xác nhận hoàn thành" };
	private static final String BTN_ADD = "add";
	private static final String BTN_DEL = "delete";
	private static final String BTN_XACNHAN = "xacnhan";
	private JTable tbTime;
	private JButton btnAdd, btnDelete, btnXacNhan;
	private TaskManager taskMngr;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		setLayout(null);
		setBackground(Color.cyan);
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
		tbTime = initTable(fNormal, fHeader, Color.LIGHT_GRAY, Color.YELLOW, true);
		tbTime.setSize(460, 250);
		tbTime.setLocation(20, 20);
		tbTime.setRowHeight(30);
		tbTime.setBackground(Color.CYAN);
		JScrollPane jScrollPane = new JScrollPane(tbTime);
		jScrollPane.setSize(460, 250);
		jScrollPane.setLocation(20, 20);
		jScrollPane.getViewport().setBackground(Color.cyan);
		add(jScrollPane);
		initTableModel();
		int i = 0;
		for (int time : COL_WIDTH) {
			TableColumn column = tbTime.getColumnModel().getColumn(i);
			column.setMinWidth(COL_WIDTH[i]);
			column.setMaxWidth(COL_WIDTH[i]);
			column.setPreferredWidth(COL_WIDTH[i]);
			i++;
		}
		TableColumn column = tbTime.getColumnModel().getColumn(0);
		column.setMinWidth(50);
		column.setMaxWidth(50);
		column.setPreferredWidth(50);

		btnAdd = initButton("Thêm Task", fHeader, Color.BLACK, BTN_ADD, this);
		btnDelete = initButton("Xóa Task", fHeader, Color.BLACK, BTN_DEL, this);
		btnXacNhan = initButton("Xác nhận hoàn thành", fHeader, Color.BLACK, BTN_XACNHAN, this);

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

		String index1 = (String) tbTime.getValueAt(index, 0);
		int newIndex = Integer.parseInt(index1);
		Task task = this.taskMngr.getLsTask().get(newIndex - 1);
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
		String index1 = (String) tbTime.getValueAt(index, 0);
		int newIndex = Integer.parseInt(index1);
		this.taskMngr.xoaTask(newIndex - 1);
		updateData();
	}

	private void goToTaskPanel() {
		// TODO Auto-generated method stub
		MainPanel main = (MainPanel) getParent();
		main.goTaskPanel();
	}

	public void addTask(String noiDung, String thoiGian) {
		// TODO Auto-generated method stub
		this.taskMngr.addTask(taskMngr.getLsTask().size() + 1, noiDung, thoiGian);
		updateData();
	}

	private void updateData() {
		// TODO Auto-generated method stub
		DefaultTableModel model = (DefaultTableModel) tbTime.getModel();
		model.setRowCount(0);
		System.out.println("Update");
		for (int i = 0; i < taskMngr.getLsTask().size(); i++) {
			if (taskMngr.getLsTask().get(i) == null) {
				continue;
			} else {
				Task task = taskMngr.getLsTask().get(i);
				System.out.println(task.getThoiGian() + " " + task.getNoiDung() + "i= " + i);
				String xacNhan = task.isXacNhan() == false ? "Chưa làm" : "Hoàn thành";
				model.addRow(new Object[] { task.getSTT(), task.getNoiDung(), task.getThoiGian(), xacNhan });
			}
		}
	}
}
