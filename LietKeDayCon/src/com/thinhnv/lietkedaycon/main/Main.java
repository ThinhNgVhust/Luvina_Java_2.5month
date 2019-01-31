package com.thinhnv.lietkedaycon.main;

import com.thinhnv.lietkedaycon.daycon.DayCon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayCon dayCon = new DayCon("10                      10");
//		dayCon.inKQ();
		dayCon.xuLy();
		System.out.println("//-----------------------------------------//");
		dayCon = new DayCon("1 2 3 5 4 6 7 8 9 8 7 6 5 11 12 13 15 14 16 18 2 4 3 5 7 9 11 11 11 12 13 14 3 4 32 1 2");
//		dayCon.inKQ();
		dayCon.xuLy();
	}

}
