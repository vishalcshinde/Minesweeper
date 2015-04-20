package minesweeper;

import java.util.HashSet;
import java.util.Set;

class MinesweeperLogic {
	CheckMine[] checkMines = { new CheckMineLeft(), new CheckMineRight(),
			new CheckMineDown(), new CheckMineUp() };
	Set<Position> positions = new HashSet<Position>();

	int getMineCount(int row, int col, String[][] input, int[][] output) {
		int count = 0;
		positions.clear();
		for (CheckMine checkMine : checkMines) {
			positions.addAll(checkMine.getMinePositions(row, col, input));
		}
		output[row][col] = positions.size();
		return count;
	}

}