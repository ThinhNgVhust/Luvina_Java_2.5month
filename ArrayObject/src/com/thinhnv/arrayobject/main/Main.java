package com.thinhnv.arrayobject.main;

import com.thinhnv.arrayobject.object.ArrayPerson;
import com.thinhnv.arrayobject.object.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayPerson dataPeople = new ArrayPerson(100);
		dataPeople.insertPerson("Thinh", "Nguyen Van", 27);//0
		Person toan = new Person("Toan", "Nguyen", 26);
//		System.out.println(toan.getLastName().equals("Nguyen Thi"));
		dataPeople.insertPerson(toan);//1
		dataPeople.insertPerson("Phuc", "Nguyen Duc", 2);//2
		dataPeople.insertPerson("Lan", "Ng", 48);//3
		dataPeople.insertPerson("Hien", "Ng", 28);//4
//		System.out.println(dataPeople.arrPerson[4].getLastName().equals("Ng"));

		dataPeople.insertPerson("Hien", "Ng", 20);//5
		dataPeople.insertPerson("Hien", "Ng", 19);//6
		dataPeople.insertPerson("Hien", "Ng", 11);//7
		dataPeople.insertPerson("Hien", "Ng", 13);//8
		dataPeople.insertPerson("Hien", "Ng", 15);//9
		dataPeople.insertPerson("Hien", "Ng", 200);//10
		dataPeople.insertPerson("Huan", "Ng", 31);//11
		Person tuyet = new Person("Tuyet", "Nguyen Thi", 25);
		dataPeople.insertPerson(tuyet);//12
//		dataPeople.displayAll();
//		dataPeople.sortPerson();
//		System.out.println("");
//		System.out.println("");
//		System.out.println("	---------------------------------------");
//		System.out.println("		Danh sach sau khi sap xep la: ");
//		dataPeople.displayAll();
//		System.out.println("");
		System.out.println("");
		System.out.println("	---------------------------------------");
		System.out.println("		Danh sach sau khi xoa la: ");
		dataPeople.deletePerson("Ng");
		dataPeople.displayAll();
	
	}

}
