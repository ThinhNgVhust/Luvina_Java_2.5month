package com.thinhnv.jframe.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI extends JFrame {
	public static final int LOCATION_X = 100;
	public static final int LOCATION_Y = 0;
	public static final int WIDTH_FRAME = 500;
	public static final int HEIGHT_FRAME = 500;

	public GUI(String title) {
		initGUI(title);
		addEventsGUI();
		addComptsGUI();
	}

	private void addComptsGUI() {
		// TODO Auto-generated method stub
		int width = 100;
		int height = 100;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				add(getPanel(j * 200, i * 200, width, height));
			}

		}
	}

	private Panel getPanel(int x, int y, int width, int height) {
		Panel panel = new Panel();
		panel.setSize(width, height);
		panel.setLocation(x, y);
		Random rd = new Random();
		int red = rd.nextInt(256);
		int green = rd.nextInt(256);
		int blue = rd.nextInt(256);
		Color randomColor = new Color(red, green, blue);
		panel.setBackground(randomColor);
		return panel;
	}

	private void addEventsGUI() {
		// TODO Auto-generated method stub

	}

	private void initGUI(String title) {
		// TODO Auto-generated method stub
		setTitle(title);
		setSize(WIDTH_FRAME , HEIGHT_FRAME );
		setPreferredSize(new Dimension(WIDTH_FRAME, HEIGHT_FRAME));
		setLocationRelativeTo(null);// dùng thay setBounds
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 200);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setSize(100 + WIDTH_FRAME, HEIGHT_FRAME);
		setLayout(null);
		setResizable(false);

	}

}
