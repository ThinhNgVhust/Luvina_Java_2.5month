package com.thinhnv.hsformapp.ui.panel;

import java.awt.CardLayout;

public class MainPanel extends BasePanel {
	private FormHSPanel formHS;

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
		formHS = new FormHSPanel();
		add(formHS);
	}

}
