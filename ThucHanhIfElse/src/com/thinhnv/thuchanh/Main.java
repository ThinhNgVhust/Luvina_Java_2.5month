package com.thinhnv.thuchanh;

import java.util.Scanner;


public class Main {
	public static void testYear() {
		Const myConst;
		System.out.println("Nhap vao so nam");
		int year;
		Scanner keyBoard = new Scanner(System.in);
		year = keyBoard.nextInt();
		keyBoard.hasNextLine();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("Nam " + year + " la nam nhuan nen thang 2 co 29 ngay");
		} else {
			System.out.println("Thang 2 co 28 ngay");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int thu;
		int month;
		System.out.println("Nhap vao thu");
		Scanner keyBoard = new Scanner(System.in);
		thu = keyBoard.nextInt();
		keyBoard.nextLine();

		while (thu < 2 || thu > 8) {
			System.out.println("Nhap lai");
			thu = keyBoard.nextInt();
			keyBoard.nextLine();
		}
		switch (thu) {
		case Const.THU_2:
			System.out.println("Thu 2");
			break;
		case Const.THU_3:
			System.out.println("Thu 3");
			break;
		case Const.THU_4:
			System.out.println("Thu 4");
			break;
		case Const.THU_5:
			System.out.println("Thu 5");
			break;
		case Const.THU_6:
			System.out.println("Thu 6");
			break;
		case Const.THU_7:
			System.out.println("Thu 7");
			break;
		default:
			System.out.println("Chu nhat");
		}
		System.out.println("Nhap vao thang");
		month = keyBoard.nextInt();
		keyBoard.nextLine();

		while (month < 1 || month > 12) {
			System.out.println("Nhap lai!");
			month = keyBoard.nextInt();
			keyBoard.nextLine();
		}
		switch (month) {
		case Const.THANG_1:
		case Const.THANG_3:
		case Const.THANG_5:
		case Const.THANG_7:
		case Const.THANG_9:
		case Const.THANG_11:
			System.out.println("Thang " + month + " co 31 ngay");
			break;
		case Const.THANG_4:
		case Const.THANG_6:
		case Const.THANG_8:
		case Const.THANG_10:
		case Const.THANG_12:
			System.out.println("Thang " + month + " co 30 ngay");
			break;
		case Const.THANG_2:
			testYear();
			break;
		}
		System.exit(0);
	}
}
