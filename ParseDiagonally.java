// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english


/**
 * when row + col is divisible by 2, then we traverse in upward diagonal.
 * Or else, we traverse the diagonal downwards. In upward case, we have
 * to check if row is 0, if so move col +1, or if col reached n-1, then
 * move row by +1, similarly in the downward case when row reach m-1, move
 * col by +1. when col reach 0, move row by +1, else col--, row++.
 *
 */
public class ParseDiagonally {
	public int[] findDiagonalOrder(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		int[] answer = new int[m * n];
		int col = 0, row = 0;
		for (int i = 0; i < m * n; i++) {
			answer[i] = mat[row][col];
			if ((row + col) % 2 == 0) {
				if (col == n - 1)
					row++;
				else if (row == 0)
					col++;
				else {
					row--;
					col++;
				}
			} else {
				if (row == m - 1)
					col++;
				else if (col == 0)
					row++;
				else {
					row++;
					col--;
				}
			}
		}

		return answer;
	}
}
