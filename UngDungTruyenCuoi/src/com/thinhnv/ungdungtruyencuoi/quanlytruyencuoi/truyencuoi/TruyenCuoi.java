package com.thinhnv.ungdungtruyencuoi.quanlytruyencuoi.truyencuoi;

public class TruyenCuoi {
	private String maId;
	private String tenTruyen;
	private String ngayXuatBan;
	private String noiDung;

	public TruyenCuoi() {
	};

	public TruyenCuoi(String maId, String tenTruyen, String ngayXuatBan, String noiDung) {
		this.maId = maId;
		this.tenTruyen = tenTruyen;
		this.ngayXuatBan = ngayXuatBan;
		this.noiDung = noiDung;
	}

	public String getMaId() {
		return maId;
	}

	public String getTenTruyen() {
		return tenTruyen;
	}

	public String getNoiDung() {
		return noiDung;
	}

	@Override
	public String toString() {
		return "\nTruyenCuoi [maId=" + maId + ", tenTruyen=" + tenTruyen + ", ngayXuatBan=" + ngayXuatBan + "]";
	}
	
	

}
