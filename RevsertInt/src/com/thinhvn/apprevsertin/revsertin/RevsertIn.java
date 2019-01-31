package com.thinhvn.apprevsertin.revsertin;

public class RevsertIn {
	private int soNguyen;
	private String maNhiPhanThuan = "";
	private String daoBit = "";
	private String maNhiPhanNghich = "";

	public RevsertIn(int soNguyen) {
		this.soNguyen = soNguyen;
	}

	private void chuyenSangMaNhiPhan() {
		String tmpStr = "";
		int soNguyen = this.soNguyen;
		while (soNguyen != 0) {
			tmpStr += soNguyen % 2;
			soNguyen /= 2;
		}
		int len = tmpStr.length();
		for (int i = 0; i < len; i++) {
			this.maNhiPhanThuan += tmpStr.charAt(len - i - 1);
		}
		System.out.println("Ma nhi phan cua " + this.soNguyen + " la: " + this.maNhiPhanThuan);
	}

	private void daoNguocChuoi() {
		int len = this.maNhiPhanThuan.length();
		String tmpStr = "";
		for (int i = len - 1; i >= 0; i--) {
			tmpStr += this.maNhiPhanThuan.charAt(i);
		}
		this.maNhiPhanNghich = tmpStr;
		System.out.println("Ma nhi phan sau khi dao chuoi la: " + tmpStr);
	}

	private void daoBit() {
		String tmpStr = "";
		int len = this.daoBit.length();
		for (int i = 0; i < len; i++) {
			tmpStr += this.daoBit.charAt(i) == '0' ? '1' : '0';
		}
		this.daoBit = tmpStr;
		System.out.println("Ma nhi phan sau khi dao bit: " + tmpStr);
	}

	private void chuyenSangInt() {
		int len = this.maNhiPhanNghich.length();
		int kq = 0;
		int tmp = 0;
		String str1 = "";
		String str2 = "";
		for (int i = 0; i < len; i++) {
			char c = this.maNhiPhanThuan.charAt(i);
			str1 += (i != (len - 1)) ? (c + "*" + 2 + "^" + i + " + ") : (c + "*" + 2 + "^" + i);
			tmp = (c =='0')? 0 : (int)Math.pow(2, i); kq += tmp;
			str2 += (i==(len-1)) ? tmp : (tmp + "+");
			
		}
		System.out.print(str1 + "= " + str2 + " = " + kq);

	}
	public void reverseInt() {
		this.chuyenSangMaNhiPhan();
		this.daoNguocChuoi();
		this.chuyenSangInt();
		
	}
}
