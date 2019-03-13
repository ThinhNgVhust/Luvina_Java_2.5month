package com.thinhnv.hsformapp.logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class QuanLyHocSinh {
	private ArrayList<HocSinh> qlHS;
	private static final String PATH = "/home/thinhnv/HocSinh.txt";
	private String path;

	public QuanLyHocSinh() {
		this.qlHS = new ArrayList<HocSinh>();
		this.path = PATH;
	}

	public void getData() throws IOException {
		this.qlHS.clear();
		File file = new File(path);
		if (!file.exists()) {
			new File(file.getParent()).mkdirs();
			file.createNewFile();
		}
		FileInputStream fileIn = new FileInputStream(file);
		int kyTu = fileIn.read();
		String gio = "";
		while (kyTu != -1) {
			if (kyTu != 10) {
				gio += (char) kyTu;
			}
			if (gio != "" && kyTu == 10) {
				String[] hsInfor = gio.split("_");
				int size = hsInfor.length;
				double diemTK = Double.parseDouble(hsInfor[size - 1]);
				if (size == 3) {
					this.qlHS.add(new HocSinh(hsInfor[0], hsInfor[1], diemTK));
				} else {
					String lop = hsInfor[size - 2];
					String hoTen = "";
					for (int i = 0; i < size - 2; i++) {
						hoTen += hsInfor[i];
					}
					this.qlHS.add(new HocSinh(hoTen, lop, diemTK));
				}
				gio = "";

			}
			kyTu = fileIn.read();
		}
		fileIn.close();
	}

	public void nhapTT(String hoTen, String lop, double diemTK) throws IOException {
		HocSinh hs = new HocSinh(hoTen, lop, diemTK);
		this.qlHS.clear();
		this.getData();
		this.qlHS.add(hs);
		String hsInfor = hs.toString();
		File file = new File(path);
		if (!file.exists()) {
			new File(file.getParent()).mkdirs();
			file.createNewFile();
		}
		FileOutputStream fileOut = new FileOutputStream(file, true);
		for (int i = 0; i < hsInfor.length(); i++) {
			fileOut.write(hsInfor.charAt(i));
		}
		fileOut.write(10);
		fileOut.close();
	}

	public String getListHSString() throws IOException {
		this.qlHS.clear();
		getData();
		String kq = "";
		for (int i = 0; i < this.qlHS.size(); i++) {
			kq += this.qlHS.get(i).toString() + "\n";
		}
		return kq;
	}

	public String findByName(String name) throws IOException {
		this.qlHS.clear();
		getData();
		String kq = "";
		for (int i = 0; i < this.qlHS.size(); i++) {
			HocSinh hs = this.qlHS.get(i);
			if (hs.getHoTen().equalsIgnoreCase(name))

				kq += hs.toString() + "\n";
		}
		return kq;
	}
}
