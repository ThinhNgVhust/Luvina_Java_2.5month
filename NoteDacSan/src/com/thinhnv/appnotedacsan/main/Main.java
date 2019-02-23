package com.thinhnv.appnotedacsan.main;

import java.util.ArrayList;

import com.thinhnv.appnotedacsan.dacsan.DacSan;
import com.thinhnv.appnotedacsan.qldacsan.QuanLyDacSan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuanLyDacSan qlDacSan = new QuanLyDacSan();
		DacSan ds1 = new DacSan("1", "Pho Bo", "30k", "Pho bo hue", "Ha noi", "7d");
		DacSan ds2 = new DacSan("2", "Bun Bo Hue", "35k", "Bun bo hue", "Hue", "9d");
		DacSan ds3 = new DacSan("3", "Thit cho", "30k", "Thit cho nuong", "Nhat tan", "7d");
		DacSan ds4 = new DacSan("4", "Thit cho", "30k", "Thit cho nuong", "Nhat tan", "7d");
		DacSan ds5 = new DacSan("5", "Thit cho", "30k", "Thit cho nuong", "Nhat tan", "7d");
		qlDacSan.themMoiDacSan(ds1);
		qlDacSan.themMoiDacSan(ds2);
		qlDacSan.themMoiDacSan(ds3);
		qlDacSan.themMoiDacSan(ds4);
		qlDacSan.themMoiDacSan(ds5);
		qlDacSan.themMoiDacSan(ds5);
		qlDacSan.shareFaceBook();
		qlDacSan.hienThiThongTinDanhSachDacSan();
		ArrayList<DacSan> ds = qlDacSan.timTheoNoiBan("nhat tan");
		for (int i = 0; i < ds.size(); i++) {
			System.out.println(ds.get(i));
		}

	}

}
