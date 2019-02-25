package com.thinhnv.thac.bai2.ungdungdacsan.menu;

import java.util.ArrayList;
import java.util.List;

import com.thinhnv.thac.bai2.ungdungdacsan.province.Province;
import com.thinhnv.thac.bai2.ungdungdacsan.tdbit.Tidbit;

public class Menu {
	List<Province> provinces = new ArrayList<Province>();

	public void themTinh(int maTinh, String tenTinh) {
		Province province = new Province(maTinh, tenTinh);
		if (this.provinces.indexOf(province) == -1) {
			this.provinces.add(province);
			System.out.println("Thêm tỉnh " + tenTinh + " thành công vào menu!");
		} else {
			System.out.println("Dã tồn tài tỉnh có mã :" + maTinh + " trong menu. Thêm thất bại!");
		}
	}

	public void xoaTinh(int id) {
		Province province = this.layTinh(id);
		if (this.provinces.indexOf(province) == -1) {
			this.provinces.remove(province);
			System.out.println("Xóa tỉnh có id " + province.getId() + " thành công trong menu!");
		} else {
			System.out.println("Dã tồn tài tỉnh có mã :" + id + " trong menu. Thêm thất bại!");
		}
	}

	public void themMonAn(int idTinh, Tidbit tidbit) {
		Province province = this.layTinh(idTinh);
		if (province == null) {
			System.out.println("Không tồn tại tỉnh có mã " + idTinh + " thêm món ăn thất bại");
		} else {
			province.themDacSan(tidbit);
		}
	}

	public void xoaMonAn(int idTinh, int idMonAn) {
		Province province = this.layTinh(idTinh);
		if (province == null) {
			System.out.println("Không tồn tại tỉnh có mã " + idTinh + " thêm món ăn thất bại");
		} else {
			province.xoaDacSan(idMonAn);
		}
	}

	public void lietKeMonAnMotTinh(int idTinh) {
		Province province = this.layTinh(idTinh);
		if (province == null) {
			System.out.println("Không tồn tại tỉnh có mã " + idTinh + " không liệt kê được!");
		} else {
			province.letKeMonAn();
		}
	}

	public List<Tidbit> timKiemMonAn(int idTinh, String tenMonAn) {
		List<Tidbit> result = new ArrayList<Tidbit>();
		Province province = this.layTinh(idTinh);
		if (province == null) {
			System.out.println("Không tồn tại tỉnh có mã " + idTinh + " không tìm kiếm được món " + tenMonAn);
		} else {
			result = province.timKiemTheoTenMon(tenMonAn);
		}
		return result;
	}

	private Province layTinh(int id) {
		if (this.provinces.size() == 0) {
			return null;
		}
		for (Province province : provinces) {
			if (province.getId() - id == 0) {
				return province;
			}
		}
		return null;
	}
}
