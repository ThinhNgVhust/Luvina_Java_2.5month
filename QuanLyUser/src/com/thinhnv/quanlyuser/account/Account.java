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

	public void setMaTK(String maTK) {
		this.maTK = maTK;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Account) {
			return this.matKhau.equals(((Account) obj).matKhau) && this.maTK.equals(((Account) obj).getMaTK());
		}
		return false;
	}

}
