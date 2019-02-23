package com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh;

public class AnhCayCo extends HinhAnh {
	private String tenGoi;
	private String congDung;

	public AnhCayCo(String idHinhAnh, String tenHinhAnh, String duongDan, String idChuDe, String kichThuoc,
			String tenGoi, String congDung) {
		super(idHinhAnh, tenHinhAnh, duongDan, idChuDe, kichThuoc);
		this.tenGoi = tenGoi;
		this.congDung = congDung;
	}

	public void inTTChung() {
		System.out.println("\n*******************************");
		System.out.println("tenGoi: " + tenGoi);
		System.out.println("congDung: " + congDung);
		super.inTTChung();
		System.out.println("\n*******************************");
	}

}
