import java.util.Scanner;

public class Fx {

	private double s;
	private int n;
	double[] arr = new double[10];
//	double[] arr1 = new double[10];

	public Fx(int degree) {
		this.n = degree;
	}

	public void getFormal() {
		for (int i = 0; i <= this.n; i++) {
			System.out.println("Enter a double type number: ");
			Scanner keyBoard = new Scanner(System.in);
			arr[i] = keyBoard.nextDouble();
			keyBoard.nextLine();
//			arr1[i] = (arr[i]) / (i + 1);
		}
	}

	public double getS(double canDuoi, double canTren) {
		double a = canDuoi;
		double b = canTren;
		double dx = 0.0001;
		for (double x = a; x <= b; x += dx) {
			for (int i = 0; i <= this.n; i++) {
				this.s += (arr[i]) * Math.pow(x, i) * dx;
			}
		}
		return this.s;
	}
}
