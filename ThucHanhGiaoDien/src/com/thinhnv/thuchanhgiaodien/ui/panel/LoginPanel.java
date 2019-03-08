package com.thinhnv.thuchanhgiaodien.ui.panel;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class LoginPanel extends JPanel {
	public LoginPanel(int x, int y, int width, int height) {
		init(x, y, width, height);
//		addEvents();
	}

	public void addEvents() {
		// TODO Auto-generated method stub
		this.setVisible(!this.isVisible());
	}

	private void init(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		setSize(width, height);
		setLocation(x, y);
		setBackground(Color.RED);
	}

}
