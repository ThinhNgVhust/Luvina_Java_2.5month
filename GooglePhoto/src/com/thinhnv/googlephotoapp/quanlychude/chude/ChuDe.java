package com.thinhnv.googlephotoapp.quanlychude.chude;

import java.util.ArrayList;
import java.util.Collections;

import com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh.HinhAnh;

public class ChuDe {
	private String idChuDe;
	private String tenChuDe;
	private String ngayTao;
	private ArrayList<HinhAnh> dsAnh = new ArrayList<HinhAnh>();

	public ChuDe(String idChuDe, String tenChuDe, String ngayTao) {
		this.idChuDe = idChuDe;
		this.tenChuDe = tenChuDe;
		this.ngayTao = ngayTao;
	}

	public String getIdChuDe() {
		return this.idChuDe;
	}

	public void suaTen(String tenMoi) {
		this.tenChuDe = tenMoi;
	}

	public void suaNgayTao(String ngayTaoMoi) {
		this.ngayTao = ngayTaoMoi;
	}

	public void xoaAnh(String idAnh) {
		if (kiemTraRong()) {
			return;
		}
		for (int i = 0; i < this.dsAnh.size(); i++) {
			if (this.dsAnh.get(i).getIdHinhAnh().equals(idAnh)) {
				System.out.println("Xóa ảnh " + this.dsAnh.get(i).getTenHinhAnh() + " thành công");
				this.dsAnh.remove(i);
				return;
			}
		}
	}

	public void themAnh(HinhAnh hinhAnh) {
		if (this.kiemTraRong()) {
			this.dsAnh.add(hinhAnh);
			System.out.println("Thêm ảnh " + hinhAnh.getTenHinhAnh() + " thành công vào chủ đề "+ this.tenChuDe);
			return;
		}
		for (int i = 0; i < this.dsAnh.size(); i++) {
			if (this.dsAnh.get(i).getIdHinhAnh().equals(hinhAnh.getIdHinhAnh())) {
				System.out.println("Ảnh " + hinhAnh.getTenHinhAnh() + " đã tồn tại");
				return;
			}
		}
		this.dsAnh.add(hinhAnh);
		System.out.println("Thêm ảnh " + hinhAnh.getTenHinhAnh() + " thành công vào chủ đề " + this.tenChuDe);
	}

	public ArrayList<HinhAnh> timKiemAnh(String ten) {
		ArrayList<HinhAnh> result = new ArrayList<HinhAnh>();
		if (this.kiemTraRong()) {
			System.out.println("Danh sach chu de " + this.tenChuDe + " trong. Ket qua tra ve null");
			return null;
		}
		for (int i = 0; i < this.dsAnh.size(); i++) {
			HinhAnh hinhAnh = this.dsAnh.get(i);
			if (this.dsAnh.get(i).getTenHinhAnh().equalsIgnoreCase(ten)) {
				result.add(hinhAnh);
			}
		}
		if (result.size() == 0) {
			System.out.println("Không tìm thấy ảnh có tên " + ten + ". Trả về null");
			return null;
		}
		System.out.println("Tìm thấy " + result.size() + " kết quả!");
		return result;
	}

	public ArrayList<HinhAnh> danhSachHinhAnh() {
		ArrayList<HinhAnh> result = new ArrayList<HinhAnh>();
		if (this.kiemTraRong()) {
			System.out.println("Danh sách các ảnh trong chủ đề " + this.tenChuDe + " Trống. Trả về null");
			return null;
		}
		Collections.copy(result, this.dsAnh);
		return result;
	}

	public boolean khongPhaiTrongChuDe(HinhAnh hinhAnh) {
		if (this.kiemTraRong()) {
			return true;
		}
		for (int i = 0; i < this.dsAnh.size(); i++) {
			if (this.dsAnh.get(i).getIdHinhAnh().equals(hinhAnh.getIdHinhAnh()))
				return false;
		}
		return true;
	}

	public HinhAnh timAnhTheoId(String id) {
		if (this.kiemTraRong()) {
			System.out.println("Chu de rong");
			return null;
		}
		for (int i = 0; i < this.dsAnh.size(); i++) {
			if (this.dsAnh.get(i).getIdHinhAnh().equals(id)) {
				return this.dsAnh.get(i);
			}
		}
		return null;
	}

	private boolean kiemTraRong() {
		// TODO Auto-generated method stub
		int size = this.dsAnh.size();
		return size == 0 ? true : false;
	}

	public String getTenChuDe() {
		// TODO Auto-generated method stub
		return this.tenChuDe;
	}
}
