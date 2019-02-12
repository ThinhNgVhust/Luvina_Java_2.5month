package com.thinhnv.quanlymonphai.kynang;

public class NgoaiCong extends KyNang{

	public NgoaiCong(String tenKyNang, int satThuong, String thuocTinh, String moTa) {
		super(tenKyNang, satThuong, thuocTinh, moTa);
		// TODO Auto-generated constructor stub
	}
	public void inTT() {
		System.out.println("Ngoai Cong");
		super.inTT();
	}
	public void danhLienHoan() {
		System.out.println("Danh lien hoan");
	}
}
