package com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh;

public class AnhCayCo extends HinhAnh {
	private String tenGoi;
	private String congDung;

	public AnhCayCo(String idChuDe, String idHinhAnh, String tenHinhAnh, String duongDan, String kichThuoc,
			String tenGoi, String congDung) {
		super(idChuDe, idHinhAnh, tenHinhAnh, duongDan, kichThuoc);
		this.tenGoi = tenGoi;
		this.congDung = congDung;
	}

	public String getTenGoi() {
		return this.tenGoi;
	}

	public void inTT() {
		System.out.println("\n----------Thông tin ảnh cây cỏ----------");
		System.out.println("Tên gọi:" + this.tenGoi);
		System.out.println("Công dụng :" + this.congDung);
		super.inTT();
		System.out.println("-----------------------------------------\n");
	}

	@Override
	public void xemAnh() {
		// TODO Auto-generated method stub
		System.out.println("\n----------Xem hình ảnh----------");
		System.out.println("Tên gọi:" + this.tenGoi);
		System.out.println("Công dụng :" + this.congDung);
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
		String sFind = ((AnhCayCo)hinhAnh).getTenGoi();
		sFind = sFind.toLowerCase();
		String gio = cacKyTu(sFind);
		String tenGoi = this.tenGoi.toLowerCase();
		int count = 0;
		for (int i = 0; i <tenGoi.length() ; i++) {
			if(gio.contains(tenGoi.charAt(i)+"")) {
				count++;
			}
		}
		return count;
	}
}
