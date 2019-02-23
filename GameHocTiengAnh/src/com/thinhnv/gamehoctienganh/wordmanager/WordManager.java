package com.thinhnv.gamehoctienganh.wordmanager;

import java.util.ArrayList;
import java.util.Collections;

import com.thinhnv.gamehoctienganh.word.Word;

public class WordManager {
	private ArrayList<Word> listWord = new ArrayList<Word>();
	private String category;

	public WordManager(String category) {
		super();
		this.category = category;
	}

	public void addWord(String word, String vnMean) {
		Word tmpWord = new Word(word, vnMean);
		if (isExits(tmpWord)) {
			return;
		}
		this.listWord.add(tmpWord);
	}

	private boolean isExits(Word tmpWord) {
		// TODO Auto-generated method stub
		if (this.listWord.size() == 0)
			return false;
		for (int i = 0; i < this.listWord.size(); i++) {
			if (this.listWord.get(i).equals(tmpWord)) {
				return true;
			}
		}
		return false;
	}

	public Word[] getTwoWordRandom() {
		System.out.println("Get 2 random words");
		Word[] result = new Word[2];
		Collections.shuffle(listWord);
		result[0] = listWord.get(0);
		result[1] = listWord.get(1);
		System.out.println(result[0].getVnMean());
		System.out.println(result[1].getVnMean());
		return result;
	}

	public void remove(String word) {
		for (int i = 0; i < this.listWord.size(); i++) {
			if (this.listWord.get(i).equals(word)) {
				this.listWord.remove(i);
				--i;
			}
		}
	}

	public void inTT() {
		for (int i = 0; i < this.listWord.size(); i++) {
			System.out.println(listWord.get(i));
		}
	}
}
