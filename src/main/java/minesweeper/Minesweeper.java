package minesweeper;

import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		sc.close();
		String[][] input = new String[rows][cols];
		for (int row = 0; row < input.length; row++) {
			for (int col = 0; col < input[row].length; col++) {
				input[row][col] = ".";
			}
		}
		Random random = new Random();
		for (int i = 0; i < rows; i++) {
			int rRow = random.nextInt(rows - 1);
			int rCol = random.nextInt(cols - 1);
			input[rRow][rCol] = "*";
		}
		random.nextInt(rows);
		MinesweeperLogic logic = new MinesweeperLogic();
		for (int i = 0; i < input.length; i++) {
			System.out.println();
			for (int j = 0; j < input[0].length; j++) {
				System.out.print(input[i][j]);
			}
		}
		System.out.println("\n\n\n");
		for (int row = 0; row < input.length; row++) {
			System.out.println();
			for (int col = 0; col < input[row].length; col++) {
				if (!input[row][col].equals("*")) {
					System.out.print(logic.getMineCount(row, col, input));
				} else {
					System.out.print("*");
				}
				

			}
		}
	}
}
