
public class Arr2DDimentions {
	private int arr2D[][];

	public Arr2DDimentions() {
		this.arr2D = new int[][] { 
			{ 1, 2, 3, 4, 2 }, 
			{ 1, 4, 3, 2, 5 }, 
			{ 1, 2, 5, 4, 3 }, 
			{ 2, 4, 1, 3, 5 } };
	}

	public void duyet() {
		int arr[] = new int[arr2D.length];
		for (int i = 0; i < arr2D.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr2D[0].length; j++) {
				sum += arr2D[i][j];
			}
			arr[i] = sum;
			System.err.println("Sum of row " + (i + 1) + " " + arr[i]);
		}

	}
}
