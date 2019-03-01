package com.thinhnv.grabcarapp.car;

public class Car {
	private static final char DEFAULT_POSITION_AT_A_STATION_IS_CHARACTER_A = 'A';
	private String carId;
	private String name;
	private String number;
	private String term;
	private String typePos;
	private int price;
	private char startPos;
	private char destPos;
	private int kmTotal;
	private int costTotal;

	public Car(String carId, String name, String number, String term, String typePos, int price) {
		this.carId = carId;
		this.name = name;
		this.number = number;
		this.term = term;
		this.typePos = typePos;
		this.price = price;
		this.kmTotal = 0;
		this.costTotal = 0;
		this.startPos = DEFAULT_POSITION_AT_A_STATION_IS_CHARACTER_A;
		this.destPos = DEFAULT_POSITION_AT_A_STATION_IS_CHARACTER_A;
	}

	public void showInfor() {
		System.out.println("Thông tin xe:");
		System.out.println("\tMã xe: " + carId);
		System.out.println("\tTên lái xe: " + name);
		System.out.println("\tBiển số: " + number);
		System.out.println("\tHãng xe: " + term);
		System.out.println("\tLoại xe: " + typePos);
		System.out.println("");
	}

	public int showCost() {
		System.out.println("\n------Hiển thị thu nhập của xe " + this.carId + " ------");
		System.out.println("Giá cước: " + price);
		System.out.println("Số km đã đi: " + kmTotal + " km");
		System.out.println("Thu nhập hiện tại của xe: " + costTotal);
		return costTotal;
	}

	public void drive(char startPos, char destPos) {
		this.startPos = startPos;
		this.destPos = destPos;
		int km = Math.abs((int) destPos - (int) startPos);
		this.kmTotal += km;
		int cost = km * this.price;
		this.costTotal += cost;
		System.out.println("Số tiền khách trả của lộ trình: ");
		System.out.println("\tTừ " + startPos + " đến " + destPos + " là " + cost + "\n");
	}

	public String getcarId() {
		return carId;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public String getTerm() {
		return term;
	}

	public String getTypePos() {
		return typePos;
	}

	public int getPrice() {
		return price;
	}

	public char getStartPos() {
		return startPos;
	}

	public char getdestPos() {
		return destPos;
	}

	public int getKmTotal() {
		return kmTotal;
	}

	public int getCostTotal() {
		return costTotal;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Car) {
			return this.carId.equalsIgnoreCase(((Car) obj).carId);
		}
		return false;
	}
}
