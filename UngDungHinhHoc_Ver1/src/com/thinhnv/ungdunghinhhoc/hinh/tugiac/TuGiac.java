package com.thinhnv.ungdunghinhhoc.hinh.tugiac;

import com.thinhnv.ungdunghinhhoc.hinh.IHinh;
import com.thinhnv.ungdunghinhhoc.hinh.dinh.Dinh;

public abstract class TuGiac implements IHinh {
	protected Dinh dinh1;
	protected Dinh dinh2;
	protected Dinh dinh3;
	protected Dinh dinh4;
	protected double chuVi;
	protected double dienTich;

	public TuGiac(Dinh dinh1, Dinh dinh2, Dinh dinh3, Dinh dinh4) {
		this.dinh1 = dinh1;
		this.dinh2 = dinh2;
		this.dinh3 = dinh3;
		this.dinh4 = dinh4;
	}

	public TuGiac(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		this.dinh1 = new Dinh(x1, y1);
		this.dinh2 = new Dinh(x2, y2);
		this.dinh3 = new Dinh(x3, y3);
		this.dinh4 = new Dinh(x4, y4);
	}

	protected abstract void tinhChuVi();

	protected abstract void tinhDienTich();

	protected abstract double getChuVi();

	protected abstract double getDienTich();

	public void inTT() {
		System.out.println("DinhA(" + dinh1.getToaDoX() + ", " + dinh1.getToaDoY() + ")");
		System.out.println("DinhA(" + dinh2.getToaDoX() + ", " + dinh2.getToaDoY() + ")");
		System.out.println("DinhA(" + dinh3.getToaDoX() + ", " + dinh3.getToaDoY() + ")");
		System.out.println("DinhA(" + dinh4.getToaDoX() + ", " + dinh4.getToaDoY() + ")");
	}

}
