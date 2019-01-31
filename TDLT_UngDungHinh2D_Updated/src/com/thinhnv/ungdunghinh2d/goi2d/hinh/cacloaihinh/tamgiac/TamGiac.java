package com.thinhnv.ungdunghinh2d.goi2d.hinh.cacloaihinh.tamgiac;

import com.thinhnv.ungdunghinh2d.goi2d.canh.Canh;
import com.thinhnv.ungdunghinh2d.goi2d.dinh.Dinh;
import com.thinhnv.ungdunghinh2d.goi2d.hinh.Hinh;

public abstract class TamGiac extends Hinh {
	protected Dinh dinhA;
	protected Dinh dinhB;
	protected Dinh dinhC;
	protected Canh a;
	protected Canh b;
	protected Canh c;

	public TamGiac(Dinh dinhA, Dinh dinhB, Dinh dinhC) {
		this.dinhA = dinhA;
		this.dinhB = dinhB;
		this.dinhC = dinhC;
		this.a = new Canh(dinhA, dinhB);
		this.b = new Canh(dinhA, dinhC);
		this.c = new Canh(dinhC, dinhB);
		this.setChuVi();
		this.setDienTich();
	}

	public TamGiac(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.dinhA = new Dinh(x1, y1);
		this.dinhB = new Dinh(x2, y2);
		this.dinhC = new Dinh(x3, y3);
		this.a = new Canh(dinhA, dinhB);
		this.b = new Canh(dinhA, dinhC);
		this.c = new Canh(dinhC, dinhB);
		this.setChuVi();
		this.setDienTich();
	}

	protected void setChuVi() {
		this.chuVi = this.a.getDoDai() + this.b.getDoDai() + this.c.getDoDai();
	}

	protected void setDienTich() {
		this.setChuVi();
		double nuaChuVi = this.chuVi / 2;
		double doDai1 = this.a.getDoDai();
		double doDai2 = this.b.getDoDai();
		double doDai3 = this.c.getDoDai();
		this.dienTich = Math.sqrt(nuaChuVi * (nuaChuVi - doDai1) * (nuaChuVi - doDai2) * (nuaChuVi - doDai3));
	}

	public double getDienTich() {
		return this.dienTich;
	}

	public double getChuVi() {
		return this.chuVi;
	}

	public void inTT() {
		System.out.println("Canh a = " + this.a.getDoDai());
		System.out.println("Canh b = " + this.b.getDoDai());
		System.out.println("Canh c = " + this.c.getDoDai());
		System.out.println("Dinh A = (" + this.dinhA.getX() + "," + this.dinhA.getY() + ")");
		System.out.println("Dinh B = (" + this.dinhB.getX() + "," + this.dinhB.getY() + ")");
		System.out.println("Dinh C = (" + this.dinhC.getX() + "," + this.dinhC.getY() + ")");
		System.out.println("Chu Vi: " + this.getChuVi());
		System.out.println("Dien Tich: " + this.getDienTich());
	}

}
