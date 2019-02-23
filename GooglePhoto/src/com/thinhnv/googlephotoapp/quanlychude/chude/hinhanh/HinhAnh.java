package com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh;

public abstract class HinhAnh {
	protected String idHinhAnh;
	protected String tenHinhAnh;
	protected String duongDan;
	protected String idChuDe;
	protected String kichThuoc;

	public HinhAnh(String idHinhAnh, String tenHinhAnh, String duongDan, String idChuDe, String kichThuoc) {
		this.idChuDe = idChuDe;
		this.idHinhAnh = idHinhAnh;
		this.tenHinhAnh = tenHinhAnh;
		this.duongDan = duongDan;
		this.kichThuoc = kichThuoc;
	}

	public String getIdHinhAnh() {
		return idHinhAnh;
	}

	public String getTenHinhAnh() {
		return tenHinhAnh;
	}

	public void hienThiAnh() {
		System.out.println("Hien thi anh");
	}

	public void inTTChung() {
		System.out.println("idHinhAnh" + idHinhAnh);
		System.out.println("tenHinhAnh" + tenHinhAnh);
		System.out.println("duongDan" + duongDan);
		System.out.println("idChuDe" + idChuDe);
		System.out.println("kichThuoc" + kichThuoc);
	}

	public void thuPhong(double scale) {
		if (scale > 1) {
			System.out.println("Phong to " + this.tenHinhAnh);
		} else if (scale < 1) {
			System.out.println("Thu nho " + this.tenHinhAnh);
		} else {
			System.out.println("Giu nguyen " + this.tenHinhAnh);
		}
	}

}
