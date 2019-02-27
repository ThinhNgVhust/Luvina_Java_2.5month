package com.thinhnv.grabcarapp.main;

import com.thinhnv.grabcarapp.car.Car;
import com.thinhnv.grabcarapp.carmgr.CarMgr;
import com.thinhnv.grabcarapp.user.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Oto1", "Hoàng Văn Nam", "29B-1145", "Hyuadai", "4 chỗ", 10000);
		Car c2 = new Car("Oto2", "Trần Tính", "29B-1145", "Toyota", "4 chỗ", 12000);
		Car c3 = new Car("Oto3", "Đặng Nam Anh", "29B-1145", "Audi", "7 chỗ", 13000);
		Car c4 = new Car("Oto4", "Nguyễn Tuấn Vũ", "29B-1145", "Mescedes", "7 chỗ", 13000);
		Car c5 = new Car("Oto5", "Trần Dục Đức", "29B-1145", "Hyuadai", "4 chỗ", 8000);
		Car c6 = new Car("Oto6", "Trịnh Thị Thủy", "29B-1145", "Hyuadai", "7 chỗ", 14000);

		User thinh = new User("1", "1", "Thịnh");
		User phuong = new User("1", "1", "Phương");
		phuong.showInfor();
		phuong.showAllSchedule();
		phuong.findCar('A', 'A', "4 chỗ");
		CarMgr carMgr = new CarMgr("Thành");
		carMgr.addCar(c1);
		carMgr.addCar(c2);
		carMgr.addCar(c3);
		carMgr.addCar(c4);
		carMgr.addCar(c5);
		carMgr.addCar(c6);
		thinh.addFindAndMoveListener(carMgr);// đăng kí lắng nghe và nhận phản hồi từ CarMgr
		thinh.findCar('A', 'F', "7 chỗ");// tìm kiếm xe
		thinh.findCar('E', 'G', "7 chỗ");// tìm kiếm xe
		thinh.findCar('A', 'G', "7 chỗ");
		thinh.findCar('A', 'G', "17 chỗ");
		thinh.showAllSchedule();
		phuong.findCar('B', 'D', "4 chỗ");
		carMgr.showTotalCost();

	}

}
