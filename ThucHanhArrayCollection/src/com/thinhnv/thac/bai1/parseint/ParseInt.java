package com.thinhnv.thac.bai1.parseint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ParseInt {
	private int[] arrInt;

	public ParseInt() {
		this.arrInt = new int[] { 1, 2, 1, 1, 2, 4, 5, 1, 6, 6, 243, 100, 100, 243, 3, 9, 9, 27, 81 };
//		Random rd = new Random();
//		this.arrInt = new int[50];
//		for (int i = 0; i < arrInt.length; i++) {
//			this.arrInt[i] = rd.nextInt(101);
//		}
	}

	public void inPhanTuXuatHienNhieuHon2VaChiSo() {
		String gio = "";
		for (int i = 0; i < arrInt.length; i++) {
			if (demSoLuong(this.arrInt[i]) > 2 && !gio.contains(this.arrInt[i] + "")) {
				gio += this.arrInt[i] + " ";
				System.out.println(this.arrInt[i] + " at index: [" + cacViTri(this.arrInt[i]) + "]");
			}
		}
	}

	private String cacViTri(int i) {
		// TODO Auto-generated method stub
		String gio = " ";
		for (int j = 0; j < arrInt.length; j++) {
			if (this.arrInt[j] == i) {
				gio += j + " ";
			}
		}
		return gio;
	}

	private int demSoLuong(int i) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int j = 0; j < arrInt.length; j++) {
			if (this.arrInt[j] == i) {
				count++;
			}
		}
		return count;
	}

	public void tongCacSoNguyenNhoHon50() {
		int sum = 0;
		for (int i = 0; i < arrInt.length; i++) {
			sum += this.arrInt[i] < 50 ? this.arrInt[i] : 0;
		}
		System.out.println("Tong cac so nho hon 50 trong mang: " + sum);
	}

	public void sapXepTangDan() {
		int[] newArr = Arrays.copyOf(arrInt, arrInt.length);
		Arrays.sort(newArr);
		System.out.println(Arrays.toString(newArr));
	}

	public void cacSoHoanHao() {
		for (int i = 0; i < arrInt.length; i++) {
			if (this.arrInt[i] == 0) {
				System.out.println("So hoan hao la: " + this.arrInt[i]);// 0 % number always = 0;
				return;
			}
		}
		int soUocMax = 0;
		for (int i = 0; i < arrInt.length; i++) {
			if (soUocMax <= demSoUoc(this.arrInt[i])) {
				soUocMax = demSoUoc(this.arrInt[i]);
			}
		}
//		System.out.println(soUocMax);
		String gio = "";
		System.out.println("\nDanh sach cac so hoan hao");
		for (int i = 0; i < arrInt.length; i++) {
			if (soUocMax == demSoUoc(this.arrInt[i]) && !gio.contains(this.arrInt[i] + "")) {
				gio += this.arrInt[i] + " ";
			}
		}

	}

	private int demSoUoc(int element) {
		// TODO Auto-generated method stub
		String gio = "";
		int count = 0;
		for (int i = 0; i < arrInt.length; i++) {
			int soNguyen = this.arrInt[i];
			if (element % soNguyen == 0 && !gio.contains("-" + soNguyen + "-")) {
				gio += "-" + soNguyen + "-";
				count++;
			}
		}
		return count;
	}
}
