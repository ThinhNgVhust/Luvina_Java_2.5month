package com.luvina.sapxep.ui;

import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import com.luvina.sapxep.ui.icommon.ICommon;
import com.luvina.sapxep.ui.panel.MainPanel;

public class GUI extends JFrame implements ICommon {
	private static final String TITLE = "Tính tổng";
	public static final int F_WIDTH = 500;
	public static final int F_HEIGHT = 250;

	private JPanel mainPanel;

	public GUI() {
		init();
		addEvents();
		addComps();
	}

	@Override
	public void addComps() {
		mainPanel = new MainPanel();
		add(mainPanel);
	}

	@Override
	public void addEvents() {
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

	@Override
	public void init() {
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
}
