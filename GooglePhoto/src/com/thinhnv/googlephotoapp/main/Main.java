package com.thinhnv.googlephotoapp.main;

import com.thinhnv.googlephotoapp.quanlychude.QuanLyChuDe;
import com.thinhnv.googlephotoapp.quanlychude.chude.ChuDe;
import com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh.AnhCayCo;
import com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh.AnhDongVat;
import com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh.AnhSieuXe;
import com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh.HinhAnh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChuDe cd1 = new ChuDe("CD1", "Siêu xe", "25/10/2017");
		ChuDe cd2 = new ChuDe("CD2", "Cây thuốc", "25/10/2017");
		ChuDe cd3 = new ChuDe("CD3", "Động vật ăn thịt", "25/10/2017");

		HinhAnh h1 = new AnhDongVat("HA31", "Hovan.jpg", "C:/hovan.jpg", "CD3", "1.2MB", "Hổ vằn", "Rừng", "Gào");
		HinhAnh h2 = new AnhDongVat("HA32", "Hotrang.jpg", "C:/hotrang.jpg", "CD3", "1.5MB", "Hổ trắng", "Rừng", "Gào");
		HinhAnh h3 = new AnhDongVat("HA33", "Linho.jpg", "C:/linho.jpg", "idChuDe", "2.1MB", "Linh hồ", "Rừng",
				"Kíu kíu");
		HinhAnh h4 = new AnhDongVat("HA34", "Meonui.jpg", "C:/meonui.jpg", "idChuDe", "2.0MB", "Mèo núi", "Rừng",
				"Meo meo");
		cd1.themAnh(h1);
		cd1.themAnh(h1);
		cd1.themAnh(h2);
		cd1.themAnh(h3);
		cd1.themAnh(h4);
		HinhAnh h5 = new AnhCayCo("HA21", "Bacha.jpg", "C:/bacha.jpg", "CD2", "0.7MB", "Bạc Hà", "Giảm đau đầu");
		HinhAnh h6 = new AnhCayCo("HA22", "TrinhNu.jpg", "C:/trinhnu.jpg", "CD2", "1.8MB", "Trinh Nữ", "Chữa ung thư");
		cd2.themAnh(h5);
		cd2.themAnh(h6);

		HinhAnh h7 = new AnhSieuXe("HA11", "Mercedes.jpg", "C:/ mercedes.jpg", "CD1", "1.1MB", "Mercedes", "Benz", 4.5);
		HinhAnh h8 = new AnhSieuXe("HA12", "Camry.jpg", "C:/ Camry.jpg", "CD1", "1.3MB", "Camry", "Toyota", 4.51);
		HinhAnh h9 = new AnhSieuXe("HA13", "Landrover.jpg", "C:/ Landrover.jpg", "CD1", "2.4MB", "Land rover",
				"Land rover", 7.1);
		cd3.themAnh(h7);
		cd3.themAnh(h8);
		cd3.themAnh(h9);
//		cd1.timAnhTheoId("CD11");
		QuanLyChuDe ql = new QuanLyChuDe();
		ql.themChuDe(cd1);
		ql.themChuDe(cd2);
		ql.themChuDe(cd3);
		ql.themChuDe(cd1);
		cd1.xoaAnh(h1.getIdHinhAnh());
		boolean kq = cd1.khongPhaiTrongChuDe(h6);
	}

}
