package com.thinhnv.lietkedaycon.daycon;

public class DayCon {
	private String chuoiSoNguyen;
	private String ketQua;
	int countElements = 0;
	public int[] arr;

	public DayCon(String chuoiSoNguyen) {
		this.chuoiSoNguyen = chuoiSoNguyen;
		this.arr = new int[this.chuoiSoNguyen.length()];
	}

	public void inKQ() {
		System.out.println(this.chuoiSoNguyen);
		System.out.println("Solution: ");
		System.out.println(this.ketQua);
	}

	private void laySo() {
		this.chuoiSoNguyen = this.chuoiSoNguyen.trim();
		StringBuilder strbld = new StringBuilder(this.chuoiSoNguyen);
		String gio = "";
		while (strbld.length() != 0) {
			char c = strbld.charAt(0);
			if (c <= '9' && c >= '0') {
				gio += c;
			} else if (gio != "") {
				arr[countElements++] = Integer.parseInt(gio);
				gio = "";
			}
			strbld.deleteCharAt(0);
		}
		if (gio != "") {
			arr[countElements++] = Integer.parseInt(gio);
		}
	}

	public void xuLy() {
		this.laySo();
		if (this.countElements < 2) {
			System.out.println("Khong the sap xep duoc");
		}
		int kc = this.arr[1] - this.arr[0];
		boolean tangDeu = kc > 0;
		for (int i = 1; i < this.countElements; i++) {
			if (kc > 0) {
				if (tangDeu) {
					System.out.print(this.arr[i - 1] + " ");
					tangDeu = false;
				}
				if (kc == this.arr[i] - this.arr[i - 1]) {
					System.out.print(arr[i] + " ");
					kc = this.arr[i] - this.arr[i - 1];
				} else {
					kc = this.arr[i] - this.arr[i - 1];
					i--;
					tangDeu = true;
					System.out.println("");
				}
			} else {
				tangDeu = true;
				kc = this.arr[i + 1] - this.arr[i];
			}
		}
	}
}
