package com.thinhnv.filemanagerapp.filemanager;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

import com.thinhnv.filemanagerapp.filemanager.fileinfo.FileInfo;

public class FileManager {
	private File file;

	public FileManager(String path) {
		this.file = new File(path);
	}

	private Comparator<FileInfo> tcNameASC = new Comparator<FileInfo>() {

		@Override
		public int compare(FileInfo o1, FileInfo o2) {
			// TODO Auto-generated method stub
			return o1.getFileName().compareTo(o2.getFileName());
		}
	};
	private Comparator<FileInfo> tcSizeDES = new Comparator<FileInfo>() {

		@Override
		public int compare(FileInfo o1, FileInfo o2) {
			// TODO Auto-generated method stub
			long result = -(o1.size() - o2.size());
			return result > 0 ? 1 : result == 0 ? 0 : -1;
		}
	};
	private Comparator<FileInfo> tcNameASCSizeDes = new Comparator<FileInfo>() {

		@Override
		public int compare(FileInfo o1, FileInfo o2) {
			// TODO Auto-generated method stub
			int nameASC = tcNameASC.compare(o1, o2);
			if (nameASC == 0) {
				return tcSizeDES.compare(o1, o2);
			} else {
				return nameASC;
			}
		}
	};

	public void findByExtension(String extension) {
		if (!this.isExist()) {
			notify("File khong ton tai. ");
			return;
		} else if (extension == null) {
			notify("Nhap vao null thi khong tim duoc");
			notify("Ket thuc");
			return;
		}
		ArrayList<FileInfo> listFileInfor = new ArrayList<FileInfo>(findAllFiles(extension));
		notify("Bat dau tim kiem file co duoi " + extension);
		for (int i = 0; i < listFileInfor.size(); i++) {
			System.out.println(listFileInfor.get(i).getPathName());
		}
		System.out.println("Total files: " + listFileInfor.size());

	}

	public void sortByNameSize() {
		ArrayList<FileInfo> tmp = findAllFiles();
		if (tmp == null) {
			notify("Khong sap xep duoc");
			return;
		}
		ArrayList<FileInfo> result = new ArrayList<FileInfo>();
		result.addAll(tmp);
		notify("Bat dau tim kiem va sap xep");
		result.sort(tcNameASCSizeDes);
		for (FileInfo fileInfo : result) {
			System.out.println(fileInfo.getFileName() + " .Size: " + fileInfo.sizeToString());
		}
		System.out.println("Total files: " + result.size());
		notify("Tim kiem file va sap xep ket thuc!");
	}

	private ArrayList<FileInfo> findAllFiles(String extension) {
		// TODO Auto-generated method stub
		ArrayList<FileInfo> listFileInfor = new ArrayList<FileInfo>();
		ArrayList<File> listFiles = new ArrayList<File>();
		if (this.file.isFile()) {
			ArrayList<FileInfo> result = new ArrayList<FileInfo>();
			result.add(new FileInfo(this.file));
			return result;
		}
		listFiles.addAll(Arrays.asList(this.file.listFiles()));
		for (int i = 0; i < listFiles.size(); i++) {
			if (listFiles.get(i).isDirectory()) {
				listFiles.addAll(Arrays.asList(listFiles.get(i).listFiles()));
			}
		}
		for (int i = 0; i < listFiles.size(); i++) {
			if (listFiles.get(i).isFile() && listFiles.get(i).getName().contains(extension)) {
				listFileInfor.add(new FileInfo(listFiles.get(i)));
			}
		}
		return listFileInfor;
	}

	private ArrayList<FileInfo> findAllFiles() {
		// TODO Auto-generated method stub
		if (!file.exists()) {
			return null;
		}
		ArrayList<FileInfo> listFileInfor = new ArrayList<FileInfo>();
		ArrayList<File> listFiles = new ArrayList<File>();
		if (this.file.isFile()) {
			ArrayList<FileInfo> result = new ArrayList<FileInfo>();
			result.add(new FileInfo(this.file));
			return result;
		}
		listFiles.addAll(Arrays.asList(this.file.listFiles()));
		for (int i = 0; i < listFiles.size(); i++) {
			if (listFiles.get(i).isDirectory()) {
				listFiles.addAll(Arrays.asList(listFiles.get(i).listFiles()));
			}
		}
		for (int i = 0; i < listFiles.size(); i++) {
			if (listFiles.get(i).isFile()) {
				listFileInfor.add(new FileInfo(listFiles.get(i)));
			}
		}
		return listFileInfor;
	}

	private boolean isExist() {
		return file.exists();
	}

	private void notify(String sms) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, sms);
	}

}
