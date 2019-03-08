package com.thinhnv.login.login;

public class Account {
	private String userName, passWord;

	public Account(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassWord() {
		return passWord;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Account) {
			return this.userName.equals(((Account) obj).userName) && this.passWord.equals(((Account) obj).passWord);
		}
		return false;
	}

}
