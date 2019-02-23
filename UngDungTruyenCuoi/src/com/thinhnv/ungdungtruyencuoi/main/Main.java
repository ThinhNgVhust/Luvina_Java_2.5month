package com.thinhnv.ungdungtruyencuoi.main;

import com.thinhnv.ungdungtruyencuoi.quanlytruyencuoi.QuanLyTruyen;
import com.thinhnv.ungdungtruyencuoi.quanlytruyencuoi.truyencuoi.ChuDeTruyen;
import com.thinhnv.ungdungtruyencuoi.quanlytruyencuoi.truyencuoi.TruyenCuoi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TruyenCuoi tc1 = new TruyenCuoi("1.1", "Rung Xa Nu", "2010", " Noi dung Rung Xa Nu");
		TruyenCuoi tc2 = new TruyenCuoi("1.2", "Nho Rung", "2011", " Noi dung Nho Rung");
		TruyenCuoi tc3 = new TruyenCuoi("1.3", "Banh Troi Nuoc", "2012", " Noi dung Bah Troi Nuoc");
		TruyenCuoi tc4 = new TruyenCuoi("1.5", "Qua Deo Ngang", "20110", "Buoc toi deo ngang bong xe ta");
		QuanLyTruyen qlTruyen = new QuanLyTruyen();
		qlTruyen.hienThiChuDeTruyen();
		ChuDeTruyen chuDeTruyen = new ChuDeTruyen("1", "Van Hoc");
		chuDeTruyen.themTruyen(tc1);
		chuDeTruyen.themTruyen(tc2);
		chuDeTruyen.themTruyen(tc3);
		chuDeTruyen.themTruyen(tc4);
		qlTruyen.taoChuDe(chuDeTruyen);
//		qlTruyen.docTruyen("1", "1.1");
		qlTruyen.themTruyenVaoChuDe("1", tc1);
		qlTruyen.hienThiChuDeTruyen();
		ChuDeTruyen chuDeTruyen1 = new ChuDeTruyen("2", "Tao lao");
		qlTruyen.taoChuDe(chuDeTruyen1);
		qlTruyen.hienThiChuDeTruyen();
		chuDeTruyen1.themTruyen(tc1);
		chuDeTruyen1.themTruyen(tc1);
		chuDeTruyen1.themTruyen(tc2);
		chuDeTruyen1.themTruyen(tc3);
		chuDeTruyen1.themTruyen(tc4);
		chuDeTruyen1.hienThiDanhSachTruyen();
		chuDeTruyen.hienThiDanhSachTruyen();
		qlTruyen.hienThiChuDeTruyen();
	}

}
