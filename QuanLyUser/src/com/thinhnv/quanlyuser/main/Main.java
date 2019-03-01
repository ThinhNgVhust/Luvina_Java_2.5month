package com.thinhnv.quanlyuser.main;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import com.thinhnv.quanlyuser.account.Account;
import com.thinhnv.quanlyuser.user.User;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "/home/thinhnv/user.txt";
		Account account = new Account(path);
		User user = new User("12345678", "pass", "ten", "SDT");
		user.dangNhap();
		user.dangKy(account);
		account.inTTUser();
		user.dangNhap();
	}
}
