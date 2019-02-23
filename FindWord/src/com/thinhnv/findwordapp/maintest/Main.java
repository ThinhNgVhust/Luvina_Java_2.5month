package com.thinhnv.findwordapp.maintest;

import com.thinhnv.findwordgapp.findword.FindWord;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindWord findWord = new FindWord("Lap trinh huong doi tuong");
		FindWord findWord1 = new FindWord("an na");

		System.out.println("\n\n----------------Test case 1---------------");
		System.out.println(findWord.sortUpEachWord());
		System.out.println(findWord.deleteLetterAppearMax());
		System.out.println("\n\n----------------Test case 2---------------");
		System.out.println(findWord1.sortUpEachWord());
		;
		System.out.println(findWord1.deleteLetterAppearMax());
	}

}
