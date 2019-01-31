package com.thinhnv.ungdunghinh2d.goi2d.hinh;

public abstract class Hinh {
	protected double chuVi;
	protected double dienTich;

	public abstract void inTT();

	protected abstract void setChuVi();

	protected abstract void setDienTich();

	public abstract double getChuVi();

	public abstract double getDienTich();

}
