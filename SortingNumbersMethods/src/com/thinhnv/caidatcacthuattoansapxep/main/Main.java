package com.thinhnv.caidatcacthuattoansapxep.main;

import com.thinhnv.caidatcacthuattoansapxep.thuattoansapxep.SimpleSort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleSort simpleSort = new SimpleSort(1000);
		long startMs = System.currentTimeMillis();
		simpleSort.bubbleSort();
		long duration1 = System.currentTimeMillis() - startMs;
		System.out.println("Bubble Sort:" + duration1 + " miliseconds");
		simpleSort = new SimpleSort(1000);
		long startMs1 = System.currentTimeMillis();
		simpleSort.selectionSort();
		long duration11 = System.currentTimeMillis() - startMs1;
		System.out.println("Selection Sort:" + duration11 + " miliseconds");
		simpleSort = new SimpleSort(1000);
		long startMs2 = System.currentTimeMillis();
		simpleSort.insertionSort();
		long duration12 = System.currentTimeMillis() - startMs2;
		System.out.println("Selection Sort:" + duration12 + " miliseconds");
		
	}

}
