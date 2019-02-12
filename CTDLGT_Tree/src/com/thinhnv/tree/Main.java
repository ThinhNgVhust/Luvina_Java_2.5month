package com.thinhnv.tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(50);
		Tree theTree = new Tree(root);
		for (int i = 0; i < 100; i++) {
			int x = (int) (Math.random() * 10000) + 1;
			theTree.insert(x);
		}
		theTree.display();
	}
}
