package com.thinhnv.ungdunghoctienganh.word;

public class Word {
	private String title;
	private String mean;
	private String spelling;
	private String idManager;

	public Word(String title, String mean, String spelling, String idManager) {
		super();
		this.title = title;
		this.mean = mean;
		this.spelling = spelling;
		this.idManager = idManager;
	}

	public Word() {
		this.title = "";
		this.mean = "";
		this.spelling = "";
		this.idManager = "";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	public String getSpelling() {
		return spelling;
	}

	public void setSpelling(String spelling) {
		this.spelling = spelling;
	}

	public String getIdManager() {
		return idManager;
	}

	public void setIdManager(String idManager) {
		this.idManager = idManager;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Word) {
			return this.title.equalsIgnoreCase(((Word) obj).getTitle());
		}
		return false;
	}

	@Override
	public String toString() {
		return "Word [title=" + title + ", mean=" + mean + ", spelling=" + spelling + ", idManager=" + idManager + "]";
	}

}
