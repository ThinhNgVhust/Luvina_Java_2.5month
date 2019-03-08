package com.thinhnv.quanlyuser.user;

import com.thinhnv.quanlyuser.account.Account;

public class User {
	private Account account;
	private String ten;
	private String sdt;
	private IDangKy iDangKy;

	public User(Account account, String ten, String sdt) {
		this.account = account;
		this.ten = ten;
		this.sdt = sdt;
	}

	public void dangKy(IDangKy event) {
		this.iDangKy = event;
		this.iDangKy.dangKy(this);
	}

	public void dangNhap(String matKhau) {
		if (this.iDangKy == null) {
			System.out.println("Chua dang ki");
		} else {
			this.iDangKy.dangNhap(this.account.getMaTK(), matKhau);
		}
	}

	public Account getAccount() {
		return account;
	}

	public String getTen() {
		return ten;
	}

	public String getSdt() {
		return sdt;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof User) {
			return this.getAccount().getMaTK().equals(((User) obj).getAccount().getMaTK());
		}
		return false;
	}

	public interface IDangKy {
		public void dangKy(User user);

		public void dangNhap(String maTK, String matKhau);
	}
}
