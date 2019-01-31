package com.thinhnv.ungdungquanlytailieu.thuvien.tailieu;

public class Sach extends TaiLieu {
	private String tenTG;
	private int soTrang;

	public Sach(String maTL, String tenTL, int soBanPhatHanh, String tenTG, int soTrang) {
		super(maTL, tenTL, soBanPhatHanh);
		this.tenTG = tenTG;
		this.soTrang = soTrang;
	}

	public void inTT() {
		System.out.println("Sach [tenTG=" + tenTG + ", soTrang=" + soTrang + "]");
		super.inTT();
	}

}
