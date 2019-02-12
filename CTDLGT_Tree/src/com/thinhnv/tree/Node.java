package com.thinhnv.tree;

public class Node {
	public int iData;
	public Node leftChild = null;
	public Node rightChild = null;

	public Node(int iData) {
		this.iData = iData;
	}

	public int getiData() {
		return iData;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void displayNode() {
		System.out.print(" " + this.getiData());
	}
}
