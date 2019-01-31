package com.thinhnv.ungdunghinh2d.goi2d.hinh.cacloaihinh.tamgiac;

import com.thinhnv.ungdunghinh2d.goi2d.dinh.Dinh;

public class TamGiacCan extends TamGiac {

	public TamGiacCan(Dinh dinhA, Dinh dinhB, Dinh dinhC) {
		super(dinhA, dinhB, dinhC);
		// TODO Auto-generated constructor stub
	}

	public TamGiacCan(double x1, double y1, double x2, double y2, double x3, double y3) {
		super(x1, y1, x2, y2, x3, y3);
		// TODO Auto-generated constructor stub
	}

	public void inTT() {
		System.out.println("Tam giac can ABC co cac thong tin");
		super.inTT();
	}
}
