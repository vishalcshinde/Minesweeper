package minesweeper;

import java.util.HashSet;
import java.util.Set;

class CheckMineLeft implements CheckMine {
	public Set<Position> getMinePositions(int row, int col, String[][] matrix) {
		Set<Position> positions = new HashSet<Position>();
		col = col - 1;
		row = row - 1;
		if (col < 0) {
			return positions;
		}
		if (row < 0) {
			row = 0;
		}
		for (int i = row; i < row + 2 && i < matrix.length; i++) {
			if (matrix[i][col].equals("*")) {
				positions.add(new Position(col, i));
			}
		}
		return positions;
	}

}