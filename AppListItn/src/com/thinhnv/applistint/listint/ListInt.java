package com.thinhnv.applistint.listint;

import java.util.Arrays;

public class ListInt {
	private int[] listInt;

	public ListInt() {
		this.listInt = new int[] { 1, 2, 3, 4, 5, 1, 3, 1, 5, 4, 1, 4, 5, 5, 2 };
	}

	public void sortUp() {
		int[] tmpArr = Arrays.copyOfRange(this.listInt, 0, this.listInt.length);
		Arrays.sort(tmpArr);
		System.out.println("Chuoi sau khi sap xep la: ");
		System.out.println(Arrays.toString(tmpArr));
	}

	public void deleteElementMaxTime() {
		int[] tmpArr = Arrays.copyOfRange(this.listInt, 0, this.listInt.length);
		int size = this.listInt.length;
		int[] arrCount = new int[size];
		for (int i = 0; i < size; i++) {
			arrCount[tmpArr[i]]++;
		}
		int max = 0;
		for (int i = 0; i < arrCount.length; i++) {
			if (max < arrCount[i]) {
				max = arrCount[i];
			}
		}
		int[] newArrInt = new int[size];
		int nElements = 0;
		for (int i = 0; i < arrCount.length; i++) {
			if (arrCount[i] < max && arrCount[i] > 0) {
				newArrInt[nElements++] = i;
			}
		}
		System.out.println("Mang moi sau khi xoa cac phan tu xuat hien nhieu nhat");
		this.listInt = Arrays.copyOfRange(newArrInt, 0, nElements);
		System.out.println(Arrays.toString(this.listInt));
	}

	public void insertCouple() {
		int length = this.listInt.length;
		int newLength = length * 2;
		this.listInt = Arrays.copyOf(this.listInt, newLength);
		for (int i = length - 1; i > 0; i--) {
			if (this.listInt[i] != 0) {
				this.listInt[2 * i] = this.listInt[i];
				this.listInt[i] = 0;
			}
		}
		for (int i = 1; i < listInt.length; i += 2) {
			this.listInt[i] = 10 - this.listInt[i - 1];
		}
		System.out.println("Day moi sau khi thuc hien insert la: ");
		System.out.println(Arrays.toString(listInt));
	}

}
