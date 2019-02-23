package com.thinhnv.filemanagerapp.main;

import java.io.File;
import java.util.ArrayList;

import com.thinhnv.filemanagerapp.filemanager.FileManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/home/thinhnv/Desktop";
		FileManager fileManager = new FileManager(path);
		System.out.println("-------------------fileManager.findByExtension(\".txt\");------------------------");
		fileManager.findByExtension(".class");
		System.out.println("-------------------fileManager.endFindByExtension(\".txt\");------------------------\n\n");
		System.out.println("-------------------fileManager.sortByNameSize();------------------------");
		fileManager.sortByNameSize();
		System.out.println("-------------------fileManager.endSortByNameSize();------------------------\n\n");
	}

}
