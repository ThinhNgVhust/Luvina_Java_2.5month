package com.thinhnv.uicolor.ui.panel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;

import com.thinhnv.uicolor.logic.ColorItem;
import com.thinhnv.uicolor.logic.ColorManager;
import com.thinhnv.uicolor.ui.GUI;

public class BGPanel extends BasePanel implements ActionListener {
	private ColorManager colorManager;
	private JList<ColorItem> listColorItem;
	private JButton btnShow, btnXoa;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		setLayout(null);
		setSize(GUI.F_WIDTH / 2 - 20, GUI.F_WIDTH / 2 - 20 + 200);
		setLocation(GUI.F_WIDTH / 2, 20);
		setBackground(Color.GREEN);
	}

	@Override
	public void addCompts() {
		// TODO Auto-generated method stub
		colorManager = new ColorManager();
		initDummyData();
		Font f = new Font("Tahoma", Font.PLAIN, 20);
		this.listColorItem = new JList<ColorItem>();
		listColorItem.setFont(f);
		listColorItem.setSize(GUI.F_WIDTH / 2 - 20, GUI.F_WIDTH / 2 - 220);
		listColorItem.setLocation(10, 10);
		listColorItem.setBackground(Color.LIGHT_GRAY);
		listColorItem.setFixedCellHeight(30);
		listColorItem.setSelectionMode(2);
		initJListModel();
		JScrollPane jScrollPane = new JScrollPane(listColorItem);
		jScrollPane.setSize(300, 300);
		jScrollPane.setLocation(10, 10);
		add(jScrollPane);

		btnShow = initButton(f, Color.RED, "Show", this);
		btnShow.setLocation(jScrollPane.getX(), jScrollPane.getY() + jScrollPane.getHeight() + 30);
		add(btnShow);

		btnXoa = initButton(f, Color.RED, "Delete", this);
		btnXoa.setLocation(jScrollPane.getX() + jScrollPane.getWidth() - btnXoa.getWidth(), btnShow.getY());
		add(btnXoa);

//		cbbColor.addItemListener(new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				// TODO Auto-generated method stub
//				if (e.getStateChange() == e.SELECTED) {
//					ColorItem colorItem = (ColorItem) cbbColor.getSelectedItem();
//					setBackground(colorItem.getC());
//					MainPanel mainPanel = (MainPanel) getParent();
//					mainPanel.setRight(colorItem.getC());
//				}
//			}
//		});
	}

	private void initJListModel() {
		// TODO Auto-generated method stub
		DefaultListModel<ColorItem> defaulJListsModel = new DefaultListModel<ColorItem>();
		ArrayList<ColorItem> list = colorManager.getListColor();
		for (ColorItem colorItem : list) {
			defaulJListsModel.addElement(colorItem);
		}
		listColorItem.setModel(defaulJListsModel);
	}

	private void initDummyData() {
		// TODO Auto-generated method stub
		colorManager.addColor("1Xanh", Color.BLUE);
		colorManager.addColor("2Do", Color.RED);
		colorManager.addColor("3Cyan", Color.CYAN);
		colorManager.addColor("4DarkGray", Color.DARK_GRAY);
		colorManager.addColor("5Gray", Color.GRAY);
		colorManager.addColor("6Pink", Color.PINK);
		colorManager.addColor("7Xanh", Color.BLUE);
		colorManager.addColor("8Do", Color.RED);
		colorManager.addColor("9Cyan", Color.CYAN);
		colorManager.addColor("10DarkGray", Color.DARK_GRAY);
		colorManager.addColor("11Gray", Color.GRAY);
		colorManager.addColor("12Pink", Color.PINK);
	}

	@Override
	public void addEvents() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();
		if (btn == btnShow) {
			showSelectedColor();
		} else if (btn == btnXoa) {
			deletaSelectedColor();
		}
	}

	private void showSelectedColor() {
		// TODO Auto-generated method stub
		List<ColorItem> list = listColorItem.getSelectedValuesList();
		showNotify(list.toString());

	}

	private void deletaSelectedColor() {
		// TODO Auto-generated method stub
		List<ColorItem> list = listColorItem.getSelectedValuesList();
		this.colorManager.getListColor().removeAll(list);
		initJListModel();
	}

}
