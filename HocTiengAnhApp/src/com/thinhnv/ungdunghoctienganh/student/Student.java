package com.thinhnv.ungdunghoctienganh.student;

import java.util.Scanner;

import com.thinhnv.ungdunghoctienganh.studytable.StudyTalbe;

public class Student {
	private static final int TIM_KIEM = 1;
	private static final int NHINTU_DOAN_NGHIA = 2;
	private static final int DOAN_DAP_AN_DUNG = 3;
	private static final int TIM_TU_DONG_NGHIA = 4;
	private static final int THOAT = 5;
	private String id;
	private String name;
	private String dOB;
	private String job;
	private String phone;
	private String userName;
	private String password;
	private StudyTalbe studyTable;
	private IDangKi iDangKi;
	private boolean isDangNhap;

	public void dangKy(IDangKi iDangKi) {
		this.iDangKi = iDangKi;
		this.iDangKi.dangKy(this);
	}

	public void dangNhap(String userName, String passWord) {
		if (this.iDangKi == null) {
			System.out.println(this.name + " chưa đăng kí");
			return;
		}
		if (this.iDangKi.dangNhap(userName, passWord)) {
			this.iDangKi.napThongTin(this);
			isDangNhap = true;
		} else {
			System.out.println("Đăng nhập thất bại do sai thông tin");
		}
	}

	public Student(String name, String dOB, String job, String phone, String userName, String password) {
		this.name = name;
		this.dOB = dOB;
		this.job = job;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
		this.id = this.name + this.phone;
		this.studyTable = new StudyTalbe();
	}

	@Override
	public String toString() {
		return this.id + "_" + this.name + "_" + this.dOB + "_" + this.job + "_" + this.phone + "_" + this.userName
				+ "_" + this.password;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public interface IDangKi {

		public void dangKy(Student student);

		public void napThongTin(Student student);

		public boolean dangNhap(String userName, String password);
	}

	public String getId() {
		return id;
	}

	public StudyTalbe getStudyTable() {
		return studyTable;
	}

	public void setStudyTable(StudyTalbe studyTable) {
		this.studyTable = studyTable;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void hocTap() {
		if (isDangNhap) {
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			sc.next();
			switch (choice) {
			case TIM_KIEM:
				timKiem();
				break;
			case NHINTU_DOAN_NGHIA:
				doanNghia();
				break;
			case DOAN_DAP_AN_DUNG:
				doanDADung();
				break;
			case TIM_TU_DONG_NGHIA:
				timTuDongNghia();
				break;
			case THOAT:

				break;
			default:
				break;
			}
		} else {
			System.out.println("Khong hoc duoc");
		}
	}

	private void timTuDongNghia() {
		// TODO Auto-generated method stub
		
	}

	private void doanDADung() {
		// TODO Auto-generated method stub
		
	}

	private void doanNghia() {
		// TODO Auto-generated method stub
		
	}

	private void timKiem() {
		// TODO Auto-generated method stub
		
	}
}
