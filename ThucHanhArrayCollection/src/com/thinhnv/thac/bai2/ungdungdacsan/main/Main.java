package com.thinhnv.thac.bai2.ungdungdacsan.main;

import com.thinhnv.thac.bai2.ungdungdacsan.menu.Menu;
import com.thinhnv.thac.bai2.ungdungdacsan.province.Province;
import com.thinhnv.thac.bai2.ungdungdacsan.tdbit.Tidbit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tidbit t1 = new Tidbit(1, "name", "description", "linkDetail", "linkIcon");
		Tidbit t2 = new Tidbit(2, "name", "description", "linkDetail", "linkIcon");
		Province p1 = new Province(1, "ha noi");
		p1.themDacSan(t1);
		p1.timKiemTheoTenMon("name");
		Menu menu = new Menu();
		menu.themTinh(1, "Hà nội");
		menu.themMonAn(1, t2);
		menu.themMonAn(2, t2);
		p1.timKiemTheoTenMon("NAME");
		menu.lietKeMonAnMotTinh(2);
	}

}
