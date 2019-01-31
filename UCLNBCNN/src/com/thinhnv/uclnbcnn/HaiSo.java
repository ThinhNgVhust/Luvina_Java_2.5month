package com.thinhnv.uclnbcnn;

public class HaiSo {
	private int so1;
	private int so2;
	private int soUCLN;
	private int soBCNN;

	public HaiSo(int so1, int so2) {
		this.so1 = Math.abs(so1);
		this.so2 = Math.abs(so2);
		this.ucln();
		this.bcnn();
	}

	private void ucln() {
		int temp1 = this.so1;
		int temp2 = this.so2;
		if (temp1 == 0 || temp2 == 0) {
			this.soUCLN = (temp1 + temp2);
		}
		while (temp1 != temp2) {
			if (temp1 > temp2) {
				temp1 -= temp2;
			} else {
				temp2 -= temp1;
			}
		}
		this.soUCLN = temp1;
	}

	private void bcnn() {
		if (this.so1 == 0 || this.so2 == 0) {
			this.soBCNN = -1;
		} else {
			this.soBCNN = (this.so1 * this.so2) / this.soUCLN;
		}
	}

	public String toString() {
		return "(" + this.so1 + ", " + this.so2 + "). " + "Uoc chung lon nhat : " + this.soUCLN
				+ ". Boi chung nho nhat : " + this.soBCNN;
	}
}
