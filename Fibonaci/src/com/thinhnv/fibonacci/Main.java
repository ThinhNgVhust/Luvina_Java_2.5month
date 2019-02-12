package com.thinhnv.fibonacci;

public class Main {
	public static void main(String args[]) {
		Fibonacci fibonacci = new Fibonacci();
		long start = System.currentTimeMillis();
		System.out.println("f80 = " + fibonacci.fiboAl2(90));
		long duration = System.currentTimeMillis() - start;
		System.out.println("Running in " + duration + " nano s");
	}

}
