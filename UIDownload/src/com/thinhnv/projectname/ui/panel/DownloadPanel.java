package com.thinhnv.projectname.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.Timer;

public class DownloadPanel extends BasePanel implements ActionListener {
	private static final String BTN_DOWNLOAD = "btnDowload";
	private JProgressBar pPath1, pPath2, pPath3, pDownload;
	private JLabel lbPath1, lbPath2, lbPath3;
	private JButton btnDownload;
	private JTextField tfP1, tfP2, tfP3;

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
		Font f = new Font("Tahoma", Font.BOLD, 15);
		boolean isEditable = true;
		lbPath1 = initLabel("Path1", f, Color.BLACK);
		lbPath1.setLocation(20, 35);
		add(lbPath1);
		tfP1 = initTextField(400, f, Color.BLACK, isEditable);
		tfP1.setLocation(lbPath1.getX() + lbPath1.getWidth() + 20, lbPath1.getY() - tfP1.getInsets().top);
		add(tfP1);

		pPath1 = initJProgressBar(0, 100, 100, tfP1.getHeight(), tfP1.getX() + tfP1.getWidth() + 10, tfP1.getY());
		add(pPath1);

		lbPath2 = initLabel("Path1", f, Color.BLACK);
		lbPath2.setLocation(lbPath1.getX(), lbPath1.getY() + lbPath1.getHeight() + 30);
		add(lbPath2);

		tfP1 = initTextField(400, f, Color.BLACK, isEditable);
		tfP1.setLocation(lbPath2.getX() + lbPath2.getWidth() + 20, lbPath2.getY() - tfP1.getInsets().top);
		add(tfP1);

		pPath2 = initJProgressBar(0, 100, 100, tfP1.getHeight(), tfP1.getX() + tfP1.getWidth() + 10, tfP1.getY());
		add(pPath2);

		lbPath3 = initLabel("Path3", f, Color.BLACK);
		lbPath3.setLocation(lbPath2.getX(), lbPath2.getY() + lbPath2.getHeight() + 30);
		add(lbPath3);

		tfP3 = initTextField(400, f, Color.BLACK, isEditable);
		tfP3.setLocation(lbPath3.getX() + lbPath3.getWidth() + 20, lbPath3.getY() - tfP3.getInsets().top);
		add(tfP3);

		pPath3 = initJProgressBar(0, 100, 100, tfP1.getHeight(), tfP3.getX() + tfP3.getWidth() + 10, tfP3.getY());
		add(pPath3);

		pDownload = initJProgressBar(0, 300, pPath1.getWidth() * 3, pPath1.getHeight(), tfP1.getX(),
				pPath3.getY() + pPath3.getHeight() + 50);
		add(pDownload);

		btnDownload = initButton("Download", f, Color.black, BTN_DOWNLOAD, this);
		btnDownload.setLocation(tfP1.getX() + tfP1.getWidth() - btnDownload.getWidth(), pDownload.getY());
		add(btnDownload);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnDownload) {
			new Timer(100, new ActionListener() {
				int index = 0;
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if (pPath1.getValue() < 100) {
						pPath1.setValue(index);
						pPath2.setValue(index);
						pPath3.setValue(index);
						pDownload.setValue(3 * index);
						index++;
					} else {
						pPath1.setValue(100);
						((Timer) (e.getSource())).stop();
					}
				}
			}).start();
		}
	}
}
