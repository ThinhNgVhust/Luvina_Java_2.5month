package com.thinhnv.triangle;

public class Triangle {
	private double canhA, canhB, canhC;
	private boolean isTriangle;
	private double chuVi, dienTich;

	public Triangle(double canhA, double canhB, double canhC) {
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
		this.checkTriangle();
	}

	private void checkTriangle() {
		if ((this.canhA + this.canhB > this.canhC) && (this.canhA + this.canhC > this.canhC) && (this.canhB + this.canhC > this.canhA))
			this.isTriangle = true;
		else
			this.isTriangle = false;
	}

	public double tinhChuVi() {
		if (this.isTriangle) {
			this.chuVi = this.canhA + this.canhB + this.canhC;
			return this.chuVi;
		} else return -1;
	}
	
	public double tinhDienTich() {
		if (this.isTriangle) {
			double nuaChuVi = (this.canhA + this.canhB + this.canhC) /2;
			this.dienTich = Math.sqrt((nuaChuVi*(nuaChuVi-this.canhA)*(nuaChuVi-this.canhB)*(nuaChuVi-this.canhC)));
			return this.chuVi;
		} else return -1;
	}
	public void inKQ() {
		if(this.isTriangle) {
			System.out.println("Chu vi: " + this.chuVi);
			System.out.println("Dien tich: " + this.dienTich);
		}else {
			System.out.println("Khong phai la tam giac");
		}
	}
}
