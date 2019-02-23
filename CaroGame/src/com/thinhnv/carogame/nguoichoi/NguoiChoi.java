package com.thinhnv.carogame.nguoichoi;

import java.util.ArrayList;

import com.thinhnv.carogame.banco.BanCo;
import com.thinhnv.carogame.quanco.QuanCo;

public class NguoiChoi {
	private ArrayList<QuanCo> dsQuanCo;
	private String tenNguoiChoi;
	private boolean loaiQuanCo;
	private String quan;

	public NguoiChoi(String tenNguoiChoi, boolean loaiQuanCo) {
		this.dsQuanCo = new ArrayList<QuanCo>();
		this.tenNguoiChoi = tenNguoiChoi;
		this.loaiQuanCo = loaiQuanCo;
		if (loaiQuanCo == true) {
			this.quan = "X";
		} else {
			this.quan = "O";
		}
	}

	public void danhCo(int x, int y) {
		if (!isInBoard(x, y)) {
			return;
		} else {
			int viTriCot = x / BanCo.SIZE + BanCo.SIZE / 2;
			int viTriHang = y / BanCo.SIZE + +BanCo.SIZE / 2;
			QuanCo quanCo = new QuanCo(viTriCot, viTriHang, this.quan);
			if (chuaDanh(quanCo)) {
				this.dsQuanCo.add(quanCo);
			} else {
				System.out.println("Vị trí này đã có quân cờ");
				return;
			}

		}

	}

	private boolean chuaDanh(QuanCo quanCo) {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.dsQuanCo.size(); i++) {
			boolean dieuKien1 = quanCo.getX() == this.dsQuanCo.get(i).getX();
			boolean dieuKien2 = quanCo.getY() == this.dsQuanCo.get(i).getY();
			if (dieuKien1 && dieuKien2) {// neu vi tri quan co da ton tai, tuc la da danh
				return false;
			}
		}
		return true;
	}

	private boolean isInBoard(int x, int y) {
		// TODO Auto-generated method stub
		boolean dieuKien1 = (x >= 0 && x <= BanCo.SIZE * (BanCo.SO_COT - 1));
		boolean dieuKien2 = (y >= 0 && y <= BanCo.SIZE * (BanCo.SO_HANG - 1));
		if (dieuKien1 && dieuKien2) {
			return true;
		}
		return false;
	}

	public void xoaCo() {
		// xoa het cac quan co co trong danh sach nguoi choi
		this.dsQuanCo.clear();
	}

	public ArrayList<QuanCo> getDanhSachQuanCo() {
		return this.dsQuanCo;
	}

	public String getTen() {
		return this.tenNguoiChoi;
	}

	public QuanCo getLastQuanCo() {
		int size = this.dsQuanCo.size();
		return this.dsQuanCo.get(size - 1);
	}

	public String getLoaiQuan() {
		return this.quan;
	}
}
