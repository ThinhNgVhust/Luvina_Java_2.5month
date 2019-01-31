package com.thinhnv.sortnative;

public class SortNative {
	private double so1, so2, so3, so4;
	private double lonNhat, lonNhi, lonThuBa, beNhat;
	private String cauTL;

	public SortNative(double so1, double so2, double so3, double so4) {
		this.so1 = so1;
		this.so2 = so2;
		this.so3 = so3;
		this.so4 = so4;
	}

	private String sortNative() {
		double[] arr = new double[3];
		this.lonNhat = this.so1 > this.so2 ? this.so1 : this.so2;
		this.lonNhat = this.lonNhat > this.so3 ? this.lonNhat : this.so3;
		this.lonNhat = this.lonNhat > this.so4 ? this.lonNhat : this.so4;

		if (this.lonNhat == this.so1) {
			this.lonNhi = this.so2 > this.so3 ? this.so2 : this.so3;
			this.lonNhi = this.lonNhi > this.so4 ? this.lonNhi : this.so4;
			if (this.lonNhi == this.so2) {
				this.lonThuBa = this.so3 > this.so4 ? this.so3 : this.so4;
				this.beNhat = this.so3 == this.lonThuBa ? this.so4 : this.so3;
			} else if (this.lonNhi == this.so3) {
				this.lonThuBa = this.so2 > this.so4 ? this.so2 : this.so4;
				this.beNhat = this.so2 == this.lonThuBa ? this.so4 : this.so2;
			} else if (this.lonNhi == this.so4) {
				this.lonThuBa = this.so3 > this.so2 ? this.so3 : this.so2;
				this.beNhat = this.so3 == this.lonThuBa ? this.so2 : this.so3;
			}
		} else if (this.lonNhat == this.so2) {
			this.lonNhi = this.so1 > this.so3 ? this.so1 : this.so3;
			this.lonNhi = this.lonNhi > this.so4 ? this.lonNhi : this.so4;
			if (this.lonNhi == this.so1) {
				this.lonThuBa = this.so3 > this.so4 ? this.so3 : this.so4;
				this.beNhat = this.so3 == this.lonThuBa ? this.so4 : this.so3;
			} else if (this.lonNhi == this.so3) {
				this.lonThuBa = this.so1 > this.so4 ? this.so1 : this.so4;
				this.beNhat = this.so1 == this.lonThuBa ? this.so4 : this.so1;
			} else if (this.lonNhi == this.so4) {
				this.lonThuBa = this.so3 > this.so1 ? this.so3 : this.so1;
				this.beNhat = this.so3 == this.lonThuBa ? this.so1 : this.so3;
			}
		} else if (this.lonNhat == this.so3) {
			this.lonNhi = this.so1 > this.so1 ? this.so1 : this.so1;
			this.lonNhi = this.lonNhi > this.so4 ? this.lonNhi : this.so4;
			if (this.lonNhi == this.so1) {
				this.lonThuBa = this.so2 > this.so4 ? this.so2 : this.so4;
				this.beNhat = this.so2 == this.lonThuBa ? this.so4 : this.so2;
			} else if (this.lonNhi == this.so1) {
				this.lonThuBa = this.so2 > this.so4 ? this.so2 : this.so4;
				this.beNhat = this.so2 == this.lonThuBa ? this.so4 : this.so2;
			} else if (this.lonNhi == this.so4) {
				this.lonThuBa = this.so3 > this.so2 ? this.so3 : this.so2;
				this.beNhat = this.so3 == this.lonThuBa ? this.so2 : this.so3;
			}
			
		} else if (this.lonNhat == this.so4) {
			this.lonNhi = this.so1 > this.so2 ? this.so1 : this.so2;
			this.lonNhi = this.lonNhi > this.so3 ? this.lonNhi : this.so3;
			if (this.lonNhi == this.so2) {
				this.lonThuBa = this.so3 > this.so1 ? this.so3 : this.so1;
				this.beNhat = this.so3 == this.lonThuBa ? this.so1 : this.so3;
			} else if (this.lonNhi == this.so3) {
				this.lonThuBa = this.so2 > this.so1 ? this.so2 : this.so1;
				this.beNhat = this.so2 == this.lonThuBa ? this.so1 : this.so2;
			} else if (this.lonNhi == this.so1) {
				this.lonThuBa = this.so3 > this.so2 ? this.so3 : this.so2;
				this.beNhat = this.so3 == this.lonThuBa ? this.so2 : this.so3;
			}
		}
		this.cauTL = this.beNhat + " " + this.lonThuBa + " " + this.lonNhi + " " + this.lonNhat;
		return this.cauTL;
	}
	
	public String inKQ() {
		this.sortNative();
		return this.cauTL;
	}

}
