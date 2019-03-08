package com.thinhnv.thuchanhgiaodien.ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.PropertyChangeListener;
import java.util.Random;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.thinhnv.thuchanhgiaodien.ui.panel.LoginPanel;
import com.thinhnv.thuchanhgiaodien.ui.panel.MouseListenerAdapter;

public class GUI extends JFrame {

	private static final String GUI = "Game Caro";
	private static final int W_FRAME = 500;
	private static final int W_HEIGHT = 500;
	private LoginPanel loginPanelA;
	private LoginPanel loginPanelB;
	private boolean isVisible = false;

	public GUI() {
		init();
		addCompts();
		addEvents();

	}

	private void addCompts() {
		// TODO Auto-generated method stub
		this.loginPanelA = new LoginPanel(25, 50, 200, 200);
		this.loginPanelB = new LoginPanel(250, 50, 200, 200);
		this.add(loginPanelA);
		this.add(loginPanelB);
		JButton btn = new JButton("Thinh");
	}

	private void addEvents() {
		loginPanelA.addMouseListener(new MouseListenerAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				loginPanelB.setVisible(true);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				loginPanelB.setVisible(false);
			}

		});
		loginPanelB.addMouseListener(new MouseListenerAdapter() {

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				loginPanelA.setVisible(true);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				loginPanelA.setVisible(false);
			}

		});
	}

	private void init() {
		// TODO Auto-generated method stub
		setTitle(GUI);
		setSize(W_FRAME, W_HEIGHT);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.CYAN);
		setDefaultCloseOperation(3);
		setLayout(null);
	}

}
