// Time Complexity : O(MN) //M rows and N columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/**
 * 1. Handle the boundary conditions. 
 * 2. After checking base condition if variable changed we need to check consitions again.
 */

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {

		int rows = matrix.length;
		int cols = matrix[0].length;
		List<Integer> result = new ArrayList<>(rows * cols);

		int top = 0;
		int bottom = rows - 1;

		int left = 0;
		int right = cols - 1;

		while (top <= bottom && left <= right) {

			for (int i = left; i <= right; i++) {
				result.add(matrix[top][i]);
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				result.add(matrix[i][right]);
			}
			right--;

			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					result.add(matrix[bottom][i]);
				}
				bottom--;
			}

			if(left<=right) {
				for (int i = bottom; i >= top; i--) {
					result.add(matrix[i][left]);
				}
				left++;				
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] nums = new int[][] { { 1, 2}, {3,4 }, {5,6} };
		System.out.println(new SpiralMatrix().spiralOrder(nums));
	}
}
