package com.thinhnv.quanlymonphai.main;

import com.thinhnv.quanlymonphai.kynang.KyNang;
import com.thinhnv.quanlymonphai.kynang.NgoaiCong;
import com.thinhnv.quanlymonphai.kynang.NoiCong;
import com.thinhnv.quanlymonphai.monphai.MonPhai;
import com.thinhnv.quanlymonphai.monphai.ThieuLam;
import com.thinhnv.quanlymonphai.monphai.VoDang;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KyNang kn1 = new NoiCong("Vận nội công", 100, "Hỏa", "Xung quanh tỏa khói");
		KyNang kn2 = new NgoaiCong("Vận ngoại công", 120, "Mộc", "Xung quanh toàn cây");

		MonPhai thieuLam = new ThieuLam("Thiếu Lâm", "Duy Ngã Độc Tôn", kn1, "Chùa", "Lấy chân thiện mỹ", "Mô tả");
		MonPhai voDang = new VoDang("Võ Đang", "Trương Vô Kỵ", kn2, "Luvina", "Không làm việc xấu", "Mô tả 1");

		thieuLam.soTai(voDang);
		((ThieuLam) thieuLam).inTT();
	}

}
