package com.thinhnv.googlephotoapp.quanlychude;

import java.util.ArrayList;

import com.thinhnv.googlephotoapp.quanlychude.chude.ChuDe;
import com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh.HinhAnh;

public class QuanLyChuDe {
	private ArrayList<ChuDe> dsChuDe = new ArrayList<ChuDe>();

	public QuanLyChuDe() {
		System.out.println("Khoi tao quan ly chu de");
	}

	public void themChuDe(ChuDe chuDe) {
		if (this.kiemTraRong()) {
			this.dsChuDe.add(chuDe);
			System.out.println("Them chu de " + chuDe.getTenChuDe() + " thanh cong");
			return;
		}
		for (int i = 0; i < this.dsChuDe.size(); i++) {
			if (this.dsChuDe.get(i).getIdChuDe().equals(chuDe.getIdChuDe())) {
				System.out.println("Chu de [" + this.dsChuDe.get(i).getIdChuDe()+" : "+this.dsChuDe.get(i).getTenChuDe()+"] da ton tai");
				return;
			}
		}
		this.dsChuDe.add(chuDe);
		System.out.println("Them chu de " + chuDe.getTenChuDe() + " thanh cong");
		return;
	}

	public void hienThiDanhSachChuDe() {
		if (this.kiemTraRong()) {
			System.out.println("Danh sach rong");
			return;
		}
		System.out.println("Danh sach chu de");
		for (int i = 0; i < this.dsChuDe.size(); i++) {
			System.out.println(this.dsChuDe.get(i).getTenChuDe());
		}
	}

	public void themAnh(String idChuDe, HinhAnh hinhAnh) {
		if (kiemTraRong()) {
			System.out.println("Chua tao chu de nen khong them duoc hinh anh " + hinhAnh.getTenHinhAnh());
			System.out.println("Hay tao chu de truoc");
			return;
		}
		ChuDe chuDe = timChuDe(idChuDe);
		if (chuDe == null) {
			System.out.println("Khong co chu de co ma" + idChuDe);
			return;
		}
		if (chuDe.khongPhaiTrongChuDe(hinhAnh)) {
			chuDe.themAnh(hinhAnh);
		}
	}

	public void xoaChuDe(String idChuDe) {
		for (int i = 0; i < this.dsChuDe.size(); i++) {
			if (this.dsChuDe.get(i).getIdChuDe().equals(idChuDe)) {
				this.dsChuDe.remove(i);
				System.out.println("Xoa thanh cong chu de co id " + idChuDe);
				return;
			}
		}
	}

	public void suaTenChuDe(String id, String tenMoi) {
		ChuDe chuDe = this.timChuDe(id);
		if (chuDe == null) {
			System.out.println("Khong ton tai chu de co id " + id);
			return;
		}
		chuDe.suaTen(tenMoi);
	}

	public void suaNgayTaoChuDe(String id, String ngayTaoMoi) {
		ChuDe chuDe = this.timChuDe(id);
		if (chuDe == null) {
			System.out.println("Khong ton tai chu de co id " + id);
			return;
		}
		chuDe.suaNgayTao(ngayTaoMoi);
	}

	public void xoaAnh(String idChuDe, String idAnh) {
		ChuDe chuDe = this.timChuDe(idChuDe);
		if (chuDe == null) {
			System.out.println("Khong co chu de co ma" + idChuDe);
			return;
		}
		HinhAnh hinhAnh = chuDe.timAnhTheoId(idAnh);
		if (hinhAnh == null) {
			System.out.println("Trong chu de khong ton tai anh " + hinhAnh.getTenHinhAnh() + ", khong xoa duoc");
			return;
		}
		chuDe.xoaAnh(idAnh);
	}

	public ChuDe timChuDe(String idChuDe) {
		if (this.kiemTraRong()) {
			return null;
		}
		for (int i = 0; i < this.dsChuDe.size(); i++) {
			if (this.dsChuDe.get(i).equals(idChuDe)) {
				return this.dsChuDe.get(i);
			}
		}
		return null;
	}

	private boolean kiemTraRong() {
		// TODO Auto-generated method stub
		return this.dsChuDe.size() == 0 ? true : false;
	}
	public void timKiemAnhTuongTu() {
		
	}

}
