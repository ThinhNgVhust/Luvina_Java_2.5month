package com.thinhnv.googlephotoapp.quanlychude;

import java.util.ArrayList;

import com.thinhnv.googlephotoapp.quanlychude.chude.ChuDe;
import com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh.HinhAnh;

public class QuanLyChuDe {
	private ArrayList<ChuDe> dsChuDe;

	public QuanLyChuDe() {
		this.dsChuDe = new ArrayList<ChuDe>();
	}

	public void themChuDe(ChuDe chude) {
		if (this.dsChuDe.isEmpty()) {
			this.dsChuDe.add(chude);
			System.out.println("Thêm chủ đề " + chude.getTenChuDe() + " thành công");
		} else {
			if (isExist(chude.getIdChuDe()) != null) {
				System.out.println("Đã tồn tại chủ đề có id " + chude.getIdChuDe() + " không thêm được!");
			} else {
				this.dsChuDe.add(chude);
				System.out.println("Thêm chủ đề " + chude.getTenChuDe() + " thành công");
			}
		}
	}

	public void xoaAnh(String idChuDe, String idAnh) {
		if (this.isEmpty()) {
			System.out.println("Không xóa được do chưa có chủ đề nào trong danh sách");
			return;
		}
		ChuDe result = null;
		for (ChuDe chuDe : dsChuDe) {
			if (chuDe.getIdChuDe().equals(idChuDe)) {
				result = chuDe;
				break;
			}
		}
		if (result == null) {
			System.out.println("Không thấy chủ đề có mã id " + idChuDe + " không xoa được ảnh");
			return;
		} else {
			result.xoaAnh(idAnh);
		}
	}

	public void xoaChuDe(String idChuDe) {
		if (this.isEmpty()) {
			System.out.println("Không xóa được do chưa có chủ đề nào trong danh sách");
			return;
		}
		ChuDe chuDe = this.isExist(idChuDe);
		if (chuDe == null) {
			System.out.println("Không tồn tại chủ đề có mã id " + idChuDe + "nên không xóa được chủ đề!");
		} else {
			this.dsChuDe.remove(chuDe);
			System.out.println("Xóa chủ đề có id " + idChuDe + " thành công");
		}
	}

	public void themAnh(String idChuDe, HinhAnh hinhAnh) {
		if (this.isEmpty()) {
			System.out.println("Chưa có chủ đề nào trong danh sách, không thêm được ảnh");
			return;
		}
		ChuDe chuDe = this.isExist(idChuDe);
		if (chuDe == null) {
			System.out.println("Không tồn tại chủ đề có mã id " + idChuDe + " nên không thêm được ảnh");
		} else {
			chuDe.themAnh(hinhAnh);
		}
	}

	public ArrayList<ChuDe> timKiemChuDeTheoTen(String tenChuDe) {
		if (this.isEmpty()) {
			System.out.println("Chưa có chủ đề nào trong danh sách, không tìm kiếm được");
			return null;
		}
		int count = 0;
		ArrayList<ChuDe> result = new ArrayList<ChuDe>();
		for (ChuDe chuDe : this.dsChuDe) {
			if (chuDe.getTenChuDe().equals(tenChuDe)) {
				result.add(chuDe);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Không tìm thấy chủ đề có tên " + tenChuDe);
		} else {
			System.out.println("Tìm thấy " + count + "chủ đề có tên " + tenChuDe);
		}
		return result;
	}

	public ArrayList<HinhAnh> timKiemHinhAnhTrongChuDe(String idChuDe, String tenAnh) {
		if (this.isEmpty()) {
			System.out.println("Chưa có chủ đề nào trong danh sách, không thêm được ảnh");
			return null;
		}
		ArrayList<HinhAnh> result = new ArrayList<HinhAnh>();
		ChuDe chuDe = isExist(idChuDe);
		if (chuDe == null) {
			System.out.println("Không tìm thấy chủ đề có id " + idChuDe);
			return null;
		}
		ArrayList<HinhAnh> kq = chuDe.timKiemAnhTheoTen(tenAnh);
		if (kq == null)
			return null;
		result.addAll(kq);
		return result;
	}

	public ArrayList<HinhAnh> timKiemAnhTuongTu() {
		ArrayList<HinhAnh> result = new ArrayList<HinhAnh>();

		return result;
	}

	private ChuDe isExist(String id) {
		if (this.isEmpty()) {
			return null;
		}
		for (ChuDe chuDe : this.dsChuDe) {
			if (chuDe.getIdChuDe().equals(id)) {
				return chuDe;
			}
		}
		return null;
	}
	private boolean isEmpty() {
		return this.dsChuDe.size() == 0 ? true : false;
	}
}
