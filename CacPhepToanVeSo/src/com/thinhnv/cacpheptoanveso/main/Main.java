package com.thinhnv.cacpheptoanveso.main;

import com.thinhnv.cacpheptoanveso.cacpheptoan.CacPhepToanVeSo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CacPhepToanVeSo so = new CacPhepToanVeSo(10);
//		so.phanTichThuaSoNguyenTo();
//		System.out.println(so.getKQ());
		long startTime = System.currentTimeMillis();
		System.out.println(so.nthPrime(2000000));
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("He thong chay trong " + duration + " miliseconds");

	}

}
