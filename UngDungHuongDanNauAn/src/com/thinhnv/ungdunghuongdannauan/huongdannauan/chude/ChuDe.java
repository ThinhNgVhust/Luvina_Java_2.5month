package com.thinhnv.ungdunghuongdannauan.huongdannauan.chude;

import java.util.ArrayList;
import java.util.Comparator;

import com.thinhnv.ungdunghuongdannauan.huongdannauan.chude.monan.MonAn;

public class ChuDe {
	private String tieuDe;
	private String noiDungMoTaCacMonAn;
	private ArrayList<MonAn> dsMonAn;
	private int sizeDSMonAn;
	private Comparator<MonAn> tieuChiTenMonAnTangDan = new Comparator<MonAn>() {

		@Override
		public int compare(MonAn o1, MonAn o2) {
			// TODO Auto-generated method stub
			return o1.getTenMonAn().compareTo(o2.getTenMonAn());
		}
	};

	public String getTieuDe() {
		return tieuDe;
	}

	public int getSizeDSMonAn() {
		return sizeDSMonAn;
	}

	public ArrayList<MonAn> timMonAn(String tenMonAn) {
		ArrayList<MonAn> result = new ArrayList<MonAn>();
		if (this.sizeDSMonAn == 0) {
			return null;
		} else {
			for (int i = 0; i < this.sizeDSMonAn; i++) {
				if (this.dsMonAn.get(i).getTenMonAn().equalsIgnoreCase(tenMonAn)) {
					result.add(this.dsMonAn.get(i));
				}
			}
		}
		return result;
	}

	public void sapXepMonAn() {
		this.dsMonAn.sort(tieuChiTenMonAnTangDan);
	}
}
