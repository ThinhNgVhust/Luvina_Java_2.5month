package com.thinhnv.thal;

public class HocSinh {
	private String name;
	private int age;

	public HocSinh(String name) {
		this.name = name;
	}

	public HocSinh(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof HocSinh) {
			HocSinh hocsinh2 = (HocSinh) obj;
			return name.equals(hocsinh2.name);
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "\nHocSinh \n\tname=" + name + "\n\tage=" + age + "\n";
	}

}
