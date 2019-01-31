package com.thinhnv.caidatcacthuattoansapxep.thuattoansapxep;

public class SimpleSort {
	private int[] arr;
	private int size;

	public SimpleSort(int size) {
		this.size = size;
		this.arr = new int[size];
		for (int i = 0; i < this.size; i++) {
			arr[i] = (int) (Math.random() * size + 1);
		}
	}

	public void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private void swap(int index1, int index2) {
		int temp = this.arr[index1];
		this.arr[index1] = this.arr[index2];
		this.arr[index2] = temp;
	}

	public void bubbleSort() {
		// O(n^2 )- worst case
		int leng = arr.length;
		for (int i = 0; i < leng; i++) {
			for (int j = i; j < leng; j++) {
				if (arr[i] > arr[j]) {
					this.swap(i, j);
				}
			}
		}
	}

	public void selectionSort() {
		// O(n^2 ) faster than bubble sort, so much
		for (int i = 0; i < this.size; i++) {
			int minIndex = i;
			for (int j = minIndex + 1; j < this.size; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			swap(i, minIndex);
		}
	}

	public void insertionSort() {
		// O(n^2 ) faster than selection Sort- not too much
		int in, out;
		for ( out = 1; out < this.size; out++) {
			int temp = arr[out];
			in = out;
			while(in > 0 && arr[in-1] >= temp) {
				arr[in] = arr[in-1];
				--in;
			}
			arr[in] = temp;
		}
	}
}
