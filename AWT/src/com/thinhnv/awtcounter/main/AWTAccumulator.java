package com.thinhnv.awtcounter.main;

import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class AWTAccumulator extends JFrame  {
	private Label lblInput;
	private Label lblOutPut;
	private TextField tfInput;
	private TextField tfOutput;
	int sum = 0;

	public AWTAccumulator() throws HeadlessException {
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		this.lblInput = new Label("Enter an integer");
		this.lblOutPut = new Label("The Accumulated Sum is: ");
		this.tfInput = new TextField(10);
		this.tfOutput = new TextField(10);
		this.tfOutput.setEditable(false);
		this.tfInput.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(lblInput);
		add(tfInput); 
		 add(lblOutPut);
		 add(tfOutput);
		 setTitle("AWT Accumulator");  // "super" Frame sets title
	      setSize(350, 120);  // "super" Frame sets initial window size
	      setVisible(true); 
//		setVisible(true);

	}

}
