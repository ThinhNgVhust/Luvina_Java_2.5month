package com.thinhnv.quanlymonphai.monphai;

import com.thinhnv.quanlymonphai.kynang.KyNang;

public class ThieuLam extends MonPhai {
	public ThieuLam(String tenMonPhai, String tenTruongMon, KyNang kyNang, String noiO, String monQuy, String moTa) {
		super(tenMonPhai, tenTruongMon, kyNang, noiO, monQuy, moTa);
		// TODO Auto-generated constructor stub
	}

	public void inTT() {
		super.inTT();
	}

	public void tungKinh() {
		System.out.println("A di da phat");
	}

	public void luyenCong() {
		System.out.println("Ngoi thien");
		this.kyNang.inTT();

	}

	public void anUong() {
		System.out.println("An chay niem phat");
	}
}
