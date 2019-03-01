package com.thinhnv.grabcarapp.main;

import com.thinhnv.grabcarapp.car.Car;
import com.thinhnv.grabcarapp.carmgr.CarMgr;
import com.thinhnv.grabcarapp.user.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Oto1", "Hoàng Văn Nam", "29B-1145", "Hyuadai", "4 chỗ", 10000);
		Car c2 = new Car("Oto2", "Trần Tính", "29B-1234", "Toyota", "4 chỗ", 12000);
		Car c3 = new Car("Oto3", "Đặng Nam Anh", "29B-1115", "Audi", "7 chỗ", 13000);
		Car c4 = new Car("Oto4", "Nguyễn Tuấn Vũ", "29B-3452", "Mescedes", "7 chỗ", 13000);
		Car c5 = new Car("Oto5", "Trần Dục Đức", "29B-9821", "Hyuadai", "4 chỗ", 8000);
		Car c6 = new Car("Oto6", "Trịnh Thị Thủy", "29B-2241", "Hyuadai", "7 chỗ", 14000);
		User thinh = new User("1", "1", "Thịnh");
		User thinh1 = new User("1", "1", "Thịnh");
		CarMgr carMgr = new CarMgr("Dỗ Nam Trung");
		carMgr.addCar(c1);
		carMgr.addCar(c2);
		carMgr.addCar(c3);
		carMgr.addCar(c4);
		carMgr.addCar(c5);
		carMgr.addCar(c6);
		carMgr.showAllCarInfor();
		thinh.addFindAndMoveListener(carMgr);
		thinh1.addFindAndMoveListener(carMgr);
		thinh.findCar('A', 'F', "7 chỗ");
		thinh.findCar('E', 'G', "7 chỗ");
		thinh.findCar('A', 'G', "7 chỗ");
		thinh.findCar('A', 'G', "4 chỗ");
		thinh.findCar('B', 'Z', "4 chỗ");
		thinh.showAllSchedule();
		thinh1.findCar('A', 'F', "7 chỗ");
		thinh1.findCar('E', 'G', "7 chỗ");
		thinh1.findCar('A', 'G', "7 chỗ");
		thinh1.findCar('A', 'G', "4 chỗ");
		thinh1.findCar('B', 'Z', "4 chỗ");
		thinh1.showAllSchedule();
		carMgr.showTotalCost();
	}

}
