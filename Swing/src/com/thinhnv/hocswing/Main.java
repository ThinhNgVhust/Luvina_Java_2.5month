package com.thinhnv.hocswing;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Swing();
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Swing();
			}
		});
	}

}
