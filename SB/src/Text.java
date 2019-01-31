
public class Text {
	private String text;

	public Text(String text) {
		this.text = text;
	}

	public void tongCacSoTrongChuoi() {
		int sum = 0;
		String gio = "";
		String txt = this.text;
		int len = txt.length();
		for (int i = 0; i < len; i++) {
			char kyTu = txt.charAt(i);
			if (kyTu <= '9' && kyTu >= '0') {
				gio += kyTu;
			} else if (gio != "") {
				System.out.println(gio);
				sum += Integer.parseInt(gio);
				gio = "";
			}
		}
		if (gio != "") {
			System.out.println(gio);
			sum += Integer.parseInt(gio);
			gio = "";
		}
		System.out.println(sum);
	}

	public String sapXep(String chuoi) {
		// TODO Auto-generated method stub
		String gio = "";
		String kq = "";
		int len = chuoi.length();
		for (int i = 0; i < len; i++) {
			char kyTu = chuoi.charAt(i);
			if (kyTu != ' ') {
				gio += kyTu;
			} else {
				System.out.println(gio);
				gio = xuLy(gio);
				System.out.println(gio);
				kq += gio;
				gio = "";
			}
		}
		if (gio != "") {
			System.out.println(gio);
			gio = xuLy(gio);
			System.out.println(gio);
			kq += gio;
		}
		return kq;
	}

	private String xuLy(String gio) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder(gio);
		String kq = "";
		while (str.length() > 0) {
			int minIndex = 0;
			char minKyTu = str.charAt(0);
			for (int i = 0; i < str.length(); i++) {
				if (minKyTu > str.charAt(i)) {
					minKyTu = str.charAt(i);
					minIndex = i;
				}
			}
			kq += minKyTu;
			str.deleteCharAt(minIndex);
		}
		return kq;
	}

	public void toDate(long milisec) {
		long hour = 0;
		long minute = 0;
		long second = 0;
		long miliseconds = milisec;
		hour = (miliseconds / (1000 * 3600));
		miliseconds = miliseconds % (1000 * 3600);
		minute = (miliseconds / (1000 * 60));
		miliseconds = miliseconds % (1000 * 60);
		System.out.println(hour + "h : " + minute + "' : " + second + ": " + miliseconds);

	}
}
