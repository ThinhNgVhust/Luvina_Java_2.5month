package com.thinhnv.formhs.logic;

public class HocSinh {
	private String hoTen;
	private String lop;
	private double diem;
	

	public HocSinh(String hoTen, String lop, double diem) {
		this.hoTen = hoTen;
		this.lop = lop;
		this.diem = diem;
	}


	public String getHoTen() {
		return hoTen;
	}


	public String getLop() {
		return lop;
	}


	public String getDiem() {
		return diem+"";
	}
	
	@Override
	public String toString() {
		return hoTen + "_" + lop + "_" + diem;
	}

}
