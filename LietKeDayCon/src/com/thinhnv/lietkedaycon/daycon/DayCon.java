package com.thinhnv.lietkedaycon.daycon;

public class DayCon {
	private String chuoiSoNguyen;
	private String ketQua;
	private StringBuilder strbld = new StringBuilder();
	public int[] arr;

	public DayCon(String chuoiSoNguyen) {
		this.chuoiSoNguyen = chuoiSoNguyen;
		strbld = new StringBuilder(this.chuoiSoNguyen);
//		System.out.println(strbld.charAt(0));
//		this.layKichThuoc();
//		this.laySo();
//		this.lietKeDayConTangDan();
	}

	public void inKQ() {
		System.out.println(this.chuoiSoNguyen);
		System.out.println("Solution: ");
		System.out.println(this.ketQua);
	}

	public void xuLy() {
		String gio = "";
		int so1=0 ;
		int so2=0 ;
		try {
			so1 = nextInt();
			so2 = nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Day chi co 1 so la " + so1 + " nen khong thuc hien duoc");
			return;
		}
		int buocNhay = so2 - so1;
		boolean flag = true;
		while (strbld.length() != 0) {
			if (buocNhay > 0) {
				if (flag) {
					gio += Integer.toString(so1) + " ";
					flag = false;
				}
				if (buocNhay == so2 - so1) {
					so1 = so2;
					gio += Integer.toString(so1) + " ";
					so2 = nextInt();
				} else {
					flag = true;
					System.out.println(gio);
					gio = "";
					buocNhay = so2 - so1;
				}
			} else {
				so1 = so2;
				so2 = nextInt();
				buocNhay = so2 - so1;
			}
		}
		if (gio != "" && so2 - so1 == buocNhay) {
			gio += " " + so2;
			System.out.println(gio);
		} else if (so2 > so1) {
			System.out.println(gio);
			gio = so1 + " " + so2;
			System.out.println(gio);
		}
	}
	public int nextInt() {
		// TODO Auto-generated method stub
		String ketQua = "";
		try {
			while (strbld.charAt(0) != ' ') {
				ketQua += strbld.charAt(0);
				strbld.deleteCharAt(0);
			}
			while (strbld.charAt(0) == ' ') {
				strbld.deleteCharAt(0);
			}
			return Integer.parseInt(ketQua);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			return Integer.parseInt(ketQua);
		}
	}

	//
//	private void laySo() {
//		// TODO Auto-generated method
//		int count = 0;
//		String gio = "";
//		for (int i = 0; i < this.chuoiSoNguyen.length(); i++) {
//			char kyTu = this.chuoiSoNguyen.charAt(i);
//			if (kyTu <= '9' && kyTu >= '0') {
//				gio += kyTu;
//			} else {
//				if (gio != "") {
//					this.arr[count++] = Integer.parseInt(gio);
//					gio = "";
//				}
//			}
//		}
//		if (gio != "") {
//			this.arr[count++] = Integer.parseInt(gio);
//		}
//	}
//
//	private void layKichThuoc() {
//		int leng = this.chuoiSoNguyen.length();
//		int size = 0;
//		for (int i = 0; i < leng; i++) {
//			if (this.chuoiSoNguyen.charAt(i) == ' ') {
//				size++;
//			}
//		}
//		this.arr = new int[size + 1];
//
//	}
//
//	private void lietKeDayConTangDan() {
//		String gio = "";
//		String kq = "";
//		int length = this.arr.length;
//		for (int i = 1; i < length; i++) {
//
//			int khoangCach = this.arr[i] - this.arr[i - 1];
//			if (khoangCach > 0) {
//				gio += Integer.toString(this.arr[i - 1]) + " " + Integer.toString(this.arr[i]);
//				for (int j = i + 1; j < length; j++) {
//					if (this.arr[j] - this.arr[j - 1] == khoangCach) {
//						gio += " " + Integer.toString(this.arr[j]);
//						if (j == length - 1) {
//							i = j;
//							break;
//						}
//					} else {
//						i = --j;
////						System.out.println(gio);
//						kq += gio + "\n";
//						gio = "";
//						break;
//					}
//				}
//			}
//		}
//		if (gio != "") {
////			System.out.println(gio);
//			kq += gio+ "\n";
//		}
//		this.ketQua = kq;
//	}
//
//	
}
