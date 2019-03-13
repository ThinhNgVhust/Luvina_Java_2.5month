package com.thinhnv.couting.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

import javax.swing.JButton;
import javax.swing.JLabel;

import com.thinhnv.couting.ui.GUI;

public class CoutPanel extends BasePanel implements ActionListener {
	private static final String COUNT = "btnCount";
	private static final String PAUSE = "btnPause";
	private JLabel lbCount;
	private JButton btnCount, btnPause;
	private boolean isStop = false;
	private boolean isPause = false;
	private Thread th1;
	private Runnable r1 = new Runnable() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			doCount();
		}
	};

	@Override
	public void init() {
		// TODO Auto-generated method stub
		setLayout(null);
	}

	@Override
	public void addEvents() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCompts() {
		// TODO Auto-generated method stub
		Font f = new Font("Tahoma", Font.PLAIN, 50);
		btnCount = initButton("Cow", f, Color.black, COUNT, this);
		btnCount.setLocation(250 - btnCount.getWidth() / 2 - 100, 350);
		add(btnCount);
		lbCount = initLabel("0", f, Color.black);
		lbCount.setHorizontalAlignment(JLabel.CENTER);
		lbCount.setSize(GUI.F_WIDTH, 100);
		lbCount.setLocation(250 - lbCount.getWidth() / 2, 50);
		add(lbCount);

		btnPause = initButton("Pause", f, Color.black, PAUSE, this);
		btnPause.setLocation(btnCount.getX() + btnCount.getWidth() + 10, btnCount.getY());
		add(btnPause);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		String name = btn.getName();
		System.out.println(name);
		switch (name) {
		case COUNT:
			if (th1 == null) {
				th1 = new Thread(r1);
				th1.start();
			}
			isPause = false;
			break;
		case PAUSE:
			isPause = true;

			break;
		default:
			break;
		}
	}

	protected void doCount() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000;) {
			if (this.isPause) {
				System.out.println();
				continue;
			}
			lbCount.setText(i + "");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (this.isStop == true) {
				th1.stop();
			}

			i++;

		}
	}

	public void stop() {
		// TODO Auto-generated method stub
		this.isStop = true;
	}

}
