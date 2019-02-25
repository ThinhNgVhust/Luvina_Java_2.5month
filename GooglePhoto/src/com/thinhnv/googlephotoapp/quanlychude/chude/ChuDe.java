package com.thinhnv.googlephotoapp.quanlychude.chude;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh.AnhCayCo;
import com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh.AnhDongVat;
import com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh.AnhSieuXe;
import com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh.HinhAnh;

public class ChuDe {
	private String idChuDe;
	private String tenChuDe;
	private String ngayTaoChuDe;
	public ArrayList<HinhAnh> dsHinhAnh;

	public String getIdChuDe() {
		return idChuDe;
	}

	public String getTenChuDe() {
		return tenChuDe;
	}

	public void setTenChuDe(String tenChuDe) {
		this.tenChuDe = tenChuDe;
	}

	public String getNgayTaoChuDe() {
		return ngayTaoChuDe;
	}

	public void setNgayTaoChuDe(String ngayTaoChuDe) {
		this.ngayTaoChuDe = ngayTaoChuDe;
	}

	public ChuDe(String idChuDe, String tenChuDe, String ngayTaoChuDe) {
		this.idChuDe = idChuDe;
		this.tenChuDe = tenChuDe;
		this.ngayTaoChuDe = ngayTaoChuDe;
		this.dsHinhAnh = new ArrayList<HinhAnh>();
	}

	public void themAnh(HinhAnh hinhAnh) {
		if (this.isEmpty()) {
			this.dsHinhAnh.add(hinhAnh);
			System.out.println("Thêm ảnh " + hinhAnh.getTenHinhAnh() + " .Id ảnh:" + hinhAnh.getIdHinhAnh()
					+ " thành công vào chủ đề " + this.tenChuDe);
			return;
		}
		if (this.dsHinhAnh.indexOf(hinhAnh) >= 0) {
//			System.out.println(this.dsHinhAnh.indexOf(hinhAnh));
			System.out.println("Đã tồn tại ảnh có id " + hinhAnh.getIdHinhAnh() + " trong chủ đề " + this.tenChuDe
					+ ".Không thêm được!");
		} else {
			this.dsHinhAnh.add(hinhAnh);
			System.out.println("Thêm ảnh " + hinhAnh.getTenHinhAnh() + " thành công vào chủ đề " + this.tenChuDe);
		}
	}

	public void xoaAnh(String idAnh) {
		if (this.isEmpty()) {
			System.out.println("Không xóa được ảnh do danh sách trống!");
		} else {
			HinhAnh hinhAnh = this.layAnh(idAnh);
			if (hinhAnh != null) {
				this.dsHinhAnh.remove(hinhAnh);
				System.out.println(
						"Xóa ảnh " + hinhAnh.getTenHinhAnh() + " trong chủ đề " + this.tenChuDe + " thành công");
			} else {
				System.out.println(
						"Không tồn tại ảnh có id " + idAnh + " trong chủ đề " + this.tenChuDe + " .Không xóa được");
			}
		}
	}

	public ArrayList<HinhAnh> timKiemAnhTheoTen(String tenAnh) {
		if (this.isEmpty()) {
			System.out.println("Không tìm được ảnh do danh sách trống!");
			return null;
		}
		ArrayList<HinhAnh> result = new ArrayList<HinhAnh>();
		int count = 0;
		for (HinhAnh hinhAnh : dsHinhAnh) {
			if (hinhAnh.getTenHinhAnh().equals(tenAnh)) {
				count++;
				result.add(hinhAnh);
			}

		}
		if (count == 0) {
			System.out.println("Không tìm thấy ảnh có tên " + tenAnh);
		} else {
			System.out.println("Tìm thấy " + count + "ảnh có tên " + tenAnh);
		}
		return result;
	}

	public void xemAnh(String idAnh) {
		if (this.isEmpty()) {
			System.out.println("Không xem được ảnh do danh sách trống!");
		} else {
			HinhAnh hinhAnh = this.layAnh(idAnh);
			if (hinhAnh != null) {
				hinhAnh.xemAnh();
			} else {
				System.out.println(
						"Không tồn tại ảnh có id " + idAnh + " trong chủ đề " + this.tenChuDe + " .Không xem được");
			}
		}
	}

	public List<HinhAnh> timKiemTuongTu(HinhAnh hinhAnh) {
		if (this.isEmpty()) {
			System.out.println("Không thực hiện tìm kiếm được do danh sách trống!");
			return null;
		}
		ArrayList<HinhAnh> result = new ArrayList<HinhAnh>();
		for (int i = 0; i < this.dsHinhAnh.size(); i++) {
			if (this.dsHinhAnh.get(i) instanceof AnhSieuXe) {
				if (this.dsHinhAnh.get(i).timKiemTuongTu(hinhAnh) <= 10) {
					result.add(this.dsHinhAnh.get(i));
				}
			} else if (this.dsHinhAnh.get(i) instanceof AnhCayCo) {
				if (this.dsHinhAnh.get(i).timKiemTuongTu(hinhAnh) > 3) {
					result.add(this.dsHinhAnh.get(i));
				}
			} else if (this.dsHinhAnh.get(i) instanceof AnhDongVat) {
				if (this.dsHinhAnh.get(i).timKiemTuongTu(hinhAnh) > 3) {
					result.add(this.dsHinhAnh.get(i));
				}
			}
		}
		if (result.size() == 0) {
			System.out.println("Khong tim duoc anh nao thoa man");
			return null;
		}
		Comparator<HinhAnh> tcSapXep = new Comparator<HinhAnh>() {

			@Override
			public int compare(HinhAnh o1, HinhAnh o2) {
				// TODO Auto-generated method stub
				if (o1 instanceof AnhSieuXe && o2 instanceof AnhSieuXe) {
					return ((AnhSieuXe) o2).timKiemTuongTu(hinhAnh) - ((AnhSieuXe) o1).timKiemTuongTu(hinhAnh);
				} else if (o1 instanceof AnhCayCo && o2 instanceof AnhCayCo) {
					return ((AnhCayCo) o2).timKiemTuongTu(hinhAnh) - ((AnhCayCo) o1).timKiemTuongTu(hinhAnh);
				} else {
					return ((AnhDongVat) o2).timKiemTuongTu(hinhAnh) - ((AnhDongVat) o1).timKiemTuongTu(hinhAnh);
				}
			}
		};
		result.sort(tcSapXep);
		if (result.size() <= 5) {
			return result;
		} else {
			List<HinhAnh> newResult = result.subList(0, 5);
			return  newResult;
		}

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof ChuDe) {
			return this.idChuDe.equals(((ChuDe) obj).idChuDe);
		}
		return super.equals(obj);
	}

	protected String laySoKyTu(String tenTimKiem) {
		// TODO Auto-generated method stub
		String gio = "";
		tenTimKiem = tenTimKiem.toLowerCase() + " ";
		for (int i = 0; i < tenTimKiem.length(); i++) {
			char kyTu = tenTimKiem.charAt(i);
			if (kyTu != ' ') {
				if (gio.contains(kyTu + "")) {
					continue;
				} else {
					gio += kyTu;
				}
			} else {
				continue;
			}
		}
		return gio;
	}

	private boolean isEmpty() {
		return this.dsHinhAnh.size() == 0 ? true : false;
	}

	private HinhAnh layAnh(String id) {
		if (this.isEmpty()) {
			return null;
		}
		for (HinhAnh hinhAnh : this.dsHinhAnh) {
			if (hinhAnh.getIdHinhAnh().equals(id)) {
				return hinhAnh;
			}
		}
		return null;
	}
}
