package com.thinhnv.login.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.thinhnv.login.login.Account;
import com.thinhnv.login.login.LoginMgr;

public class LoginPanel extends BasePanel {
	private JLabel lbUserName, lbPassWord;
	private JTextField tflbUserName;
	private JPasswordField tflbPassWord;
	private JButton btLogin, btCancel;
	private LoginMgr loginMngr;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		setLayout(null);
	}

	@Override
	public void addCompts() {
		// TODO Auto-generated method stub
		Font f = new Font("Tahoma", Font.PLAIN, 25);
		lbUserName = initLabel("Username", f, Color.RED);
		lbUserName.setLocation(20, 20);
		add(lbUserName);

		tflbUserName = initTextField(f, 250, Color.GREEN);
		tflbUserName.setLocation(lbUserName.getX() + lbUserName.getWidth() + 20, lbUserName.getY());
		add(tflbUserName);

		lbPassWord = initLabel("Password", f, Color.RED);
		lbPassWord.setLocation(lbUserName.getX(), lbUserName.getHeight() + lbUserName.getY() + 30);
		add(lbPassWord);

		tflbPassWord = initPassWordTextField(f, 250, Color.GREEN);
		tflbPassWord.setLocation(tflbUserName.getX(), lbPassWord.getY());
		add(tflbPassWord);

		btLogin = initButton(f, Color.BLUE, "LOGIN");
		btLogin.setLocation(tflbPassWord.getX() + tflbPassWord.getWidth() - btLogin.getWidth(),
				tflbPassWord.getY() + tflbPassWord.getHeight() + 20);
		add(btLogin);

		btCancel = initButton(f, Color.RED, "CANCEL");
		btCancel.setLocation(btLogin.getX() - 20 - btCancel.getWidth(), btLogin.getY());
		add(btCancel);
	}

	@Override
	public void addEvents() {
		btCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showNotify("Dong chuong trinh");
				System.exit(0);
			}
		});
		btLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String userName = tflbUserName.getText();
				char[] pass = tflbPassWord.getPassword();
				String password = "";
				for (int i = 0; i < pass.length; i++) {
					password += pass[i];
				}
				if (userName.isEmpty() || password.isEmpty()) {
					showNotify("Dien day du thong tin");
					return;
				}
				loginMngr = new LoginMgr();
				if (loginMngr.login(userName, password)) {
					showNotify("Dang nhap thanh cong");
				} else {
					showNotify("Sai thong tin thang nhap");
				}
			}
		});
	}

}
