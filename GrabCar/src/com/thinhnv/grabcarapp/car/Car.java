package com.thinhnv.grabcarapp.car;

public class Car {
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
		this.startPos = 'A';
		this.destPos = 'A';
	}

	public void showInfor() {
		System.out.println("\tCar information:");
		System.out.println("\tcarId: " + carId);
		System.out.println("\tTên lái xe: " + name);
		System.out.println("\tBiển số: " + number);
		System.out.println("\tHãng xe: " + term);
		System.out.println("\tLoại xe: " + typePos);
	}

	public int showCost() {
		System.out.println("\n        Cost information");
		System.out.println("Giá cước: " + price);
		System.out.println("Số km đã đi: " + kmTotal);
		System.out.println("Thu nhập hiện tại của xe: " + costTotal);
		return costTotal;
	}

	public void drive(char startPos, char destPos) {
		this.startPos = startPos;
		this.destPos = destPos;
		int km = (int) destPos - (int) startPos;
		int cost = Math.abs(km) * this.price;
		this.costTotal += cost;
		System.out.println("Số tiền khách trả của lộ trình: ");
		System.out.println("\tTừ " + startPos + " đến " + destPos + " là " + cost+"\n");
		// trả về một thông tin lộ trình đường đi
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
