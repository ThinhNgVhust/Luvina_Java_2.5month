package com.thinhnv.triangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle myTriangle = new Triangle(3, 4, 5);
//		myTriangle.checkTriangle();
		myTriangle.tinhChuVi();
		myTriangle.tinhDienTich();
		myTriangle.inKQ();
		System.out.println("-----------------------");
		Triangle thanhTriangle = new Triangle(1,2,3);
//		thanhTriangle.checkTriangle();
		thanhTriangle.tinhChuVi();
		thanhTriangle.tinhDienTich();
		thanhTriangle.inKQ();
	}

}
