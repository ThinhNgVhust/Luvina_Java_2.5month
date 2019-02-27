package com.thinhnv.grabcarapp.user;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.SheetCollate;

import com.thinhnv.grabcarapp.car.Car;
import com.thinhnv.grabcarapp.schedule.Schedule;

public class User {
	private String userId;
	private String pass;
	private String name;
	List<Schedule> listSchedule = new ArrayList<Schedule>();
	private FindAndMoveListener findAndMoveListener;

	public User(String userId, String pass, String name) {
		this.userId = userId;
		this.pass = pass;
		this.name = name;
	}

	public void showInfor() {
		System.out.println("\nUser information: ");
		System.out.println("\tMã id người dùng: " + userId);
		System.out.println("\tTên người dùng: ");
		System.out.println("");
	}

	public void addFindAndMoveListener(FindAndMoveListener event) {
		this.findAndMoveListener = event;
	}

	public void findCar(char startPos, char destPos, String typePos) {
		if (this.findAndMoveListener == null) {
			System.out.println(name
					+ " chưa đăng kí lắng nghe và nhận phản hồi từ bất cứ nhà xe nào \n   nên không thể tìm kiếm xe");
			return;
		}
		Car car = this.findAndMoveListener.find(startPos, destPos, typePos);
		if (car == null) {

			return;
		}
		System.out.println("Kết quả tìm kiếm phù hợp nhất là: ");
		car.showInfor();
		String carId = car.getcarId();
		this.findAndMoveListener.move(startPos, destPos, carId);
		int kmTotal = (int) Math.abs(startPos - destPos);
		int cost = car.getPrice() * kmTotal;
		Schedule schedule = new Schedule(carId, car.getNumber(), car.getTypePos(), this.name, startPos, destPos,
				kmTotal, cost);
		this.listSchedule.add(schedule);
		schedule.showInfor();

	}

	public void showAllSchedule() {
		if (this.listSchedule.size() == 0) {
			System.out.println(name + " chưa đi đâu hết. Không có danh sách lộ trình");
			return;
		}
		System.out.println("\n----------Danh sách lộ trình của " + name + "----------");
		int totalCost = 0;
		int stt = 1;

		for (Schedule schedule : listSchedule) {
			System.out.print((stt++) + " ");
			schedule.showInfor();
			totalCost += schedule.getCost();
		}
		System.out.println("Tổng chi phí mà " + name + " phải trả cho toàn bộ lộ trình: " + totalCost);
		System.out.println("-----------------------------------------------------\n");
	}

	public interface FindAndMoveListener {
		public Car find(char startPos, char desPos, String typePos);

		public void move(char startPos, char destPos, String cardId);
	}
}
