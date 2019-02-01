package com.thinhnv.hocthread;

public class MyClass implements Runnable {
	static String message[] = { "Hom nay", "bao cao", "bai tap lon", "mon lap trinh java" };
	private String name;

	public MyClass(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < message.length; i++) {
			System.err.println(this.name + ": " + message[i]);
		}
	}

}
