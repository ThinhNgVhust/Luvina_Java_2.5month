package com.thinhnv.ungdungcocaro.cocaro.quanco;

public class QuanCo {
	private int xPos;
	private int yPos;
	private String type;

	public QuanCo(int xPos, int yPos, String type) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.type = type;
	}

	public int getxPosition() {
		return xPos;
	}

	public int getyPosition() {
		return yPos;
	}

	public String getType() {
		return type;
	}

}
