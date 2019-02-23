package com.thinhnv.ungdunghuongdannauan.huongdannauan.chude.monan.chuanbi;

public class NguyenLieu {
	private String tenThucPham;
	private int soLuong;
	private String donVi;
	private String xacNhanDaMua;

	public NguyenLieu(String tenThucPham, int soLuong, String donVi) {
		this.tenThucPham = tenThucPham;
		this.soLuong = soLuong;
		this.donVi = donVi;
		this.xacNhanDaMua = "chua mua";
	}

	public void xacNhanDaMua() {
		this.xacNhanDaMua = "da mua";
	}

	@Override
	public String toString() {
		return "NguyenLieu [tenThucPham: " + tenThucPham + ", soLuong: " + soLuong + ", donVi: " + donVi
				+ ", xacNhanDaMua: " + xacNhanDaMua + "]";
	}

	public boolean equals(NguyenLieu nguyenLieu) {
		// TODO Auto-generated method stub
		boolean dk1 = this.tenThucPham.equalsIgnoreCase(nguyenLieu.tenThucPham);
		boolean dk2 = this.soLuong == nguyenLieu.soLuong;
		boolean dk3 = this.donVi.equalsIgnoreCase(nguyenLieu.donVi);
		boolean dk4 = this.xacNhanDaMua.equals(nguyenLieu.xacNhanDaMua);
		return dk1 && dk2 && dk3 && dk4;
	}

}
