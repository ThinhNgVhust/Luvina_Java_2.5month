package com.thinhnv.ungdunghuongdannauan.huongdannauan.chude.monan;

import java.util.ArrayList;

import com.thinhnv.ungdunghuongdannauan.huongdannauan.chude.monan.chuanbi.BuocLam;
import com.thinhnv.ungdunghuongdannauan.huongdannauan.chude.monan.chuanbi.NguyenLieu;

public class MonAn {
	private String tenMonAn;
	private String moTaMonAn;
	private ArrayList<NguyenLieu> dsNguyenLieu;
	private ArrayList<BuocLam> dsBuoc;
	private String ghiChu;
	private String danhGia;

	public String getTenMonAn() {
		return tenMonAn;
	}

	public String getDanhGia() {
		return danhGia;
	}

	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}

	public void hienThiDanhSachNguyenLieu() {
		System.out.println("Danh sach nguyen lieu can cho mon an " + this.tenMonAn);
		for (int i = 0; i < dsNguyenLieu.size(); i++) {
			System.out.println("\t" + dsNguyenLieu.get(i));
		}
	}

	public void muaNguyenLieu(NguyenLieu nguyenLieu) {
		for (int i = 0; i < dsNguyenLieu.size(); i++) {
			if (dsNguyenLieu.get(i).equals(nguyenLieu)) {
				dsNguyenLieu.get(i).xacNhanDaMua();
			}
		}
		this.hienThiDanhSachNguyenLieu();
	}

	public void nauAn() {
		// hien thi cac buoc
		// danh dau xac nhan xong khi hoan thanh moi buoc
		// khi hoan thanh thi xac nhan
	}
}
