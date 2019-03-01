package com.thinhnv.quanlyuser.account;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

import com.thinhnv.quanlyuser.user.User;
import com.thinhnv.quanlyuser.user.User.IDangKy;

public class Account implements IDangKy {
	private List<User> users;
	private File fileDest;
	private Comparator<User> tcMaTK = new Comparator<User>() {
		@Override
		public int compare(User o1, User o2) {
			// TODO Auto-generated method stub
			return o1.getMaTK().compareToIgnoreCase(o2.getMaTK());
		}
	};

	public Account(String pathName) {
		users = new ArrayList<User>();
		fileDest = new File(pathName);
		if (!fileDest.exists()) {
			System.out.println("File chưa tồn tại, tạo mới file");
			new File(fileDest.getParent());
			try {
				if (fileDest.createNewFile()) {
					System.out.println("Tạo file thành công");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
	}

	public List<User> timKiemUser(String name) throws IOException {
		if (this.users.size() == 0) {
			getUsersInforFromFile();
		}
		if (this.users.size() == 0) {
			return null;
		}
		List<User> result = new ArrayList<User>();
		for (User user : users) {
			if (user.getTen().equalsIgnoreCase(name))
				result.add(user);
		}
		System.out.println("Tìm thấy " + result.size() + " kết quả!");
		return result;
	}

	public void xoaUser(String maTK) throws IOException {
		this.users.clear();
		getUsersInforFromFile();
		if (this.users.size() == 0) {
			System.out.println("Không tồn tại mã tài khoản " + maTK);
			return;
		}
		for (int i = 0; i < this.users.size(); i++) {
			if (this.users.get(i).getMaTK().equalsIgnoreCase(maTK)) {
				if (this.users.remove(i) != null) {
					System.out.println("Xóa thành công " + maTK);
					break;
				}
			} else {
				System.out.println("Không tồn tại " + maTK + " không xóa được");
				break;
			}
		}
		String newPath = this.fileDest.getParent();
		String newName = this.fileDest.getName();
		this.fileDest.delete();
		File newFile = new File(newPath + "/" + newName);
		if (!newFile.exists()) {
			newFile.createNewFile();
		}
		for (User user : users) {
			String gio = user.getMaTK() + "-" + user.getPass() + "-" + user.getTen() + "-" + user.getSDT();
			FileOutputStream fileOut;
			try {
				fileOut = new FileOutputStream(newFile, true);
				for (int i = 0; i < gio.length(); i++) {
					char kyTu = gio.charAt(i);
					try {
						fileOut.write(kyTu);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println("Error: writeUserToFile()_get char line 105\n" + e.getMessage());
					}
				}
				try {
					fileOut.write(10);
					fileOut.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				System.out.println("Error: writeUserToFile()" + e1.getMessage());
			}
		}
	}

	public void inTTUser() throws IOException {
		this.users.clear();
		getUsersInforFromFile();
		for (User user : users) {
			System.out.println(user);
		}
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		try {
			getUsersInforFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(" Error: getUsersInforFromFile: " + e.getMessage());
		}
		if (this.users.size() == 0||this.users.indexOf(user) == -1) {
			writeUserToFile(user);
			System.out.println("Đăng kí thành công cho " + user.getMaTK());
			user.dangKy(this);
		} else {
			System.out.println("Tài khoản " + user.getMaTK() + " đã tồn tại");
		}
	}

	private void getUsersInforFromFile() throws IOException {
		// TODO Auto-generated method stub
		String gio = "";
		FileInputStream fileIn = new FileInputStream(fileDest);
		if (fileDest.length() < 5) {
			fileIn.close();
			return;
		}
		int kyTu = fileIn.read();
		while (kyTu != -1) {
			if (kyTu == 10 && gio != "") {
				this.users.add(new User(gio.split("-")[0], gio.split("-")[1], gio.split("-")[2], gio.split("-")[3]));
				gio = "";
				continue;
			}
			if (kyTu != 10) {
				gio += (char) kyTu;
			}
			kyTu = fileIn.read();
		}
		fileIn.close();
	}

	private void writeUserToFile(User user) {
		// TODO Auto-generated method stub
		String gio = user.getMaTK() + "-" + user.getPass() + "-" + user.getTen() + "-" + user.getSDT();
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream(fileDest, true);
			for (int i = 0; i < gio.length(); i++) {
				char kyTu = gio.charAt(i);
				try {
					fileOut.write(kyTu);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Error: writeUserToFile()_get char line 105\n" + e.getMessage());
				}
			}
			try {
				fileOut.write(10);
				fileOut.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("Error: writeUserToFile()" + e1.getMessage());
		}
		;
	}

	@Override
	public void dangNhap(User user) {
		// TODO Auto-generated method stub
		this.users.clear();
		try {
			this.getUsersInforFromFile();
			if(this.users.indexOf(user)==-1) {
				System.out.println("Đăng nhập thất bại!");
			}else {
				System.out.println("Đăng nhập thành công!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
