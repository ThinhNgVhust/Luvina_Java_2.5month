package com.thinhnv.quanlydanhba.danhba;

public class QuanLyDanhBa {
	private DanhBa[] listDB;

	public QuanLyDanhBa() {
		super();
		this.listDB = new DanhBa[5];
//		System.out.println(this.listDB.length);
	}

	public boolean isExit(String sdt) {
		for (int i = 0; i < listDB.length; i++) {
			if (listDB[i] == null) {
				return false;
			}
			if (listDB[i].getSdt().equals(sdt)) {
				return true;
			}
		}
		return false;
	}

	public void themDanhBa(int index, String gTen, String gSdt) {
		DanhBa tmp = new DanhBa(gTen, gSdt);
		if (isExit(gSdt)) {
			System.out.println("Danh ba nay da ton tai!");
			return;
		} else {
			this.listDB[index - 1] = tmp;
			System.out.println("Da them danh ba thanh cong");
		}
	}

	public void suaDanhBa(String gtSdt, String sdtMoi) {
		for (int i = 0; i < listDB.length; i++) {
			if (this.listDB[i].getSdt().equals(gtSdt)) {
				if (this.isExit(sdtMoi)) {
					System.out.println("So dien thoai da co trong danh ba");
					return;
				}
				this.listDB[i].setSdt(sdtMoi);
				System.out.println("Doi so thanh cong");
				return;
			}
		}
	}

	public void timKiemDanhBa(String findName) {
		System.out.println("\nKet qua sau khi tim kiem: ");
		for (int i = 0; i < listDB.length; i++) {
			String ten = listDB[i].getTen();
			if (isCommon(ten, findName)) {
				System.out.println(ten + " " + listDB[i].getSdt());
			}
		}
	}

	private boolean isCommon(String ten, String findName) {
		// TODO Auto-generated method stub
		String ten1 = ten;
		String findName1 = findName;
		ten1 = ten1.toLowerCase();
		findName1 = findName1.toLowerCase();
		while (findName1.length() != 0) {
			char kyTu = findName1.charAt(0);
			int indexOfkyTu = ten1.indexOf(kyTu);
			if (indexOfkyTu != -1) {
				ten1 = ten1.substring(1);
				findName1 = findName1.substring(1);
			} else {
				return false;
			}
		}
		return true;
	}

}
