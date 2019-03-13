package com.thinhnv.threadcustomer;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.err.println(a1rgs.length);
		Customer customer = new Customer(0);

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				customer.rutTien(2000);
			}
		};

		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				customer.deposit(5000);
			}
		};
		Thread bo = new Thread(r2);
		Thread con = new Thread(r1);
		bo.start();
		con.start();
	}

}
