package com.thinhnv.ungdungtruyencuoi.quanlytruyencuoi;

import java.util.ArrayList;
import java.util.List;
import com.thinhnv.ungdungtruyencuoi.quanlytruyencuoi.truyencuoi.ChuDeTruyen;
import com.thinhnv.ungdungtruyencuoi.quanlytruyencuoi.truyencuoi.TruyenCuoi;

public class QuanLyTruyen {
	private List<ChuDeTruyen> dsChuDeTruyen = new ArrayList<>();

	public QuanLyTruyen() {
	}

	public void taoChuDe(ChuDeTruyen chuDeTruyen) {
		String maChuDe = chuDeTruyen.getMaChuDe();
		String tenChuDe = chuDeTruyen.getTenChuDe();
		for (int i = 0; i < dsChuDeTruyen.size(); i++) {
			if (dsChuDeTruyen.get(i).getMaChuDe().equals(maChuDe)
					|| dsChuDeTruyen.get(i).getTenChuDe().equals(tenChuDe)) {
				System.out.println("Không thêm được chủ đề mới do bị trùng tên hoặc mã chủ đề");
				return;
			}
		}
		this.dsChuDeTruyen.add(chuDeTruyen);
		System.out.println("Tạo chủ đề mới thành công");
	}

	public void xoaChuDe(String maChuDe) {
		for (int i = 0; i < this.dsChuDeTruyen.size(); i++) {
			ChuDeTruyen chuDeTruyen = this.dsChuDeTruyen.get(i);
			if (chuDeTruyen.getMaChuDe().equals(maChuDe)) {
				this.dsChuDeTruyen.remove(i);
				System.out.println("Xoa chủ đề chuyện có mã  " + maChuDe + " thành công");
				return;
			}
		}
		System.out.println("Không tồn tại chủ đề truyện có mã " + maChuDe + " nên không xóa được");
	}

	public ChuDeTruyen timKiemChuDeTheoMa(String maChuDe) {
		for (int i = 0; i < this.dsChuDeTruyen.size(); i++) {
			ChuDeTruyen chuDeTruyen = this.dsChuDeTruyen.get(i);
			if (chuDeTruyen.getMaChuDe().equals(maChuDe)) {
				System.out.println("Tìm thấy chủ đề truyện có mã: " + maChuDe);
				return chuDeTruyen;
			}
		}
		System.out.println("Khôngtìm thấy chủ đề truyện có mã: " + maChuDe + " kết quả trả về null");
		return null;
	}

	public void docTruyen(String maChuDe, String maTruyen) {
		ChuDeTruyen chuDeTruyen = this.timKiemChuDeTheoMa(maChuDe);
		if (chuDeTruyen != null) {
			TruyenCuoi truyenCuoi = chuDeTruyen.timTruyenTheoId(maTruyen);
			if (truyenCuoi != null) {
				truyenCuoi.docTruyen();
			}
		}
		return;
	}

	public void themTruyenVaoChuDe(String maChuDe, TruyenCuoi truyenCuoi) {
		ChuDeTruyen chuDeTruyen = this.timKiemChuDeTheoMa(maChuDe);
		if (chuDeTruyen != null) {
			chuDeTruyen.themTruyen(truyenCuoi);
		}
	}

	public void xoaTruyenVaoChuDe(String maChuDe, TruyenCuoi truyenCuoi) {
		String id = truyenCuoi.getMaId();
		ChuDeTruyen chuDeTruyen = this.timKiemChuDeTheoMa(maChuDe);
		if (chuDeTruyen != null) {
			chuDeTruyen.xoaTruyen(id);
		}
	}

	public void hienThiChuDeTruyen() {
		if (this.dsChuDeTruyen.size() == 0) {
			System.out.println("Chưa có chủ đề truyện nào");
			return;
		}
		System.out.println("Danh sách chủ đề truyện: ");
		for (int i = 0; i < this.dsChuDeTruyen.size(); i++) {
			ChuDeTruyen chuDeTruyen = this.dsChuDeTruyen.get(i);
			System.out.println(
					(i + 1) + " Mã chủ đề: " + chuDeTruyen.getMaChuDe() + " Tên chủ đề: " + chuDeTruyen.getTenChuDe());
			;
		}
	}
}
