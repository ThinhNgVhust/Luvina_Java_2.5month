package com.thinhnv.doubleendlinkedlist;

public class Link {
	private int iData;
	private double dData;
	public Link next;

	public Link(int iData, double dData) {
		this.iData = iData;
		this.dData = dData;
	}

	public void display() {
		System.out.print("(iData=" + iData + ", dData=" + dData + ")");
	}
	
	public boolean equals(int iData, double dData) {
		return (this.iData == iData && this.dData == dData);
	}
	public boolean equals(Link link) {
		return (this.iData == link.iData && this.dData == link.dData);
	}
}
