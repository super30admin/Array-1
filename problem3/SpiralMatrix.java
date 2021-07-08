// Time Complexity : O(m*n), m -> Number of rows, n -> Number fo columns
// Space Complexity : O(1), Only output array is created.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

package problem3;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> ans = new ArrayList<Integer>();
		if (matrix == null || matrix.length == 0) {
			return ans;
		}

		int rowStart = 0;
		int rowEnd = matrix.length - 1;
		int colStart = 0;
		int colEnd = matrix[0].length - 1;

		while (rowStart <= rowEnd && colStart <= colEnd) {
			for (int col = colStart; col <= colEnd; col++) {
				ans.add(matrix[rowStart][col]);
			}

			for (int row = rowStart + 1; row <= rowEnd; row++) {
				ans.add(matrix[row][colEnd]);
			}

			if (rowStart < rowEnd && colStart < colEnd) {
				for (int col = colEnd - 1; col > colStart; col--) {
					ans.add(matrix[rowEnd][col]);
				}

				for (int row = rowEnd; row > rowStart; row--) {
					ans.add(matrix[row][colStart]);
				}
			}

			rowStart++;
			rowEnd--;
			colStart++;
			colEnd--;
		}
		return ans;
	}

	public static void main(String[] args) {
		SpiralMatrix obj = new SpiralMatrix();
		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		List<Integer> spiralMatrix = obj.spiralOrder(matrix);
		System.out.println("Matrix in spiral order: ");
		for (Integer element : spiralMatrix) {
			System.out.print(element + " ");
		}
	}

}
