package com.thinhnv.googlephotoapp.main;

import java.util.ArrayList;
import java.util.List;

import com.thinhnv.googlephotoapp.itimkiem.ITimKiemXeTuongTu;
import com.thinhnv.googlephotoapp.quanlychude.QuanLyChuDe;
import com.thinhnv.googlephotoapp.quanlychude.chude.ChuDe;
import com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh.AnhCayCo;
import com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh.AnhDongVat;
import com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh.HinhAnh;

public class Main {
	public static void main(String[] args) {
		HinhAnh h1 = new AnhDongVat("CD3", "HA31", "Hovan.jpg", "C:/hovan.jpg", "1.2MB", "Hổ vằn", "Rừng", "Gào");
		HinhAnh h2 = new AnhDongVat("CD3", "HA32", "Hovan.jpg", "C:/hovan.jpg", "1.2MB", "Hổ mang mang", "Rừng", "Gào");
		HinhAnh h3 = new AnhDongVat("CD3", "HA33", "Hovan.jpg", "C:/hovan.jpg", "1.2MB", "Hổ mang mang chúa", "Rừng",
				"Gào");
		HinhAnh h4 = new AnhDongVat("CD3", "HA34", "Hovan.jpg", "C:/hovan.jpg", "1.2MB", "Hổ màng", "Rừng", "Gào");
		HinhAnh h5 = new AnhDongVat("CD3", "HA35", "Hovan.jpg", "C:/hovan.jpg", "1.2MB", "Hổ mang", "Rừng", "Gào");

		HinhAnh h6 = new AnhDongVat("CD3", "HA36", "Hovan.jpg", "C:/hovan.jpg", "1.2MB", "Hình mamangmangmang", "Rừng",
				"Gào");
		HinhAnh h7 = new AnhDongVat("CD3", "HA37", "Hovan.jpg", "C:/hovan.jpg", "1.2MB", "Hổ mang mang1", "Rừng",
				"Gào");
		HinhAnh h8 = new AnhDongVat("CD3", "HA38", "Hovan.jpg", "C:/hovan.jpg", "1.2MB", "Hổ mang mang2", "Rừng",
				"Gào");
		HinhAnh h9 = new AnhDongVat("CD3", "HA39", "Hovan.jpg", "C:/hovan.jpg", "1.2MB", "Hổ mang man3", "Rừng", "Gào");
		HinhAnh h10 = new AnhDongVat("CD3", "HA40", "Hovan.jpg", "C:/hovan.jpg", "1.2MB", "Hổ mang mang4", "Rừng",
				"Gào");
		ChuDe cd1 = new ChuDe("CD1", "Động vật", "20");
		cd1.themAnh(h1);
		cd1.themAnh(h2);
		cd1.themAnh(h3);
		cd1.themAnh(h4);
		cd1.themAnh(h5);
		cd1.themAnh(h6);
		cd1.themAnh(h7);
		cd1.themAnh(h8);
		cd1.themAnh(h9);
		cd1.themAnh(h10);
		HinhAnh anhDongVat = new AnhDongVat("mang");
		List<HinhAnh> cd2 = cd1.timKiemTuongTu(anhDongVat);
		System.out.println(cd2.size());
		for (HinhAnh hinhAnh : cd2) {
			hinhAnh.inTT();
		}
	}
}
