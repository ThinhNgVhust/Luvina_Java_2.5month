package com.thinhnv.ungdungtruyencuoi.quanlytruyencuoi.truyencuoi;

import java.util.ArrayList;
import java.util.List;

public class ChuDeTruyen {
	public static final int TIM_THEO_ID = 0;
	public static final int TIM_THEO_TEN = 1;
	private String maChuDe;
	private String tenChuDe;
	private List<TruyenCuoi> dsTruyen = new ArrayList<>();

	public ChuDeTruyen(String maChude, String tenChuDe) {
		this.maChuDe = maChude;
		this.tenChuDe = tenChuDe;
	}

	private TruyenCuoi timKiemTruyen(int kieuTimKiem, String value) {
		if (kieuTimKiem == TIM_THEO_ID) {
			for (int i = 0; i < dsTruyen.size(); i++) {
				TruyenCuoi truyenCuoi = this.dsTruyen.get(i);
				if (truyenCuoi.getMaId().equals(value)) {
					System.out.println("Tìm thầy truyện có mã " + value + " !");
					return truyenCuoi;
				}
			}
			System.out.println("Không tìm thấy truyện có mã " + value + "!_ Trả kết quả về null");
			return null;
		} else {
			for (int i = 0; i < dsTruyen.size(); i++) {
				TruyenCuoi truyenCuoi = this.dsTruyen.get(i);
				if (truyenCuoi.getTenTruyen().equals(value)) {
					System.out.println("Tìm thầy truyện có tên " + value + " !");
					return truyenCuoi;
				}
			}
			System.out.println("Không tìm thầy truyện có tên " + value + " !");
			return null;
		}
	}

	public TruyenCuoi timTruyenTheoTen(String name) {
		TruyenCuoi truyenCuoi = this.timKiemTruyen(TIM_THEO_TEN, name);
		return truyenCuoi;
	}

	public TruyenCuoi timTruyenTheoId(String id) {
		TruyenCuoi truyenCuoi = this.timKiemTruyen(TIM_THEO_ID, id);
		return truyenCuoi;
	}

	public void themTruyen(TruyenCuoi truyenCuoi) {
		String id = truyenCuoi.getMaId();
		String tenTruyen = truyenCuoi.getTenTruyen();
		for (int i = 0; i < this.dsTruyen.size(); i++) {
			if (this.dsTruyen.get(i).getMaId().equals(id) || this.dsTruyen.get(i).getTenTruyen().equals(tenTruyen)) {
				System.out.println("Không thể thêm được truyên do thông tin truyện thêm vào bị trùng!!!");
			}
		}
		this.dsTruyen.add(truyenCuoi);
		System.out.println(
				"Thêm truyện có tên " + truyenCuoi.getTenTruyen() + " thành công vào chủ đề: " + this.tenChuDe);
	}

	public void xoaTruyen(String maId) {
		for (int i = 0; i < dsTruyen.size(); i++) {
			if (dsTruyen.get(i).getMaId().equals(maId)) {
				dsTruyen.remove(i);
			}
		}
	}

//
	public void docTruyen(String maId) {
		TruyenCuoi truyenCuoi = this.timTruyenTheoId(maId);
		if (truyenCuoi != null) {
			truyenCuoi.docTruyen();
		}
	}

//
	public String getMaChuDe() {
		return maChuDe;
	}

	public String getTenChuDe() {
		return this.tenChuDe;
	}

	public void hienThiDanhSachTruyen() {
		System.out.println("\n");
		System.out.println("Danh sách truyện trong chủ đề " + this.tenChuDe);
		for (int i = 0; i < this.dsTruyen.size(); i++) {
			TruyenCuoi truyenCuoi = this.dsTruyen.get(i);
			System.out.println((i + 1) + " " + truyenCuoi);
		}
	}
}
