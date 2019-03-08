package com.luvina.sapxep.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.luvina.sapxep.logic.Sort;

public class SortPanel extends BasePanel {
	private JLabel lbA, lbB;
	private JTextField tfA, tfB;
	private JButton btSort;
	private Sort sort;

	@Override
	public void init() {
		setBackground(Color.WHITE);
		setLayout(null);
	}

	@Override
	public void addEvents() {

	}

	@Override
	public void addComps() {
		Font f = new Font("Arial", Font.PLAIN, 20);
		Font fButton = new Font("Arial", Font.BOLD, 20);

		lbA = initLabel("  Dãy số ", f, Color.RED);
		lbA.setLocation(50, 50);
		add(lbA);

		tfA = initTextField(250, f, Color.blue, true);
		tfA.setLocation(lbA.getX() + lbA.getWidth() + 10, lbA.getY() - tfA.getInsets().top);
		add(tfA);

		lbB = initLabel("Kết quả ", f, Color.RED);
		lbB.setLocation(lbA.getX(), lbA.getY() + lbA.getHeight() + 20);
		add(lbB);

		tfB = initTextField(250, f, Color.RED, false);
		tfB.setLocation(lbB.getX() + lbB.getWidth() + 10, lbB.getY() - tfB.getInsets().top);
		add(tfB);

		btSort = initButton("Sắp xếp", fButton, Color.BLUE);
		btSort.setLocation(tfB.getX() + tfB.getWidth() - btSort.getWidth(), tfB.getHeight() + tfB.getY() + 20);
		btSort.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sort = new Sort();
				try {
					sort.setItemSort(tfA.getText());
					sort.sort();
					tfB.setText(sort.toString());
				} catch (Exception e2) {
					// TODO: handle exception
					showNotify("Vui lòng nhập đúng qui tắc");
				}
			}
		});
		add(btSort);
	}
}
