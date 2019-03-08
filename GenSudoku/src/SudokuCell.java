import java.util.Arrays;

public class SudokuCell {
	public int value;
	public int indexI;
	public int indexJ;
	public int[] khaNang;

	public SudokuCell() {
		this.khaNang = new int[9];
		for (int i = 0; i < 9; i++) {
			khaNang[i] = (int) (Math.random() * 9 + 1);
		}
	}
}
