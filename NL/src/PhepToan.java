
public class PhepToan {
	private String numA, numB;

	public PhepToan(String numA, String numB) {
		this.numA = numA;
		this.numB = numB;
	}

	public double chia() throws Exception {
		if (numB == null || numA == null) {
			throw new NullPointerException("numB = null");
		}
		// TODO: handle exception
		try {
			int soA = Integer.parseInt(numA);
			int soB = Integer.parseInt(numB);
			if(soB == 0) {
				throw new ArithmeticException("soB = 0");
			}
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		int soA = Integer.parseInt(numA);
		int soB = Integer.parseInt(numB);
		return soA * 1F / soB;
	}

}
