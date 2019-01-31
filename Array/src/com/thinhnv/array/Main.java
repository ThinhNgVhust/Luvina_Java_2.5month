package com.thinhnv.array;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSize = 100;
		ArrayStructure highArr = new ArrayStructure(maxSize);
		highArr.inseart(2);
		highArr.inseart(1);
		highArr.inseart(5);
		highArr.inseart(6);
		highArr.inseart(7);
		highArr.inseart(1);
		highArr.inseart(3);
		highArr.inseart(100);
		highArr.sortFromLowToHigh(); // 1 1 2 
		System.out.println(highArr.binarySearch(3));
	}

}
