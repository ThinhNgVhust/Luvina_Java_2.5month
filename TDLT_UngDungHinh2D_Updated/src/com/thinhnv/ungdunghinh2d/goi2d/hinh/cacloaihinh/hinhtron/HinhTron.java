package com.thinhnv.ungdunghinh2d.goi2d.hinh.cacloaihinh.hinhtron;

import com.thinhnv.ungdunghinh2d.goi2d.dinh.Dinh;
import com.thinhnv.ungdunghinh2d.goi2d.hinh.Hinh;

public class HinhTron extends Hinh {
	private Dinh toaDoTam;
	private double banKinh;

	public HinhTron(Dinh toaDoTam, double banKinh) {
		this.toaDoTam = toaDoTam;
		this.banKinh = banKinh;
	}

	public HinhTron(double x, double y, double banKinh) {
		this.toaDoTam = new Dinh(x, y);
		this.banKinh = banKinh;
	}

	@Override
	public double getChuVi() {
		// TODO Auto-generated method stub
		this.setChuVi();
		return this.chuVi;
	}

	public double getDienTich() {
		this.setDienTich();
		return this.dienTich;

	}

	@Override
	protected void setChuVi() {
		// TODO Auto-generated method stub
		this.chuVi = 2 * Math.PI * this.banKinh;

	}

	@Override
	protected void setDienTich() {
		// TODO Auto-generated method stub
		this.dienTich = Math.PI * this.banKinh * this.banKinh;

	}

	@Override
	public void inTT() {
		// TODO Auto-generated method stub
		System.out.println("Thong tin hinh tron:");
		System.out.println(
				"Toa do tam: (" + this.toaDoTam.getX() + "," + this.toaDoTam.getY() + ") - Ban kinh: " + this.banKinh);
		System.out.println("ChuVi: " + this.getChuVi() + ". Dien tich: " + this.getDienTich());
	}

}
