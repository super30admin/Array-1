// Time Complexity : O(m*n), m -> Number of rows, n -> Number fo columns
// Space Complexity : O(1), Only output array is created.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem2;

public class DiagonalTraverse {
	public int[] findDiagonalOrder(int[][] mat) {
		if (mat == null || mat.length == 0) {
			return new int[0];
		}

		int m = mat.length;
		int n = mat[0].length;

		int[] ans = new int[m * n];

		int curRow = 0;
		int curCol = 0;

		for (int i = 0; i < ans.length; i++) {
			ans[i] = mat[curRow][curCol];
			if ((curRow + curCol) % 2 == 0) {
				if (curCol == n - 1) {
					curRow++;
				} else if (curRow == 0) {
					curCol++;
				} else {
					curRow--;
					curCol++;
				}
			} else {
				if (curRow == m - 1) {
					curCol++;
				} else if (curCol == 0) {
					curRow++;
				} else {
					curRow++;
					curCol--;
				}
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		DiagonalTraverse obj = new DiagonalTraverse();
		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] spiralMatrix = obj.findDiagonalOrder(matrix);
		System.out.println("Matrix in spiral order: ");
		for (Integer element : spiralMatrix) {
			System.out.print(element + " ");
		}
	}

}
