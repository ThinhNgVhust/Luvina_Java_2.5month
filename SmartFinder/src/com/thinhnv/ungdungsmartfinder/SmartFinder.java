package com.thinhnv.ungdungsmartfinder;

public class SmartFinder {
	private int soN;
	public String ketQua;
	public int numberOfNumber;

	public SmartFinder(int soN) {
		this.soN = soN;
		this.checkNumberOfNumber();// khoi tao gia tri cho thuoc tinh numberOfNumber
	}

	private void checkNumberOfNumber() {
		int temp = this.soN;
		while (temp != 0) {
			this.numberOfNumber++;
			temp /= 10;
		}
	}

	public void checkSymetry() {
		if (this.soN <= 10) {
			this.ketQua = this.soN + "khong phai so doi xung";
		} else {
			int temp = this.soN;
			int count = this.numberOfNumber;
			while (count != 0 && count != 1) {
				int last = temp % 10;
				temp /= 10;
				int first = temp / ((int) Math.pow(10, count - 2));
				temp %= Math.pow(10, count - 2);
				if (last != first) {
					this.ketQua = this.soN + " khong phai so doi xung";
					return;
				}
				count -= 2;
			}
		}
		this.ketQua = this.soN + " la so doi xung";
	}

	public void findLargeArea() {
		for (int i = 1; i <= this.soN; i++) {
			for (int j = 1; j <= this.soN; j++) {
				if (i + j < 50 && soUocChung(i, j) > 3) {
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
	}

	private int soUocChung(int a, int b) {
		int min = a < b ? a : b;
		int count = 0;
		for (int i = 1; i <= min; i++) {
			if (a % i == 0 && b % i == 0) {
				count++;
			}
		}
		return count;
	}

	public void finRectangle() {
		System.out.println("Cac bo 3 so thoa man la 3 canh cua 1 tam giac la: ");
		for (int i = 1; i < this.soN; i++) {
			for (int j = 1; j < this.soN; j++) {
				for (int k = 1; k < this.soN; k++) {
					if ((i + j > k) && (i + k > j) && (j + k > i) && (i != j) && (j != k) && (k != i)) {
						System.out.println("Canh 1: " + i + ". Canh 2: " + j + ". Canh 3:" + k);
					}
				}
			}
		}
	}
}
