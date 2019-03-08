package com.thinhnv.quanlyuser.main;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import com.thinhnv.quanlyuser.account.Account;
import com.thinhnv.quanlyuser.quanlyuser.QuanLyUser;
import com.thinhnv.quanlyuser.user.User;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "/home/thinhnv/user.txt";
		QuanLyUser quanLyUser = new QuanLyUser(path);
		quanLyUser.sapXepTheoTen();
		quanLyUser.xoaData();
	}

}
