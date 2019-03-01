package com.thinhnv.parseintapp.parseint;

import java.util.Arrays;
import java.util.Random;

public class ParseInt {
	private int[] arrInt;

	public ParseInt() {
		Random rd = new Random();
		this.arrInt = new int[50];
		for (int i = 0; i < arrInt.length; i++) {
			this.arrInt[i] = rd.nextInt(101);
		}
		System.out.print("Mảng sinh ngẫu nhiên 50 phần từ từ 0-100: ");
		System.out.println(Arrays.toString(arrInt));
	}

	public void inPhanTuXuatHienNhieuHon2VaChiSo() {
		String gio = "";
		System.out.println("Các vị trí các số nguyên có giá trị bằng nhau trong mảng trên là: ");
		for (int i = 0; i < arrInt.length; i++) {
			if (demSoLuong(this.arrInt[i]) >= 2 && !gio.contains(this.arrInt[i] + "")) {
				gio += this.arrInt[i] + " ";
				System.out
						.println("Số " + this.arrInt[i] + ": " + Arrays.toString(cacViTri(this.arrInt[i]).split(" ")));
			}
		}
		if (gio == "") {
			System.out.println("Mảng không tồn tại phần tử nào thỏa mãn xuất hiện từ 2 lần trở lên!");
		}
	}

	private String cacViTri(int i) {
		// TODO Auto-generated method stub
		String gio = "";
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
		System.out.print("       Sắp xếp mảng theo thứ tự tăng dần: ");
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
		}
		int soUocMax = 0;
		for (int i = 0; i < arrInt.length; i++) {
			if (soUocMax <= demSoUoc(this.arrInt[i], i)) {
				soUocMax = demSoUoc(this.arrInt[i], i);
			}
		}
		String gio = "";
		System.out.print("\nDanh sách các số hoàn hảo: ");
		for (int i = 0; i < arrInt.length; i++) {
			if (soUocMax == demSoUoc(this.arrInt[i], i)) {// && !gio.contains(this.arrInt[i] + "")
				gio += this.arrInt[i] + " ";
			}
		}
		System.out.println(Arrays.toString(gio.split(" ")));
	}

	private int demSoUoc(int element, int index) {
		// TODO Auto-generated method stub
		if (element == 0) {
			int countZero = 0;
			for (int i = 0; i < arrInt.length; i++) {
				if (this.arrInt[i] != 0) {
					countZero++;
				}
			}
			return countZero;
		}
		String gio = "";
		int count = 0;
		for (int i = 0; i < arrInt.length; i++) {
			int soNguyen = this.arrInt[i];
			if (index == i) {
				continue;
			}
			if (soNguyen != 0 && element % soNguyen == 0 && !gio.contains("-" + soNguyen + "-")) {
				gio += "-" + soNguyen + "-";
				count++;
			}
		}
		return count;
	}
}