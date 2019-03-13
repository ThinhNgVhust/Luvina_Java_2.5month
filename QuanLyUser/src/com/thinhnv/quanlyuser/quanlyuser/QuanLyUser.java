package com.thinhnv.quanlyuser.quanlyuser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

import com.thinhnv.quanlyuser.account.Account;
import com.thinhnv.quanlyuser.user.User;
import com.thinhnv.quanlyuser.user.User.IHanhVi;

public class QuanLyUser implements IHanhVi {
	private ArrayList<User> listUsers;
	private String path;
	private Comparator<User> tcName = new Comparator<User>() {

		@Override
		public int compare(User o1, User o2) {
			// TODO Auto-generated method stub
			if (o1 instanceof User && o1 instanceof User) {
				return o1.soSanhTheoTen(o2);
			}
			return 0;
		}
	};

	public QuanLyUser(String path) {
		this.path = path;
		listUsers = new ArrayList<User>();
	}

	public void updateData() {
		this.listUsers.clear();
		try {
			File file = new File(path);
			if (!file.exists()) {
				new File(file.getParent()).mkdirs();
				file.createNewFile();
			}
			FileInputStream fileIn = new FileInputStream(file);
			int kyTu = fileIn.read();
			String gio = "";
			while (kyTu != -1) {
				if (kyTu != 10) {
					gio += (char) kyTu;
				}
				if (kyTu == 10 && gio != "") {
					String[] userInfor = gio.split("-");
					this.listUsers.add(new User(userInfor[2], userInfor[3], new Account(userInfor[0], userInfor[1])));
					gio = "";
				}
				kyTu = fileIn.read();
			}
			fileIn.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		this.listUsers.remove(0);
	}

	public void writeFile() {
		try {
			File file = new File(path);
			if (!file.exists()) {
				new File(file.getParent()).mkdirs();
				file.createNewFile();
			}
			FileOutputStream fileOut = new FileOutputStream(file);
			String title = "User Information format: MaTK-TenTK-HoVaTen-SoDienThoai";
			for (int i = 0; i < title.length(); i++) {
				fileOut.write(title.charAt(i));
			}
			fileOut.write(10);
			for (User user : listUsers) {
				String userInfor = user.toString();
				for (int i = 0; i < userInfor.length(); i++) {
					fileOut.write(userInfor.charAt(i));
				}
				fileOut.write(10);
			}
			fileOut.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<User> findUserByName(String name) {
		this.listUsers.clear();
		this.updateData();
		if (this.listUsers.size() == 0) {
			System.out.println("Danh sach trong nen khong xoa duoc");
			return null;
		}
		ArrayList<User> rs = new ArrayList<User>();
		for (User user : listUsers) {
			if (user.getHoTen().equalsIgnoreCase(name)) {
				rs.add(user);
			}
		}
		return rs;
	}

	public void deleteUser(String maTaiKhoan) {
		this.listUsers.clear();
		updateData();
		for (int i = 0; i < this.listUsers.size(); i++) {
			User user = this.listUsers.get(i);
			if (user.getAcount().getMaTK().equals(maTaiKhoan)) {
				this.listUsers.remove(i);
				break;
			}
		}
		this.writeFile();
		updateData();
	}

	public void sapXepVaInTTTheoTen() {
		System.out.println("Sap xep danh sach user theo ten");
		updateData();
		this.listUsers.sort(this.tcName);
		for (User user : listUsers) {
			System.out.println(user.toString());
		}
		this.writeFile();
	}

	@Override
	public void dangKi(Account account, String hoTen, String soDT) {
		// TODO Auto-generated method stub
		String maTK = account.getMaTK();
		String matKhau = account.getMatKhau();
		this.listUsers.clear();
		updateData();
		for (int i = 0; i < this.listUsers.size(); i++) {
			User user = this.listUsers.get(i);
			if (user.getAcount().getMaTK().equals(maTK)) {
				System.out.println("Da co nguoi dang ki ma tai khoan nay");
				return;
			}
		}
		User userRe = new User(hoTen, soDT, account);
		this.listUsers.add(userRe);
		this.writeFile();
		System.out.println("Dang ki thanh cong");
	}

	@Override
	public boolean dangNhap(Account account) {
		// TODO Auto-generated method stub
		this.listUsers.clear();
		updateData();
		for (int i = 0; i < this.listUsers.size(); i++) {
			User user = this.listUsers.get(i);
			if (user.getAcount().equals(account)) {
				return true;
			}
		}
		return false;
	}
}
