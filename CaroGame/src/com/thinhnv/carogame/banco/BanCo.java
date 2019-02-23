package com.thinhnv.carogame.banco;

import java.util.ArrayList;
import java.util.Arrays;

import com.thinhnv.carogame.nguoichoi.NguoiChoi;
import com.thinhnv.carogame.quanco.QuanCo;

public class BanCo {
	public static final int SO_COT = 7;
	public static final int SO_HANG = 7;
	public static final int SIZE = 50;
	private int[] tySo = new int[2];
	private NguoiChoi nguoiChoi1;
	private NguoiChoi nguoiChoi2;
	private ArrayList<QuanCo> dsQuanCo = new ArrayList<QuanCo>();

	public BanCo(NguoiChoi nguoiChoi1, NguoiChoi nguoiChoi2) {
		Arrays.fill(tySo, 0);
		this.nguoiChoi1 = nguoiChoi1;
		this.nguoiChoi2 = nguoiChoi2;
	}

	public void veBanCo() {
		System.out.println("Ban co duoc ve voi mau....");
	}

	public void xoaBanCo() {
		// xoa tat ca cac quan co cua 2 nguoi choi tren ban co
	}

	public void choiLai() {
		// reset ty so tran dau va xoa tat ca cac quan co
		// cua 2 nguoi choi tren ban co
	}

	public void kiemTraThangCuoc() {
		// kiem tra nguoi choi nao thang cuoc
	}

	public void danhCo(NguoiChoi nguoiChoi, int x, int y) {
		if (this.dsQuanCo.size() != 0) {
			// kiem tra luot choi
			int lastIndex = this.dsQuanCo.size();
			if (this.dsQuanCo.get(lastIndex - 1).getLoaiQuan().equals(nguoiChoi.getLoaiQuan())) {
				System.out.println("Không phải lượt chơi của " + nguoiChoi.getTen());
				return;
			}
			// kiem tra su ton tai tren ban co
			for (int i = 0; i < dsQuanCo.size(); i++) {
				QuanCo quanCo = this.dsQuanCo.get(i);
				int viTriCot = x / BanCo.SIZE + BanCo.SIZE / 2;
				int viTriHang = y / BanCo.SIZE + +BanCo.SIZE / 2;
				QuanCo quanCo1 = new QuanCo(viTriCot, viTriHang, nguoiChoi.getLoaiQuan());
				boolean dk1 = quanCo.getX() == quanCo1.getX();
				boolean dk2 = quanCo.getY() == quanCo1.getY();
				if (dk1 && dk2) {
					System.out.println("Vị trí này đã có người đánh");
					return;
				}
			}
		}
		// neu dung luot choi
		nguoiChoi.danhCo(x, y);
		// update trong ds quan co
		dsQuanCo.add(nguoiChoi.getLastQuanCo());
	}
}
