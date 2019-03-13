package com.thinhnv.uihoctienganhapp.logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class WordManager {
	private ArrayList<Word> listWord;
	String filePath;

	public WordManager(String filePath) {
		this.listWord = new ArrayList<Word>();
		this.filePath = filePath;

	}

	public void readFile() throws IOException {
		File file = new File(filePath);
		if (!file.exists()) {
			new File(file.getParent()).mkdirs();
			file.createNewFile();

		}
		FileInputStream fileIn = new FileInputStream(file);
		int kyTu = fileIn.read();
		String gio = "";
		while (kyTu != -1) {
			if (kyTu != 10) {
				gio += (char) kyTu;
			}
			if (kyTu == 10 && gio != "") {
				String[] word = gio.split(":");
				listWord.add(new Word(word[0], word[1]));
				gio = "";
			}
			kyTu = fileIn.read();
		}
	}

	public void WriteFile(String word, String mean) throws IOException {
		Word newWord = new Word(word, mean);
		if (this.listWord.indexOf(newWord) != -1) {
			throw new NumberFormatException("Từ này đã có trong thư viện");
		}
		File file = new File(filePath);
		if (!file.exists()) {
			new File(file.getParent()).mkdirs();
			file.createNewFile();

		}
		FileOutputStream fileOut = new FileOutputStream(file, true);
		String result = newWord.getWord() + ":" + newWord.getMean();
		for (int i = 0; i < result.length(); i++) {
			fileOut.write(result.charAt(i));
		}
		fileOut.write(10);
	}

	public ArrayList<Word> getListWord() {
		return this.listWord;
	}

	public boolean deleteWord(Word word) throws IOException {

		File file = new File(this.filePath);
		FileOutputStream fileOut = new FileOutputStream(file);
		boolean kq = this.listWord.remove(word);
		for (Word word2 : listWord) {
			String gio = word2.getWord() + ":" + word2.getMean();
			for (int i = 0; i < gio.length(); i++) {
				fileOut.write(gio.charAt(i));
			}
			fileOut.write(10);
		}
		return kq;

	}

}
