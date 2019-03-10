package com.thinhnv.uicolor.logic;

import java.awt.Color;

public class ColorItem {
	private String name;
	private Color c;

	public ColorItem(String name, Color c) {
		this.name = name;
		this.c = c;
	}

	public String getName() {
		return name;
	}

	public Color getC() {
		return c;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
