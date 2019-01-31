package com.thinhnv.canchi;

import java.util.Calendar;

import com.thinhnv.canchi.hangso.HangSo;

public class CanChi {

	private int namSinh;
	private int age;
	private int canChi;
	private String kq;

	public CanChi(int namSinh) {
		this.namSinh = namSinh;
		this.calAge();
	}

	private void calAge() {
		Calendar rightNow = Calendar.getInstance();
		this.age = rightNow.get(Calendar.YEAR) - this.namSinh;
	}

	public int getAge() {
		this.calAge();
		return this.age;
	}

	private void tinhCanChi() {
		this.canChi = (this.namSinh - 3) % 60;
		switch (this.canChi) {
		case HangSo.GIAP_TY_1:
			this.kq = "Giáp tý";
			break;
		case HangSo.AT_SUU_2:
			this.kq = "Ất sửu";
			break;
		case HangSo.BINH_DAN_3:
			this.kq = "Bính dần";
			break;
		case HangSo.DINH_MAO_4:
			this.kq = "Dinh mão";
			break;
		case HangSo.MAU_THIN_5:
			this.kq = "Mậu thìn";
			break;
		case HangSo.KY_TY_6:
			this.kq = "Kỷ tỵ";
			break;
		case HangSo.CANH_NGO_7:
			this.kq = "Canh ngọ";
			break;
		case HangSo.TAN_MUI_8:
			this.kq = "Tân mùi";
			break;
		case HangSo.NHAM_THAN_9:
			this.kq = "Nhâm thân";
			break;
		case HangSo.QUY_DAU_10:
			this.kq = "Quý dậu";
			break;
		case HangSo.GIAP_TUAT_11:
			this.kq = "Giáp tuất";
			break;
		case HangSo.AT_HOI_12:
			this.kq = "Ất hợi";
			break;
		case HangSo.BINH_TY_13:
			this.kq = "Bính tỵ";
			break;
		case HangSo.DINH_SUU_14:
			this.kq = "Đinh sửu";
			break;
		case HangSo.KY_MAO_15:
			this.kq = "Kỷ mão";
			break;
		case HangSo.CANH_THIN_16:
			this.kq = "Canh thìn";
			break;
		case HangSo.TAN_TY_17:
			this.kq = "Tân Tỵ";
			break;
		case HangSo.NHAM_NGO_18:
			this.kq = "Nhâm ngọ";
			break;
		case HangSo.QUI_MUI_19:
			this.kq = "Quí mùi";
			break;
		case HangSo.GIAP_THAN_20:
			this.kq = "Giáp thân";
			break;
		case HangSo.AT_DAU_21:
			this.kq = "Ất dậu";
			break;
		case HangSo.BINH_TUAT_22:
			this.kq = "Bính tuất";
			break;
		case HangSo.DINH_HOI_23:
			this.kq = "Đinh hợi";
			break;
		case HangSo.MAU_TY_24:
			this.kq = "Mậu tý";
			break;
		case HangSo.KY_SUU_25:
			this.kq = "Kỳ sửu";
			break;
		case HangSo.CANH_DAN_26:
			this.kq = "Canh dần";
			break;
		case HangSo.TAN_MAO_27:
			this.kq = "Tân mão";
			break;
		case HangSo.NHAM_THIN_28:
			this.kq = "Nhâm thìn";
			break;
		case HangSo.QUY_TY_29:
			this.kq = "Quý tỵ";
			break;
		case HangSo.GIAP_NGO_30:
			this.kq = "Giáp ngọ";
			break;
		case HangSo.AT_MUI_31:
			this.kq = "Ất mùi";
			break;
		case HangSo.BINH_THAN_32:
			this.kq = "Bính thân";
			break;
		case HangSo.DINH_DAU_33:
			this.kq = "Đinh dậu";
			break;
		case HangSo.MAU_TUAT_34:
			this.kq = "Mậu tuất";
			break;
		case HangSo.KY_HOI_35:
			this.kq = "Kỷ hợi";
			break;
		case HangSo.CANH_TY_36:
			this.kq = "Canh tỵ";
			break;
		case HangSo.TAN_SUU_37:
			this.kq = "Tân sửu";
			break;
		case HangSo.NHAM_DAN_38:
			this.kq = "Nhâm dần";
			break;
		case HangSo.QUY_MAO_39:
			this.kq = "Quý mão";
			break;
		case HangSo.GIAP_THIN_40:
			this.kq = "Giáp thìn";
			break;
		case HangSo.AT_TY_41:
			this.kq = "Ất tỵ";
			break;
		case HangSo.BINH_NGO_42:
			this.kq = "Bính ngọ";
			break;
		case HangSo.DINH_MUI_43:
			this.kq = "Đinh mùi";
			break;
		case HangSo.MAU_THAN_44:
			this.kq = "Mậu thân";
			break;
		case HangSo.KY_DAU_45:
			this.kq = "Kỷ dậu";
			break;
		case HangSo.CANH_TUAT_46:
			this.kq = "Canh tuất";
			break;
		case HangSo.TAN_HOI_47:
			this.kq = "Tân hợi";
			break;
		case HangSo.NHAM_TY_48:
			this.kq = "Nhâm tý";
			break;
		case HangSo.QUY_SUU_49:
			this.kq = "Quý sửu";
			break;
		case HangSo.GIAP_DAN_50:
			this.kq = "Giáp dần";
			break;
		case HangSo.AT_MAO_51:
			this.kq = "Ất mão";
			break;
		case HangSo.BINH_THIN_52:
			this.kq = "Bính thìn";
			break;
		case HangSo.DINH_TY_53:
			this.kq = "Đinh tý";
			break;
		case HangSo.MAU_NGO_54:
			this.kq = "Mậu ngọ";
			break;
		case HangSo.KY_MUI_55:
			this.kq = "Kỷ mùi";
			break;
		case HangSo.CANH_THAN_56:
			this.kq = "Canh thân";
			break;
		case HangSo.TAN_DAU_57:
			this.kq = "Tân dậu";
			break;
		case HangSo.NHAM_TUAT_58:
			this.kq = "Nhâm tuất";
			break;
		case HangSo.QUI_HOI_59:
			this.kq = "Quí hợi";
			break;
		default:
			break;
		}
	}

	public String getKQ() {
		this.tinhCanChi();
		return this.kq;
	}
}
