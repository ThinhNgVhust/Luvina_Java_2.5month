package com.thinhnv.thac.bai1.parseint;

import java.util.Arrays;
import java.util.Random;

public class ParseInt {
	private int[] arrInt;

	public ParseInt() {
//		this.arrInt = new int[] { 1, 2, 1, 1, 2, 4, 5, 1, 6, 6, 243, 100, 100,100,100 ,243,9,6,7, 3, 9, 9, 27, 81 };
		this.arrInt = new int[] { 22, 3, 23, 33, 51, 71, 91, 11, 12, 13, 14, 15, 16 };
//		this.arrInt = new int[] {};
//		Random rd = new Random();
//		this.arrInt = new int[50];
//		for (int i = 0; i < arrInt.length; i++) {
//			this.arrInt[i] = rd.nextInt(101);
//		}
	}

	public void inPhanTuXuatHienNhieuHon2VaChiSo() {
		String gio = "";
		for (int i = 0; i < arrInt.length; i++) {
			if (demSoLuong(this.arrInt[i]) >= 2 && !gio.contains(this.arrInt[i] + "")) {
				gio += this.arrInt[i] + " ";
				System.out.println(this.arrInt[i] + " at index: [" + cacViTri(this.arrInt[i]) + "]");
			}
		}
		if (gio == "") {
			System.out.println("Mảng không tồn tại phần tử nào thỏa mãn xuất hiện từ 2 lần trở lên!");
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
		if (this.arrInt.length == 0) {
			System.out.println("Không tính được tổng do mảng không có phần tử nào");
			return;
		}
		int sum = 0;
		for (int i = 0; i < arrInt.length; i++) {
			sum += this.arrInt[i] < 50 ? this.arrInt[i] : 0;
		}
		System.out.println("Tổng các số nhỏ hơn 50 trong mảng: " + sum);
	}

	public void sapXepTangDan() {
		if (this.arrInt.length == 0) {
			System.out.println("Danh sách trống nên không sắp xếp được");
			return;
		}
		System.out.print("Sắp xếp mảng theo thứ tự tăng dần: ");
		int[] newArr = Arrays.copyOf(arrInt, arrInt.length);
		Arrays.sort(newArr);
		System.out.println(Arrays.toString(newArr));
	}

	public void cacSoHoanHao() {
		if (this.arrInt.length == 0) {
			System.out.println("Không tìm được số hoàn hảo do mảng không có phần tử nào");
			return;
		}
		int countZero = 0;
		for (int i = 0; i < arrInt.length; i++) {
			if (this.arrInt[i] == 0) {
				countZero++;
			}
		}
		if (countZero == this.arrInt.length) {
			System.out.println("Dang sách mảng toàn số 0 nên không tồn tại số hoàn hảo nào");
			return;
		}
		for (int i = 0; i < arrInt.length; i++) {
			if (this.arrInt[i] == 0) {
				System.out.println("Số hoàn hảo là : " + this.arrInt[i]);// 0 % number always = 0;
				return;
			}
		}

		for (int i = 0; i < arrInt.length; i++) {
		}
		int soUocMax = 0;
		for (int i = 0; i < arrInt.length; i++) {
			if (soUocMax <= demSoUoc(this.arrInt[i])) {
				soUocMax = demSoUoc(this.arrInt[i]);
			}
		}
		String gio = "";
		System.out.print("\nDanh sách các số hoàn hảo: ");
		for (int i = 0; i < arrInt.length; i++) {
			if (soUocMax == demSoUoc(this.arrInt[i]) && !gio.contains(this.arrInt[i] + "")) {
				gio += this.arrInt[i] + " ";
			}
		}
		System.out.println(Arrays.toString(gio.split(" ")));

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
