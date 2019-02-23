package com.thinhnv.matrixfun1app.matrixfun;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixFun {
	private int[][] arr;
	private ArrayList<Point> stackPoints = new ArrayList<Point>();

	public void init() {
		this.arr = new int[][] { { 1, 0, 1, 0, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 1 },
				{ 1, 1, 1, 0, 1, 1, 0, 1 }, { 1, 0, 0, 0, 1, 1, 1, 1 } };
		System.out.println("--------------------MatrixFun--------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(this.arr[i]));
		}
	}

	public void convertRowToInt() {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				result += this.arr[i][j] * Math.pow(2, (7 - j));
			}
			System.out.println("Hang " + (i + 1) + " " + result);
			result = 0;
		}
	}

	public void findBestColumn() {
		int result = 0;
		int sum = 0;
		int count = 0;
		int[] arrMaxCol = new int[8];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j || i == 7 - j) {
					continue;
				} else {
					sum += this.arr[j][i];
				}

			}
			if (result <= sum) {
				result = sum;
				arrMaxCol[count++] = i;
			}
			sum = 0;
		}
		System.out.println("------------Find best column------------");
		for (int i = 0; i < count; i++) {
			System.out.println(arrMaxCol[i] + " : " + result + " times");
		}

	}

	public void push(Point point) {
		this.stackPoints.add(point);
	}

	public Point pop() {
		int index = this.stackPoints.size();
		Point result = this.stackPoints.get(index - 1);
		this.stackPoints.remove(index - 1);
		return result;
	}

	public boolean isEmpty() {
		return this.stackPoints.isEmpty();
	}

	public int size() {
		return this.stackPoints.size();
	}

	public Point peek() {
		int index = this.stackPoints.size();
		Point result = this.stackPoints.get(index - 1);
//		this.stackPoints.remove(index - 1);
		return result;
	}

	public void findTheWays() {
		int stepX = 0;
		int stepY = 0;
		Point root = new Point(stepX, stepY);
		root.isVisited = true;
		root.nextRight = new Point(root.x, root.y + 1);
		root.nextDown = new Point(root.x + 1, root.y);
		this.push(root);
		while (this.size() != 15) {
			Point cur = this.peek();
			Point nextRight = cur.nextRight;
			Point nextDown = cur.nextDown;
			Point tmp = null;
			if (nextRight.isVisited == false && nextRight.data == 1) {
				nextRight.isVisited = true;
				tmp = nextRight;
				cur = tmp;
				cur.nextDown = new Point(cur.x + 1, cur.y);
				cur.nextRight = new Point(cur.y + 1, cur.x);
				this.push(cur);

			} else if (nextDown.isVisited == false && nextDown.data == 1) {
				nextDown.isVisited = true;
				tmp = nextDown;
				cur = tmp;
				cur.nextRight = new Point(cur.y + 1, cur.x);
				cur.nextDown = new Point(cur.x + 1, cur.y);
				cur.nextRight = new Point(cur.x, cur.y + 1);
				this.push(cur);

			} else {
				this.pop();
			}
			// neu nextRighgt co data ==1 va chua visit : vi sit va them vao ngan xep
			// neu nextDown co data ==1 va chua visit : vi sit va them vao ngan xep

		}

		System.out.println("\n\n");
		for (int i = 0; i < this.size(); i++) {
			System.out.print(this.stackPoints.get(i) + " - ");
		}
	}
}
