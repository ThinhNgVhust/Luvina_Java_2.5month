package com.thinhnv.songuyento;

public class SoNT {
	private int soNT;
	private String isPrime;

	public SoNT(int soNT) {
		this.soNT = soNT;
	}

	private boolean checkPrime() {
		double rootOfsoNT = Math.sqrt(this.soNT);
		if (this.soNT <= 2) {
			return true;
		}
		for (int i = 2; i*i <= rootOfsoNT; i++) {
			if (this.soNT % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void ketQua() {
		if (this.checkPrime()) {
			System.out.println(this.soNT);
		}
	}
}
