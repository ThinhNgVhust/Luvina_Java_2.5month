package com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh;

public class AnhSieuXe extends HinhAnh {
	private String tenXe;
	private String hangXe;
	private double giaTien;

	public AnhSieuXe(String idChuDe, String idHinhAnh, String tenHinhAnh, String duongDan, String kichThuoc,
			String tenXe, String hangXe, double giaTien) {
		super(idChuDe, idHinhAnh, tenHinhAnh, duongDan, kichThuoc);
		this.tenXe = tenXe;
		this.hangXe = hangXe;
		this.giaTien = giaTien;
	}

	public void inTT() {
		System.out.println("\n----------Thông tin ảnh siêu xe----------");
		System.out.println("Tên xe:" + this.tenXe);
		System.out.println("Hãng :" + this.hangXe);
		System.out.println("Giá tiền:" + this.giaTien);
		super.inTT();
		System.out.println("-----------------------------------------\n");
	}

	@Override
	public void xemAnh() {
		// TODO Auto-generated method stub
		System.out.println("\n----------Xem hình ảnh----------");
		System.out.println("Tên xe:" + this.tenXe);
		System.out.println("Hãng :" + this.hangXe);
		System.out.println("Giá tiền:" + this.giaTien);
		System.out.println("Mã chủ đề: " + this.idChuDe);
		System.out.println("Mã hình ảnh: " + this.idHinhAnh);
		System.out.println("Tên hình ảnh: " + this.tenHinhAnh);
		System.out.println("Dường dẫn: " + this.duongDan);
		System.out.println("Kích thước ảnh: " + this.kichThuoc);
		System.out.println("----------Kết thúc----------");

	}

	@Override
	public int timKiemTuongTu(HinhAnh hinhAnh) {
		// TODO Auto-generated method stub
		double gia1 = ((AnhSieuXe) (hinhAnh)).giaTien;
		double gia2 = this.giaTien;
		if(this.hangXe.equals(((AnhSieuXe) (hinhAnh)).hangXe)) {
			return 0;
		}else {
			return (int)((gia1 - gia2)*1000000000);
		}
	}

}
