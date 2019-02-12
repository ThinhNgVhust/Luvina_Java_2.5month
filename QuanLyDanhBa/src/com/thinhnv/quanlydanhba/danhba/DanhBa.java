package com.thinhnv.quanlydanhba.danhba;

public class DanhBa {
	private String ten;
	private String sdt;

	public DanhBa(String ten, String sdt) {
		super();
		this.ten = ten;
		this.sdt = sdt;
	}

	public String getTen() {
		return ten;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

}
