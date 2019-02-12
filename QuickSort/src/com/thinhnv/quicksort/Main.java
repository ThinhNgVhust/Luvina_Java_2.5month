package com.thinhnv.quicksort;

import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		int arr[] = { 8, 8, 5, 3, 6, 9, 0, 22, 5, 0, 100, 123, 111, 101, 102 };
//		int arr[] = { 10, 80, 30, 90, 40, 50, 70 };
		QuickSort qS = new QuickSort();
		qS.quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

}
