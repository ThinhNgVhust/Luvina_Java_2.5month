package com.thinhnv.quanlyuser.main;


import java.io.IOException;

import javax.swing.JOptionPane;

import com.thinhnv.quanlyuser.account.Account;
import com.thinhnv.quanlyuser.quanlyuser.QuanLyUser;
import com.thinhnv.quanlyuser.user.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/home/thinhnv/user.txt";
		QuanLyUser ql = new QuanLyUser(path);
		User thinh1= new User("Nguyen Thinh", "0987654321", new Account("thuchinh", "hoidelamgi"));
		thinh1.dangKi(ql);
		ql.sapXepVaInTTTheoTen();
	}

}
