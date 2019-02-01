package com.thinhnv.hocthread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mc1 = new MyClass("Thread1:");
		MyClass mc2 = new MyClass("Thread2:");
		Thread t1 = new Thread(mc1);
		Thread t2 = new Thread(mc2);
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}

}
