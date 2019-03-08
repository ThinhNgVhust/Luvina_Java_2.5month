package com.thinhnv.sampleui.ui;

import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.thinhnv.sampleui.ui.icommon.ICommon;
import com.thinhnv.sampleui.ui.panel.MainPanel;

public class GUI extends JFrame implements ICommon {
	private static final String TITLE = "Sample UI";
	public static final int F_WIDTH = 800;
	public static final int F_HEIGHT = 500;
	private MainPanel mainPanel;

	public GUI() {
		init();
		addEvents();
		addCompts();
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		setTitle(TITLE);
		setSize(F_WIDTH, F_HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setLayout(new CardLayout());
	}

	@Override
	public void addCompts() {
		// TODO Auto-generated method stub
		mainPanel = new MainPanel();
		add(mainPanel);
	}

	@Override
	public void addEvents() {
		// TODO Auto-generated method stub
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int rs = JOptionPane.showConfirmDialog(GUI.this, "Close it, really?", "Alert",
						JOptionPane.YES_NO_OPTION);
				if (rs == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		});
	}

}
