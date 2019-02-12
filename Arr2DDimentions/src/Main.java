import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arr2DDimentions arr2dDimentions = new Arr2DDimentions();
		long arr[] = { 1, 2, 3, 4, 2, 1, 4 };
		arr2dDimentions.inTT();
		System.out.println(Arrays.toString(arr));
		int pos = Arrays.binarySearch(arr, 10);
//		Arrays.sort
		System.out.println(pos);
	}

}
