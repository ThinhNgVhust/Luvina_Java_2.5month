package com.thinhnv.giaiptbacnhat;

public class PTB1 {
	private double a, b, x;
	private String cauTL;

	public PTB1(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public void giaiPT() {
		if (this.a == 0 && this.b == 0) {
			this.cauTL = "PT vo so nghiem";
		} else if (this.a == 0 && this.b != 0) {
			this.cauTL = " PT vo nghiem";
		} else {
			this.x = -this.b / this.a;
			this.cauTL = "PT co nghiem duy nhat: " + this.x;
		}
	}

	public void inKQ() {
		System.out.println(this.cauTL);

	}

}
