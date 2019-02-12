package com.thinhnv.quanlymonphai.monphai;

import com.thinhnv.quanlymonphai.kynang.KyNang;

public class VoDang extends MonPhai {
	public VoDang(String tenMonPhai, String tenTruongMon, KyNang kyNang, String noiO, String monQuy, String moTa) {
		super(tenMonPhai, tenTruongMon, kyNang, noiO, monQuy, moTa);
		// TODO Auto-generated constructor stub
	}

	public void inTT() {
		super.inTT();
	}

	public void giangDao() {
		System.out.println("Giang dao");
	}

	public void luyenCong() {
		System.out.println("Cai bang luyen cong");
		this.kyNang.inTT();

	}

	public void anUong() {
		System.out.println("An thit");
	}
}
