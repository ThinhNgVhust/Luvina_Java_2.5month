package com.thinhnv.quanlyuser.user;

public class User {
	private String maTK;
	private String pass;
	private String ten;
	private String SDT;
	private IDangKy dangky;

	public User(String maTK, String pass, String ten, String SDT) {
		this.maTK = maTK;
		this.pass = pass;
		this.ten = ten;
		this.SDT = SDT;
	}

	public void dangKy(IDangKy iDangKy) {
		this.dangky = iDangKy;
//		this.dangky.add(this);
	}

	public void dangNhap() {
		if (this.dangky == null) {
			System.out.println("Tài khoản này chưa đăng kí");
			return;
		} else {
			this.dangky.dangNhap(this);
		}
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof User) {
			return maTK.equals(((User) obj).maTK);
		}
		return false;
	}

	public interface IDangKy {
		public void add(User user);

		public void dangNhap(User user);
	}

	public String getMaTK() {
		return maTK;
	}

	public String getTen() {
		return ten;
	}

	public String getSDT() {
		return SDT;
	}

	public String getPass() {
		// TODO Auto-generated method stub
		return this.pass;
	}

	@Override
	public String toString() {
		return this.maTK + "-" + this.ten + "-" + this.SDT + "-" + this.pass;
	}

}
