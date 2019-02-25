package com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh;

import com.thinhnv.googlephotoapp.itimkiem.ITimKiemXeTuongTu;

public abstract class HinhAnh implements ITimKiemXeTuongTu {
	protected String idChuDe;
	protected String idHinhAnh;
	protected String tenHinhAnh;
	protected String duongDan;
	protected String kichThuoc;

	protected HinhAnh(String idChuDe, String idHinhAnh, String tenHinhAnh, String duongDan, String kichThuoc) {
		this.idChuDe = idChuDe;
		this.idHinhAnh = idHinhAnh;
		this.tenHinhAnh = tenHinhAnh;
		this.duongDan = duongDan;
		this.kichThuoc = kichThuoc;
	}

	public HinhAnh() {
		super();
	}

	public String getIdHinhAnh() {
		return idHinhAnh;
	}

	public String getTenHinhAnh() {
		return tenHinhAnh;
	}

	public void phongTo() {
		System.out.println("Phóng to ảnh " + this.tenHinhAnh);
	}

	public void thuNho() {
		System.out.println("Thu nhỏ ảnh " + this.tenHinhAnh);
	}

	public void inTT() {
		System.out.println("Mã chủ đề: " + this.idChuDe);
		System.out.println("Mã hình ảnh: " + this.idHinhAnh);
		System.out.println("Tên hình ảnh: " + this.tenHinhAnh);
		System.out.println("Dường dẫn: " + this.duongDan);
		System.out.println("Kích thước ảnh: " + this.kichThuoc);
	}

	public String cacKyTu(String s) {
		// TODO Auto-generated method stub
		String gio = "";
		s += "";
		for (int i = 0; i < s.length(); i++) {
			char kyTu = s.charAt(i);
			if (!gio.contains(kyTu + "")) {
				gio += kyTu;
			}
		}
		return gio;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof HinhAnh) {
			return this.idHinhAnh.equalsIgnoreCase(((HinhAnh) obj).idHinhAnh);
		}
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public abstract void xemAnh();
}
