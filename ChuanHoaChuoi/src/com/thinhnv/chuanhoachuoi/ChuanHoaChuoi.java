package com.thinhnv.chuanhoachuoi;

public class ChuanHoaChuoi {
	private String chuoiDau;
	private String chuoiDaXuLy;

	public ChuanHoaChuoi(String chuoiDau) {
		this.chuoiDau = chuoiDau;
	}

	public void inKetQua() {
		this.xuLyChuoi();
		System.out.println("Chuoi sau khi da xu ly la: " + this.chuoiDaXuLy);
	}

	private void xuLyChuoi() {
		String str = this.chuoiDau;
		int length = str.length();
		String kq = "";
		for (int i = 0; i < length; i++) {
			if (str.charAt(i) == '(') {
				for (int j = i + 1; j < length; j++) {
					if (isPareness(i, j)) {
						kq += str.substring(i, j + 1);
						i = j;
						break;
					}
				}
			}

		}
		this.chuoiDaXuLy = kq;
	}

	private boolean isPareness(int i, int j) {
		// TODO Auto-generated method stub
		String tmp = this.chuoiDau;
		StringBuilder strbld = new StringBuilder(tmp.substring(i, j + 1));
		while (strbld.length() != 0) {
			if (strbld.charAt(0) == '(' && strbld.charAt(strbld.length() - 1) == ')') {
				strbld.deleteCharAt(0);
				strbld.deleteCharAt(strbld.length() - 1);
			} else {
				return false;
			}
		}
		return true;
	}

}
