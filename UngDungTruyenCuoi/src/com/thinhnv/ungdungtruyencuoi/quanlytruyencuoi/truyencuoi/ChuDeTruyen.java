package com.thinhnv.ungdungtruyencuoi.quanlytruyencuoi.truyencuoi;

import java.util.Arrays;

public class ChuDeTruyen {
	private String maChuDe;
	private String tenChuDe;
	private TruyenCuoi[] dsTruyen;
	private int nElements;

	public ChuDeTruyen(String maChude, String tenChuDe) {
		this.maChuDe = maChude;
		this.tenChuDe = tenChuDe;
		dsTruyen = new TruyenCuoi[3];
		this.nElements = 0;
	}

	public TruyenCuoi findByName(String name) {
		TruyenCuoi kq = null;
		for (int i = 0; i < dsTruyen.length; i++) {
			if (dsTruyen[i] != null && dsTruyen[i].getTenTruyen().equals(name)) {
				System.out.println("Tim thay truyen co ten: " + name);
				return kq;
			}
		}
		System.out.println("Khong tim thay truyen co ten: " + name);
		return kq;
	}

	public TruyenCuoi findById(String id) {
		TruyenCuoi kq = null;
		for (int i = 0; i < dsTruyen.length; i++) {
			if (dsTruyen[i] != null && dsTruyen[i].getMaId().equals(id)) {
				System.out.println("Tim thay truyen co ma id: " + id);
				kq = this.dsTruyen[i];
				return kq;
			}
		}
		System.out.println("Khong tim thay truyen co ma id: " + id);
		return kq;
	}

	public void themTruyen(TruyenCuoi truyenCuoi) {
		if (this.nElements > 2) {
			System.out.println("Danh sach truyen theo chu de nay da day! chi chua duoc toi da 3 truyen");
			return;
		}
		this.dsTruyen[nElements++] = truyenCuoi;
	}

	public void xoaTruyen(String maId) {
		TruyenCuoi truyenCuoi = this.findById(maId);
		if (truyenCuoi == null)
			return;
		for (int i = 0; i < dsTruyen.length; i++) {
			if (truyenCuoi.getMaId().equals(dsTruyen[i].getMaId())) {
				for (int j = i; j < dsTruyen.length - 1; j++) {
					dsTruyen[j] = dsTruyen[j + 1];
				}
				--nElements;
				--i;
			}
		}
		System.out.println("Xoa truyen thanh cong");
	}

	public void docTruyen(String maId) {
		TruyenCuoi truyenCuoi = this.findById(maId);
		if (truyenCuoi == null) {
		} else {
			System.out.println("Ten truyen: " + truyenCuoi.getTenTruyen());
			System.out.println("Noi dung truyen la: ");
			System.out.println(truyenCuoi.getNoiDung());
		}
	}

	public String getMaChuDe() {
		return maChuDe;
	}

	public String getTenChuDe() {
		return this.tenChuDe;
	}

	@Override
	public String toString() {
		return "ChuDeTruyen [maChuDe=" + maChuDe + ", tenChuDe=" + tenChuDe + ", dsTruyen=" + Arrays.toString(dsTruyen)
				+ "]";
	}

}
