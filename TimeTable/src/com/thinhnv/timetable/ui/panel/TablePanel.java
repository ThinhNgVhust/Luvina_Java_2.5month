package com.thinhnv.timetable.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.thinhnv.timetable.logic.Subject;
import com.thinhnv.timetable.logic.SubjectManager;

public class TablePanel extends BasePanel implements ActionListener {
	private static final String TIME[] = new String[] { "Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7",
			"Chủ nhật" };
	private static final String COL_NAME[] = new String[] { "Thứ", "Môn học" };
	protected static final int TABLE_COL = 2;
	private JLabel title, timeTitle, subjectTitle;
	private JTable allTimeTable, filterTable;
	private JTextField tfSubject;
	private JComboBox<String> filterCobb, allTimeCbb;
	private JButton addSubject;
	private SubjectManager subjectManager;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		setLayout(null);
		setBackground(Color.LIGHT_GRAY);
	}

	@Override
	public void addEvents() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCompts() {
		subjectManager = new SubjectManager();
		// TODO Auto-generated method stub
		Font titleFont = new Font("Tahoma", Font.BOLD, 36);
		Font normalFont = new Font("Tahoma", Font.PLAIN, 15);

		title = initLabel("THỜI KHÓA BIỂU", titleFont, Color.RED);
		title.setLocation(20, 35);
		add(title);

		timeTitle = initLabel("Thứ:", normalFont, Color.BLACK);
		timeTitle.setLocation(title.getX(), title.getY() + title.getHeight() + 20);
		add(timeTitle);

		allTimeCbb = new JComboBox<String>();
		allTimeCbb.setFont(normalFont);
		allTimeCbb.setSize(200, 30);
		allTimeCbb.setLocation(timeTitle.getX() + timeTitle.getWidth() + 40, timeTitle.getY() - 5);
		add(allTimeCbb);
		initCCBModel(allTimeCbb);

		subjectTitle = initLabel("Môn học:", normalFont, Color.BLACK);
		subjectTitle.setLocation(timeTitle.getX(), timeTitle.getY() + timeTitle.getHeight() + 30);
		add(subjectTitle);

		tfSubject = initTextField(allTimeCbb.getWidth() - 10, normalFont, Color.black, true);
		tfSubject.setLocation(allTimeCbb.getX(), allTimeCbb.getY() + allTimeCbb.getHeight() + 20);
		add(tfSubject);

		addSubject = initButton("Thêm", normalFont, Color.black,
				tfSubject.getY() + tfSubject.getHeight() - timeTitle.getY(), "addSubject", this);
		addSubject.setLocation(allTimeCbb.getX() + allTimeCbb.getWidth() + 20, timeTitle.getY());
		add(addSubject);

		allTimeTable = initTable(normalFont, normalFont, Color.LIGHT_GRAY, Color.white, true);
		allTimeTable.setSize(addSubject.getWidth() + addSubject.getX() - timeTitle.getX(), 300);
		allTimeTable.setLocation(subjectTitle.getX(), subjectTitle.getY() + subjectTitle.getHeight() + 20);
		allTimeTable.setRowHeight(30);

		JScrollPane jScrollPaneTimeTable = new JScrollPane(allTimeTable);
		jScrollPaneTimeTable.setSize(addSubject.getWidth() + addSubject.getX() - timeTitle.getX(), 300);
		jScrollPaneTimeTable.setLocation(subjectTitle.getX(), subjectTitle.getY() + subjectTitle.getHeight() + 20);
		add(jScrollPaneTimeTable);
		initModelTalbe(allTimeTable);

		filterCobb = new JComboBox<String>();
		filterCobb.setFont(normalFont);
		filterCobb.setSize(250, 40);
		filterCobb.setLocation(addSubject.getX() + addSubject.getWidth() + 20, title.getY());
		add(filterCobb);
		filterCobb.addActionListener(this);
		initCCBModel(filterCobb);

		filterTable = initTable(normalFont, normalFont, Color.LIGHT_GRAY, Color.white, true);
		filterTable.setSize(filterCobb.getWidth(), 500);
		filterTable.setLocation(addSubject.getX() + addSubject.getWidth() + 20,
				filterCobb.getY() + filterCobb.getHeight() + 10);
		filterTable.setRowHeight(60);
		JScrollPane jScrollPaneFilterTable = new JScrollPane(filterTable);
		jScrollPaneFilterTable.setLocation(addSubject.getX() + addSubject.getWidth() + 20,
				filterCobb.getY() + filterCobb.getHeight() + 10);
		jScrollPaneFilterTable.setSize(filterCobb.getWidth(),
				allTimeTable.getY() + allTimeTable.getHeight() - jScrollPaneFilterTable.getY());
		add(jScrollPaneFilterTable);
		initModelTalbe(filterTable);

	}

	private void initModelTalbe(JTable jTable) {
		// TODO Auto-generated method stub
		DefaultTableModel model = new DefaultTableModel() {
			@Override
			public int getColumnCount() {
				// TODO Auto-generated method stub
				return TABLE_COL;
			}

			@Override
			public String getColumnName(int columnIndex) {
				// TODO Auto-generated method stub
				return COL_NAME[columnIndex];
			}
		};
		jTable.setModel(model);
	}

	private void initCCBModel(JComboBox<String> allTimeCbb2) {
		// TODO Auto-generated method stub
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
		for (int i = 0; i < TIME.length; i++) {
			model.addElement(TIME[i]);
		}
		allTimeCbb2.setModel(model);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if (source == addSubject) {
			addSubject();
		} else if (source == filterCobb) {
			filterSubject();
		}

	}

	private void filterSubject() {
		// TODO Auto-generated method stub
		String time = TIME[filterCobb.getSelectedIndex()];
		DefaultTableModel model = (DefaultTableModel) filterTable.getModel();
		model.setRowCount(0);
		for (int i = 0; i < subjectManager.getListSubject().size(); i++) {
			Subject subject = subjectManager.getListSubject().get(i);
			if (subject.getTime().equals(time)) {
				model.addRow(new Object[] { time, subject.getSubject() });
			}
		}
		filterTable.setModel(model);
	}

	private void addSubject() {
		// TODO Auto-generated method stub
		String time = TIME[allTimeCbb.getSelectedIndex()];
		String subject = tfSubject.getText();
		if (subject.isEmpty()) {
			showNotify("Tên môn học không được để trống");
			return;
		}
		if (subjectManager.addSubject(time, subject)) {
			DefaultTableModel model = (DefaultTableModel) allTimeTable.getModel();
			model.addRow(new Object[] { time, subject });
		} else {
			showNotify("Môn học đã tồn tại trong danh sách");
		}
	}

}
