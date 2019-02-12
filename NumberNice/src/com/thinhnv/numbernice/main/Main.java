package com.thinhnv.numbernice.main;

import com.thinhnv.numbernice.numbernicemanager.NumberNice;

public class Main {
	public static void main(String[] args) {
		NumberNice nNice = new NumberNice(10);
		System.out.println("/------------------/");
		nNice.sortArr();
		nNice.maxOddNumber();
		nNice.maxSumLessThan50000();
	}
}
