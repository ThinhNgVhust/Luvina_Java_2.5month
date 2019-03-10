package com.thinhnv.uicolor.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.thinhnv.uicolor.ui.icommon.ICommon;

public abstract class BasePanel extends JPanel implements ICommon {
	public BasePanel() {
		init();
		addCompts();
		addEvents();

	}

	protected JLabel initLabel(String text, Font f, Color c) {
		// TODO Auto-generated method stub
		JLabel lb = new JLabel(text);
		lb.setFont(f);
		FontMetrics metrics = getFontMetrics(lb.getFont());
		int hLb = metrics.getHeight();
		int wLb = metrics.stringWidth(lb.getText());
		lb.setSize(wLb, hLb);
		lb.setForeground(c);
		return lb;
	}

	protected JTextField initTextField(Font f, int width, Color c) {
		// TODO Auto-generated method stub
		JTextField lb = new JTextField();
		lb.setFont(f);
		FontMetrics metrics = getFontMetrics(lb.getFont());
		int hLb = metrics.getHeight();
		int wLb = width;
		int paddingLR = lb.getInsets().left * 2;
		int paddingTB = lb.getInsets().bottom * 2;
		lb.setSize(wLb + paddingLR, hLb + paddingTB);
		lb.setForeground(c);
		return lb;
	}

	protected JPasswordField initPassWordTextField(Font f, int width, Color c) {
		// TODO Auto-generated method stub
		JPasswordField lb = new JPasswordField();
		lb.setFont(f);
		FontMetrics metrics = getFontMetrics(lb.getFont());
		int hLb = metrics.getHeight();
		int wLb = width;
		int paddingLR = lb.getInsets().left * 2;
		int paddingTB = lb.getInsets().bottom * 2;
		lb.setSize(wLb + paddingLR, hLb + paddingTB);
		lb.setForeground(c);
		return lb;
	}

	protected JButton initButton(Font f, Color c, String text,ActionListener ev) {
		// TODO Auto-generated method stub
		JButton btn = new JButton(text);
		btn.setFont(f);
		FontMetrics metrics = getFontMetrics(btn.getFont());
		int hLb = metrics.getHeight();
		int wLb = metrics.stringWidth(btn.getText());

		int paddingLR = btn.getInsets().left * 2;
		int paddingTB = btn.getInsets().bottom * 2;
		btn.setSize(wLb + paddingLR, hLb + paddingTB);
		btn.setForeground(c);
		btn.addActionListener(ev);
		return btn;
	}

	protected void showNotify(String sms) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, sms);
	}

	
	
}
