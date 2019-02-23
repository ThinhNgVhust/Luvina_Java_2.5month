package com.thinhnv.ungdungcocaro.cocaro.banco;

import java.util.ArrayList;
import java.util.Arrays;

import com.thinhnv.ungdungcocaro.cocaro.HangSo.HangSo;
import com.thinhnv.ungdungcocaro.cocaro.nguoichoi.NguoiChoi;
import com.thinhnv.ungdungcocaro.cocaro.quanco.QuanCo;

public class BanCo {
	private int soHang;
	private int soCot;
	private int size;
	private String mauSac;
	private int[] tySo;
	private NguoiChoi nguoiChoi1;
	private NguoiChoi nguoiChoi2;
	private boolean luotChoi1;
	private ArrayList<QuanCo> dsQuanCo = new ArrayList<QuanCo>();

	public BanCo(String name1, String name2, String mauSac) {
		this.soHang = HangSo.SO_COT;
		this.soCot = HangSo.SO_HANG;
		this.size = HangSo.SIZE;
		this.mauSac = mauSac;
		this.nguoiChoi1 = new NguoiChoi(name1, "X");
		this.nguoiChoi2 = new NguoiChoi(name2, "O");
		this.tySo = new int[] { 0, 0 };
		this.luotChoi1 = true;
		this.veBanCo();

	}

	private void veBanCo() {
		System.out.println("  1 2 3 4 5 6");
		for (int i = 0; i < HangSo.SO_COT - 1; i++) {
			String str = "|";
			for (int j = 0; j < HangSo.SO_HANG - 1; j++) {
				int xPos = j * 50 + 25;
				int yPos = i * 50 + 25;
				String s = getLoaiQuan(xPos, yPos);
				str += s + "|";
			}
			System.out.println((i + 1) + "" + str);
			str = "";
		}
		System.out.println("\n \n");
	}

	private String getLoaiQuan(int xPos, int yPos) {
		// TODO Auto-generated method stub
		int size = this.dsQuanCo.size();
		if (size == 0) {
			return " ";
		}
		for (int i = 0; i < size; i++) {
			QuanCo quanCo = this.dsQuanCo.get(i);
			if (quanCo.getxPosition() == xPos && quanCo.getyPosition() == yPos) {
				return quanCo.getType();
			}
		}
		return " ";
	}

	public void xoaBanCo() {
		System.out.println("Xóa bàn cờ");
		this.nguoiChoi1.xoaCo();
		this.nguoiChoi2.xoaCo();
		this.dsQuanCo.clear();
	}

	public void choiLai() {
		System.out.println("Reset lại tỷ số, chơi lại từ đầu");
		this.xoaBanCo();
		Arrays.fill(this.tySo, 0);
		this.veBanCo();
	}

	private void kiemTraThangCuoc() {
		if (!this.luotChoi1) {
			if (this.nguoiChoi1.kiemTraThangCuoc()) {
				this.tySo[0]++;
				System.out.println("Người chơ " + this.nguoiChoi1.getTen() + " thắng cuộc\n\t Tỷ số là: "
						+ this.nguoiChoi1.getTen() + " " + this.tySo[0] + " - " + this.tySo[1] + " "
						+ this.nguoiChoi2.getTen());
				this.xoaBanCo();
			}
		} else {
			if (this.nguoiChoi2.kiemTraThangCuoc()) {
				this.tySo[1]++;
				System.out
						.println("" + this.nguoiChoi2.getTen() + " thắng cuộc\n\t Tỷ số là: " + this.nguoiChoi2.getTen()
								+ " " + this.tySo[1] + " - " + this.tySo[0] + " " + this.nguoiChoi1.getTen());
				this.xoaBanCo();
			}
		}
		this.veBanCo();
	}

	public void danhCo(int xPos, int yPos) {
		xPos = (xPos / 50) * 50 + 25;
		yPos = (yPos / 50) * 50 + 25;
		if (this.luotChoi1) {
			if (kiemTraCo(xPos, yPos) && this.nguoiChoi1.danhCo(xPos, yPos)) {
				this.luotChoi1 = false;
				this.dsQuanCo.add(new QuanCo(xPos, yPos, HangSo.LOAI_X));
			}
		} else {
			if (kiemTraCo(xPos, yPos) && this.nguoiChoi2.danhCo(xPos, yPos)) {
				this.luotChoi1 = true;
				this.dsQuanCo.add(new QuanCo(xPos, yPos, HangSo.LOAI_O));
			}
		}
//		this.veBanCo();
		this.kiemTraThangCuoc();
	}

	private boolean kiemTraCo(int xPos, int yPos) {
		// TODO Auto-generated method stub
		int size = this.dsQuanCo.size();
		if (size == 0) {
			return true;
		}
		for (int i = 0; i < size; i++) {
			QuanCo quanCo = this.dsQuanCo.get(i);
			if (quanCo.getxPosition() == xPos && quanCo.getyPosition() == yPos) {
				if (quanCo.getType().equalsIgnoreCase("X")) {
					System.out.println("Vị trí này đã được đánh bởi " + this.nguoiChoi1.getTen() + " ."
							+ this.nguoiChoi2.getTen() + " hãy đánh lại");
				} else {
					System.out.println("Vị trí này đã được đánh bởi " + this.nguoiChoi2.getTen() + " ."
							+ this.nguoiChoi1.getTen() + " hãy đánh lại");
				}
				return false;
			}
		}
		return true;
	}

	public void inTT() {
		System.out.println(Arrays.toString(tySo));
	}
}
