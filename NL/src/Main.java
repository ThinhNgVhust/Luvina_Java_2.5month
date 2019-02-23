
public class Main {

	public static void main(String[] args) {
		PhepToan phepToan = new PhepToan("10", "0");
		try {
			double kq = phepToan.chia();
			System.out.println(kq);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("Thinh");
	}

}