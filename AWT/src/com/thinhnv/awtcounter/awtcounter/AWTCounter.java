package com.thinhnv.awtcounter.awtcounter;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class AWTCounter extends JFrame{
	private Button btnCount;
	private Label lblCount;
	private TextField tfCount;
	private int count = 0;

	public AWTCounter() {
		setSize(250, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("AWT Counter");
		this.btnCount = new Button("Count");
		this.lblCount = new Label("Counter");
		this.tfCount = new TextField(count + "", 10);
		this.tfCount.setEditable(false);
		this.btnCount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				tfCount.setText(count + "");
				if (count == 10) {
					count = 0;
				}
				count++;
			}
		});
		Panel panel = new Panel();
		panel.add(lblCount);
		panel.add(tfCount);
		panel.add(btnCount);
		add(panel);
		setVisible(true);

	}

}
