// Time Complexity : O(MN) //M rows and N columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/**
 * 1. maintain a boolean variable to know the travel direction
 * 2. handle the boundary conditions. 
 */

import java.util.Arrays;

public class DiagonalTraverse {
	public int[] findDiagonalOrder(int[][] mat) {

		int rows = mat.length;
		int cols = mat[0].length;
		int result[] = new int[rows * cols];

		int i = 0;
		int row = 0;
		int col = 0;
		boolean dir = true; // true means up false means down
		while (i < rows * cols) {
			System.out.println(row + "..." + col + "..." + dir);
			if (dir) {
				result[i] = mat[row][col];
				if (col == cols - 1) {
					row++;
					dir = false;
				} else if (row == 0) {
					col++;
					dir = false;
				} else {
					row--;
					col++;
				}
			} else {
				result[i] = mat[row][col];
				if (row == rows - 1) {
					col++;
					dir = true;
				} else if (col == 0) {
					row++;
					dir = true;
				} else {
					row++;
					col--;
				}
			}
			i++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] mat = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.toString(new DiagonalTraverse().findDiagonalOrder(mat)));
	}
}
