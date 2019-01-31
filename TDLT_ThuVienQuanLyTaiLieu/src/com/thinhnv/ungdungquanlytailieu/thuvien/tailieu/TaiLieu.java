package com.thinhnv.ungdungquanlytailieu.thuvien.tailieu;

public abstract class TaiLieu {
	protected String maTL;
	protected String tenTL;
	protected int soBanPhatHanh;

	protected TaiLieu(String maTL, String tenTL, int soBanPhatHanh) {
		this.maTL = maTL;
		this.tenTL = tenTL;
		this.soBanPhatHanh = soBanPhatHanh;
	}

	public void inTT() {
		System.out.println("TaiLieu [maTL=" + maTL + ", tenTL=" + tenTL + ", soBanPhatHanh=" + soBanPhatHanh + "]");
	}

}
