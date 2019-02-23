package com.thinhnv.thal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HocSinh hs1 = new HocSinh("Thanh", 90);
		HocSinh hs2 = new HocSinh("Thinh", 92);
		HocSinh hs3 = new HocSinh("Phuong", 95);
		List listHocList = new ArrayList<>();
		listHocList.add(hs1);
		listHocList.add(hs2);
		listHocList.add(hs3);
		listHocList.add(hs2);
		listHocList.add(hs1);
		List<HocSinh> delList = new ArrayList<HocSinh>();
		delList.add(new HocSinh("Thanh"));
		delList.add(new HocSinh("Thinh"));
		listHocList.removeAll(delList);
		Comparator<HocSinh> tcNameDes = new Comparator<HocSinh>() {

			@Override
			public int compare(HocSinh o1, HocSinh o2) {
				// TODO Auto-generated method stub
				return -o1.getName().compareTo(o2.getName());
			}
		};
		listHocList.sort(tcNameDes);
//		System.out.println(listHocList);
		HocSinh[] lsHs = new HocSinh[listHocList.size()];
		listHocList.toArray(lsHs);
		System.out.println(Arrays.toString(lsHs));
	}

}
