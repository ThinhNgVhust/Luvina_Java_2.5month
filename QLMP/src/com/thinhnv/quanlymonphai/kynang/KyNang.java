package com.thinhnv.quanlymonphai.kynang;

public abstract class KyNang {
	protected String tenKyNang;
	protected int satThuong;
	protected String thuocTinh;
	protected String moTa;
	
	public KyNang(String tenKyNang, int satThuong, String thuocTinh, String moTa) {
//		super();
		this.tenKyNang = tenKyNang;
		this.satThuong = satThuong;
		this.thuocTinh = thuocTinh;
		this.moTa = moTa;
	}
	public void inTT() {
		String thongTin = "KyNang [tenKyNang=" + tenKyNang + ", satThuong=" + satThuong + ", thuocTinh=" + thuocTinh + ", moTa="
				+ moTa + "]";
		System.out.println(thongTin);
	}
	public int getSatThuong() {
		return this.satThuong;
	}
	@Override
	public String toString() {
		return "KyNang [tenKyNang=" + tenKyNang + ", satThuong=" + satThuong + ", thuocTinh=" + thuocTinh + ", moTa="
				+ moTa + "]";
	}

	
	
	
}
