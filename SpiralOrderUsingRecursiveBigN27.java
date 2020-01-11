//Time complexity is o(row*column) as we are iterating through the entire matrix
//Space complexity is O(min(row/2, colum/2)) as it will depend on the number of boxes which is O(n) linear recursive space.
//This code is submitted on leetcode

import java.util.ArrayList;
import java.util.List;
public class SpiralOrderUsingRecursiveBigN27 {
	List<Integer> result = new ArrayList<>();

	public List<Integer> spiralOrder(int[][] matrix) {
		// edge
		if (matrix == null || matrix.length == 0) {
			return result;
		}
		int row = matrix.length;
		int column = matrix[0].length;
		int top = 0;
		int bottom = row - 1;
		int left = 0;
		int right = column - 1;
		helper(matrix, left, right, top, bottom);
		return result;
	}

	private void helper(int[][] matrix, int left, int right, int top, int bottom) {
		if (left > right || top > bottom) {
			return;
		}
		for (int i = left; i <= right; i++) {
			result.add(matrix[left][i]);
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

		if (left <= right) {
			for (int i = bottom; i >= top; i--) {
				result.add(matrix[i][left]);
			}
			left++; 
		}
		helper(matrix, left, right, top, bottom);
	}
	public static void main(String[] args) {
		SpiralOrderUsingRecursiveBigN27 spiral = new SpiralOrderUsingRecursiveBigN27();
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		spiral.spiralOrder(matrix);
	}
}
