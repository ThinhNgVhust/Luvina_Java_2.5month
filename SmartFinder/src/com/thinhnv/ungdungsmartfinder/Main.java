package com.thinhnv.ungdungsmartfinder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartFinder smartFinder = new SmartFinder(151);
		System.out.println(smartFinder.numberOfNumber);
		smartFinder.checkSymetry();
		System.out.println(smartFinder.ketQua);
		smartFinder.findLargeArea();
//		smartFinder.finRectangle();
	}

}
