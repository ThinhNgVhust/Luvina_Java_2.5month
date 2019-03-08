package com.thinhnv.hocjpanel.loginpanel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.omg.CORBA.FREE_MEM;

public class LoginPanel extends JPanel {
	private int count = 0;
	JTextField tf;
	JButton btn;
	JLabel lbl;

	public LoginPanel() {
		init();
		addEvents();
		addCompts();
	}

	private void addCompts() {
		// TODO Auto-generated method stub

	}

	private void addEvents() {
		// TODO Auto-generated method stub

	}

	private void init() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setTitle("Action Listener");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(3);
		frame.setLayout(null);
		frame.setBackground(Color.green);
		frame.getContentPane().add(this);
		frame.setVisible(true);
		setLayout(new FlowLayout());
		setLocation(0, 0);
		setSize(300, 300);
		lbl = new JLabel("Counter");
		this.add(lbl);
		tf = new JTextField("0", 10);
		tf.setEditable(false);
		this.add(tf);
		btn = new JButton("Count");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				JOptionPane.showMessageDialog(null, ++count);
				tf.setText((++count) + "");
				count = count == 10 ? -1 : count;
			}
		});
		this.add(btn);
		frame.add(this);
		frame.setVisible(true);

	}

}
