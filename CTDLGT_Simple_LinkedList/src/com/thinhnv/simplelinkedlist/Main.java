package com.thinhnv.simplelinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList = new LinkedList();
		int size = 10;
		for (int i = 0; i < size; i++) {
			linkedList.insertFirst(i, i + 0.5);
		}

		linkedList.displayList();
		linkedList.deleteLink(0, 0.5);
		linkedList.displayList();
		linkedList.findKey(5, 5.5);
	}

}
