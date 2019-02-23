package com.thinhnv.smartstringapp.smartstring;

import java.util.ArrayList;

public class SmartString {
	private String text;
	private ArrayList<News> listNews = new ArrayList<News>();

	public SmartString(String text) {
		this.text = text;
	}

	public void filter() {
		String tmptxt = this.text;
		String[] arrString = tmptxt.split("\n");
		String title = "";
		String linkDetail = "";
		String imgLink = "";
		String date = "";
		String titleData = "<title><![CDATA[";
		int lengthTitleData = titleData.length();
		String endTitleData = "]]></title>";
		String linkDetailData = "<link><![CDATA[";
		int lengthLinkDetailData = linkDetailData.length();
		String endLinkDetailData = "]]></link>";
		String imgLinkData = "<img src=\\\"";
		int lengthImgLinkData = imgLinkData.length();
		String endImgLinkData = "\\\" />";
		String dateData = "<pubDate><![CDATA[";
		int lengthDateData = dateData.length();
		String endDataData = "]]></pubDate>";
		for (int i = 0; i < arrString.length; i++) {
			if (arrString[i].contains(titleData)) {
				title = arrString[i].substring(arrString[i].indexOf(titleData) + lengthTitleData,
						arrString[i].indexOf(endTitleData));
				System.out.println(title);
			} else if (arrString[i].contains(linkDetailData)) {
				linkDetail = arrString[i].substring(arrString[i].indexOf(linkDetailData) + lengthLinkDetailData,
						arrString[i].indexOf(endLinkDetailData));
				System.out.println(linkDetail);
			} else if (arrString[i].contains(imgLinkData)) {
				imgLink = arrString[i].substring(arrString[i].indexOf(imgLinkData) + lengthImgLinkData,
						arrString[i].indexOf(endImgLinkData));
				System.out.println(imgLink);
			} else if (arrString[i].contains(dateData)) {
				date = arrString[i].substring(arrString[i].indexOf(dateData) + lengthDateData,
						arrString[i].indexOf(endDataData));
				System.out.println(date);
			} else {
				continue;
			}
			if (title != "" && date != "" && imgLink != "" && linkDetail != "") {
				this.listNews.add(new News(title, linkDetail, imgLink, date));
				title = "";
				date = "";
				imgLink = "";
				linkDetail = "";
			}
		}
		System.out.println("-------------------------------------------");
		System.out.println("\t\t\tKet qua la: ");

		for (int i = 0; i < this.listNews.size(); i++) {
			System.out.println(this.listNews.get(i));
		}
	}
}
