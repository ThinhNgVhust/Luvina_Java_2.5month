package com.thinhnv.couting.ui.panel;

import java.awt.CardLayout;

public class MainPanel extends BasePanel {
	private CoutPanel countPanel;

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
		countPanel = new CoutPanel();
		add(countPanel);
	}

	public void stopCountPanel() {
		// TODO Auto-generated method stub
		this.countPanel.stop();
	}

}
