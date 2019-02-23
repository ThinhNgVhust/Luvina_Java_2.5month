package com.thinhnv.gamehoctienganh.main;

import com.thinhnv.gamehoctienganh.wordmanager.WordManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordManager wordManager = new WordManager("Thể Thao");
		wordManager.addWord("Thể thao", "Sport");
		wordManager.addWord("BÓng đá", "Soccer");
		wordManager.addWord("Bóng ", "Football");
		wordManager.addWord("Cái chân", "Leg");
		wordManager.addWord("Hậu vệ", "Defender");
		wordManager.inTT();
		System.out.println("\n");
		wordManager.remove("Leg");
		wordManager.inTT();
		wordManager.getTwoWordRandom();
	}

}
