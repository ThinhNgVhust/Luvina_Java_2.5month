package com.thinhnv.grabcarapp.schedule;

public class Schedule {
	private String carId;
	private String number;
	private String userId;
	private String userName;
	private char startPos;
	private char destPos;
	private int kmTotal;
	private int cost;

	public Schedule(String carId, String number, String userId, String userName, char startPos, char destPos,
			int kmTotal, int cost) {
		this.carId = carId;
		this.number = number;
		this.userId = userId;
		this.userName = userName;
		this.startPos = startPos;
		this.destPos = destPos;
		this.kmTotal = kmTotal;
		this.cost = cost;
	}

	public void showInfor() {
		System.out.println("Thông tin lộ trình");
		System.out.println("\tMã xe: " + carId);
		System.out.println("\tBiển số: " + number);
		System.out.println("\tMã tài khoản: " + userId);
		System.out.println("\tHọ tên người dùng: " + userName);
		System.out.println("\tVị trí đầu: " + startPos);
		System.out.println("\tVị trí kết thúc: " + destPos);
		System.out.println("\tSố km: " + kmTotal);
		System.out.println("\tChi phí: " + cost+"\n");
	}

	public String getCarId() {
		return carId;
	}

	public String getNumber() {
		return number;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public char getStartPos() {
		return startPos;
	}

	public char getDestPos() {
		return destPos;
	}

	public int getKmTotal() {
		return kmTotal;
	}

	public int getCost() {
		return cost;
	}

}
