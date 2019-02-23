package com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh;

public class AnhSieuXe extends HinhAnh {
	private String tenXe;
	private String hangXe;
	private double giaTien;

	public AnhSieuXe(String idHinhAnh, String tenHinhAnh, String duongDan, String idChuDe, String kichThuoc,
			String tenXe, String hangXe, double giaTien) {
		super(idHinhAnh, tenHinhAnh, duongDan, idChuDe, kichThuoc);
		this.tenXe = tenXe;
		this.hangXe = hangXe;
		this.giaTien = giaTien;
	}

	public void inTTChung() {
		System.out.println("\n*******************************");
		System.out.println("tenXe: " + tenXe);
		System.out.println("hangXe: " + hangXe);
		System.out.println("giaTien: " + giaTien);
		super.inTTChung();
		System.out.println("\n*******************************");
	}
}
