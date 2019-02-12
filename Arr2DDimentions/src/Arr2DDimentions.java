import java.util.Arrays;

public class Arr2DDimentions {
	private int arr2D[][];

	public Arr2DDimentions() {
		this.arr2D = new int[][] { { 1, 2, 3, 4, 2 }, { 1, 4, 3, 2, 5 }, { 1, 2, 5, 4, 3 }, { 2, 4, 1, 3, 5 } };
	}

	public void duyet() {
		int arr[] = new int[arr2D.length];
		for (int i = 0; i < arr2D.length; i++) {
			int tmp[] = this.arr2D[i];
			int sum = 0;
			arr[i] = sumOfElements(tmp);
			System.err.println("Sum of row " + (i + 1) + " " + arr[i]);
		}

	}

	private int sumOfElements(int[] tmp) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < tmp.length; i++) {
			sum += tmp[i];
		}
		return sum;
	}

	public void printEvenNumbers() {
		System.out.println("\nList of even numbers:");
		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D[0].length; j++) {
				if (this.arr2D[i][j] % 2 == 0) {
					System.out.println(this.arr2D[i][j] + " ");
				}
			}
		}
	}

	public void sumOfCols() {
		System.out.println("Sum of elements");
		for (int j = 0; j < arr2D[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < arr2D.length; i++) {
				sum += this.arr2D[i][j];
			}
			System.out.println("Sum of " + (j + 1) + "th column is: " + sum);
		}
	}

	public void sortRows() {
		for (int i = 0; i < arr2D.length; i++) {
			arr2D[i] = selectionSort(arr2D[i]);
		}
		this.inTT();
	}

	public void inTT() {
		for (int i = 0; i < arr2D.length; i++) {
			System.out.println(Arrays.toString(arr2D[i]));
		}
	}

	private int[] selectionSort(int[] value) {
		// TODO Auto-generated method stub
		for (int i = 0; i < value.length; i++) {
			int maxPos = findMaxPos(i, value);
			swap(value, i, maxPos);
		}
		return value;
	}

	private void swap(int[] value, int i, int maxPos) {
		// TODO Auto-generated method stub
		int tmp = value[i];
		value[i] = value[maxPos];
		value[maxPos] = tmp;
	}

	private int findMaxPos(int i, int[] value) {
		// TODO Auto-generated method stub
		int maxPos = i;
		for (int j = i + 1; j < value.length; j++) {
			if (value[j] > value[maxPos]) {
				maxPos = j;
			}
		}
		return maxPos;
	}

}
