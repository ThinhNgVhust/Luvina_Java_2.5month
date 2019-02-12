package com.thinhnv.fibonacci;

public class Fibonacci {
	public static final int MAX = 10000000;

	private boolean[] isCheck;
	private long[] fibo;

	public Fibonacci() {
		isCheck = new boolean[MAX];
		fibo = new long[MAX];
		fibo[1] = 1;
		fibo[2] = 1;
		isCheck[1] = true;
		isCheck[2] = true;
	}

	public long fiboAl1(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fiboAl1(n - 1) + fiboAl1(n - 2);
		}
	}

	public long fiboAl2(int n) {
		if (isCheck[n] == false) {
			fibo[n] = fiboAl2(n - 1) + fiboAl2(n - 2);
			isCheck[n] = true;
		}
		return fibo[n];
	}

}
