package com.thinhnv.apparrint.arrint;

public class ArrInt {
	private int[] arrInt;

	public ArrInt() {
		this.arrInt = new int[] { 1, 2, 3, 4, 5, 2, 3, 1, 5, 4, 1, 4, 5, 3, 2 };
	}

	public void printMaxElement() {
		int max = this.arrInt[0];
		for (int i = 1; i < arrInt.length; i++) {
			if (max < this.arrInt[i]) {
				max = this.arrInt[i];
			}
		}
		System.out.println("Phan tu lon nhat: " + max);
	}

	public void capDoiMaxEqual5() {
		System.out.println("Cac cap doi co 2 phan tu ke tiep nhau va tong bang 5 la");
		int sum = this.arrInt[0];
		for (int i = 1; i < arrInt.length; i++) {
			if (sum + arrInt[i] == 5) {
				System.out.println(sum + " + " + arrInt[i] +" = " +(sum + arrInt[i]));
				
			}
			sum = arrInt[i];
		}
	}

}
