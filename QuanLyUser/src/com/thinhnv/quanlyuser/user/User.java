package com.thinhnv.quanlyuser.user;

import com.thinhnv.quanlyuser.account.Account;

public class User {
	private String hoTen;
	private String soDT;
	private Account account;
	private IHanhVi iHanhVi;

	public User(String hoTen, String soDT, Account account) {
		this.hoTen = hoTen;
		this.soDT = soDT;
		this.account = account;
	}

	public void dangKi(IHanhVi iHanhVi) {
		this.iHanhVi = iHanhVi;
		iHanhVi.dangKi(this.account, this.hoTen, this.soDT);
	}

	public void dangNhap() {
		if (this.iHanhVi == null) {
			System.out.println("Chua dang ki");
			return;
		} else {
			if (this.iHanhVi.dangNhap(this.account)) {
				System.out.println("Dang nhap thanh cong");
			} else {
				System.out.println("Tai khoan hoac mat khau khong chinh xac");
			}
		}

	}

	public String getHoTen() {
		return this.hoTen;
	}

	public Account getAcount() {
		return this.account;
	}

	@Override
	public String toString() {
		return account.getMaTK() + "-" + account.getMatKhau() + "-" + hoTen + "-" + soDT;
	}

	public interface IHanhVi {
		public void dangKi(Account account,String hoTen, String soDT);

		public boolean dangNhap(Account account);
	}

	public int soSanhTheoTen(User user) {
		return this.hoTen.compareTo(user.getHoTen());
	}
}
