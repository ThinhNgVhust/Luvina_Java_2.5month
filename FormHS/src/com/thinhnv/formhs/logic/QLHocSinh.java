package com.thinhnv.formhs.logic;

import java.util.ArrayList;

public class QLHocSinh {
	private ArrayList<HocSinh> listHS;
	public static final String PATH = "/home/thinhnv/HocSinh.txt";

	public QLHocSinh() {
		this.listHS = new ArrayList<HocSinh>();
	}

	public void addHS(HocSinh hs) {
		this.listHS.add(hs);
	}

	public ArrayList<HocSinh> getListHS() {
		return this.listHS;
	}

}
