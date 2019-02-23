package com.thinhnv.btvn1.main;

import com.thinhnv.btvn1.xulychuoi.XuLyChuoi;

public class Main {
	public static void main(String args[]) {
		XuLyChuoi xuLyChuoi = new XuLyChuoi("1.11.1");
		try {
			xuLyChuoi.checkType();
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
