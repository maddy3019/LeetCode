/**
 * @author Maddy
 * Ver 1.0 Sep 26, 2017 12:24:29 AM
 * Determine the perimeter of the island.
 * Ex 1:
 * [[0,1,0,0],
 *  [1,1,1,0],
 *  [0,1,0,0],
 *  [1,1,0,0]]
 * Answer: 16 
 */

package LeetCode.Google;

import java.util.Scanner;

public class IslandPerimeter {

	/**
	 * @param args
	 */
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
