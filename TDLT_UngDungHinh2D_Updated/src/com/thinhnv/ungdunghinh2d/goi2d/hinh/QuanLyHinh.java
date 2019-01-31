package com.thinhnv.ungdunghinh2d.goi2d.hinh;

import com.thinhnv.ungdunghinh2d.goi2d.hinh.cacloaihinh.hinhtron.HinhTron;
import com.thinhnv.ungdunghinh2d.goi2d.hinh.cacloaihinh.tamgiac.TamGiac;
import com.thinhnv.ungdunghinh2d.goi2d.hinh.cacloaihinh.tamgiac.TamGiacCan;
import com.thinhnv.ungdunghinh2d.goi2d.hinh.cacloaihinh.tamgiac.TamGiacDeu;
import com.thinhnv.ungdunghinh2d.goi2d.hinh.cacloaihinh.tamgiac.TamGiacThuong;
import com.thinhnv.ungdunghinh2d.goi2d.hinh.cacloaihinh.tugiac.HinhChuNhat;
import com.thinhnv.ungdunghinh2d.goi2d.hinh.cacloaihinh.tugiac.HinhVuong;
import com.thinhnv.ungdunghinh2d.goi2d.hinh.cacloaihinh.tugiac.TuGiac;

public class QuanLyHinh {
	private int soLuong;
	private int nElements;
	private Hinh[] dsHinh;

	public QuanLyHinh(int soLuong) {
		this.dsHinh = new Hinh[soLuong];
		this.soLuong = soLuong;
		this.nElements = 0;
//		for (int i = 0; i < this.soLuong; i++) {
//			dsHinh[i] = null;
//		}
	}

	public int length() {
		return this.soLuong;
	}

// thuc hien thao tac them
	public void themHinh(HinhTron hinhTron) {
		try {
			this.dsHinh[this.nElements++] = hinhTron;
		} catch (Exception e) {
			System.out.println("DS da day khong the nhap them duoc");
		}
	}

	public void themHinh(HinhChuNhat hcn) {
		try {
			this.dsHinh[this.nElements++] = hcn;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("DS da day khong the nhap them duoc");
		}
	}

	public void themHinh(HinhVuong hv) {
		try {
			this.dsHinh[this.nElements++] = hv;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("DS da day khong the nhap them duoc");
		}
	}

	public void themHinh(double x1, double y1, double banKinh) {
		try {
			this.dsHinh[this.nElements++] = new HinhTron(x1, y1, banKinh);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("DS da day khong the nhap them duoc");
		}
	}

	public void themHinh(TamGiacCan tgc) {
		try {
			this.dsHinh[this.nElements++] = tgc;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("DS da day khong the nhap them duoc");
		}
	}

	public void themHinh(TamGiacDeu tgd) {
		try {
			this.dsHinh[this.nElements++] = tgd;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("DS da day khong the nhap them duoc");
		}
	}

	public void themHinh(TamGiacThuong tgt) {
		try {
			this.dsHinh[this.nElements++] = tgt;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("DS da day khong the nhap them duoc");
		}
	}

	public void themHinh(HinhTron hinhTron, int viTri) {
		try {
			this.dsHinh[viTri] = hinhTron;
		} catch (Exception e) {
			System.out.println("Vi tri nhap khong hop le");
		}
	}

	public void themHinh(HinhChuNhat hcn, int viTri) {
		try {
			this.dsHinh[viTri] = hcn;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Vi tri nhap khong hop le");
		}
	}

	public void themHinh(HinhVuong hv, int viTri) {
		try {
			this.dsHinh[viTri] = hv;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Vi tri nhap khong hop le");
		}
	}

	public void themHinh(double x1, double y1, double banKinh, int viTri) {
		try {
			this.dsHinh[viTri] = new HinhTron(x1, y1, banKinh);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Vi tri nhap khong hop le");
		}
	}

	public void themHinh(TamGiacCan tgc, int viTri) {
		try {
			this.dsHinh[viTri] = tgc;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Vi tri nhap khong hop le");
		}
	}

