package com.thinhnv.quanlyuser.quanlyuser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.thinhnv.quanlyuser.account.Account;
import com.thinhnv.quanlyuser.user.User;
import com.thinhnv.quanlyuser.user.User.IDangKy;

public class QuanLyUser implements IDangKy {
	private List<User> users;
	private File fileDest;
	private Comparator<User> tcTenTang = new Comparator<User>() {

		@Override
		public int compare(User o1, User o2) {
			// TODO Auto-generated method stub
			return o1.getTen().compareTo(o2.getTen());
		}
	};

	public QuanLyUser(String path) {
		users = new ArrayList<User>();
		fileDest = new File(path);
		if (!isExist()) {
			System.out.println("Chua ton tai file");
			new File(fileDest.getParent()).mkdirs();
			boolean rs = false;
			try {
				rs = fileDest.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			if (rs) {
				System.out.println("Tao file moi thanh cong: " + fileDest.getName());
			}
		}
	}

	private boolean isExist() {
		return fileDest.exists();
	}

	@Override
	public void dangKy(User user) {
		// TODO Auto-generated method stub
		this.users.clear();
		docUserTuFile();
		if (this.users.size() == 0) {
			ghiUserVaoFile(user);
			System.out.println("Dang ki thanh cong");
			return;
		}
		if (!tonTaiUser(user)) {
			ghiUserVaoFile(user);
			System.out.println("Dang ki thanh cong");
			return;
		}
		System.out.println("Da ton tai tai khoan ma " + user.getAccount().getMaTK());
	}

	@Override
	public void dangNhap(String maTK, String matKhau) {
		// TODO Auto-generated method stub
		this.users.clear();
		this.docUserTuFile();
		if (this.users.size() == 0) {
			System.out.println("Tai khoan " + maTK + " khong ton tai");
			return;
		}
		for (User user : users) {
			Account account = user.getAccount();
			if (account.getMaTK().equals(maTK)) {
				if (account.getMatKhau().equals(matKhau)) {
					System.out.println("Dang nhap thanh cong!!!");
				} else {
					System.out.println("Sai mat khau, dang nhap that bai");
				}
				return;
			}
		}
	}

	public List<User> timKiemTheoTeo(String name) {
		this.users.clear();
		this.docUserTuFile();
		if (this.users.size() == 0) {
			System.out.println("Khong ton tai tai khoan co nguoi dung ten la: " + name);
			return null;
		}
		List<User> listUsers = new ArrayList<User>();
		for (User user : users) {
			if (user.getTen().equalsIgnoreCase(name))
				listUsers.add(user);
		}
		System.out.println("Tim thay " + listUsers.size() + " ket qua");
		return listUsers;

	}

	public void sapXepTheoTen() {
		this.users.clear();
		this.docUserTuFile();
		if (this.users.size() == 0) {
			System.out.println("Chua co user");
			return;
		}
		this.users.sort(tcTenTang);
		for (User user : users) {
			System.out.println(user.getTen() + " " + user.getSdt() + " " + user.getAccount().getMaTK());
		}
	}

	public void xoaUser(String maTK) {
		this.users.clear();
		this.docUserTuFile();
		if (this.users.size() == 0) {
			System.out.println("Chua co user trong quan ly user");
			return;
		}
		boolean deleted = false;
		for (User user : users) {
			if (user.getAccount().getMaTK().equals(maTK)) {
				this.users.remove(user);
				System.out.println("Xoa thanh cong tai khoan " + maTK
						+ " noi dung: co y xuc pham admin hoac chui tuc cong dong game lanh manh");
				deleted = true;
				break;
			}
		}
		if (!deleted) {
			System.out.println("Khong ton tai tai khoan " + maTK);
		}
		creatNewFile();
		for (int i = 0; i < this.users.size(); i++) {
			this.ghiUserVaoFile(users.get(i));

		}
	}

	private void creatNewFile() {
		// TODO Auto-generated method stub
		this.fileDest.delete();
		try {
			this.fileDest.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean tonTaiUser(User user) {
		// TODO Auto-generated method stub
		return this.users.indexOf(user) >= 0;
	}

	private void ghiUserVaoFile(User user) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fileOut = new FileOutputStream(fileDest, true);
			String gio = user.getAccount().getMaTK() + "-" + user.getAccount().getMatKhau() + "-" + user.getTen() + "-"
					+ user.getSdt();
			int length = gio.length();
			for (int i = 0; i < length; i++) {
				char kyTu = gio.charAt(i);
				fileOut.write((int) kyTu);
			}
			fileOut.write(10);
			fileOut.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Can write into " + fileDest.getName() + ": " + e.getMessage());
		}

	}

	private void docUserTuFile() {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileIn = new FileInputStream(fileDest);
			if (fileDest.length() < 3)
				return;
			String gio = "";
			int kyTu = fileIn.read();
			while (kyTu != -1) {
				if (kyTu == 10 && gio != "") {
					String[] userInfor = gio.split("-");
					Account account = new Account(userInfor[0], userInfor[1]);
					String ten = userInfor[2];
					String sdt = userInfor[3];
					addUserIntoList(account, ten, sdt);
					gio = "";
				}
				gio += kyTu == 10 ? "" : (char) kyTu;
				kyTu = fileIn.read();

			}

			fileIn.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't read file " + fileDest.getName() + ": " + e.getMessage());
		}

	}

	private void addUserIntoList(Account account, String ten, String sdt) {
		this.users.add(new User(account, ten, sdt));
	}

	public void xoaData() {
		this.fileDest.delete();
		try {
			this.fileDest.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
