package com.thinhnv.uicolor.ui.panel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends BasePanel implements ActionListener{
	private ColorPanel colorPanel;
	private BGPanel bgPanel;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		setLayout(null);
		setVisible(true);
		
	}

	@Override
	public void addCompts() {
		// TODO Auto-generated method stub
		colorPanel= new ColorPanel();
		
		add(colorPanel);
		bgPanel = new BGPanel();
		add(bgPanel);
	}

	@Override
	public void addEvents() {
		// TODO Auto-generated method stub
	}

	public  void setRight(Color c) {
		// TODO Auto-generated method stub
		this.bgPanel.setBackground(c);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Hih");
	}
	

}
