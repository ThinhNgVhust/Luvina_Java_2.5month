package com.thinhnv.ungdunghinh2d.goi2d.dinh;

public class Dinh {
	private double x;
	private double y;

	public Dinh(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getLength(Dinh dinhKia) {
		double deltaX = this.getX() - dinhKia.getX();
		double deltaY = this.getY() - dinhKia.getY();
		return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
	}

}
