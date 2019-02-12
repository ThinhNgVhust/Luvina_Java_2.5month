package com.thinhnv.quanlydanhba.main;

import com.thinhnv.quanlydanhba.danhba.QuanLyDanhBa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuanLyDanhBa qlDanhBa = new QuanLyDanhBa();
		qlDanhBa.themDanhBa(1, "Thang", "0123");
		qlDanhBa.themDanhBa(2, "TranThanh", "012345");
		qlDanhBa.themDanhBa(3, "Hoai", "10123");
		qlDanhBa.themDanhBa(4, "To hoang", "012311");
		qlDanhBa.themDanhBa(5, "To Thang", "01123");
		qlDanhBa.timKiemDanhBa("Thang");
	}

}
