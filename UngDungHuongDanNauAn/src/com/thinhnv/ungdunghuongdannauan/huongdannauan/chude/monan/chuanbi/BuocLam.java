package com.thinhnv.ungdunghuongdannauan.huongdannauan.chude.monan.chuanbi;

public class BuocLam {
	private String noiDungCheBien;
	private String thoiGianCheBien;
	private String ketQuaDatDuoc;
	private String ghiChu;
	private String amThanhHoanThanhThoiGianCheBien;
	private boolean xacNhanHoanThanhBuocCheBien;

	public BuocLam(String noiDungCheBien, String thoiGianCheBien, String ketQuaDatDuoc, String ghiChu,
			String amThanhHoanThanhThoiGianCheBien) {
		this.noiDungCheBien = noiDungCheBien;
		this.thoiGianCheBien = thoiGianCheBien;
		this.ketQuaDatDuoc = ketQuaDatDuoc;
		this.ghiChu = ghiChu;
		this.amThanhHoanThanhThoiGianCheBien = amThanhHoanThanhThoiGianCheBien;
	}

	public String getNoiDungCheBien() {
		return noiDungCheBien;
	}

	public void setNoiDungCheBien(String noiDungCheBien) {
		this.noiDungCheBien = noiDungCheBien;
	}

	public String getThoiGianCheBien() {
		return thoiGianCheBien;
	}

	public void setThoiGianCheBien(String thoiGianCheBien) {
		this.thoiGianCheBien = thoiGianCheBien;
	}

	public String getKetQuaDatDuoc() {
		return ketQuaDatDuoc;
	}

	public void setKetQuaDatDuoc(String ketQuaDatDuoc) {
		this.ketQuaDatDuoc = ketQuaDatDuoc;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public String getAmThanhHoanThanhThoiGianCheBien() {
		return amThanhHoanThanhThoiGianCheBien;
	}

	public void setAmThanhHoanThanhThoiGianCheBien(String amThanhHoanThanhThoiGianCheBien) {
		this.amThanhHoanThanhThoiGianCheBien = amThanhHoanThanhThoiGianCheBien;
	}

	public boolean isXacNhanHoanThanhBuocCheBien() {
		return xacNhanHoanThanhBuocCheBien;
	}

	public void setXacNhanHoanThanhBuocCheBien(boolean xacNhanHoanThanhBuocCheBien) {
		this.xacNhanHoanThanhBuocCheBien = xacNhanHoanThanhBuocCheBien;
	}
	

}
