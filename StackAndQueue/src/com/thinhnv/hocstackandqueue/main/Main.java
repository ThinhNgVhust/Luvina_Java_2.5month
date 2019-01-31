package com.thinhnv.hocstackandqueue.main;

import com.thinhnv.hocstackandqueue.stack.Stack;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack myStack = new Stack(100);
		String str = "((()a(())b {}c{}s[e][fg[h{()}]][]";
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			int c = (int) str.charAt(i);
			if (c == '[' || c == '{' || c == '(') {
				myStack.push(c);
				if (i == str.length() - 1) {
					flag = false;
					break;
				}
			}
			if (c == ']' || c == '}' || c == ')') {
				if (myStack.isEmpty()) {
					flag = false;
					break;
				} else {
					if (isMatching(myStack.peek(), c)) {
						myStack.pop();
						continue;
					} else {
						flag = false;
						break;
					}
				}
			}
			if (!myStack.isEmpty()) {
				flag = false;
			}
		}
		String kq = flag ? "Dung" : "Khong dung ";
		System.out.println(kq);
	}

	private static boolean isMatching(int peek, int c) {
		// TODO Auto-generated method stub
		if (peek == '(' && c == ')') {
			return true;
		} else if (peek == '{' && c == '}') {
			return true;
		} else if (peek == '[' && c == ']') {
			return true;
		} else
			return false;
	}
}
