package com.thinhnv.appnotedacsan.qldacsan;

import java.util.ArrayList;

import com.thinhnv.appnotedacsan.dacsan.DacSan;

public class QuanLyDacSan {
	private static final int TYPE_NAME = 1;
	private static final int TYPE_NOI_BAN = 2;
	ArrayList<DacSan> dsDacSan = new ArrayList<DacSan>();

	public QuanLyDacSan() {
	}

	public void themMoiDacSan(DacSan dacSan) {
		if (this.dsDacSan.size() == 0) {
			this.dsDacSan.add(dacSan);
			System.out.println("Them dac san thanh cong");
			return;
		}
		String maId = dacSan.getMaDacSan();
		String tenDacSac = dacSan.getTenDacSan();
		for (int i = 0; i < this.dsDacSan.size(); i++) {
			DacSan dacSan1 = this.dsDacSan.get(i);
			if (dacSan1.getMaDacSan().equalsIgnoreCase(maId)) {
				System.out.println("Da ton tai dac san co ma " + maId + " .Khong them duoc vao");
				return;
			} else if (dacSan1.getTenDacSan().equalsIgnoreCase(tenDacSac)) {
				System.out.println("Da ton tai dac san co ten " + tenDacSac + " .Khong them duoc vao");
				return;
			}
		}
		this.dsDacSan.add(dacSan);
		System.out.println("Them dac san thanh cong");
		return;
	}

	public void hienThiThongTinDanhSachDacSan() {
		int size = this.dsDacSan.size();
		if (size == 0) {
			System.out.println("Danh sach dac san trong");
			return;
		}
		System.out.println("Thong tin danh sach cac dac san: ");
		for (int i = 0; i < size; i++) {
			System.out.println(this.dsDacSan.get(i));
		}
	}

	public void xoaDacSan(String maDacSac) {
		int size = this.dsDacSan.size();
		if (size == 0) {
			System.out.println("Danh sach dac san trong, khong xoa duoc");
			return;
		}
		for (int i = 0; i < size; i++) {
			DacSan dacSan = this.dsDacSan.get(i);
			if (dacSan.getMaDacSan().equals(maDacSac)) {
				this.dsDacSan.remove(i);
				System.out.println("Xoa dac san co ma " + maDacSac + " thanh cong");
			}
		}
	}

	public ArrayList<DacSan> timTheoTen(String name) {
		return timDacSac(TYPE_NAME, name);

	}

	public ArrayList<DacSan> timTheoNoiBan(String noiBan) {
		return timDacSac(TYPE_NOI_BAN, noiBan);
	}

	private ArrayList<DacSan> timDacSac(int typeSearch, String value) {
		ArrayList<DacSan> result = new ArrayList<DacSan>();
		int size = this.dsDacSan.size();
		if (size == 0) {
			System.out.println("Danh sach dac san trong, hay them vao truoc khi tim");
			return null;
		}
		for (int i = 0; i < size; i++) {
			DacSan item = this.dsDacSan.get(i);
			if (typeSearch == TYPE_NAME && item.getTenDacSan().equalsIgnoreCase(value)) {
				result.add(item);
				return result;
			} else if (typeSearch == TYPE_NOI_BAN && item.getNoiBan().equalsIgnoreCase(value)) {
				result.add(item);
			}
		}

		return result;
	}

	public void shareFaceBook() {
		System.out.println("Da chia se len facebook");
	}
}
