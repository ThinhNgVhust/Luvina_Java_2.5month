package com.thinhnv.thac.bai2.ungdungdacsan.tdbit;

public class Tidbit {
	private int id;
	private String name;
	private String description;
	private String linkDetail;
	private String linkIcon;

	public Tidbit(int id, String name, String description, String linkDetail, String linkIcon) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.linkDetail = linkDetail;
		this.linkIcon = linkIcon;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getLinkDetail() {
		return linkDetail;
	}

	public String getLinkIcon() {
		return linkIcon;
	}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if(obj instanceof Tidbit) {
		return this.id - ((Tidbit)obj).id == 0;
	}
	return false;
}
}
