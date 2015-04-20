package minesweeper;

import java.util.HashSet;
import java.util.Set;

class MinesweeperLogic {
	CheckMine[] checkMines = { new CheckMineLeft(), new CheckMineRight(),
			new CheckMineDown(), new CheckMineUp() };
	Set<Position> positions = new HashSet<Position>();

	int getMineCount(int row, int col, String[][] input) {
		positions.clear();
		for (CheckMine checkMine : checkMines) {
			positions.addAll(checkMine.getMinePositions(row, col, input));
		}
		return positions.size();
	}

}