package com.thinhnv.apparrayutil.arrayutil;

public class ArrayUtil {
	private int[] array;
	private int n;

	public ArrayUtil(int n) {
		this.n = n;
		this.array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 50 + 1);
//			System.out.println(array[i]);

		}
	}

	public void findTriangle() {
		System.out.println("Danh sach 3 so lien tiep tao thanh 3 canh cua mot tam giac");
		for (int i = 2; i < array.length; i++) {
			if (isTriangle(array[i - 2], array[i - 1], array[i])) {
				System.out.println("(" + array[i - 2] + ", " + array[i - 1] + ", " + array[i] + ")");
			}
		}
	}

	private boolean isTriangle(int a, int b, int c) {
		return (a + b > c && a + c > b && b + c > a);

	}

}
