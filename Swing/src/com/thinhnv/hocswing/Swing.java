package com.thinhnv.hocswing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing extends JFrame {
	private JLabel jlblCount;
	private JButton jbtnCount;
	private JTextField jtxtCount;
	private int count = 0;

	public Swing() {
		this.jbtnCount = new JButton("Count");
		this.jlblCount = new JLabel("Counter:");
		this.jtxtCount = new JTextField("0", 10);
		jtxtCount.setEnabled(false);
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(jlblCount);
		cp.add(jtxtCount);
		cp.add(jbtnCount);
		jbtnCount.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				jtxtCount.setText(count + "");
			}
		});
		this.setTitle("Java Swing");
		this.setSize(200, 80);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
