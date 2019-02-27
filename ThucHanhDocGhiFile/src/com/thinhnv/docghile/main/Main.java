package com.thinhnv.docghile.main;

import java.io.File;
import java.io.IOException;

import com.thinhnv.docghile.filemanager.FileManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String srcPath = "/home/thinhnv/Desktop/CE";
		String destPath = "/home/thinhnv/Desktop/Downloads";
		String link = "https://cdn.cnn.com/cnnnext/dam/assets/190219203939-obama-stephen-curry-ankles-town-hall-large-169.jpg";
		FileManager fileManager = new FileManager(srcPath, destPath);
		try {
			fileManager.download(link, destPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
