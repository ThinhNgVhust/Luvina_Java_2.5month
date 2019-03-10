package com.thinhnv.uicolor.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import com.thinhnv.uicolor.logic.ColorItem;
import com.thinhnv.uicolor.logic.ColorManager;
import com.thinhnv.uicolor.ui.GUI;

public class ColorPanel extends BasePanel {
	private JComboBox<ColorItem> cbbColor;
	private ColorManager colorManager;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		setLayout(null);
		setSize(GUI.F_WIDTH/2-20, GUI.F_WIDTH/2-20);
		setBackground(Color.CYAN);
		setLocation(20, 20);
	}

	@Override
	public void addCompts() {
		// TODO Auto-generated method stub
		colorManager = new ColorManager();
		initDummyData();
		Font f = new Font("Tahoma", Font.ITALIC, 20);
		this.cbbColor = new JComboBox<ColorItem>();
		cbbColor.setSize(150, 30);
		cbbColor.setLocation(20, 50);
		initCBBModel();
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
		add(cbbColor);

	}

	private void initCBBModel() {
		// TODO Auto-generated method stub
//		ComboBoxModel
		DefaultComboBoxModel<ColorItem> defaulcbbModel = new DefaultComboBoxModel<ColorItem>();
		ArrayList<ColorItem> list = colorManager.getListColor();
		for (ColorItem colorItem : list) {
			defaulcbbModel.addElement(colorItem);
		}
		cbbColor.setModel(defaulcbbModel);
	}

	private void initDummyData() {
		// TODO Auto-generated method stub
		colorManager.addColor("Xanh", Color.BLUE);
		colorManager.addColor("Do", Color.RED);
		colorManager.addColor("Cyan", Color.CYAN);
		colorManager.addColor("DarkGray", Color.DARK_GRAY);
		colorManager.addColor("Gray", Color.GRAY);
		colorManager.addColor("Pink", Color.PINK);
	}

	@Override
	public void addEvents() {
		// TODO Auto-generated method stub
	}

}
