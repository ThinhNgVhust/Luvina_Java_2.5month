package com.thinhnv.ungdungquanlytailieu;

import com.thinhnv.ungdungquanlytailieu.thuvien.QuanLyThuVien;
import com.thinhnv.ungdungquanlytailieu.thuvien.tailieu.Bao;
import com.thinhnv.ungdungquanlytailieu.thuvien.tailieu.Sach;
import com.thinhnv.ungdungquanlytailieu.thuvien.tailieu.TaiLieu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuanLyThuVien quanLyThuVien = new QuanLyThuVien(100);
		Sach sach1 = new Sach("123", "Clean Code", 4, "Hacker", 5);
		quanLyThuVien.themTaiLieu(sach1);
		quanLyThuVien.inTTSach();
		quanLyThuVien.inTTTaiLieu();
		Bao bao1 = new Bao("Bao moi", "Bao cong an nhan dan", 30012019, 31);
		quanLyThuVien.themTaiLieu(bao1);
		quanLyThuVien.inTTBao();
	}

}
