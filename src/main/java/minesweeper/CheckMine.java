package minesweeper;

import java.util.Set;

interface CheckMine {
	public Set<Position> getMinePositions(int row, int col, String[][] matrix);

}