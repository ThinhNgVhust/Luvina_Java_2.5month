package com.thinhnv.thac.bai2.ungdungdacsan.province;

import java.util.ArrayList;
import java.util.List;

import com.thinhnv.thac.bai2.ungdungdacsan.tdbit.Tidbit;

public class Province {
	private int id;
	private String name;
	private List<Tidbit> dsTidbit = new ArrayList<Tidbit>();

	public Province(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void themDacSan(Tidbit tidbit) {
		if (this.dsTidbit.indexOf(tidbit) == -1) {
			this.dsTidbit.add(tidbit);
			System.out.println("Thêm đặc sản " + tidbit.getName() + " thành công vào khu vực " + this.name);
		} else {
			System.out.println("Đã tồn tại món ăn có id " + tidbit.getId() + " trong khu vực  " + this.name);
		}
	}

	public void xoaDacSan(int id) {
		Tidbit tidbit = this.getTidbit(id);
		if (this.dsTidbit.remove(tidbit)) {
			System.out.println("Xóa thành công đặc sản có mã " + tidbit.getId());
		} else {
			System.out.println("Không tồn tại đặc sản có mã " + id + " trong khu vực " + this.name + " không xóa được");
		}
	}

	public List<Tidbit> timKiemTheoTenMon(String tenMon) {
		System.out.println("\nTìm kiếm trog khu vực " + name + " các món ăn có tên " + tenMon);
		List<Tidbit> tidbits = new ArrayList<Tidbit>();
		for (Tidbit tidbit : this.dsTidbit) {
			if (tidbit.getName().equalsIgnoreCase(tenMon)) {
				tidbits.add(tidbit);
			}
		}
		if (tidbits.size() > 0) {
			System.out.println("Tìm thấy " + tidbits.size() + " kết quả");
		} else {
			System.out.println("Không tìm thấy kết quả nào");
		}
		return tidbits;
	}

	private boolean isEmpty() {
		return this.dsTidbit.isEmpty();
	}

	private Tidbit getTidbit(int id) {
		if (isEmpty()) {
			return null;
		}
		for (Tidbit tidbit : dsTidbit) {
			if (tidbit.getId() == id) {
				return tidbit;
			}
		}
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Province) {
			return this.id - ((Province) obj).id == 0;
		}
		return false;
	}

	public void letKeMonAn() {
		// TODO Auto-generated method stub
		if (this.dsTidbit.size() == 0) {
			System.out.println("Không tồn tại món ăn nào trong danh sách");
		} else {
			System.out.println("\nDanh sách các món ăn trong tỉnh " + name);
			for (Tidbit tidbit : this.dsTidbit) {
				System.out.println("\t" + tidbit.getId() + ": " + tidbit.getName());
			}
		}
	}

}
