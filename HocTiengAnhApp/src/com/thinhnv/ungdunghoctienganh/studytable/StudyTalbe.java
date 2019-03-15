package com.thinhnv.ungdunghoctienganh.studytable;

import java.util.ArrayList;

import com.thinhnv.ungdunghoctienganh.word.Word;

public class StudyTalbe {
	private int diemBai1, diemBai2, diemBai3;
	private ArrayList<Word> dsTuDaHoc;

	public StudyTalbe() {
	}

	public void addWord(String word, String mean) {
		String word1 = word;
		String mean1 = mean;
		Word word2 = new Word();
		word2.setTitle(word1);
		word2.setMean(mean1);
		this.dsTuDaHoc.add(word2);
	}

	public int getDiemBai1() {
		return diemBai1;
	}

	public void setDiemBai1(int diemBai1) {
		this.diemBai1 = diemBai1;
	}

	public int getDiemBai2() {
		return diemBai2;
	}

	public void setDiemBai2(int diemBai2) {
		this.diemBai2 = diemBai2;
	}

	public int getDiemBai3() {
		return diemBai3;
	}

	public void setDiemBai3(int diemBai3) {
		this.diemBai3 = diemBai3;
	}

	public ArrayList<Word> getDsTuDaHoc() {
		return dsTuDaHoc;
	}

	public void setDsTuDaHoc(ArrayList<Word> dsTuDaHoc) {
		this.dsTuDaHoc = dsTuDaHoc;
	}

}
