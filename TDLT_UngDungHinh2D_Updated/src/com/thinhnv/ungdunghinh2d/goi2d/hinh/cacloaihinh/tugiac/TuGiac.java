package com.thinhnv.ungdunghinh2d.goi2d.hinh.cacloaihinh.tugiac;

import com.thinhnv.ungdunghinh2d.goi2d.canh.Canh;
import com.thinhnv.ungdunghinh2d.goi2d.dinh.Dinh;
import com.thinhnv.ungdunghinh2d.goi2d.hinh.Hinh;

public abstract class TuGiac extends Hinh {
	protected Dinh d1;
	protected Dinh d2;
	protected Dinh d3;
	protected Dinh d4;

	public TuGiac(Dinh d1, Dinh d2, Dinh d3, Dinh d4) {
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
		this.d4 = d4;
	}

	public TuGiac(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		this.d1 = new Dinh(x1, y1);
		this.d2 = new Dinh(x2, y2);
		this.d3 = new Dinh(x3, y3);
		this.d4 = new Dinh(x4, y4);
	}

}
