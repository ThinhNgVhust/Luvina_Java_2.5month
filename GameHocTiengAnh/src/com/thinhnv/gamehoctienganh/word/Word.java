package com.thinhnv.gamehoctienganh.word;

public class Word {
	private String word;
	private String vnMean;

	public Word(String vnMean, String word) {
		this.word = word;
		this.vnMean = vnMean;
	}

	public String getWord() {
		return word;
	}

	public String getVnMean() {
		return vnMean;
	}

	public boolean equals(Word word) {
		// TODO Auto-generated method stub
		return this.word.equalsIgnoreCase(word.word);
	}

	public boolean equals(String word) {
		// TODO Auto-generated method stub
		return this.word.equalsIgnoreCase(word);
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", vnMean=" + vnMean + "]";
	}
	
	
}
