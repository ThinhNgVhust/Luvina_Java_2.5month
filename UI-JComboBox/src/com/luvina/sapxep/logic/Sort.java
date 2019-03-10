package com.luvina.sapxep.logic;

import java.util.Arrays;

public class Sort {
	private int[] listInt;

	public void setItemSort(String text) {
		String[] arrStr = text.split(",");
		this.listInt = new int[arrStr.length];

		for (int i = 0; i < arrStr.length; i++) {
			this.listInt[i] = Integer.parseInt(arrStr[i]);
		}
	}

	public void sort() {
		Arrays.sort(listInt);
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < listInt.length; i++) {
			result += this.listInt[i] + " ";
		}
		return result;
	}
}
