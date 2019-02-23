package com.thinhnv.carogame.Main;

import com.thinhnv.carogame.banco.BanCo;
import com.thinhnv.carogame.nguoichoi.NguoiChoi;

public class Main {
	public static void main(String[] args) {
		NguoiChoi nguoiChoi1 = new NguoiChoi("Thịnh", true);
		NguoiChoi nguoiChoi2 = new NguoiChoi("Phúc", false);
		BanCo banCo = new BanCo(nguoiChoi1, nguoiChoi2);
		banCo.danhCo(nguoiChoi1, 0, 0);
		banCo.danhCo(nguoiChoi2, 50, 0);
		banCo.danhCo(nguoiChoi1, 0, 0);
	}
}
