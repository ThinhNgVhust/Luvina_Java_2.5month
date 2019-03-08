package com.thinhnv.quanlyuser.account;

public class Account {
	private String maTK;
	private String matKhau;

	public Account(String maTK, String matKhau) {
		this.maTK = maTK;
		this.matKhau = matKhau;
	}

	public String getMaTK() {
		return maTK;
	}

	public String getMatKhau() {
		return matKhau;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Account) {
			return this.maTK.equals(((Account) obj).maTK);
		}
		return false;
	}
}
