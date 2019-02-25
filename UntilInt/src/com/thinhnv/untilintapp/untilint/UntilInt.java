package com.thinhnv.untilintapp.untilint;

import java.util.Arrays;
import java.util.Scanner;

public class UntilInt {
	private int[] arrInt;

	public void init() {
		Scanner scKeyboard = new Scanner(System.in);
		String s = scKeyboard.nextLine();
		String[] arrS = s.split(" ");
		this.arrInt = new int[arrS.length];
		for (int i = 0; i < arrS.length; i++) {
			this.arrInt[i] = Integer.parseInt(arrS[i]);
		}
		System.out.println(Arrays.toString(this.arrInt));
	}

	public void maxMutiplesElements() {
		int max = 0;
		for (int i = 0; i < arrInt.length; i++) {
			if (this.arrInt[i] != 0) {
				int count = countMultiple(this.arrInt[i], i);
				max = max <= count ? count : max;
			}
		}
		String gio = "";
		for (int i = 0; i < arrInt.length; i++) {
			
			if (this.arrInt[i] == 0)
				continue;
			if (countMultiple(this.arrInt[i], i) == max && !gio.contains(this.arrInt[i] + "")) {
				gio += this.arrInt[i] + " ";
			}
		}
		System.out.println("Phan tu thoa man: " + gio);
	}

	private int countMultiple(int element, int index) {
		int count = 0;
		for (int i = 0; i < arrInt.length; i++) {
			if (i != index) {
				if (arrInt[i] % element == 0)
					++count;
			}
		}
		return count;
	}
}
