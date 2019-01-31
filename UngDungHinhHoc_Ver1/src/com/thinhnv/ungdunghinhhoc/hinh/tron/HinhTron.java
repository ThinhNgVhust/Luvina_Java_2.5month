package com.thinhnv.ungdunghinhhoc.hinh.tron;

import com.thinhnv.ungdunghinhhoc.hinh.IHinh;
import com.thinhnv.ungdunghinhhoc.hinh.dinh.Dinh;

public class HinhTron implements IHinh {
	private Dinh toaDoTam;
	private double banKinh;
	private double chuVi;
	private double dienTich;

	public HinhTron(Dinh dinh1, double banKinh) {
		// TODO Auto-generated constructor stub
		this.banKinh = banKinh;
		this.toaDoTam = dinh1;
		this.chuVi = 2 * Math.PI * this.banKinh;
		this.dienTich = Math.PI * Math.pow(this.banKinh, 2);
	}

	public HinhTron(double x, double y, double banKinh) {
		// TODO Auto-generated constructor stub
		this.toaDoTam = new Dinh(x, y);
		this.banKinh = banKinh;
	}

	@Override
	public void inTT() {
		// TODO Auto-generated method stub
		System.out.println("Chu vi: " + this.chuVi);
		System.out.println("Dien tich: " + this.dienTich);
	}

	@Override
	public void veHinh() {
		// TODO Auto-generated method stub
		System.out.println("Hinh tron da cho co thong so: ");
		System.out.println("Toa do tam: (" + this.toaDoTam.getToaDoX() + ", " + this.toaDoTam.getToaDoY() + ")");
	}
}
