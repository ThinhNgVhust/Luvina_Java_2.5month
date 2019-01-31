package com.thinhnv.sortnative;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortNative sortNative = new SortNative(20, 30, 100, 10000);
//		sortNative.sortNative();
		sortNative.inKQ();
		sortNative = new SortNative(1.25, 2.2, 100, Math.PI);
		System.out.println(sortNative.inKQ());

	}

}
