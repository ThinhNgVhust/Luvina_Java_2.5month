package com.thinhnv.quanlymonphai.monphai;

import com.thinhnv.quanlymonphai.kynang.KyNang;

public abstract class MonPhai {
	protected String tenMonPhai;
	protected String tenTruongMon;
	protected KyNang kyNang;
	protected String noiO;
	protected String monQuy;
	protected String moTa;

	protected MonPhai(String tenMonPhai, String tenTruongMon, KyNang kyNang, String noiO, String monQuy, String moTa) {
		this.tenMonPhai = tenMonPhai;
		this.tenTruongMon = tenTruongMon;
		this.kyNang = kyNang;
		this.noiO = noiO;
		this.monQuy = monQuy;
		this.moTa = moTa;
	}

	protected void inTT() {
		String thongTin = "MonPhai [tenMonPhai=" + tenMonPhai + ", tenTruongMon=" + tenTruongMon + ", " + kyNang
				+ ", noiO=" + noiO + ", monQuy=" + monQuy + ", moTa=" + moTa + "]";
		System.out.println(thongTin);
	}

	public void soTai(MonPhai monPhai2) {
		int satThuong = this.kyNang.getSatThuong() - monPhai2.kyNang.getSatThuong();
		if (satThuong > 0) {
			System.out.println("Mon phai " + this.tenMonPhai + " thang " + monPhai2.tenMonPhai);
		} else if (satThuong < 0) {
			System.out.println("Mon phai " + this.tenMonPhai + " thang " + monPhai2.tenMonPhai);
		} else {
			System.out.println("Hai mon phai hoa nhau");
		}
	}

	protected abstract void luyenCong();

	protected abstract void anUong();

}
