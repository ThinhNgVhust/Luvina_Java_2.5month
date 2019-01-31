package com.thinhnv.appsmarttext.main;

import com.thinhnv.appsmarttext.smarttext.SmartText;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartText smartText = new SmartText("    Alo tôi là thịnh đây các          bạn ơi     ");
		smartText.countOccurrence();
		smartText.trimExtra();
		smartText.xoaTiengViet();
		System.out.println("ễ".toUpperCase());

	}

}
