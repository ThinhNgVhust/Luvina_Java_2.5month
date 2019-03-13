package com.thinhnv.uihoctienganhapp.logic;

public class Word {
	private String word;
	private String mean;

	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	@Override
	public String toString() {
		return word + " :/" + mean + "/";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Word) {
			return this.word.equals(((Word) obj).word);
		}
		return false;
	}

}
