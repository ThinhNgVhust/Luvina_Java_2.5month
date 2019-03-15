package com.thinhnv.projectname.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import com.thinhnv.projectname.ui.icommon.ICommon;

public abstract class BasePanel extends JPanel implements ICommon {
//	protected static Font fNormal = new Font("Tahoma", Font.BOLD, 10);
//	protected static Font fNormal = new Font("Tahoma", Font.BOLD, 15);
//	protected static Font fNormal = new Font("Tahoma", Font.BOLD, 20);
//	protected static Font fNormal = new Font("Tahoma", Font.BOLD, 25);
	public BasePanel() {
		init();
		addEvents();
		addCompts();
	}

	protected JTable initTable(Font f, Font fHeader, Color bg, Color cHeader, boolean isShowGrid) {
		// TODO Auto-generated method stub
		f = new Font("Tahoma", Font.PLAIN, 15);
		JTable table = new JTable() {
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		table.setFont(f);
		JTableHeader header = table.getTableHeader();
		((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
		((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer()).setBackground(cHeader);
		header.setBackground(cHeader);
		header.setFont(fHeader);
		table.setBackground(bg);
		table.setShowGrid(isShowGrid);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setCellSelectionEnabled(true);
		return table;
	}

	protected JLabel initLabel(String text, Font f, Color c) {
		JLabel lb = new JLabel(text);
		lb.setFont(f);
		lb.setForeground(c);
		FontMetrics metrics = getFontMetrics(lb.getFont());

		int paddingLR = lb.getInsets().left * 2;
		int paddingTB = lb.getInsets().top * 2;
		int hLb = metrics.getHeight();
		int wLb = metrics.stringWidth(lb.getText());
		lb.setSize(wLb + paddingLR, hLb + paddingTB);
		return lb;
	}

	protected JButton initButton(String text, Font f, Color c, String name, ActionListener e) {
		JButton bt = new JButton(text);
		bt.setFont(f);
		bt.setForeground(c);
		FontMetrics metrics = getFontMetrics(bt.getFont());

		int hLb = metrics.getHeight();
		int wLb = metrics.stringWidth(bt.getText());

		int paddingLR = bt.getInsets().left * 2;
		int paddingTB = bt.getInsets().top * 2;
		bt.setSize(wLb + paddingLR, hLb + paddingTB);
		bt.setName(name);
		bt.addActionListener(e);
		return bt;
	}

	protected JButton initButton(String text, Font f, Color c, int width, String name, ActionListener e) {
		JButton bt = new JButton(text);
		bt.setFont(f);
		bt.setForeground(c);
		FontMetrics metrics = getFontMetrics(bt.getFont());
		int hLb = metrics.getHeight();
		int wLb = metrics.stringWidth(bt.getText());
		bt.setSize(width + wLb, width + hLb);
		bt.setName(name);
		bt.addActionListener(e);
		return bt;
	}

	protected JTextField initTextField(int wText, Font f, Color c, boolean isEditable) {
		JTextField tf = new JTextField();
		tf.setForeground(c);
		tf.setFont(f);
		FontMetrics fm = getFontMetrics(tf.getFont());
		int paddingLR = tf.getInsets().left * 2;
		int paddingTB = tf.getInsets().top * 2;
		tf.setSize(wText + paddingLR, fm.getHeight() + paddingTB);
		tf.setEditable(isEditable);
		return tf;
	}

	protected JProgressBar initJProgressBar(int startRange, int endRange, int width, int height, int locationX,
			int locationY) {
		JProgressBar pro = new JProgressBar(startRange, endRange);
		pro.setBounds(locationX, locationY, width, height);
		pro.setValue(0);
		pro.setStringPainted(true);
		return pro;
	}

	protected void showNotify(String message) {
		JOptionPane.showMessageDialog(this, message);
	}
}
