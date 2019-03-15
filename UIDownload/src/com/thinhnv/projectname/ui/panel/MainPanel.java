package com.thinhnv.projectname.ui.panel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;

import javax.swing.JButton;

public class MainPanel extends BasePanel {
	DownloadPanel downloadPanel;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		setLayout(new CardLayout());
	}

	@Override
	public void addEvents() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCompts() {
		// TODO Auto-generated method stub
		downloadPanel = new DownloadPanel();
		add(downloadPanel);
		
	}

}
