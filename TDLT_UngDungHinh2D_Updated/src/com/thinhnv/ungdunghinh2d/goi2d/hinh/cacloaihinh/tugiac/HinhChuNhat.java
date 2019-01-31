package com.thinhnv.ungdunghinh2d.goi2d.hinh.cacloaihinh.tugiac;

import com.thinhnv.ungdunghinh2d.goi2d.canh.Canh;
import com.thinhnv.ungdunghinh2d.goi2d.dinh.Dinh;

public class HinhChuNhat extends TuGiac {
	private Canh canh1;
	private Canh canh2;

	public HinhChuNhat(Dinh d1, Dinh d2, Dinh d3, Dinh d4) {
		super(d1, d2, d3, d4);
		this.canh1 = new Canh(d1, d2);
		this.canh2 = new Canh(d2, d3);
		// TODO Auto-generated constructor stub
	}

	public HinhChuNhat(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		// TODO Auto-generated constructor stub
		this.canh1 = new Canh(this.d1, this.d2);
		this.canh1 = new Canh(this.d1, this.d2);
	}

	protected void setChuVi() {
		this.chuVi = (this.canh1.getDoDai() + this.canh2.getDoDai()) * 2;
	}

	protected void setDienTich() {
		this.dienTich = this.canh1.getDoDai() * this.canh2.getDoDai();
	}

	public double getChuVi() {
		this.setChuVi();
		return this.chuVi;
	}

	public double getDienTich() {
		this.setDienTich();
		return this.dienTich;
	}

	public void inTT() {
		System.out.println("Hinh chu nhat co cac thong tin:");
		System.out.println("Do dai canh1: " + this.canh1.getDoDai());
		System.out.println("Do dai canh2: " + this.canh2.getDoDai());
		System.out.println("Chu vi: " + this.getChuVi());
		System.out.println("Dien tich: " + this.getDienTich());
	}
}
