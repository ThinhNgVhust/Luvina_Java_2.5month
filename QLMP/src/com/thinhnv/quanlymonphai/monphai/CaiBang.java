package com.thinhnv.quanlymonphai.monphai;

import com.thinhnv.quanlymonphai.kynang.KyNang;

public class CaiBang extends MonPhai {

	public CaiBang(String tenMonPhai, String tenTruongMon, KyNang kyNang, String noiO, String monQuy, String moTa) {
		super(tenMonPhai, tenTruongMon, kyNang, noiO, monQuy, moTa);
		// TODO Auto-generated constructor stub
	}

	public void inTT() {
		super.inTT();
	}

	public void anXin() {
		System.out.println("Di an xin");
	}

	public void luyenCong() {
		System.out.println("Da cau bong phap");
		this.kyNang.inTT();

	}

	public void anUong() {
		System.out.println("An xin o moi noi");
	}
}
