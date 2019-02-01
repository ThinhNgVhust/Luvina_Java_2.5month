package com.thinhnv.doubleendlinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleEndedLinkedList linkedList = new DoubleEndedLinkedList();
		int size = 4;
		for (int i = 0; i < size; i++) {
			linkedList.insertFirst(i, i + 0.5);
		}
		linkedList.displayList();
//		linkedList.displayList();
//		linkedList.deleteLink(0, 0.5);
//		linkedList.deleteFirst();
//		linkedList.displayList();
		linkedList.insertLast(10, 10.5);
		linkedList.displayList();
		linkedList.insertLast(22, 22.5);
		linkedList.displayList();
	}

}
