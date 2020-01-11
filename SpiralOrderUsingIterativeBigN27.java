//Time complexity is o(row*column) as we are iterating through the entire matrix
//Space complexity is O(1) as we are not using any extra space
//This code is submitted on leetcode

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderUsingIterativeBigN27 {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
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

		while (top <= bottom && left <= right) {
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
		SpiralOrderUsingIterativeBigN27 spiral = new SpiralOrderUsingIterativeBigN27();
		int[][] matrix = {{ 1, 2, 3 },{ 4, 5, 6 },{ 7, 8, 9 }};
		spiral.spiralOrder(matrix);
	}

}
