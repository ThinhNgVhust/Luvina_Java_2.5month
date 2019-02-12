package com.thinhnv.numbernice.numbernicemanager;

import java.util.Arrays;

public class NumberNice {
	public int[] arrInt;

	public NumberNice(int size) {
		this.arrInt = new int[size];
		System.out.println("Generate new " + size + " random numbers from 10000 -> 99999: ");
		for (int i = 0; i < size; i++) {
			arrInt[i] = (int) (Math.random() * (99999 - 10000) + 10000);
		}
		this.display();
	}

	private void display() {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(this.arrInt));
	}

	public void sortArr() {
		Arrays.sort(arrInt);
		System.out.println("Sorting....");
		System.out.println(Arrays.toString(this.arrInt));
	}

	public void maxOddNumber() {
		int size = arrInt.length;
		int getNum = arrInt[0];
		int result = calOddNumber(getNum);
		for (int i = 1; i < size; i++) {
			if (result < calOddNumber(this.arrInt[i])) {
				getNum = this.arrInt[i];
				result = calOddNumber(getNum);
			}
		}
		System.out.println("Max of odd: " + getNum + " has " + result + " odd numbers");
	}

	private int calOddNumber(int number) {
		// TODO Auto-generated method stub
		int getNum;
		int count = 0;
		while (number > 0) {
			getNum = number % 10;
			if (getNum % 2 != 0) {
				++count;
			}
			number = number / 10;
		}
		return count;
	}

	public void maxSumLessThan50000() {
		int count = 0;
		int sum = 0;
		int result = 0;
		for (int i = 2; i < arrInt.length; i++) {
			sum = this.arrInt[i] + this.arrInt[i - 1] + this.arrInt[i - 2];
			System.out.println("Sum " +(i-1)+ ":" + sum);
			if (result < sum && sum < 50000) {
				result = sum;
			}
		}
		if (result != 0) {
			System.out.println("Max sum of three elements: " + result);
		} else {
			System.out.println("There is no way in this array");
		}
	}
}
