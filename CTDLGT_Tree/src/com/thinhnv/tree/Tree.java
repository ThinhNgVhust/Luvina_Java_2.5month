package com.thinhnv.tree;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

// Lop Tree de the hien cho cay
public class Tree {
	private Node root;

	public Tree(Node root) {
//		super();
		this.root = root;
	}

	public Node find(int iData) {
		Node current = root;
		while (current.getiData() != iData) {
			if (iData > current.getiData()) {
				current = current.getRightChild();
			} else if (iData < current.getiData()) {
				current = current.getLeftChild();
			} else if (current == null) {
				return null;
			}
		}
		return current;
	}

	public void insert(int iData) {
		int count = 0;
		Node newNode = new Node(iData);
		if (this.root == null) {
			this.root = newNode;
		} else {
			Node current = this.root;
			Node parent = null;
			while (true) {
				count++;
				parent = current;
				if (iData < current.getiData()) {
					current = current.getLeftChild();
					if (current == null) {
						System.out.println(count);
						parent.leftChild = newNode;
						return;
					}
				} else {
					current = current.getRightChild();
					if (current == null) {
						System.out.println(count);
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	public void delete(int iData) {

	}

	public void display() {
		this.inOrder(root);
	}

	private void inOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.getLeftChild());
			localRoot.displayNode();
			inOrder(localRoot.getRightChild());
		}
	}
}
