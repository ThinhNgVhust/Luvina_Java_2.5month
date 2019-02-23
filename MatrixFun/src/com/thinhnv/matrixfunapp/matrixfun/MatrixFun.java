package com.thinhnv.matrixfunapp.matrixfun;

import java.util.Arrays;

public class MatrixFun {
	private int[][] arrInt;

	public void init() {
		this.arrInt = new int[][] { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 7, 8, 2, 3, 6, 4, 3, 2 }, { 8, 9, 3, 2, 4, 3, 4, 9 },
				{ 0, 4, 7, 3, 4, 2, 3, 4 }, { 9, 8, 7, 4, 3, 2, 3, 8 }, { 8, 7, 3, 4, 3, 3, 2, 3 },
				{ 9, 7, 4, 5, 4, 1, 8, 3 }, { 9, 8, 4, 3, 5, 5, 9, 8 } };
//		this.arrInt = new int[8][8];
//		for (int i = 0; i < arrInt.length; i++) {
//			for (int j = 0; j < arrInt.length; j++) {
//				this.arrInt[i][j] = (int) (Math.random() * 9 + 1);
//			}
//		}
		for (int i = 0; i < this.arrInt.length; i++) {
			System.out.println(Arrays.toString(this.arrInt[i]));
		}
	}

	public void thirdMax() {
		System.out.println("\n\n---------Find third max-----------");
		int max1 = 0;
		for (int i = 0; i < this.arrInt.length; i++) {
			for (int j = 0; j < this.arrInt[0].length; j++) {
				if (max1 < this.arrInt[i][j]) {
					max1 = this.arrInt[i][j];
				}
			}
		}
		int max2 = 0;
		for (int i = 0; i < this.arrInt.length; i++) {
			for (int j = 0; j < this.arrInt[0].length; j++) {
				if (max2 < this.arrInt[i][j] && max1 > this.arrInt[i][j]) {
					max2 = this.arrInt[i][j];
				}
			}
		}
		int max3 = 0;
		for (int i = 0; i < this.arrInt.length; i++) {
			for (int j = 0; j < this.arrInt[0].length; j++) {
				if (max3 < this.arrInt[i][j] && max2 > this.arrInt[i][j]) {
					max3 = this.arrInt[i][j];
				}
			}
		}

		int timesOfMax3 = 0;
		for (int i = 0; i < this.arrInt.length; i++) {
			for (int j = 0; j < this.arrInt[0].length; j++) {
				if (max3 == this.arrInt[i][j]) {
					timesOfMax3++;
				}
			}
		}
		System.out.println("Phan tu lon thu 3 :" + max3 + " .So lan xuat hien: " + timesOfMax3);
	}

	public void sortDiagonalLine() {
		System.out.println("\n----------------------sortDiagonalLine()----------------------");
		System.out.println("                             ***                              ");
		for (int i = 0; i < arrInt.length; i++) {
			for (int j = i; j < arrInt.length; j++) {
				if (lonThu(i, this.arrInt[j][i])) {
					this.swap(arrInt, i, j);
				}
			}
		}
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println("\t\t   " + Arrays.toString(this.arrInt[i]));
		}
		System.out.println("                             ***                              ");
		System.out.println("----------------------end sortDiagonalLine()----------------------");

	}

	private boolean lonThu(int i, int element) {
		// TODO Auto-generated method stub
		// lay cac phan tu cua cot i
		int[] arr = new int[8];
		for (int j = 0; j < arrInt.length; j++) {
			arr[j] = this.arrInt[j][i];
		}
		int[] arr1 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr1);
		boolean result = element == arr1[i];
		return result;
	}

	private void swap(int[][] arrInt, int i, int j) {
		// TODO Auto-generated method stub
		int arrTemp = 0;
		for (int k = 0; k < this.arrInt.length; k++) {
			arrTemp = arrInt[i][k];
			arrInt[i][k] = arrInt[j][k];
			arrInt[j][k] = arrTemp;
		}
	}

}
