package com.thinhnv.ungdunghinhhoc.main;

import com.thinhnv.ungdunghinhhoc.hinh.dinh.Dinh;
import com.thinhnv.ungdunghinhhoc.hinh.tamgiac.TamGiac;
import com.thinhnv.ungdunghinhhoc.hinh.tamgiac.TamGiacCan;
import com.thinhnv.ungdunghinhhoc.hinh.tamgiac.TamGiacDeu;
import com.thinhnv.ungdunghinhhoc.hinh.tamgiac.TamGiacThuong;

public class Main {
	public static void main(String args[]) {
		TamGiac tg1 = new TamGiacCan(0, 0, 5, 0, 2.5, 5);
		TamGiac tg2 = new TamGiacCan(0, 0, 5, 0, 2.5, 5);
		TamGiac tg3 = new TamGiacCan(0, 0, 5, 0, 2.5, 5);
		TamGiac tg4 = new TamGiacCan(0, 0, 5, 0, 2.5, 5);
		TamGiac tg5 = new TamGiacCan(0, 0, 5, 0, 2.5, 5);
		TamGiac tg6 = new TamGiacDeu(-1, 1, 2, 4, 6, 0);
		Dinh dinh1 = new Dinh(0, 0);
		Dinh dinh2 = new Dinh(10, 0);
		Dinh dinh3 = new Dinh(3, 5);
		Dinh dinh4 = new Dinh(5, 5);
		TamGiac tg7 = new TamGiacThuong(dinh1, dinh2, dinh3);
		TamGiac tg8 = new TamGiacThuong(dinh1, dinh2, dinh4);
		TamGiac[] qlTamGiac = new TamGiac[100];
		qlTamGiac[0] = tg1;
		qlTamGiac[1] = tg2;
		qlTamGiac[2] = tg3;
		qlTamGiac[3] = tg4;
		qlTamGiac[4] = tg5;
		qlTamGiac[5] = tg6;
		qlTamGiac[6] = tg7;
		qlTamGiac[7] = tg8;
		int count = 0;
		System.out.println("Danh sach cac tam giac thuong");
		for (int i = 0; i < 8; i++) {
			if (qlTamGiac[i] instanceof TamGiacThuong) {
				System.out.println("\n------------------------------------");
				System.out.println(++count + ". ");
				qlTamGiac[i].veHinh();

			}
		}

		count = 0;
		System.out.println("Danh sach cac tam giac can");
		for (int i = 0; i < 8; i++) {
			if (qlTamGiac[i] instanceof TamGiacCan) {
				System.out.println("\n------------------------------------");
				System.out.println(++count + ". ");
				qlTamGiac[i].veHinh();

			}
		}
		count = 0;
		System.out.println("Danh sach cac tam giac deu");
		for (int i = 0; i < 8; i++) {
			if (qlTamGiac[i] instanceof TamGiacDeu) {
				System.out.println("\n------------------------------------");
				System.out.println(++count + ". ");
				qlTamGiac[i].veHinh();

			}
		}
	}
}
