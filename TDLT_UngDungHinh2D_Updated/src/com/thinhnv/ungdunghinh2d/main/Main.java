package com.thinhnv.ungdunghinh2d.main;

import com.thinhnv.ungdunghinh2d.goi2d.dinh.Dinh;
import com.thinhnv.ungdunghinh2d.goi2d.hinh.Hinh;
import com.thinhnv.ungdunghinh2d.goi2d.hinh.QuanLyHinh;
import com.thinhnv.ungdunghinh2d.goi2d.hinh.cacloaihinh.hinhtron.HinhTron;
import com.thinhnv.ungdunghinh2d.goi2d.hinh.cacloaihinh.tugiac.HinhChuNhat;
import com.thinhnv.ungdunghinh2d.goi2d.hinh.cacloaihinh.tugiac.HinhVuong;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuanLyHinh qlHinh = new QuanLyHinh(100);
		qlHinh.themHinh(1, 1, 2);
		Dinh dinhA = new Dinh(0, 0);
		Dinh dinhB = new Dinh(5, 0);
		Dinh dinhC = new Dinh(5, 5);
		Dinh dinhD = new Dinh(0, 5);
		HinhChuNhat hcn = new HinhChuNhat(dinhA, dinhB, dinhC, dinhD);
		HinhVuong hv = new HinhVuong(dinhA, dinhB, dinhC, dinhD);
		qlHinh.themHinh(hv);
		qlHinh.themHinh(hcn);
		double banhKinh = 10;
		HinhTron ht1 = new HinhTron(dinhA, banhKinh);
		qlHinh.themHinh(ht1);
		qlHinh.themHinh(2, 1, 1);
		qlHinh.themHinh(3, 1, 2);
		qlHinh.themHinh(4, 1, 3);
		qlHinh.themHinh(5, 1, 4);
		qlHinh.themHinh(6, 1, 5);
		qlHinh.themHinh(6, 1, 0.5);
		qlHinh.themHinh(6, 1, 100);
		qlHinh.themHinh(6, 1, 101, 99);
		qlHinh.duyetTuGiac();
	}
}
