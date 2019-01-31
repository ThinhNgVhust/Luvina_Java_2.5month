package com.thinhnv.ungdunghinhhoc.hinh.tamgiac;

import com.thinhnv.ungdunghinhhoc.hinh.IHinh;
import com.thinhnv.ungdunghinhhoc.hinh.canh.Canh;
import com.thinhnv.ungdunghinhhoc.hinh.dinh.Dinh;

public abstract class TamGiac implements IHinh {
	protected Dinh dinh1 = null;
	protected Dinh dinh2 = null;
	protected Dinh dinh3 = null;
	protected Canh canh1 = null;
	protected Canh canh2 = null;
	protected Canh canh3 = null;

	protected double chuVi;
	protected double dienTich;

	public TamGiac(Dinh dinh1, Dinh dinh2, Dinh dinh3) {
		this.dinh1 = dinh1;
		this.dinh2 = dinh2;
		this.dinh3 = dinh3;
		this.canh1 = new Canh(dinh1, dinh2);
		this.canh2 = new Canh(dinh2, dinh3);
		this.canh3 = new Canh(dinh1, dinh3);
		this.chuVi = this.canh1.getLength() + this.canh2.getLength() + this.canh3.getLength();
		double nuaChuVi = this.chuVi / 2;
		this.dienTich = Math.sqrt(nuaChuVi * (nuaChuVi - this.canh1.getLength()) * (nuaChuVi - this.canh2.getLength())
				* (nuaChuVi - this.canh3.getLength()));
	}

	public TamGiac(double x1, double y1, double x2, double y2, double x3, double y3) {
		dinh1 = new Dinh(x1, y1);
		dinh2 = new Dinh(x2, y2);
		dinh3 = new Dinh(x3, y3);
		this.canh1 = new Canh(dinh1, dinh2);
		this.canh2 = new Canh(dinh2, dinh3);
		this.canh3 = new Canh(dinh1, dinh3);
		this.chuVi = this.canh1.getLength() + this.canh2.getLength() + this.canh3.getLength();
		double nuaChuVi = this.chuVi / 2;
		this.dienTich = Math.sqrt(nuaChuVi * (nuaChuVi - this.canh1.getLength()) * (nuaChuVi - this.canh2.getLength())
				* (nuaChuVi - this.canh3.getLength()));
	}

	// day la 1 lop abstract nen khong can phai dinh nghia lai 2 phuong thuc ke thua
	// interface
	public void inTT() {
		System.out.println("Dinh1 ( " + this.dinh1.getToaDoX() + ", " + this.dinh1.getToaDoY() + ").");
		System.out.println("Dinh2 ( " + this.dinh2.getToaDoX() + ", " + this.dinh2.getToaDoY() + ").");
		System.out.println("Dinh3 ( " + this.dinh3.getToaDoX() + ", " + this.dinh3.getToaDoY() + ").");
		System.out.println("Chu Vi:" + this.chuVi);
		System.out.println("Dien Tich: " + this.dienTich);
	}
}
