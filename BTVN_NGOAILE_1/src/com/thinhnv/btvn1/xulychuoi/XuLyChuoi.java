package com.thinhnv.btvn1.xulychuoi;

public class XuLyChuoi {
	private String text;

	public XuLyChuoi(String text) {
		this.text = text;
	}

	public void checkType() {
		try {
			System.out.println(Integer.parseInt(text));
		} catch (Exception e) {
			// TODO: handle exception
			try {
				System.out.println(Double.parseDouble(text));
			} catch (Exception e2) {
				// TODO: handle exception
				if (text.equalsIgnoreCase("true") || text.equalsIgnoreCase("false")) {
					System.out.println("Boolean");
				} else {
					throw new NullPointerException("Undefined");
				}
			}
		}

	}
}
