package LeetCode;

import java.util.Scanner;

public class IslandPerimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] grid = new int[row][col];
		for (int a = 0; a < row; a++) {
			for (int b = 0; b < col; b++) {
				grid[a][b] = sc.nextInt();
			}
		}
		int islands = 0, neighbours = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					islands++;
					if (i < grid.length - 1 && grid[i + 1][j] == 1)
						neighbours++;
					if (j < grid[i].length - 1 && grid[i][j + 1] == 1)
						neighbours++;
				}
			}
		}
		System.out.println(islands * 4 - neighbours * 2);
	}

}
