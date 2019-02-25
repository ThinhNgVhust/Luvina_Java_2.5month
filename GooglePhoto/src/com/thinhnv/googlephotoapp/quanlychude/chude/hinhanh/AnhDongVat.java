package com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh;

import java.util.Comparator;

import com.thinhnv.googlephotoapp.itimkiem.ITimKiemXeTuongTu;

public class AnhDongVat extends HinhAnh {
	private String tenGoi;
	private String noiSong;
	private String tiengKeu;

	public AnhDongVat(String idChuDe, String idHinhAnh, String tenHinhAnh, String duongDan, String kichThuoc,
			String tenGoi, String noiSong, String tiengKeu) {
		super(idChuDe, idHinhAnh, tenHinhAnh, duongDan, kichThuoc);
		this.tenGoi = tenGoi;
		this.noiSong = noiSong;
		this.tiengKeu = tiengKeu;
	}

	public AnhDongVat(String tenGoi) {

		this.tenGoi = tenGoi;
	}

	public void phatAmThanh() {
		System.out.println("Con " + this.tenGoi + " kêu: " + "\"" + this.tiengKeu + "\"");
	}

	public void inTT() {
		System.out.println("\n----------Thông tin ảnh động vật----------");
		System.out.println("Tên gọi:" + this.tenGoi);
		System.out.println("Nơi sống :" + this.noiSong);
		System.out.println("Tiếng kêu:" + this.tiengKeu);
		super.inTT();
		System.out.println("-----------------------------------------\n");
	}

	@Override
	public void xemAnh() {
		// TODO Auto-generated method stub
		System.out.println("\n----------Xem hình ảnh----------");
		System.out.println("Tên gọi:" + this.tenGoi);
		System.out.println("Nơi sống :" + this.noiSong);
		System.out.println("Tiếng kêu:" + this.tiengKeu);
		System.out.println("Mã chủ đề: " + this.idChuDe);
		System.out.println("Mã hình ảnh: " + this.idHinhAnh);
		System.out.println("Tên hình ảnh: " + this.tenHinhAnh);
		System.out.println("Dường dẫn: " + this.duongDan);
		System.out.println("Kích thước ảnh: " + this.kichThuoc);
		System.out.println("----------Kết thúc----------");
	}

	public String getTenGoi() {
		return this.tenGoi;
	}

	public int timKiemTuongTu(HinhAnh hinhAnh) {
		// TODO Auto-generated method stub
		String sFind = ((AnhDongVat) hinhAnh).getTenGoi();
		sFind = sFind.toLowerCase();
		String gio = cacKyTu(sFind);
		String tenGoi = this.tenGoi.toLowerCase();
		int count = 0;
		for (int i = 0; i < tenGoi.length(); i++) {
			if (gio.contains(tenGoi.charAt(i) + "")) {
				count++;
			}
		}
		return count;
	}
}
