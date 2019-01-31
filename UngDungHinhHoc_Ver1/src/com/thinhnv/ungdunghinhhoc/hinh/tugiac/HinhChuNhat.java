package com.thinhnv.ungdunghinhhoc.hinh.tugiac;

import com.thinhnv.ungdunghinhhoc.hinh.canh.Canh;
import com.thinhnv.ungdunghinhhoc.hinh.dinh.Dinh;

public class HinhChuNhat extends TuGiac {
	private Canh canh1;
	private Canh canh2;

	public HinhChuNhat(Dinh dinh1, Dinh dinh2, Dinh dinh3, Dinh dinh4) {
		super(dinh1, dinh2, dinh3, dinh4);
		canh1 = new Canh(dinh1, dinh2);
		canh2 = new Canh(dinh2, dinh3);
		// TODO Auto-generated constructor stub
	}

	public HinhChuNhat(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		// TODO Auto-generated constructor stub
		canh1 = new Canh(dinh1, dinh2);
		canh2 = new Canh(dinh2, dinh3);
	}

	@Override
	public void tinhChuVi() {
		// TODO Auto-generated method stub
		this.chuVi = 2 * (canh1.getLength() + canh2.getLength());

	}

	@Override
	public void tinhDienTich() {
		// TODO Auto-generated method stub
		this.dienTich = canh1.getLength() * canh2.getLength();
	}

	public double getChuVi() {
		return this.chuVi;
	}

	public double getDienTich() {
		return this.dienTich;
	}

	public void veHinh() {
		System.out.println("Day la hinh chu nhat co cac thong tin");
		this.inTT();
		System.out.println("Chu vi: " + this.getChuVi());
		System.out.println("Dien tich: " + this.getDienTich());
	}
}
