package com.thinhnv.songuyento;

public class DanhSachSNT {
	private int soNguyen;

	public DanhSachSNT(int soNguyen) {
		this.soNguyen = soNguyen;
	}

	public void lietKe() {
		System.out.println("Danh sach so NT nho hon " + this.soNguyen + " la");
		for (int i = 2; i < this.soNguyen; i++) {
			SoNT soNT = new SoNT(i);
			soNT.ketQua();
		}
	}

}
