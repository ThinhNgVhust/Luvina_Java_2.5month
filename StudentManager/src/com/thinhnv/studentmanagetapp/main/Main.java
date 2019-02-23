package com.thinhnv.studentmanagetapp.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.thinhnv.studentmanagetapp.studentmanager.StudentManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StudentManager sManager = new StudentManager();
//		sManager.printList();
//		sManager.sortByNameAscScoreDes();
//		sManager.printList();
//		int arrInt[] = new int[] { 1, 2, 3, 4, 5, 6 };
//		int newArrInt[] = Arrays.copyOfRange(arrInt, 1, 1);
//		System.out.println(Arrays.toString(newArrInt));
//		String str = "Booo Dep Trai";
//		String[] str1 = str.split("o");
//		int size = str1.length;
//		for (int i = 0; i < str1.length; i++) {
//			if(str1[i] == null) {
//				System.out.println("null");
//			}else if(str1[i]!=null){
//				System.out.println("Thinh" + str1[i]);
//			}
//		}
		List<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(1);
		listInteger.add(2);
		listInteger.add(4);
		listInteger.add(5);
		listInteger.add(8);
		listInteger.add(9);
	
		System.out.println(Collections.min(listInteger));
		System.out.println(Collections.max(listInteger));
		Collections.shuffle(listInteger);
		System.out.println(listInteger);
	}

}
