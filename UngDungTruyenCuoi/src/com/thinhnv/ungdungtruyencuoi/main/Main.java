package com.thinhnv.ungdungtruyencuoi.main;

import com.thinhnv.ungdungtruyencuoi.quanlytruyencuoi.QuanLyTruyen;
import com.thinhnv.ungdungtruyencuoi.quanlytruyencuoi.truyencuoi.ChuDeTruyen;
import com.thinhnv.ungdungtruyencuoi.quanlytruyencuoi.truyencuoi.TruyenCuoi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String noiDung1 = "Trong giờ học, thầy giáo:\n" + "- Ai tự nhận thấy mình là kẻ ngu ngốc thì đứng lên!\n"
				+ "Cả lớp ngồi im. Sau vài phút Vova đứng lên. Thầy giáo:\n"
				+ "- Vova, em tự cho mình là kẻ ngu ngốc?\n" + "- Không ạ, nhưng để thầy đứng một mình như vậy thì …..";
		TruyenCuoi tc1 = new TruyenCuoi("1.1", "Ke Ngu Ngoc", "2019", noiDung1);
		String noiDung2 = "Vova chạy sang vườn nhà Masa chơi. Trời rất lạnh, tuyết phủ trắng xoá. Vova và Masa quyết định đắp một thằng người tuyết. Sau khi đã xong xuôi phần chính, Masa bảo:\n"
				+ "- Anh đợi Em nhé. Em vào nhà lấy củ cà rốt.\n" + "- Em lấy luôn 2 củ đi. Củ thứ hai để làm mũi nó.";
		TruyenCuoi tc2 = new TruyenCuoi("1.2", "Mua Dong", "2020", noiDung2);
		String noiDung3 = "Vô va lên lớp 6 bị bắt buôc phải hoc tiếng Anh…nhưng rất tiếc Vô va lại bị thiểu năng về môn English này… Một hôm Cô giáo băt Vôva phải";
		TruyenCuoi tc3 = new TruyenCuoi("1.3", "Vo va hoc tieng anh", "2000", noiDung3);
		QuanLyTruyen qlTruyen = new QuanLyTruyen();
		ChuDeTruyen cd1 = new ChuDeTruyen("1", "Vo va");
		cd1.themTruyen(tc1);
		cd1.themTruyen(tc2);
		cd1.themTruyen(tc3);
		cd1.themTruyen(tc3);
		ChuDeTruyen cd2 = new ChuDeTruyen("2", "Tinh yeu");
		cd2.themTruyen(tc1);
		cd2.themTruyen(tc2);
		ChuDeTruyen cd3 = new ChuDeTruyen("3", "Dan gian");
		cd3.themTruyen(tc1);
		cd3.themTruyen(tc2);
		cd3.themTruyen(tc3);
		qlTruyen.taoChuDe(cd1);
		qlTruyen.taoChuDe(cd2);
		qlTruyen.taoChuDe(cd3);
		qlTruyen.inDanhSach();
		qlTruyen.docTruyen("1.2");

	}

}
