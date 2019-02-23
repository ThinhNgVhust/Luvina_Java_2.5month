package com.thinhnv.ungdungcocaro.cocaro.nguoichoi;

import java.util.ArrayList;

import com.thinhnv.ungdungcocaro.cocaro.HangSo.HangSo;
import com.thinhnv.ungdungcocaro.cocaro.quanco.QuanCo;

public class NguoiChoi {
	private String tenNguoiChoi;
	private String loaiQuanCo;
	private ArrayList<QuanCo> dsQuanCo = new ArrayList<QuanCo>();

	public NguoiChoi(String tenNguoiChoi, String loaiQuanCo) {
		this.tenNguoiChoi = tenNguoiChoi;
		this.loaiQuanCo = loaiQuanCo;
	}

	public boolean danhCo(int xPos, int yPos) {
		if (kTraTrenBanCo(xPos, yPos)) {
			xPos = (xPos / 50) * 50 + 25;
			yPos = (yPos / 50) * 50 + 25;
			QuanCo quanCo = new QuanCo(xPos, yPos, this.loaiQuanCo);
			if (kTraLaChuaDanh(quanCo)) {
				this.dsQuanCo.add(quanCo);
				System.out.println(this.tenNguoiChoi + " đánh quân cờ [ " + this.loaiQuanCo + " ] ở vị trí [" + xPos
						+ " " + yPos + "]");
				if (this.kiemTraThangCuoc()) {
//					System.out.println("Người chơi " + this.tenNguoiChoi + " thắng cuộc!");
				}
				return true;
			} else {
				System.out.println("Vị trí quân cờ đã được " + this.tenNguoiChoi + " đánh, hãy đánh lại");
				return false;
			}
		} else {
			System.out.println("Vị trí đánh cờ của  " + this.tenNguoiChoi + " không hợp lệ");
			return false;
		}

	}

	public boolean kiemTraThangCuoc() {
		// TODO Auto-generated method stub
		if (checkDoc() || checkNgang() || checkCheoLen() || checkCheoXuong()) {
			return true;
		} else {
			return false;
		}

	}

	private boolean checkCheoXuong() {
		// TODO Auto-generated method stub
		int count = 0;
		int soLuongQuan = this.dsQuanCo.size();
		for (int i = 0; i < soLuongQuan; i++) {
			QuanCo quanCo = this.dsQuanCo.get(i);
			QuanCo nextQuanCo = quanKeTiepCheoXuong(quanCo);
			while (nextQuanCo != null) {
				++count;
				nextQuanCo = quanKeTiepDoc(nextQuanCo);
			}
//			System.out.println(count);
			if (count >= HangSo.DIEU_KIEN_THANG) {
				return true;
			}
		}
		return false;
	}

	private QuanCo quanKeTiepCheoXuong(QuanCo quanCo) {
		// TODO Auto-generated method stub
		int size = this.dsQuanCo.size();
		for (int i = 0; i < size; i++) {
			QuanCo quanCo1 = this.dsQuanCo.get(i);
			boolean dk1 = quanCo1.getyPosition() - quanCo.getyPosition() == 50;// x ngang
			boolean dk2 = quanCo1.getxPosition() - quanCo.getxPosition() == 50;// y doc
			if (dk1 && dk2) {
				return quanCo1;
			}
		}
		return null;
	}

	private boolean checkCheoLen() {
		// TODO Auto-generated method stub
		int count = 0;
		int soLuongQuan = this.dsQuanCo.size();
		for (int i = 0; i < soLuongQuan; i++) {
			QuanCo quanCo = this.dsQuanCo.get(i);
			QuanCo nextQuanCo = quanKeTiepCheoLen(quanCo);
			while (nextQuanCo != null) {
				++count;
				nextQuanCo = quanKeTiepDoc(nextQuanCo);
			}
//			System.out.println(count);
			if (count >= HangSo.DIEU_KIEN_THANG) {
				return true;
			}
		}
		return false;
	}

	private QuanCo quanKeTiepCheoLen(QuanCo quanCo) {
		// TODO Auto-generated method stub
		int size = this.dsQuanCo.size();
		for (int i = 0; i < size; i++) {
			QuanCo quanCo1 = this.dsQuanCo.get(i);
			boolean dk1 = quanCo1.getyPosition() - quanCo.getyPosition() == 50;// x ngang
			boolean dk2 = quanCo1.getxPosition() - quanCo.getxPosition() == -50;// y doc
			if (dk1 && dk2) {
				return quanCo1;
			}
		}
		return null;
	}

