package com.thinhnv.ungdunghinh2d.goi2d.canh;

import com.thinhnv.ungdunghinh2d.goi2d.dinh.Dinh;

public class Canh {
	private double doDai;
	private Dinh dinhA;
	private Dinh dinhB;

	public Canh(Dinh dinhA, Dinh dinhB) {
		this.dinhA = dinhA;
		this.dinhB = dinhB;

	}

	public Canh(double x1, double y1, double x2, double y2) {
		this.dinhA = new Dinh(x1, y1);
		this.dinhB = new Dinh(x2, y2);
	}

	public double getDoDai() {
		this.setDoDai();
		return this.doDai;
	}

	private void setDoDai() {
		this.doDai = dinhA.getLength(dinhB);
	}

}
