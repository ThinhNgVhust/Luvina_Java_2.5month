package com.thinhnv.uicolor.logic;

import java.awt.Color;
import java.util.ArrayList;

public class ColorManager {
	private ArrayList<ColorItem> listColor;

	public ColorManager() {
		this.listColor = new ArrayList<ColorItem>();
	}

	public void addColor(String name, Color c) {
		this.listColor.add(new ColorItem(name, c));
	}
	public ArrayList<ColorItem> getListColor(){
		return this.listColor;
	}
	public ColorItem getElement(int index) {
		return this.listColor.get(index);
	}

	@Override
	public String toString() {
		return "ColorManager [listColor=" + listColor + "]";
	}
	
}
