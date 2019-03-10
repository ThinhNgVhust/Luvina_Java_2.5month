package com.luvina.sapxep.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.luvina.sapxep.ui.icommon.ICommon;

public abstract class BasePanel extends JPanel implements ICommon {
	public BasePanel() {
		init();
		addEvents();
		addComps();
	}

	protected JLabel initLabel(String text, Font f, Color c) {
		JLabel lb = new JLabel(text);
		lb.setFont(f);
		lb.setForeground(c);
		FontMetrics metrics = getFontMetrics(lb.getFont());

		int hLb = metrics.getHeight();
		int wLb = metrics.stringWidth(lb.getText());
		lb.setSize(wLb, hLb);
		return lb;
	}

	protected JButton initButton(String text, Font f, Color c) {
		JButton bt = new JButton(text);
		bt.setFont(f);
		bt.setForeground(c);
		FontMetrics metrics = getFontMetrics(bt.getFont());

		int hLb = metrics.getHeight();
		int wLb = metrics.stringWidth(bt.getText());

		int paddingLR = bt.getInsets().left * 2;
		int paddingTB = bt.getInsets().top * 2;
		bt.setSize(wLb + paddingLR, hLb + paddingTB);

		return bt;
	}

	protected JTextField initTextField(int wText, Font f, Color c, boolean isEditable) {
		JTextField tf = new JTextField();
		tf.setForeground(c);
		tf.setFont(f);
		FontMetrics fm = getFontMetrics(tf.getFont());
		int paddingLR = tf.getInsets().left * 2;
		int paddingTB = tf.getInsets().top * 2;
		tf.setSize(wText+paddingLR, fm.getHeight()+paddingTB);
		tf.setEditable(isEditable);

		return tf;
	}

	protected void showNotify(String message) {
		JOptionPane.showMessageDialog(this, message);
	}
}
