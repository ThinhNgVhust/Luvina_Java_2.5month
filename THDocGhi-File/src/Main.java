import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StudentManager s = new StudentManager();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			char kyTu = str.charAt(i);
			System.out.println((int) kyTu);
		}
//		int count = 0;
//		while (true) {
//			System.out.println("Nhập thông tin học sinh thứ " + (count + 1));
//			System.out.println("Tên: ");
//			String name = sc.nextLine();
//			System.out.println("Điểm: ");
//			boolean nhapSai = true;
//			while (nhapSai) {
//				try {
//					double diem = sc.nextDouble();
//					sc.nextLine();
//					s.addStudent(name, diem);
//					nhapSai = false;
//				} catch (Exception e) {
//					// TODO: handle exception
//					System.out.println("Bạn đã nhập sai, hãy nhập lại");
//					sc.nextLine();
//				}
//			}
//			System.out.println("Bạn có muốn nhập tiếp không? [Y/N]");
//			String as = sc.nextLine();
//			System.out.println(as);
//			count++;
//			if (!(as.equalsIgnoreCase("yes") || as.equalsIgnoreCase("y"))) {
//				System.out.println("bye ");
//				break;
//			}
//		}
//		sc.close();
//		s.printListStudent();
	}

}
