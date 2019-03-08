package com.thinhnv.login.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class LoginMgr {
	private ArrayList<Account> listAcount;

	public LoginMgr() {
		this.listAcount = new ArrayList<Account>();
		getAllAcount();
	}

	private void getAllAcount() {
		String path = "/home/thinhnv/Desktop/Account.txt";
		File file = new File(path);
		String gio = "";
		try {
			FileInputStream fileIn = new FileInputStream(file);
			try {
				int kyTu = fileIn.read();
				while (kyTu != -1) {
					if (kyTu != 10) {
						gio += (char) kyTu;
					}
					if (kyTu == 10 && gio != "") {
						String[] arrStr = gio.split("_");
						this.listAcount.add(new Account(arrStr[0], arrStr[1]));
						gio = "";
					}
					kyTu = fileIn.read();
				}
			} catch (IOException e) {
				// TODO: handle exception
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean login(String user, String pass) {
		Account ac = new Account(user, pass);
		return this.listAcount.indexOf(ac) >= 0;
	}
}
