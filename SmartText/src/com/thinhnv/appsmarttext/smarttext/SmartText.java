package com.thinhnv.appsmarttext.smarttext;

public class SmartText {
	private String text;

	public SmartText(String text) {
		this.text = text;
	}

	public void sortText() {
		// sap xep
		// in ra theo thu tu giam dan

		// su dung QuickSort
		char[] charArr = this.text.toCharArray();
		int nElements = this.text.length();
		quickSort(charArr, 0, nElements - 1);
		// in ra thu tu sap xep
		int len = charArr.length;
		System.out.println("Chuoi sap xep: ");
		for (int i = 0; i < len; i++) {
			System.out.print(charArr[i] + " ");
		}
	}

	private void quickSort(char arr[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	private int partition(char arr[], int low, int high) {
		char pivot = arr[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		char temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public void countOccurrence() {
		// dem va in ra so lan xuat hien ki tu trong chuoi
		int length = this.text.length();
		boolean[] mark = new boolean[length];
		int[] ghiNhan = new int[length];
		char[] kyTu = new char[length];

		for (int i = 0; i < length; i++) {
			mark[i] = true;// not mark yet
		}
		for (int i = 0; i < length; i++) {
			char c = this.text.charAt(i);
			int count = 0;
			if (mark[i] == true) {
				count++;
				for (int j = i + 1; j < length; j++) {
					if ((this.text.charAt(j) == c) && (mark[j] == true)) {
						count++;
						mark[j] = false;
					}
					ghiNhan[i] = count;
					kyTu[i] = c;
				}
			}
		}
		for (int i = 0; i < length; i++) {
			if (mark[i] == true) {
				if (kyTu[i] == ' ') {
					System.out.println("Dấu cách: " + ghiNhan[i]);
					continue;
				}
				System.out.println(kyTu[i] + ": " + ghiNhan[i]);
			}
		}

	}

	public void trimExtra() {
		// xoa cac ky tu dau cach thua
		String luuGiu = "";
		String tmpStr = this.text.trim();
		String nameWithProperSpacing = tmpStr.replaceAll("\\s+", " ");
		System.out.println(nameWithProperSpacing);
	}

	public void xoaTiengViet() {
		final String UNICODEA = "áàạảãăắằặẵặẳâấầậẫẩ";
		final String UNICODEE = "èéẻẽẹếêềểễệ";
		final String UNICODEO = "ốồộỗộớờởỡôơ";  
		final String UNICODEU = "úùủũụứừửữự";
		final String UNICODEI = "íìĩịỉ";
		String luuGiu = "";
		for (int i = 0; i < this.text.length(); i++) {
			char c = this.text.charAt(i);
			for (int j = 0; j < UNICODEA.length(); j++) {
				if (c == UNICODEA.charAt(j)) {
					c = 'a';
				}
			}
			for (int j = 0; j < UNICODEE.length(); j++) {
				if (c == UNICODEE.charAt(j)) {
					c = 'e';
				}
			}
			for (int j = 0; j < UNICODEU.length(); j++) {
				if (c == UNICODEU.charAt(j)) {
					c = 'u';
				}
			}
			for (int j = 0; j < UNICODEI.length(); j++) {
				if (c == UNICODEI.charAt(j)) {
					c = 'i';
				}
			}
			for (int j = 0; j < UNICODEO.length(); j++) {
				if (c == UNICODEO.charAt(j)) {
					c = 'o';
				}
			}
			luuGiu += c;
		}
		System.out.println("Ket qua: " + luuGiu);
	}

}
