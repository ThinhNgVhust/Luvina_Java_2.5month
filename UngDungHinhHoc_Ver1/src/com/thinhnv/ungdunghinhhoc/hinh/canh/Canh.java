package com.thinhnv.ungdunghinhhoc.hinh.canh;

import com.thinhnv.ungdunghinhhoc.hinh.dinh.Dinh;

public class Canh {
	private Dinh dinh1;
	private Dinh dinh2;

	public Canh(Dinh dinh1, Dinh dinh2) {
		this.dinh1 = dinh1;
		this.dinh2 = dinh2;
	}

	public Canh(double x1, double y1, double x2, double y2) {
		this.dinh1 = new Dinh(x1, y1);
		this.dinh2 = new Dinh(x2, y2);
	}

	public double getLength() {
		double tp1 = Math.pow(dinh1.getToaDoX() - dinh2.getToaDoX(), 2);
		double tp2 = Math.pow(dinh1.getToaDoY() - dinh2.getToaDoY(), 2);
		return Math.sqrt(tp1 + tp2);
	}
}
