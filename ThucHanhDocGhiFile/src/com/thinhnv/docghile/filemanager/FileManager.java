package com.thinhnv.docghile.filemanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JOptionPane;

public class FileManager {
	private String srcPath;
	private String destPath;
	private File inFile;
	private File outFile;

	public FileManager(String srcPath, String destPath) {
		this.srcPath = srcPath;
		this.destPath = destPath;
		try {
			inFile = new File(srcPath);
			outFile = new File(destPath);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void readData() throws IOException {
		if (this.srcPath == null) {
			System.out.println("File  bil null");
			return;
		}
		String gio = "";
		FileInputStream filein;
		try {
			filein = new FileInputStream(inFile);
			int kyTu = filein.read();
			while (kyTu != -1) {
				gio += (char) kyTu;
				kyTu = filein.read();
			}
			filein.close();
			// TODO Auto-generated catch block
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("File khong ton tai");
		} finally {
			System.out.println(gio);
			System.out.println(srcPath);
		}

	}

	public void readDatas() {
		byte buff[] = new byte[1024];
		FileInputStream in;
		String gio = "";
		try {
			in = new FileInputStream(new File(srcPath));
			int len = in.read(buff);
			while (!(len < 1024)) {
				gio += new String(buff);
				len = in.read(buff);
			}
			gio += new String(buff, 0, len);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (StringIndexOutOfBoundsException e) {
		} finally {
			System.out.println(gio + " " + gio.length());
		}
	}

	public void writeData(String text, boolean isAppend) throws IOException {
		FileOutputStream out;
		try {
			out = new FileOutputStream(outFile, isAppend);
			out.write(text.getBytes());
			System.out.println("ghi file thanh cong");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

//path: C:/data.txt
//dest: D:/ABC/defe.txt	
	public void copyFile(String desPath) throws IOException {
		File desFile = new File(desPath);
		// tao file
		if (!desFile.exists()) {
			System.out.println((new File(desFile.getParent())).mkdirs() == true);
			desFile.createNewFile();
			System.out.println(desFile.exists());
		}
		// ghi file
		FileInputStream in = new FileInputStream(inFile);
		FileOutputStream out = new FileOutputStream(desFile);
		long sizein = inFile.length();
		long sizeout = desFile.length();
		byte[] buff = new byte[1024];
		int len = in.read(buff);
		while (len == 1024) {
			len = in.read(buff);
			out.write(buff, 0, len);
			System.out.println("Dowloading: ");
		}
		out.write(buff, 0, len);
		System.out.println("Thanh cong");
	}

	public void download(String link, String destPath) throws IOException {
		try {
			URL url = new URL(link);
			String name = link.substring(link.lastIndexOf("/") + 1);
			String nameDest = "anh"+ name.substring(name.indexOf('.'));
			System.out.println(nameDest);
			URLConnection conn = url.openConnection();
			InputStream in = conn.getInputStream();
			long size = conn.getContentLength();
			File outFile = new File(destPath);
			if (!outFile.exists()) {
				outFile.mkdirs();
				File fi = new File(destPath + "/" + nameDest);
				fi.createNewFile();
			}
			File f = new File(destPath + "/" + nameDest);
			FileOutputStream out = new FileOutputStream(f);
			byte[] buff = new byte[1024];
			long sizeOfOutPutFile = f.length();
			int len = in.read(buff);
			sizeOfOutPutFile+= len;
			while (len > -1) {
				out.write(buff, 0, len);
				sizeOfOutPutFile+= len;
				System.out.println("Downloading..." + (f.length()*100)/size+"%");
				len = in.read(buff);
			}
			in.close();
			out.close();
			System.out.println("Download success!");
			JOptionPane.showMessageDialog(null, "Tai thanh cong!\n" + destPath + "/" + nameDest);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
