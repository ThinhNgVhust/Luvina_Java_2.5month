package com.thinhnv.ungdunghoctienganh.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.thinhnv.ungdunghoctienganh.student.Student;
import com.thinhnv.ungdunghoctienganh.student.Student.IDangKi;
import com.thinhnv.ungdunghoctienganh.studytable.StudyTalbe;
import com.thinhnv.ungdunghoctienganh.word.Word;

public class Manager implements IDangKi {
	private String value;
	private ArrayList<Word> lsWord;
	private ArrayList<Student> lsStudents;
	private static final String PATH = "/home/thinhnv/Desktop/Account.txt";
	private static final int TEN = 0;
	private static final int SO_DIEN_THOAI = 1;

	public Manager() {
		this.lsWord = new ArrayList<Word>();
		this.lsStudents = new ArrayList<Student>();
	}

	public void suaTuVung(String idTuVung, String newMeaning) {
		for (int i = 0; i < lsWord.size(); i++) {
			Word word = this.lsWord.get(i);
			if (word.getTitle().equalsIgnoreCase(idTuVung)) {
				word.setMean(newMeaning);
			}
		}
	}

	public void add(Word newWord) {
		if (this.lsWord.indexOf(newWord) == -1) {
			this.lsWord.add(newWord);
			System.out.println("Thêm từ mới thành công");
		} else {
			System.out.println("Thêm từ mới thất bại do từ được thêm trước đó");
		}
	}

	public void xoaTuVung(String idManager) {
		boolean isXoa = false;
		for (int i = 0; i < lsWord.size(); i++) {
			Word word = this.lsWord.get(i);
			if (word.getIdManager().equals(idManager)) {
				this.lsWord.remove(i);
				isXoa = true;
			}
		}
		if (isXoa) {
			System.out.println("Xóa thành công tất cả các từ vựng có idManager: " + idManager);
		} else {
			System.out.println("Không tồn tại idManager " + idManager);
		}
	}

	private ArrayList<Word> timKiemTuVung(String nghia) {
		ArrayList<Word> result = new ArrayList<Word>();
		for (int i = 0; i < lsWord.size(); i++) {
			Word word = this.lsWord.get(i);
			if (word.getMean().equalsIgnoreCase(nghia)) {
				result.add(word);
			}
		}
		if (result.size() == 0) {
			System.out.println("Không tìm thấy kết quả");
		} else {
			System.out.println("Tìm thấy " + result.size() + " kết quả");
		}
		return result;
	}

	public void hienThiDSTuVung() {
		System.out.println("Danh sách các từ vựng:");
		for (int i = 0; i < lsWord.size(); i++) {
			System.out.println(lsWord.get(i).toString());
		}
	}

	private void docFile() {
		File file = new File(PATH);
		if (!file.exists()) {
			new File(file.getParent()).mkdirs();
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		try {
			FileInputStream fileIn = new FileInputStream(file);
			String gio = "";
			int kyTu = fileIn.read();
			while (kyTu != -1) {
				if (kyTu != 10) {
					gio += (char) kyTu;
				}
				if (gio != "" && kyTu == 10) {
					String[] studentInfor = gio.split("_");
					Student st = new Student(studentInfor[1], studentInfor[2], studentInfor[3], studentInfor[4],
							studentInfor[5], studentInfor[6]);
					this.lsStudents.add(st);
					gio = "";

				}
				kyTu = fileIn.read();
			}
			fileIn.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void inTTDSHV() {
		this.lsStudents.clear();
		this.docFile();
		for (int i = 0; i < lsStudents.size(); i++) {
			System.out.println(lsStudents.get(i).toString());
		}
	}

	public ArrayList<Student> timKiem(int type, String value) {
		ArrayList<Student> result = new ArrayList<Student>();
		this.lsStudents.clear();
		this.docFile();
		for (int i = 0; i < lsStudents.size(); i++) {
			Student s = this.lsStudents.get(i);
			if (type == TEN) {
				if (s.getName().equalsIgnoreCase(value)) {
					result.add(s);
				}
			} else if (type == SO_DIEN_THOAI) {
				if (s.getPhone().equalsIgnoreCase(value)) {
					result.add(s);
				}
			}
		}
		System.out.println("Tìm thấy tất cả " + result.size() + " kết quả");
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
		return result;
	}

	private void ghiFile(String string) {
		// TODO Auto-generated method stub
		File file = new File(PATH);
		if (!file.exists()) {
			new File(file.getParent()).mkdirs();
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		try {
			FileOutputStream fileOut = new FileOutputStream(file, true);
			for (int i = 0; i < string.length(); i++) {
				fileOut.write(string.charAt(i));
			}
			fileOut.write(10);
			fileOut.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void dangKy(Student student) {
		this.lsStudents.clear();
		this.docFile();
		for (int i = 0; i < lsStudents.size(); i++) {
			Student s = this.lsStudents.get(i);
			if (s.getUserName().equals(student.getUserName())) {
				System.out.println("Đã có người đăng kí với tài khoản " + student.getUserName() + " này rồi ");
				return;
			}
			ghiFile(student.toString());
		}
	}

	@Override
	public boolean dangNhap(String userName, String password) {
		this.lsStudents.clear();
		this.docFile();
		for (int i = 0; i < lsStudents.size(); i++) {
			Student s = lsStudents.get(i);
			System.out.println(s.toString());
			if (s.getUserName().equals(userName) && s.getPassword().equals(password)) {
				creatFileForStudent(s);
				System.out.println("Đăng nhập thành công");
				return true;
			}
		}
		return false;
	}

	private void creatFileForStudent(Student s) {
		// TODO Auto-generated method stub
		String path = "/home/thinhnv/Desktop/BangHocTap/" + s.getId() + ".txt";
		File file = new File(path);
		if (!file.exists()) {
			new File(file.getParent()).mkdirs();
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		return;
	}

	@Override
	public void napThongTin(Student student) {
		// TODO Auto-generated method stub
		String path = "/home/thinhnv/Desktop/BangHocTap/" + student.getId() + ".txt";
		File file = new File(path);
		if (!file.exists()) {
			new File(file.getParent()).mkdirs();
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		try {
			FileInputStream fileIn = new FileInputStream(file);
			int kyTu = fileIn.read();
			String gio = "";
			while (kyTu != -1) {
				gio += (char) kyTu;
				kyTu = fileIn.read();
			}
			String[] infor = gio.split("\n");
			int size = infor.length;
			if (size < 2) {
				System.out.println("Chưa học bao giờ");
				return;
			} else {
				StudyTalbe studyTalbe = new StudyTalbe();
				String str1 = infor[0].split("_")[0];
				String str2 = infor[0].split("_")[1];
				String str3 = infor[0].split("_")[2];
				int diem1 = Integer.parseInt(str1);
				int diem2 = Integer.parseInt(str2);
				int diem3 = Integer.parseInt(str3);
				studyTalbe.setDiemBai1(diem1);
				studyTalbe.setDiemBai1(diem2);
				studyTalbe.setDiemBai1(diem3);
				String word1 = "";
				for (int i = 1; i < size; i++) {
					word1 = infor[i];
					String str[] = (word1.split(":"));
					studyTalbe.addWord(str[1], str[2]);// khong hieu sao doan nay bi exception
				}
				student.setStudyTable(studyTalbe);
			}
			fileIn.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());

		}
	}
}
