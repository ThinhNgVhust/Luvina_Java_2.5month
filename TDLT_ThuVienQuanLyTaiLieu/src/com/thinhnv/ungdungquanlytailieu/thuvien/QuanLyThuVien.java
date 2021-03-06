package com.thinhnv.ungdungquanlytailieu.thuvien;

import com.thinhnv.ungdungquanlytailieu.thuvien.tailieu.Bao;
import com.thinhnv.ungdungquanlytailieu.thuvien.tailieu.Sach;
import com.thinhnv.ungdungquanlytailieu.thuvien.tailieu.TaiLieu;
import com.thinhnv.ungdungquanlytailieu.thuvien.tailieu.TapChi;

public class QuanLyThuVien {
	private int nElements;
	private int maxSize;
	private TaiLieu[] dsTaiLieu;

	public QuanLyThuVien(int maxSize) {
		this.maxSize = maxSize;
		this.dsTaiLieu = new TaiLieu[maxSize];
		this.nElements = 0;

	}

	public void themTaiLieu(Sach sach) {
		try {
			this.dsTaiLieu[nElements++] = sach;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("Thu vien da day, khong the nhap duoc them");
		}
	}

	public void themTaiLieu(TapChi tapChi) {
		try {
			this.dsTaiLieu[nElements++] = tapChi;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("Thu vien da day, khong the nhap duoc them");
		}
	}

	public void themTaiLieu(Bao bao) {
		try {
			this.dsTaiLieu[nElements++] = bao;
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
			System.out.println("Thu vien da day, khong the nhap duoc them");
		}
	}

	public void inTTSach() {
		System.out.println("Thong tin cac sach trong thu vien");
		for (int i = 0; i < this.nElements; i++) {
			if (dsTaiLieu[i] instanceof Sach) {
				(dsTaiLieu[i]).inTT();
			}
		}
	}

	public void inTTBao() {
		System.out.println("Thong tin cac bao trong thu vien");
		for (int i = 0; i < this.nElements; i++) {
			if (dsTaiLieu[i] instanceof Bao) {
				(dsTaiLieu[i]).inTT();
				((Bao)dsTaiLieu[i]).bao(); 
			}
		}

	}

	public void inTTTapChi() {
		System.out.println("Thong tin cac tap chi trong thu vien");
		for (int i = 0; i < this.nElements; i++) {
			if (dsTaiLieu[i] instanceof TapChi) {
				(dsTaiLieu[i]).inTT();
			}
		}
	}

	public void inTTTaiLieu() {
		System.out.println("Thong tin cac tai lieu trong thu vien");
		for (int i = 0; i < this.nElements; i++) {
			if (dsTaiLieu[i] instanceof TaiLieu) {
				((TaiLieu) dsTaiLieu[i]).inTT();
			}
		}
	}
}
