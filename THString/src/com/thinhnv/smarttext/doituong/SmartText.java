package com.thinhnv.smarttext.doituong;

public class SmartText {
	private String t;

	public SmartText(String t) {
		this.t = t;
	}

	public void intKyTuVietHoa() {
		int len = this.t.length();
		for (int i = 0; i < len; i++) {
			if (t.charAt(i) >= 'A' && t.charAt(i) <= 'Z') {
				if (i == len - 1) {
					System.out.println(t.charAt(i) + ".");
				} else {
					System.out.print(t.charAt(i) + ",");
				}
			}
		}
	}

	public void intKyTuSo() {
		System.out.println();
		int len = this.t.length();
		for (int i = 0; i < len; i++) {
			if (t.charAt(i) >= '0' && t.charAt(i) <= '9') {
				if (i == len - 1) {
					System.out.println(t.charAt(i) + ".");
				} else {
					System.out.print(t.charAt(i) + ",");
				}
			}
		}
	}

	public int sumOfNumber() {
		int len = this.t.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			char myChar = t.charAt(i);
			if (myChar >= '0' && myChar <= '9') {
				count += Integer.parseInt(myChar + "");
			}
		}
		return count;
	}

	public void inViTriXHKyTu(char n) {
		String kq = "";
		int len = this.t.length();
		for (int i = 0; i < len; i++) {
			if(this.t.charAt(i) == n) {
				kq +=i +" ";
			}
		}
		System.out.println("Vi tri xuat hien ky tu " + n + " la: " + kq);
	}

	public void inChuoiDaoNguoc() {
		String chuoiDaoNguoc = "";
		int len = this.t.length();
		int lastIndex = len - 1;
		for (int i = 0; i <= lastIndex; i++) {
			chuoiDaoNguoc += this.t.charAt(lastIndex - i);
		}
		System.out.println("Ket qua la: " + chuoiDaoNguoc);
	}

	public void daoNguocHoaThanhThuong() {
		// TODO Auto-generated method
		String chuoiDaoNguoc = "";
		int len = this.t.length();
		for (int i = 0; i < len; i++) {
			char kyTu = this.t.charAt(i);
			chuoiDaoNguoc += changeCase(kyTu);
		}
		System.out.println("Ket qua: " + chuoiDaoNguoc);
	}

	private char changeCase(char kyTu) {
		if (kyTu >= 'A' && kyTu <= 'Z') {
			char toChar = (char) ((int) kyTu + 32);
			return toChar;
		} else if (kyTu >= 'a' && kyTu <= 'z') {
			char toChar = (char) ((int) kyTu - 32);
			return toChar;
		} else {
			char toChar = kyTu;
			return toChar;
		}
	}

	public void inRaCacTuCoMatTrongChuoi() {
		// TODO Auto-generated method stub
		int len = this.t.length();
		String roDungHang = "";
		for (int i = 0; i < len; i++) {
			char kyTu = this.t.charAt(i);
			if (kyTu == ' ') {
				System.out.print(roDungHang);
				roDungHang = ";";

			} else {
				roDungHang += this.t.charAt(i);
			}
		}
	}

}