	private boolean checkNgang() {
		// TODO Auto-generated method stub
		int count = 0;
		int soLuongQuan = this.dsQuanCo.size();
		for (int i = 0; i < soLuongQuan; i++) {
			QuanCo quanCo = this.dsQuanCo.get(i);
			QuanCo nextQuanCo = quanKeTiepNgang(quanCo);
			while (nextQuanCo != null) {
				++count;
				nextQuanCo = quanKeTiepDoc(nextQuanCo);
			}
//			System.out.println(count);
			if (count >= HangSo.DIEU_KIEN_THANG) {
				return true;
			}
		}
		return false;
	}

	private QuanCo quanKeTiepNgang(QuanCo quanCo) {
		// TODO Auto-generated method stub
		int size = this.dsQuanCo.size();
		for (int i = 0; i < size; i++) {
			QuanCo quanCo1 = this.dsQuanCo.get(i);
			boolean dk1 = quanCo1.getyPosition() == quanCo.getyPosition();// x ngang
			boolean dk2 = quanCo1.getxPosition() - quanCo.getxPosition() == 50;// y doc
			if (dk1 && dk2) {
				return quanCo1;
			}
		}
		return null;
	}

	private boolean checkDoc() {
		// TODO Auto-generated method stub
		int count = 0;
		int soLuongQuan = this.dsQuanCo.size();
		for (int i = 0; i < soLuongQuan; i++) {
			QuanCo quanCo = this.dsQuanCo.get(i);
			QuanCo nextQuanCo = quanKeTiepDoc(quanCo);
			while (nextQuanCo != null) {
				++count;
				nextQuanCo = quanKeTiepDoc(nextQuanCo);
			}
//			System.out.println(count);
			if (count >= HangSo.DIEU_KIEN_THANG) {
				return true;
			}
		}
		return false;
	}

	private QuanCo quanKeTiepDoc(QuanCo quanCo) {
		// TODO Auto-generated method stub
		int size = this.dsQuanCo.size();
		for (int i = 0; i < size; i++) {
			QuanCo quanCo1 = this.dsQuanCo.get(i);
			boolean dk1 = quanCo1.getyPosition() - quanCo.getyPosition() == 50;// x ngang
			boolean dk2 = quanCo1.getxPosition() == quanCo.getxPosition();// y doc
			if (dk1 && dk2) {
				return quanCo1;
			}
		}
		return null;
	}

	private boolean kTraLaChuaDanh(QuanCo quanCo) {
		// TODO Auto-generated method stub
		int size = this.dsQuanCo.size();
		// Nếu danh sách quân cờ trống thì tức là quân cờ quanCo chưa tồn tại trong danh
		// sách
		if (size == 0) {
			return true;
		}
		// duyệt từng quân cờ trong danh sách của người chơi
		// nếu tồn tại quân cờ của người chơi có vị trí trùng với vị trí quanCo chuẩn bị
		// đánh thì trả về false
		for (int i = 0; i < size; i++) {
			QuanCo quanCo1 = this.dsQuanCo.get(i);
			boolean dk1 = quanCo1.getxPosition() == quanCo.getxPosition();
			boolean dk2 = quanCo1.getyPosition() == quanCo.getyPosition();
			if (dk1 && dk2) {
				return false;
			}
		}
		return true;
	}

	private boolean kTraTrenBanCo(int xPos, int yPos) {
		// TODO Auto-generated method stub
		boolean dk1 = 0 <= xPos && xPos <= (HangSo.SO_HANG - 1) * HangSo.SIZE;
		boolean dk2 = 0 <= yPos && yPos <= (HangSo.SO_COT - 1) * HangSo.SIZE;
		return dk1 && dk2 ? true : false;
	}

	public void xoaCo() {
		this.dsQuanCo.clear();
	}

	public ArrayList<QuanCo> getDSQuanCo() {
		return this.dsQuanCo;
	}

	public String getTen() {
		return this.tenNguoiChoi;
	}
}
