package com.thinhnv.todolist.logic;

public class Task {
	private int sTT;
	private String noiDung;
	private String thoiGian;
	private boolean xacNhan;

	public Task(int stt, String noiDung, String thoiGian) {
		this.noiDung = noiDung;
		this.thoiGian = thoiGian;
		this.xacNhan = false;
		this.sTT = stt;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public String getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}

	public boolean isXacNhan() {
		return xacNhan;
	}

	public void setXacNhan(boolean xacNhan) {
		this.xacNhan = xacNhan;
	}

	public void setSTT(int x) {
		this.sTT = x;
	}

	public String getSTT() {
		return this.sTT + "";
	}

}
