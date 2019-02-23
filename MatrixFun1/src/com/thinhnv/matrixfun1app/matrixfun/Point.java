package com.thinhnv.matrixfun1app.matrixfun;

import java.util.Arrays;

public class Point {
	public int x;
	public int y;
	public int data;
	public Point nextRight;
	public Point nextDown;
	public boolean isVisited;
	public int[][] arr;

	public void init() {
		this.arr = new int[][] { { 1, 0, 1, 0, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 1 },
				{ 1, 1, 1, 0, 1, 1, 0, 1 }, { 1, 0, 0, 0, 1, 1, 1, 1 } };
	}

	public Point(int x, int y) {
		this.init();
		this.x = x;
		this.y = y;
		if (this.x > 7 || this.y > 7) {
			this.data = 0;
		} else {
			this.data = this.arr[x][y];
		}
		this.nextRight = null;
		this.nextDown = null;
		this.isVisited = false;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

}
