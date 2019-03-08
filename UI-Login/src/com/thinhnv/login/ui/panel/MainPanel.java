package com.thinhnv.login.ui.panel;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends BasePanel {
	private LoginPanel loginPanel;


	@Override
	public void init() {
		// TODO Auto-generated method stub
		setLayout(new CardLayout());
		setVisible(true);
		
	}

	@Override
	public void addCompts() {
		// TODO Auto-generated method stub
		this.loginPanel = new LoginPanel(); 
		add(loginPanel);
	}

	@Override
	public void addEvents() {
		// TODO Auto-generated method stub
	}
	

}
