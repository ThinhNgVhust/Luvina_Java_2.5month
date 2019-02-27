package com.thinhnv.grabcarapp.carmgr;

import java.util.ArrayList;
import java.util.List;

import com.thinhnv.grabcarapp.car.Car;
import com.thinhnv.grabcarapp.schedule.Schedule;
import com.thinhnv.grabcarapp.user.User.FindAndMoveListener;

public class CarMgr implements FindAndMoveListener {
	private String name;
	private List<Car> listCar;

	public CarMgr(String name) {
		this.name = name;
		listCar = new ArrayList<Car>();
	}

	public void addCar(Car car) {
		if (this.listCar.indexOf(car) == -1) {
			this.listCar.add(car);
			System.out.println("Thêm xe thành công");
			return;
		} else {
			System.out.println("Đã tồn tại xe với mã " + car.getcarId() + " không thêm được xe!");
		}

	}

	public void showAllCarInfor() {
		if (this.listCar.isEmpty()) {
			System.out.println("Danh sách ô tô trống, không hiển thị được thông tin");
		} else {

			System.out.println("-------------Thông tin các xe của quản lý " + name + "-------------");
			for (Car car : listCar) {
				car.showInfor();
			}
			System.out.println("-----------------------------Kết thúc-----------------------------");
		}
	}

	public Car findCar(String carId) {
		if (this.listCar.size() == 0) {
			System.out.println("Danh sách ô tô trống, không tìm được! Trả về null");
			return null;
		} else {
			for (Car car : listCar) {
				if (car.getcarId().equalsIgnoreCase(carId))
					return car;
			}
		}
		System.out.println("Không tìm thấy ô tô nào có mã " + carId + " trả về null");
		return null;
	}

	@Override
	public Car find(char startPos, char destPos, String typePos) {
		// TODO Auto-generated method stub
		// tim kiem va tra ve o to toi uu theo vi tri hien tai
		if (this.listCar.isEmpty()) {
			System.out.println("Công ty của " + name + " hiện chưa có ô tô nào để phục vụ quí khách!!!");
			return null;
		}
		List<Car> rightTypePosCar = new ArrayList<Car>();
		for (Car car : this.listCar) {
			if (car.getTypePos().equalsIgnoreCase(typePos))
				rightTypePosCar.add(car);
		}
		if (rightTypePosCar.isEmpty()) {
			System.out.println("Không tìm được loại xe " + typePos + " theo yêu cầu, đề nghị quí khách vẫy xe khác!");
			return null;
		}
		// neu chi tim thay 1 xe
		if (rightTypePosCar.size() == 1) {
			return rightTypePosCar.get(0);
		}
		// neu tim thay nhieu xe co cung typePos
		// thi tim kiem vi tri gan nhat

		// tim kiem vi tri gan nhat
		int minDistance = Math.abs(startPos - rightTypePosCar.get(0).getdestPos());
		for (int i = 0; i < rightTypePosCar.size(); i++) {
			int curDistance = Math.abs(rightTypePosCar.get(i).getdestPos() - startPos);
			if (curDistance < minDistance) {
				minDistance = curDistance;
			}
		}
		// lay cac xe co vi tri min
		List<Car> minDistanceCar = new ArrayList<Car>();
		for (int i = 0; i < rightTypePosCar.size(); i++) {
			int curDistance = Math.abs(rightTypePosCar.get(i).getdestPos() - startPos);
			if (curDistance == minDistance) {
				minDistanceCar.add(rightTypePosCar.get(i));
			}
		}
		// lay tiep cac oto co chi phi re nhat
		Car rightCar = minDistanceCar.get(0);
		for (int i = 0; i < minDistanceCar.size(); i++) {
			if (rightCar.getPrice() >= minDistanceCar.get(i).getPrice())
				rightCar = minDistanceCar.get(i);
		}
		return rightCar;
	}

	@Override
	public void move(char startPos, char destPos, String cardId) {
		// TODO Auto-generated method stub
		Car car = this.findCar(cardId);
		if (car == null) {
			return;
		}
		car.drive(startPos, destPos);
		return;
	}

	public void showTotalCost() {
		int totalCost = 0;
		for (Car car : listCar) {
			totalCost += car.getCostTotal();
		}
		System.out.println("Tổng số tiền thu nhập của quản lý " + name + " là: " + totalCost);
	}
}
