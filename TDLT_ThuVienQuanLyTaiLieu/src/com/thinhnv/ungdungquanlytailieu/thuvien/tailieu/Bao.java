package com.thinhnv.ungdungquanlytailieu.thuvien.tailieu;

public class Bao extends TaiLieu {
	private int ngayPhatHanh;

	public Bao(String maTL, String tenTL, int soBanPhatHanh, int ngayPhatHanh) {
		super(maTL, tenTL, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public void inTT() {
		System.out.println("Bao [ngayPhatHanh=" + ngayPhatHanh + "]");
		super.inTT();
	}

	public void bao() {
		System.out.println("Bao rat mong");
	}
}