	public void themHinh(TamGiacDeu tgd, int viTri) {
		try {
			this.dsHinh[viTri] = tgd;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Vi tri nhap khong hop le");
		}
	}

	public void themHinh(TamGiacThuong tgt, int viTri) {
		try {
			this.dsHinh[viTri] = tgt;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Vi tri nhap khong hop le");
		}
	}

	// duyet
	public void duyetHinhVuong() {
		int count = 0;
		for (int i = 0; i < this.soLuong; i++) {
			if (dsHinh[i] instanceof HinhVuong) {
				(dsHinh[i]).inTT();
				count++;
			}
		}
		System.out.println("---------------------------------");
		System.out.println("So luong hinh vuong: " + count);
	}

	public void duyetHinhChuNhat() {
		int count = 0;
		for (int i = 0; i < this.soLuong; i++) {
			if (dsHinh[i] instanceof HinhChuNhat) {
				dsHinh[i].inTT();
				count++;
			}
		}
		System.out.println("---------------------------------");
		System.out.println("So luong hinh chu nhat: " + count);
	}

	public void duyetTuGiac() {
		int count = 0;
		for (int i = 0; i < this.soLuong; i++) {
			if (dsHinh[i] instanceof TuGiac) {
				(dsHinh[i]).inTT();
				count++;
			}
		}
		System.out.println("---------------------------------");
		System.out.println("So luong tu giac: " + count);
	}

	public void duyetTamGiac() {
		int count = 0;
		for (int i = 0; i < this.soLuong; i++) {
			if (dsHinh[i] instanceof TamGiac) {
				((TamGiac) dsHinh[i]).inTT();
				count++;
			}
		}
		System.out.println("---------------------------------");
		System.out.println("So luong tam giac: " + count);
	}

	public void duyetTamGiacCan() {
		int count = 0;
		for (int i = 0; i < this.soLuong; i++) {
			if (dsHinh[i] instanceof TamGiacCan) {
				(dsHinh[i]).inTT();
				count++;
			}
		}
		System.out.println("---------------------------------");
		System.out.println("So luong tam giac can: " + count);
	}

	public void duyetTamGiacDeu() {
		int count = 0;
		for (int i = 0; i < this.soLuong; i++) {
			if (dsHinh[i] instanceof TamGiacDeu) {
				(dsHinh[i]).inTT();
				count++;
			}
		}
		System.out.println("---------------------------------");
		System.out.println("So luong tam giac: " + count);
	}

	public void duyetHinhTron() {
		int count = 0;
		for (int i = 0; i < this.soLuong; i++) {
			if (dsHinh[i] instanceof HinhTron) {
				(dsHinh[i]).inTT();
				count++;
			}
		}
		System.out.println("---------------------------------");
		System.out.println("So luong hinh tron: " + count);
	}

	// tra ve hinh o vi tri i
	public Hinh layHinh(int i) {
		if (i > this.soLuong || i < 0) {
			System.out.println("Vi tri khong hop le, doi tuong se duong tham chieu toi null");
			return null;
		} else {
			return this.dsHinh[i];
		}
	}

	// thao tac xoa hinh o mot vi tri
	public void xoaHinh(int i) {
		if (i > this.soLuong || i < 0 && this.dsHinh[i] == null) {
			System.out.println("Vi tri khong hop le, doi tuong se duong tham chieu toi null");
			return;
		} else {
			this.dsHinh[i] = null;
		}
		this.toChucLai();

	}

	public void toChucLai() {
		// TODO Auto-generated method stub
		int nElements = 0;
		for (int i = 0; i < this.soLuong; i++) {
			if (dsHinh[i] instanceof Hinh) {
				nElements++;
			}
		}
		this.nElements = nElements;
		Hinh[] tmpHinh = new Hinh[nElements];
		for (int i = 0; i < this.nElements; i++) {
			for (int j = 0; j < this.soLuong; j++) {
				if (dsHinh[j] instanceof Hinh) {
					tmpHinh[i++] = dsHinh[j];
					dsHinh[j] = null;
				}
			}
		}
		for (int i = 0; i < this.nElements; i++) {
			this.dsHinh[i] = tmpHinh[i];
		}
	}

}
