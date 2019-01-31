package com.thinhnv.ungdunghinhhoc.hinh.tamgiac;

import com.thinhnv.ungdunghinhhoc.hinh.dinh.Dinh;

public class TamGiacThuong extends TamGiac {
	public TamGiacThuong(Dinh dinh1, Dinh dinh2, Dinh dinh3) {
		super(dinh1, dinh2, dinh3);
		// TODO Auto-generated constructor stub
	}
	
	public TamGiacThuong(double x1, double y1, double x2, double y2, double x3, double y3) {
		super(x1, y1, x2, y2, x3, y3);
		// TODO Auto-generated constructor stub
	}

	public void veHinh() {
		// TODO Auto-generated method stub
		System.out.println("Đây là tam giác bình thường");
		this.inTT();
	}
 

}
