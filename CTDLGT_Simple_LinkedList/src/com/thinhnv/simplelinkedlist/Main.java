package com.thinhnv.simplelinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList = new LinkedList();
		int size = 4;
		for (int i = 0; i < size; i++) {
			linkedList.insertFirst(i, i + 0.5);
		}

		linkedList.displayList();
		linkedList.deleteLink(3, 3.5);
		linkedList.displayList();
	}

}
