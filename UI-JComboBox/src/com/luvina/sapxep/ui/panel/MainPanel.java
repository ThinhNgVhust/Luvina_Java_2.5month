package com.luvina.sapxep.ui.panel;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class MainPanel extends BasePanel {
	private JPanel tong2SoABPanel;

	
	@Override
	public void addComps() {
		tong2SoABPanel = new SortPanel();
		add(tong2SoABPanel);
	}

	@Override
	public void addEvents() {
		
	}

	@Override
	public void init() {
		setBackground(Color.red);
		setLayout(new CardLayout());		
	}
}
