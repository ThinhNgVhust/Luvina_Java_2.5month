//Made by ThinhNgV CDT_BKHN_59
//contact: thinhbka.nguyenvan@gmail.com
package com.thinhnv.array;

public class ArrayStructure {
	private double[] arr; // ref to array
	private int nElements; // number of elements

	// -----------------------------------

	public ArrayStructure(int size) {
		arr = new double[size]; // creat the array
		this.nElements = 0;// no items yet
	}

	// -----------find elements--------------
	public boolean find(double searchKey) {
		for (int i = 0; i < this.nElements; i++) {
			if (this.arr[i] == searchKey) {
				return true;
			}
		}
		return false;
	}

	// -----------insert elements-------------
	public void inseart(double value) {
		if (this.nElements == arr.length) {
			return;
		}
		arr[this.nElements] = value;
		this.nElements++;
	}

	// -------------delete element--------------
	public void delete(double value) {
		for (int i = 0; i < this.nElements; i++) {
			if (arr[i] == value) {
				for (int j = i; j < this.nElements; j++) {
					arr[j] = arr[j + 1];
				}
				this.nElements--;
			}
		}
	}

	// -------------display the arr --------------------
	public void display() {
		for (int i = 0; i < this.nElements; i++) {
			System.out.println("Phan tu thu " + (i + 1) + ": " + arr[i]);
		}
	}

	public void sortFromLowToHigh() {
		// low sort, buble sort only
		for (int i = 0; i < this.nElements; i++) {
			for (int j = i + 1; j < this.nElements; j++) {
				if (arr[i] > arr[j]) {
					double temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public void sortFormHighToLow() {
		for (int i = 0; i < this.nElements; i++) {
			for (int j = i + 1; j < this.nElements; j++) {
				if (arr[i] < arr[j]) {
					double temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public boolean binarySearch(double searchKey) {
		// onlu use when we have ordered arr, turns out we must call the method
		// sortFromLowToHigh first
		int low = 0;
		int high = this.nElements - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == searchKey) {
				return true;
			} else if (searchKey > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return false;
	}
}
