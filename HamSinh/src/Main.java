
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i <= 25; i++) {
			for (int j = 0; j <= 25; j++) {
				for (int j2 = 0; j2 <= 25; j2++) {
					for (int k = 0; k <= 25; k++) {
						if (i + j + j2 + k == 25)
							System.out.println(i + " " + j + " " + j2 + " " + k);
						sum++;
					}
				}
			}
		}
		System.out.println(sum);
	}

}
