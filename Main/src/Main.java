
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tong = 0;
		for (int soTuNhien = 0; soTuNhien < 100; soTuNhien += 2) {
			if (soTuNhien >= 50) {
				break;
			}
			tong += soTuNhien;
		}
		System.out.println("Tong = " + tong);
	}

}
