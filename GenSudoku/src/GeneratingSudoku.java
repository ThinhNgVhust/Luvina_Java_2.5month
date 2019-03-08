import java.util.ArrayList;
import java.util.Arrays;

public class GeneratingSudoku {
	private static final int COLS = 9;
	private static final int ROWs = 9;
	ArrayList<SudokuCell> sudokuBoard = new ArrayList<SudokuCell>();

	public GeneratingSudoku() {
		gen();
	}

	private void gen() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 81; i++) {
			SudokuCell sudokuCell = new SudokuCell();
			int indexI = i / 9;
			int indexJ = i % 9;
			sudokuCell.indexI = indexI;
			sudokuCell.indexJ = indexJ;
			this.sudokuBoard.add(sudokuCell);
		}
	}

}
