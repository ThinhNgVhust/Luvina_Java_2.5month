package com.thinhnv.googlephotoapp.quanlychude.chude.hinhanh;

public class AnhDongVat extends HinhAnh {
	private String tenGoi;
	private String noiSong;
	private String tiengKeu;

	

	public AnhDongVat(String idHinhAnh, String tenHinhAnh, String duongDan, String idChuDe, String kichThuoc,
			String tenGoi, String noiSong, String tiengKeu) {
		super(idHinhAnh, tenHinhAnh, duongDan, idChuDe, kichThuoc);
		this.tenGoi = tenGoi;
		this.noiSong = noiSong;
		this.tiengKeu = tiengKeu;
	}



	public void inTTChung() {
		System.out.println("\n*******************************");
		System.out.println("tenGoi: " + tenGoi);
		System.out.println("noiSong: " + noiSong);
		System.out.println("tiengKeu: " + tiengKeu);
		super.inTTChung();
		System.out.println("Phat am thanh "+ this.tiengKeu);
		System.out.println("\n*******************************");
		
	}

}
