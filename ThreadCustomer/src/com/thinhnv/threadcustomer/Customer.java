package com.thinhnv.threadcustomer;

public class Customer {
	private int money;

	public Customer(int money) {
		this.money = money;
	}

	public synchronized void rutTien(int moneyGet) {
		if (moneyGet > this.money) {
			System.out.println("\nBalance is not enough!");
//			return;
			//đợi
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
			money -= moneyGet;
			System.out.println("Drawed!, Balance is: " + this.money);
	}

	public synchronized void deposit(int money) {
		this.money += money;
		System.out.println("Deposited!, Balance is: " + this.money);
		//thông báo
//		notify();
		Math.random();
		return;
	}
}
