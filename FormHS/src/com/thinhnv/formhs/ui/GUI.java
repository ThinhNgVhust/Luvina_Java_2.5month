package com.thinhnv.formhs.ui;

import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import com.thinhnv.formhs.ui.icommon.ICommon;
import com.thinhnv.formhs.ui.panel.MainPanel;

public class GUI extends JFrame implements ICommon {
	private static final String TITLE = "Color Item";
	public static final int F_WIDTH = 700;
	public static final int F_HEIGHT = 300;
	private MainPanel mainPanel;

	public GUI() {
		init();
		addEvents();
		addCompts();
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName());
		} catch (Exception e) {
			// TODO: handle exception
		}
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
