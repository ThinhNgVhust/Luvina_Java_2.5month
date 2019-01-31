package com.thinhnv.simplelinkedlist;

public class LinkedList {
	private Link fisrt;

	public LinkedList() {
		this.fisrt = null;
	}

	public void insertFirst(int iData, double dData) {
		Link newLink = new Link(iData, dData);
		newLink.next = this.fisrt;
		this.fisrt = newLink;
	}

	public boolean isEmpty() {
		return (this.fisrt == null);
	}

	public Link deleteFirst() {
		if (!this.isEmpty()) {
			Link tmp = fisrt;
			this.fisrt = this.fisrt.next;
			return tmp;
		} else {
			return null;
		}

	}

	public Link findKey(int iData, double dData) {
		Link tmp = new Link(iData, dData);
		Link current = this.fisrt;
		while (current != null) {
			if (current.equals(tmp)) {
				System.out.println("Found");
				return current;
			}
		}
		System.out.println("Not found any link with that data");
		return null;
	}

	public void deleteLink(int iData, double dData) {
		Link pre = fisrt;
		Link current = fisrt.next;
		while (current != null && pre != null) {
			if (current.equals(iData, dData)) {
				// cv
				pre.next = current.next;
				System.out.println("Deleted");
				return;
			} else {
				pre = current;
				current = current.next;
			}
		}
	}

	public void displayList() {
		System.out.println("List (fisrt --> last): ");
		Link current = this.fisrt;
		System.out.print("fisrt --> ");
		while (current != null) {
			current.display();
			current = current.next;
			if (current != null) {
				System.out.print(" -- > ");
			} else {
				System.out.print(" -- > null");
			}
		}
		System.out.println("");
	}
}
