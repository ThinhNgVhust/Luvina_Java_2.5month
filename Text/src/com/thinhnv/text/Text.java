package com.thinhnv.text;

public class Text {
	private String text;

	public Text(String text) {
		this.text = text;
	}

	private void inRaChuCoMaNhoNhat() {
		int len = this.text.length();
		char kyTu = this.text.charAt(0);
		for (int i = 1; i < len; i++) {
//			System.out.println(this.text.charAt(i) + ":" + (int) this.text.charAt(i));
			if (kyTu > this.text.charAt(i) && (int) this.text.charAt(i) != 32) {
				kyTu = this.text.charAt(i);
			}
		}
		System.out.println("Ky tu co ma ANSCII be nhat la: " + kyTu);
	}

	private void vietHoaCacChuCaiDau() {
		int len = this.text.length();
		String str = "";
		str += (this.text.charAt(0) + "").toUpperCase();
		for (int i = 1; i < len; i++) {
			String upperString;
			if (this.text.charAt(i) == ' ') {
				upperString = (this.text.charAt(i + 1) + "").toUpperCase();
				str += " " + upperString;
				i++;
				continue;
			}
			str += this.text.charAt(i);
		}
		System.out.println("Viet hoa cac chu cai dau: " + str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Text txt = new Text("It's never enough for learning. It's never too late for learning");
		txt.inRaChuCoMaNhoNhat();
		txt.vietHoaCacChuCaiDau();

	}

}
