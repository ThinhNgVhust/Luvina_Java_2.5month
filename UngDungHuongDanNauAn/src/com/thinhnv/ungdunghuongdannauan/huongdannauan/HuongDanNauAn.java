package com.thinhnv.ungdunghuongdannauan.huongdannauan;

import java.util.ArrayList;

import com.thinhnv.ungdunghuongdannauan.huongdannauan.chude.ChuDe;
import com.thinhnv.ungdunghuongdannauan.huongdannauan.chude.monan.MonAn;
import com.thinhnv.ungdunghuongdannauan.huongdannauan.chude.monan.chuanbi.NguyenLieu;

public class HuongDanNauAn {
	private ArrayList<ChuDe> dsChuDe;
	private int sizeDSChuDe;

	public HuongDanNauAn() {
		this.sizeDSChuDe = 0;
	}

	public void hienThiThongTinCacChuDe() {

		if (this.sizeDSChuDe == 0) {
			System.out.println("Chu De trong do chua duoc them chu de nao");
			return;
		} else {
			for (int i = 0; i < this.sizeDSChuDe; i++) {
				ChuDe chuDe = this.dsChuDe.get(i);
				System.out.println(" Chu de " + (i + 1) + " " + chuDe.getTieuDe());
			}
		}
	}

	public ChuDe chonChuDe(int index) {
		int size = this.dsChuDe.size();
		if (size == 0) {
			System.out.println("Chua co chu de nao trong danh sach chu de");
			return null;
		}
		if (index >= size || index < 0) {
			System.out.println("Chu de ban chon chua dung!");
			return null;
		} else {
			return this.dsChuDe.get(index);
		}
	}

	public void themChuDe(ChuDe chuDe) {
		this.dsChuDe.add(chuDe);
		this.sizeDSChuDe++;
		System.out.println("Them chu de " + chuDe.getTieuDe() + " thanh cong");
	}

	public void xoaChuDe(String tieuDe) {
		if (this.sizeDSChuDe == 0) {
			return;
		} else {
			for (int i = 0; i < this.sizeDSChuDe; i++) {
				ChuDe chuDe = this.dsChuDe.get(i);
				if (chuDe.getTieuDe().equals(tieuDe)) {
					this.dsChuDe.remove(i);
					i--;
					this.sizeDSChuDe--;
					System.out.println("Xoa thanh cong chu de co tieu de " + tieuDe);
				}
			}
		}
	}

	public ArrayList<MonAn> timKiemMonAnTheoTen(String tenMonAn) {
		ArrayList<MonAn> result = new ArrayList<MonAn>();
		if (this.sizeDSChuDe == 0) {
			return null;
		}
		for (int i = 0; i < this.sizeDSChuDe; i++) {
			ChuDe chuDe = this.dsChuDe.get(i);
			if (chuDe.timMonAn(tenMonAn).contains(null)) {
				continue;
			} else {
				result.addAll(chuDe.timMonAn(tenMonAn));
			}
		}
		System.out.println("Tim kiem thanh cong");
		return result;
	}

	public void sapXepMonAn(String tieuDe) {
		// sap xep mon an trong 1 chu de theo bang chu cai
		if (this.sizeDSChuDe == 0) {
			return;
		} else {
			for (int i = 0; i < this.sizeDSChuDe; i++) {
				ChuDe chuDe = this.dsChuDe.get(i);
				if (chuDe.getTieuDe().equals(tieuDe)) {
					chuDe.sapXepMonAn();
				}
			}
		}
	}

	public ArrayList<MonAn> xemThongTinMonAn(String tenMonAn) {
		// xem mot 1 mon an va co the danh gia no
		return this.timKiemMonAnTheoTen(tenMonAn);
	}

	public void danhGia(String tenMonAn, String danhGia) {
		ArrayList<MonAn> dsMonAn = this.timKiemMonAnTheoTen(tenMonAn);
		if (dsMonAn.contains(null)) {
			System.out.println("Khong tim kiem duoc mon an co ten " + tenMonAn);
			return;
		} else {
			for (int i = 0; i < dsMonAn.size(); i++) {
				dsMonAn.get(i).setDanhGia(danhGia);
			}
		}
	}

	public void diCho(NguyenLieu nguyenLieu) {
		// Khi người dùng thực hiện chức năng đi chợ,
		// màn hình điện thoại sẽ hiển thị danh sách các nguyện liệu cần chuẩn chị cho
		// món ăn đó để người dùng tiện xem
		// nếu đã mua được nguyên liệu nào, người dùng cần phải xác nhận đã mua vào
		// nguyên liệu đó.
		ArrayList<MonAn> result = new ArrayList<MonAn>();
		for (int i = 0; i < result.size(); i++) {
			result.get(i).muaNguyenLieu(nguyenLieu);
		}
	}

	public void nauAn(MonAn monAn) {
		// hien thi cac buoc che bien cua mon an
		// thuc hien ghi chu tai cac buoc lam va ghi ket qua dat duoc
	}
}
