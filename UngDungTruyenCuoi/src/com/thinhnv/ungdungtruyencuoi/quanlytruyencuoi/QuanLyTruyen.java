package com.thinhnv.ungdungtruyencuoi.quanlytruyencuoi;

import com.thinhnv.ungdungtruyencuoi.quanlytruyencuoi.truyencuoi.ChuDeTruyen;
import com.thinhnv.ungdungtruyencuoi.quanlytruyencuoi.truyencuoi.TruyenCuoi;

public class QuanLyTruyen {
	private int nElements;
	private ChuDeTruyen[] dsChuDeTruyen;

	public QuanLyTruyen() {
		this.dsChuDeTruyen = new ChuDeTruyen[3];
		this.nElements = 0;
	}

	public void taoChuDe(ChuDeTruyen chuDeTruyen) {
		if (this.nElements > 2) {
			System.out.println("Danh sach chu de truyen da day! Khong tao duoc them");
			return;
		}
		this.dsChuDeTruyen[this.nElements++] = chuDeTruyen;
		System.out.println("Them chu de -" + chuDeTruyen.getTenChuDe() + "- thanh cong!");
	}

	public ChuDeTruyen timChuDe(String maChuDe) {
		ChuDeTruyen kq = null;
		for (int i = 0; i < dsChuDeTruyen.length; i++) {
			if (dsChuDeTruyen[i] != null && dsChuDeTruyen[i].getMaChuDe().equals(maChuDe)) {
				kq = dsChuDeTruyen[i];
				System.out.println("Tim thay chu de " + maChuDe);
				return kq;
			}
		}
		System.out.println("Khong tim thay chu de " + maChuDe);
		return kq;
	}

	public void xoaChuDe(String maChuDe) {
		ChuDeTruyen kq = this.timChuDe(maChuDe);
		if (kq == null) {
			return;
		}
		for (int i = 0; i < dsChuDeTruyen.length; i++) {
			if (dsChuDeTruyen[i].getMaChuDe().equals(maChuDe)) {
				for (int j = i; j < dsChuDeTruyen.length - 1; j++) {
					dsChuDeTruyen[j] = dsChuDeTruyen[j + 1];
				}
				this.nElements--;
				i--;
			}
		}
		System.out.println("Xoa chu de thanh cong");
	}

	public void hienThiChuDe() {
		System.out.println("Danh sach chu de truyen:");
		for (int i = 0; i < nElements; i++) {
			System.out.println(this.dsChuDeTruyen[i].getMaChuDe() + " " + this.dsChuDeTruyen[i].getTenChuDe());
		}
	}

	public void inDanhSach() {
		for (int i = 0; i < nElements; i++) {
			System.out.println(dsChuDeTruyen[i]);
		}
	}
	
	public TruyenCuoi timTheoTen(String ten) {
		TruyenCuoi kq = null;
		for (int i = 0; i < this.nElements; i++) {
			kq = dsChuDeTruyen[i].findByName(ten);
		}
		return kq;
	}
	public TruyenCuoi timTheoMa(String ma) {
		TruyenCuoi kq = null;
		for (int i = 0; i < this.nElements; i++) {
			kq = dsChuDeTruyen[i].findById(ma);
		}
		return kq;
	}
	public void docTruyen(String maTruyen) {
		for (int i = 0; i < nElements; i++) {
			this.dsChuDeTruyen[i].docTruyen(maTruyen);
		}
	}
}
