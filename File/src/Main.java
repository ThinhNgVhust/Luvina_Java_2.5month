import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/home/thinhnv/Desktop/[BTVN]-Java Swing1.pages";
//		File file = new File(path);
//		boolean kq = file.exists();
//		if (kq) {
//			JOptionPane.showMessageDialog(null, "File da ton tai");
//		} else {
//			try {
//				file.createNewFile();
//				JOptionPane.showMessageDialog(null, "Tao file thanh cong");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				JOptionPane.showMessageDialog(null, "Tao file khong thanh cong");
//				System.out.println(e.getMessage());
//			}
//		}
//		if (file.delete()) {
//			JOptionPane.showMessageDialog(null, "Xoa file thanh cong");
//		} else {
//			JOptionPane.showMessageDialog(null, "Dang duoc su dung boi tien trinh khac");
//		}
//		FileManager fileManager = new FileManager(path);
//		fileManager.creatFile(false);
//		long start = System.currentTimeMillis();
//		long start1 = System.nanoTime();

//		String path1 = "/home/thinhnv/Desktop/abc/def/ghi/thinh.txt";
//		String dirStr = path1.substring(0, path1.lastIndexOf('/'));
		// dung get Parent cho an toan hon
//		System.out.println(dirStr);
//		File file2 = new File(dirStr);
//		String parentStr = file2.getParent();
//		System.out.println(parentStr);
//		System.out.println(file2.getPath());
//		file2.mkdirs();
//		try {
//			file2 = new File(path1);
//			file2.createNewFile();
////			file2.getP
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		FileManager fileManager = new FileManager(path);
		if(!fileManager.isExist()) {
			fileManager.creatFile(true);
		}else {
			fileManager.creatFile(false);
		}		
//		try {
//			fileManager.rename("t.txt");
//		} catch (Exception e) {
//			 TODO: handle exception
//			System.out.println(e.getMessage());
//		}
//		File thinh = new File(path);
//		fileManager.getSubFile();
		
	}
}
