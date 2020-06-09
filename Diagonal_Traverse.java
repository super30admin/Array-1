// Time Complexity : O(M*N)
// Space Complexity : O(1)[No Auxillary Space Used]
// Did this code successfully run on Leetcode : Yes

import java.util.Arrays;

public class Diagonal_Traverse {
	/*
	 * This function iterates through the matrix in both the directions and checks
	 * for various condition such as if we have reached the first/last row or last
	 * column and increments or decrements the rows and columns accordingly and
	 * changes directions and each element in the matrix is added to the result
	 * array
	 */
	public static int[] findDiagonalOrder(int[][] matrix) {
		if (matrix == null || matrix.length == 0)
			return new int[0];
		int i = 0;
		int row = 0;
		int column = 0;
		int dir = 1;
		int m = matrix.length;
		int n = matrix[0].length;
		int[] result = new int[m * n];
		while (i < m * n) {
			result[i] = matrix[row][column];
			if (dir == 1) {
				if (column == n - 1) {
					row++;
					dir = -1;
				} else if (row == 0) {
					column++;
					dir = -1;
				} else {
					row--;
					column++;
				}
			} else {
				if (row == m - 1) {
					column++;
					dir = 1;
				} else if (column == 0) {
					row++;
					dir = 1;
				} else {
					column--;
					row++;
				}
			}
			i++;
		}
		return result;
	}

	public static void main(String[] args) {
		int nums[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int result[] = findDiagonalOrder(nums);
		System.out.println(Arrays.toString(result));
	}
}