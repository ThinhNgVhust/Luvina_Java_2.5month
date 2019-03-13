package com.thinhnv.hsformapp.logic;

public class HocSinh {
	private String hoTen;
	private String lop;
	private double diemTK;

	public HocSinh(String hoTen, String lop, double diemTK) {
		super();
		this.hoTen = hoTen;
		this.lop = lop;
		this.diemTK = diemTK;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public double getDiemTK() {
		return diemTK;
	}

	public void setDiemTK(double diemTK) {
		this.diemTK = diemTK;
	}

	@Override
	public String toString() {
		return hoTen + "_" + lop + "_" + diemTK;
	}

}
