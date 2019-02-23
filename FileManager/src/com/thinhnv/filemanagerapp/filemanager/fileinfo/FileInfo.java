package com.thinhnv.filemanagerapp.filemanager.fileinfo;

import java.io.File;
import java.text.DecimalFormat;

public class FileInfo {
	private static final float KB = 1024;
	private static final float MB = 1024 * 1024;
	private static final float GB = 1024 * 1024 * 1024;
	private static final float TB = 1024 * 1024 * 1024 * 1024;
	private String pathName;
	private String fileName;
	private File file;

	public FileInfo(File file) {
		this.pathName = file.getPath();
		this.fileName = file.getName();
		this.file = file;
	}

	public String getPathName() {
		return pathName;
	}

	public String getFileName() {
		return fileName;
	}

	public long size() {
		return this.file.length();
	}

	public String sizeToString() {
		long size = this.size();
		if (size < KB) {
			return (size) + " KBs";
		} else if (size < MB) {
			return format(size / KB) + " MBs";
		} else if (size < GB) {
			return format(size / MB) + " GBs";
		} else {
			return format(size / GB) + " TBs";
		}
	}

	private String format(double a) {
		String pattern = "###,###.##";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		String format = decimalFormat.format(a);
		return format;
	}

}
