package com.thinhnv.appnotedacsan.dacsan;

public class DacSan {
	private String maDacSan;
	private String tenDacSan;
	private String gia;
	private String moTa;
	private String noiBan;
	private String nhanXet;

	public DacSan(String maDacSan, String tenDacSan, String gia, String moTa, String noiBan, String nhanXet) {
		this.maDacSan = maDacSan;
		this.tenDacSan = tenDacSan;
		this.gia = gia;
		this.moTa = moTa;
		this.noiBan = noiBan;
		this.nhanXet = nhanXet;
	}
//getters
	public String getMaDacSan() {
		return maDacSan;
	}

	public String getTenDacSan() {
		return tenDacSan;
	}

	public String getGia() {
		return gia;
	}

	public String getMoTa() {
		return moTa;
	}

	public String getNoiBan() {
		return noiBan;
	}

	public String getNhanXet() {
		return nhanXet;
	}

	//setters
	public void setTenDacSan(String tenDacSan) {
		this.tenDacSan = tenDacSan;
	}

	public void setGia(String gia) {
		this.gia = gia;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public void setNoiBan(String noiBan) {
		this.noiBan = noiBan;
	}

	public void setNhanXet(String nhanXet) {
		this.nhanXet = nhanXet;
	}
	
	@Override
	public String toString() {
		return "DacSan [maDacSan=" + maDacSan + ", tenDacSan=" + tenDacSan + ", gia=" + gia + ", moTa=" + moTa
				+ ", noiBan=" + noiBan + ", nhanXet=" + nhanXet + "]";
	}
	public void thongTinDacSan() {
		System.out.println(this);
	}
}
