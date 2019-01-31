package com.thinhnv.ungdungquanlytailieu.thuvien.tailieu;

public class TapChi extends TaiLieu {
	private int soPhatHanh;
	private int thangPhatHanh;

	public TapChi(String maTL, String tenTL, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(maTL, tenTL, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public void inTT() {
		System.out.println("TapChi [soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + "]");
		super.inTT();
	}

}
