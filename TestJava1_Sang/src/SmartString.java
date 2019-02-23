
public class SmartString {
	private String text;

	public SmartString() {
		this.text = "Lap trinh huong doi tuong Java Core danh cho nguoi moi bat dau";
//		+this.text = "Auto-generated method stub hi";
		System.out.println("\t\tChuỗi đã cho ban đầu: ");
		System.out.println(this.text);
		System.out.println("--------------------------------------------------------------");
		System.out.println();
	}

	public void processingText() {
		// sap xep chuoi
		System.out.println("\t\tChuoi sau khi sap xep:\n");
		String sortStr = this.sortString();
		// sau do xoa cac tu co so lan xuat hien nhieu nhat
		System.out.println("\t\tChuoi sau khi sap xep va xoa di cac tu chua cac ky tu xuat hien nhieu nhat:\n");
//		sortStr = 
		System.out.println(this.text);
		deleteMaxChars(text);
	}

	public String sortString() {
		String kq = "";
		String tmpStr = this.text + " ";
		int length = tmpStr.length();
		String strEle1 = "";
		String strEle2 = "";
		for (int i = 0; i < length; i++) {
			char kyTu = tmpStr.charAt(i);
			if (kyTu != ' ') {
				strEle1 += kyTu;
			} else if (kyTu == ' ' && strEle1 != "") {
				String minStr = strEle1;
				for (int j = 0; j < length; j++) {
					char kyTuSau = tmpStr.charAt(j);
					if (kyTuSau != ' ') {
						strEle2 += kyTuSau;
					} else if (kyTuSau == ' ' && strEle2 != "") {
						minStr = minOf2String(minStr, strEle2);
						strEle2 = "";
					}
				}
				strEle1 = "";
				int subLen = minStr.length();
				String subStr1 = tmpStr.substring(0, tmpStr.indexOf(minStr));
				String subStr2 = tmpStr.substring(tmpStr.indexOf(minStr) + subLen);
				tmpStr = subStr1 + " " + subStr2;
				length = tmpStr.length();
				kq += minStr + " ";
				i = 0;
			}
		}
		if (tmpStr != "")
			kq += tmpStr;
		System.out.println(kq);
		System.out.println("\n");
		return kq;
	}

	private String minOf2String(String strEle1, String strEle2) {
		// TODO Auto-generated method stub
		if (strEle1.compareTo(strEle2) > 0) {
			return strEle2;
		} else {
			return strEle1;
		}
	}

	public String deleteMaxChars(String sortStr) {
		// TODO Auto-generated method stub
		// tim cac ky tu xuat hien nhieu nhat
		// duyet cac chuoi xuat hien ky tu, neu no chua cac ky tu thi xoa no di
		int max = 0;
		String maxChars = "";
		String tmpStr = sortStr;
		int length = tmpStr.length();
		for (int i = 0; i < length; i++) {
			char kyTu = tmpStr.charAt(i);
			if (kyTu == ' ') {
				continue;
			} else {
				int soPhanTuKyTu = demKyTu(tmpStr, kyTu, i);
				if (max < soPhanTuKyTu) {
					max = soPhanTuKyTu;
				}
			}
		}

		for (int i = 0; i < length; i++) {
			char kyTu = tmpStr.charAt(i);
			if (kyTu == ' ') {
				continue;
			} else {
				int soPhanTuKyTu = demKyTu(tmpStr, kyTu, i);
				if (max == soPhanTuKyTu) {
					maxChars += kyTu;
				}
			}
		}
		String kq = "";
		String gio = "";
		String tmpStr1 = tmpStr + " ";
		for (int i = 0; i < tmpStr1.length(); i++) {
			char kyTu = tmpStr1.charAt(i);
			if (kyTu != ' ') {
				gio += kyTu;
			} else if (kyTu == ' ' && gio != "") {
				if (!contains(gio, maxChars)) {
					kq += gio + " ";
				}
				gio = "";
			}
		}
		System.out.println("Cac ky tu xuat hien nhieu nhat la: " + maxChars);
		System.out.println(kq);
		return kq;
	}

	private boolean contains(String gio, String maxChars) {
		// TODO Auto-generated method stub
		for (int i = 0; i < maxChars.length(); i++) {
			String kyTu = maxChars.charAt(i) + "";
			if (gio.contains(kyTu)) {
				return true;
			}
		}
		return false;
	}

	private int demKyTu(String tmpStr, char kyTu, int index) {
		// TODO Auto-generated method stub
		int length = tmpStr.length();
		int count = 0;
		for (int i = index; i < length; i++) {
			if (tmpStr.charAt(i) == kyTu) {
				++count;
			}
		}
		return count;
	}

}
