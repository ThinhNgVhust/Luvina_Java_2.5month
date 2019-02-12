package com.thinhnv.matrixfunproject.matrixfun;

import java.util.Arrays;

public class MatrixFun {
	private int[][] arrInt;

	public void init() {

//		this.arrInt = new int[8][8];
//		for (int i = 0; i < 8; i++) {
//			for (int j = 0; j < 8; j++) {
//				this.arrInt[i][j] = (int) (Math.random() * 100 + 1);
//			}
//		}
		this.arrInt = new int[][] { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 7, 8, 2, 3, 6, 4, 3, 2 }, { 8, 9, 3, 2, 4, 3, 4, 9 },
				{ 0, 4, 7, 3, 4, 2, 3, 4 }, { 9, 8, 7, 4, 3, 2, 3, 8 }, { 8, 7, 3, 4, 3, 3, 2, 3 },
				{ 9, 7, 4, 5, 4, 1, 8, 3 }, { 9, 8, 4, 3, 7, 5, 9, 8 } };

	}

	public void findSecondMax() {
		int firstMax = this.arrInt[0][0];
		int secondMax = 0;
		for (int i = 0; i < this.arrInt.length; i++) {
			for (int j = 0; j < this.arrInt[0].length; j++) {
				if (firstMax < this.arrInt[i][j]) {
					secondMax = firstMax;
					firstMax = this.arrInt[i][j];
				}
				if (secondMax < this.arrInt[i][j] && this.arrInt[i][j] != firstMax) {
					secondMax = this.arrInt[i][j];
				}
			}
		}
		System.out.println("Sencond max element is: " + secondMax);
	}

	public void findthMax() {
		int firstMax = this.arrInt[0][0];
		int secondMax = 0;
		int thirdMax = 0;
		int fourthMax = 0;
		for (int i = 0; i < this.arrInt.length; i++) {
			for (int j = 0; j < this.arrInt[0].length; j++) {
				if (secondMax < this.arrInt[i][j] && this.arrInt[i][j] != firstMax) {
					secondMax = this.arrInt[i][j];
				}
			}
		}
		for (int i = 0; i < this.arrInt.length; i++) {
			for (int j = 0; j < this.arrInt[0].length; j++) {
				if (thirdMax < this.arrInt[i][j] && this.arrInt[i][j] != firstMax && this.arrInt[i][j] != secondMax) {
					thirdMax = this.arrInt[i][j];
				}
			}
		}
		for (int i = 0; i < this.arrInt.length; i++) {
			for (int j = 0; j < this.arrInt[0].length; j++) {
				if (fourthMax < this.arrInt[i][j] && this.arrInt[i][j] != firstMax && this.arrInt[i][j] != secondMax
						&& this.arrInt[i][j] != thirdMax) {
					fourthMax = this.arrInt[i][j];
				}
			}
		}
		System.out.println("Sencond max element is: " + secondMax);
		System.out.println("3rd max element is: " + thirdMax);
		System.out.println("4th max element is: " + fourthMax);
	}

	public void calcSumArea() {
		System.out.println("\nSum of each area in this matrix");
		System.out.println("Sum of 1st Area:" + this.sumOfArea1());
		System.out.println("Sum of 2nd Area:" + this.sumOfArea2());
		System.out.println("Sum of 3rd Area:" + this.sumOfArea3());
		System.out.println("Sum of 4th Area:" + this.sumOfArea4());
	}

	private int sumOfArea1() {
		int sum = 0;
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 7 - i; j++) {
				sum += this.arrInt[i][j];
			}
		}
		return sum;
	}

	private int sumOfArea2() {
		int sum = 0;
		for (int j = 5; j <= 7; j++) {
			for (int i = 7 - j + 1; i < j; i++) {
				sum += this.arrInt[i][j];
			}
		}
		return sum;
	}

	private int sumOfArea3() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 5; i <= 7; i++) {
			for (int j = 7 - i + 1; j < i; j++) {
				sum += this.arrInt[i][j];
			}
		}
		return sum;
	}

	private int sumOfArea4() {
		int sum = 0;
		// TODO Auto-generated method stub
		for (int j = 0; j <= 2; j++) {
			for (int i = j + 1; i < 6 - j + 1; i++) {
				sum += this.arrInt[i][j];
			}
		}
		return sum;
	}

	public void calSumOfDiagonal() {
		System.out.println("Sum of left diagonal:" + this.sumOfLeft());
		System.out.println("Sum of right diagonal:" + this.sumOfRight());
	}

	private int sumOfRight() {
		int sum = 0;
		for (int i = 0; i < arrInt.length; i++) {
			sum += this.arrInt[i][i];
		}
		// TODO Auto-generated method stub
		return sum;
	}

	private int sumOfLeft() {
		int sum = 0;
		// TODO Auto-generated method stub
		for (int i = 0; i < arrInt.length; i++) {
			sum += this.arrInt[i][7 - i];
		}
		return sum;
	}

	public void calSumOfSquares() {
		int vitri = 0;
		System.out.println("Tong cac phan tu tren hinh vuong thu nhat:" + this.sum(vitri + 1));
		System.out.println("Tong cac phan tu tren hinh vuong thu hai:" + this.sum(vitri + 2));
		System.out.println("Tong cac phan tu tren hinh vuong thu ba:" + this.sum(vitri + 3));
		System.out.println("Tong cac phan tu tren hinh vuong thu tu:" + this.sum(vitri + 4));

	}

	private int sum(int number) {
		int kq = 0;
		int index = number - 1;
		for (int i = index; i < arrInt.length - index; i++) {
			for (int j = index; j < arrInt.length - index; j++) {
				if (i == index || i == 7 - index) {
					kq += this.arrInt[i][j];
				} else if (j == index || j == 7 - index) {
					kq += this.arrInt[i][j];
				}

			}

		}
		return kq;
	}

	public void findBestElement() {
		int[] countArr = new int[10];// 0 9 8 7 6 5 4 3 2 1
		for (int i = 0; i < arrInt.length; i++) {
			for (int j = 0; j < this.arrInt[0].length; j++) {
				countArr[this.arrInt[i][j]]++;
				if (this.arrInt[i][j] == 3) {
				}
			}
		}
		int max = 0;
		int element = 0;
		for (int i = 0; i < countArr.length; i++) {
			if (max < countArr[i]) {
				{
					max = countArr[i];
					element = i;
				}
			}
		}
		System.out.println("\nPhan tu xuat hien nhieu nhat la " + element + " voi so lan: " + max);
	}
}
