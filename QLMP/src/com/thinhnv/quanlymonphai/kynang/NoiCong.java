package com.thinhnv.quanlymonphai.kynang;

public class NoiCong extends KyNang {

	public NoiCong(String tenKyNang, int satThuong, String thuocTinh, String moTa) {
		super(tenKyNang, satThuong, thuocTinh, moTa);
		// TODO Auto-generated constructor stub
	}

	public void inTT() {
		System.out.println("Noi Cong");
		super.inTT();
	}

	public void vanCong() {
		System.out.println("Van noi cong");
	}
}
