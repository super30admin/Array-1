// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.List;
import java.util.ArrayList;

public class Spiral_Matrix {
	/*
	 * In this function we iterate through the matrix in spiral order, we assign
	 * boundaries and keep updating the boundaries as we are iterating through the
	 * matrix, during each iteration we add the elements onto our list which is
	 * returned in the end
	 */
	public static List<Integer> spiralOrder(int[][] matrix) {
		if (matrix.length == 0)
			return new ArrayList<>();

		int totalSize = matrix.length * matrix[0].length;
		List<Integer> res = new ArrayList<>(totalSize);

		int left = 0, top = 0, right = matrix[0].length - 1, bottom = matrix.length - 1;

		left--; // Skip initial increment
		while (res.size() < totalSize) {
			// go right
			for (int i = ++left; i <= right && top <= bottom; i++) {
				res.add(matrix[top][i]);
			}
			// go down
			for (int i = ++top; i <= bottom && left <= right; i++) {
				res.add(matrix[i][right]);
			}
			// go left
			for (int i = --right; i >= left && top <= bottom; i--) {
				res.add(matrix[bottom][i]);
			}
			// go up
			for (int i = --bottom; i >= top && left <= right; i--) {
				res.add(matrix[i][left]);
			}
		}

		return res;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		list = spiralOrder(matrix);
		System.out.println(list);
	}
}