package com.thinhnv.findwordgapp.findword;

public class FindWord {
	private String text;

	public FindWord(String text) {
		this.text = text;
		System.out.println(this.text);
		System.out.println("-------------------------------------------------------\n");
	}

	public String sortUpEachWord() {
		if (this.text.length() <= 1) {
			System.out.println("Khong sap xep duoc do chuoi cho do dai < 2");
		}
		System.out.println("Ket qua la:");
		String kq = "";
		String tmpStr = this.text + " ";
		String gio = "";
		int length = tmpStr.length();
		for (int i = 0; i < length; i++) {
			char kyTu = tmpStr.charAt(i);
			if (kyTu != ' ') {
				gio += kyTu;
			} else if (gio != "") {
				kq += sort(gio) + " ";
				gio = "";
			}
		}
		return kq;
	}

	private String sort(String gio) {
		// TODO Auto-generated method stub
		String kq = "";
		for (int i = 0; i < gio.length(); i++) {
			char kyTu1 = gio.charAt(i);
			char minChar = kyTu1;
			for (int j = i + 1; j < gio.length(); j++) {
				char kyTu2 = gio.charAt(j);
				minChar = this.minOfChars(minChar, kyTu2);
			}
			kq += minChar;
			int index = gio.indexOf(minChar + "");
			String sub1 = gio.substring(0, index);
			String sub2 = gio.substring(index + 1);
			gio = sub1 + sub2;
			i = -1;
		}
		return kq;
	}

	private char minOfChars(char kyTu1, char kyTu2) {
		// TODO Auto-generated method stub
		return kyTu1 > kyTu2 ? kyTu2 : kyTu1;
	}

	public String deleteLetterAppearMax() {
		System.out.println("----------------------------------------------");
		String kq = "";
		String tmpStr = this.text;
		int maxChars = 0;
		for (int i = 0; i < tmpStr.length(); i++) {
			char kyTu = tmpStr.charAt(i);
			if (kyTu == ' ') {
				continue;
			}
			int countChar = count(kyTu, tmpStr);
			if (maxChars < countChar) {
				maxChars = countChar;
			}
		}
		String strContainsMaxChars = "";
		for (int i = 0; i < tmpStr.length(); i++) {
			char kyTu = tmpStr.charAt(i);
			if (kyTu != ' ') {
				String s = kyTu + "";
				if ((isMaxChar(kyTu, tmpStr, maxChars) && !strContainsMaxChars.contains(s))) {
					strContainsMaxChars += kyTu;
				}
			}

		}
		System.out.println(
				"Cac ky tu xuat hien nhieu nhat: [" + strContainsMaxChars + "] xuat hien " + maxChars + " lan");
		// thuc hien xoa cac tu chua cac ky tu max
		tmpStr = tmpStr + " ";
		String gio = "";
		for (int i = 0; i < tmpStr.length(); i++) {
			char kyTu = tmpStr.charAt(i);
			if (kyTu != ' ') {
				gio += kyTu;
			} else if (gio != "") {
				if (hasMaxChars(gio, strContainsMaxChars)) {
					gio = "";
				} else {
					kq += gio + " ";
					gio = "";
				}
			}
		}
//		System.out.println(kq);
		System.out.println("Chuoi sau khi thuc hien deleteLetterAppearMax():");
		return kq;
	}

	private boolean hasMaxChars(String gio, String strContainsMaxChars) {
		// TODO Auto-generated method stub
		for (int i = 0; i < gio.length(); i++) {
			char kyTu = gio.charAt(i);
			for (int j = 0; j < strContainsMaxChars.length(); j++) {
				char kyTu1 = strContainsMaxChars.charAt(j);
				if (kyTu == kyTu1) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isMaxChar(char kyTu, String tmpStr, int maxChars) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < tmpStr.length(); i++) {
			if (kyTu == tmpStr.charAt(i)) {
				count++;
			}
		}
		if (count == maxChars) {
			return true;
		}
		return false;
	}

	private int count(char kyTu, String tmpStr) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < tmpStr.length(); i++) {
			if (kyTu == tmpStr.charAt(i)) {
				++count;
			}
		}
		return count;
	}
}
