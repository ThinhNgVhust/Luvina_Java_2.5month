import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class FileManager {
	private static final long KB = 1024;
	private static final long MB = 1024 * 1024;
	private static final long GB = 1024 * 1024 * 1024;
	private String pathname;
	private File file;
	private ArrayList<File> files = new ArrayList<File>();

	private String format(double a) {
		String pattern = "###,###.##";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		String format = decimalFormat.format(a);
		return format;
	}

	public FileManager(String path) {
		this.pathname = path;
		this.file = new File(pathname);
	}

	public void creatFile(boolean isRenew) {
		if (file.exists()) {
			if (isRenew) {
				this.file.delete();
				notify(" Xoa file thanh cong");
			} else {
				int choice = confirm("File da ton tai, tao moi nhe");
				if (choice != JOptionPane.YES_OPTION) {
					return;
				}
			}
		}
		try {
			this.file.createNewFile();
			notify("Tao file thanh cong");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			notify(e.getMessage());
		}
	}

	private int confirm(String sms) {
		return JOptionPane.showConfirmDialog(null, sms);
	}

	private void notify(String sms) {
		JOptionPane.showMessageDialog(null, sms);
	}

	public void rename(String newName) {
		if (newName == null) {
			notify("null");
			return;
		}
		if (this.file.exists()) {
			String oldSrc = this.file.getPath();
			String name = this.file.getName();
			String newSrc = this.file.getParent() + "/" + newName;
			File dest = new File(newSrc);
			if (this.file.renameTo(dest)) {
				notify("Doi ten file thanh cong");
				return;
			} else {
				notify("Doi ten file that bat");
				return;
			}
		} else {
			notify("File khong ton tai. Khong doi duoc ten file");
		}
	}

	private void showFile(File file2) {
		System.out.println("\n\n\tInfo");
		// TODO Auto-generated method stub
		System.out.println(file2.getName());
		System.out.println(file2.getPath());
		long size = file2.length();
		if (size < KB) {
			System.out.println(format(file2.length()) + " KBs");
		} else if (size < MB) {
			System.out.println(format((file2.length() / (1024F))) + "MBs");
		} else if (size < GB) {
			System.out.println(format((file2.length() / (1024F * 1024F))) + "GBs");
		} else {
			System.out.println(format((file2.length() / (1024F * 1024F * 1024F))) + "TBs");
		}
	}

	public void getSubFile() {
		ArrayList<File> list = new ArrayList<File>();

		list.addAll(Arrays.asList(this.file.listFiles()));
//		System.out.println(list.size());
		if (!this.file.exists()) {
			notify("File khong ton tai");
			return;
		} else {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).isFile()) {
					continue;
				} else if (list.get(i).isDirectory()) {
					list.addAll(Arrays.asList(list.get(i).listFiles()));
//					i--;
				}
			}
//			System.out.println("here");
			for (File file : list) {
				if (file.isFile()) {
					this.showFile(file);
				}
			}
		}
	}
//	public void getSubFile() {
//		if (!this.file.exists()) {
//			notify("File khong ton tai");
//			return;
//		} else {
//
//			File[] paths = this.file.listFiles();
//			for (int i = 0; i < paths.length; i++) {
//				if (paths[i].isFile()) {// && paths[i].getName().contains(extension)
//					this.files.add(paths[i]);
//				} else if (paths[i].isDirectory()) {
//					getSubFile1(paths[i]);
//				}
//			}
//			for (File file : this.files) {
//				this.showFile(file);
//			}
//		}
//	}

//	public void getSubFile() {
//		File[] listFiles = this.file.listFiles();
//		if (listFiles == null) {
//			System.out.println("Null");
//			return;
//		}
//		for (File file : listFiles) {
//			if (file.isFile()) {
//				showFile(file);
//			}
//		}
//	}
//	private void getSubFile1(File file2) {
//		// TODO Auto-generated method stub
////		System.out.println(extension);
//		File[] paths = file2.listFiles();
//		if (paths == null) {
//			return;
//		}
//		for (int i = 0; i < paths.length; i++) {
//			if (paths[i].isFile()) {
//				files.add(paths[i]);
//			} else {
//				getSubFile1(paths[i]);
//			}
//		}
//	}
}
