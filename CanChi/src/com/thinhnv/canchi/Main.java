package com.thinhnv.canchi;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		for (int i = 1900; i < Calendar.getInstance().get(Calendar.YEAR); i++) {
			CanChi year = new CanChi(i);
			System.out.println(i + " - " + year.getKQ());
		}
	}
}
