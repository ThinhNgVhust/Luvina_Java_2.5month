package com.thinhnv.testunionfind;

import java.util.Scanner;

import edu.princeton.cs.algs4.UF;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("Nhap vao so N: ");
		int n = keyBoard.nextInt();
		keyBoard.nextLine();
		UF uf = new UF(n);
		int count = 0;
		while (count <= n) {
			int p = keyBoard.nextInt();
			keyBoard.nextLine();
			int q = keyBoard.nextInt();
			keyBoard.nextLine();
			if (!uf.connected(p, q)) {
				uf.union(p, q);
				System.out.println(p + " - " + q);
			}
			count++;

		}
		System.out.println("Has : " + uf.count() + " components.");
	}

}
