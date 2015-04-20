package minesweeper;

import java.util.HashSet;
import java.util.Set;

class CheckMineUp implements CheckMine {
	public Set<Position> getMinePositions(int row, int col, String[][] matrix) {
		Set<Position> positions = new HashSet<Position>();
		col = col - 1;
		row = row - 1;
		if (row < 0) {
			return positions;
		}
		if (col < 0) {
			col = 0;
		}
		for (int i = col; i < col + 2 && i < matrix[0].length; i++) {
			if (matrix[row][i].equals("*")) {
				positions.add(new Position(i, row));
			}
		}
		return positions;
	}

}