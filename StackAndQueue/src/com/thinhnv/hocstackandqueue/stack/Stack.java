package com.thinhnv.hocstackandqueue.stack;

//Stack LIFO- Last In First Out
public class Stack {
	private int maxSize;
	private int[] arrStack;
	private int top;

	/* Constructor method */
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.arrStack = new int[maxSize];
		this.top = -1;
	}

	public void push(int number) {
		if (this.isFull()) {
			return;
		} else {
			this.arrStack[++this.top] = number;
		}
	}

	public int pop() {
		if (this.isEmpty()) {
			return 100000000;
		} else {
			return this.arrStack[top--];
		}
	}

	public boolean isEmpty() {
		return this.top == -1;
	}

	public int peek() {
		return this.arrStack[this.top];
	}

	public boolean isFull() {
		return this.top == maxSize - 1;
	}
}
