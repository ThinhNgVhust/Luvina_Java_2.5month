package com.thinhnv.tinhtong2chuoi.tonghaichuoi;

public class TongHaiChuoi {
	private String numA;
	private String numB;
	private String tongString;

	public TongHaiChuoi(String numA, String numB) {
		this.numA = numA;
		this.numB = numB;
		this.tong2Chuoi();
	}

	private void tong2Chuoi() {
		StringBuilder str1 = new StringBuilder(this.numA);
		StringBuilder str2 = new StringBuilder(this.numB);
		int length = str1.length() > str2.length() ? str1.length() : str2.length();
		if (str1.length() < str2.length()) {
			int len = str2.length() - str1.length();
			str1.insert(0, addZero(len));
		} else if (str1.length() > str2.length()) {
			int len = str1.length() - str2.length();
			str2.insert(0, addZero(len));
		}
		int nho = 0;
		StringBuilder kq = new StringBuilder();
		for (int i = length - 1; i >= 0; i--) {
			int so1 = Integer.parseInt(str1.charAt(i) + "");
			int so2 = Integer.parseInt(str2.charAt(i) + "");
			int tong = so1 + so2 + nho;
			if (tong >= 10) {
				tong = 0;
				nho = 1;
			} else {
				nho = 0;
			}
			kq.insert(0, Integer.toString(tong));
		}
		this.tongString = kq.toString();
	}

	private String addZero(int len) {
		// TODO Auto-generated method stub
		String kq = "";
		for (int i = 0; i < len; i++) {
			kq+= '0';
		}
		return kq;

	}

	public void inKetQua() {
		System.out.println("\\------------Ket Qua La------------\\");
		System.out.println(this.numA + " + " + this.numB + " = " + this.tongString);
	}

}
