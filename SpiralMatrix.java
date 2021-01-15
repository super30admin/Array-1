import java.util.*;

//Time Complexity : o(n*m)
//Space Complexity : o(1)
//Did this code successfully run on Leetcode : Yes
public class SpiralMatrix {

	public List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> result = new ArrayList<>();
		if (matrix == null || matrix.length == 0)
			return result;

		int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

		while (top <= bottom && left <= right) {
			//top row
			for (int i = left; i <= right; i++) {
				result.add(matrix[top][i]);
			}
			top++;
			//last column
			for (int i = top; i <= bottom; i++) {
				result.add(matrix[i][right]);
			}
			right--;
			// bridge the condition
			if (top <= bottom) {
				//bottom row
				for (int i = right; i >= left; i--) {
					result.add(matrix[bottom][i]);
				}
			}
			bottom--;
			// bridge the condition
			if (left <= right) {
				//first column
				for (int i = bottom; i >= top; i--) {
					result.add(matrix[i][left]);
				}
			}
			left++;
		}
		return result;
	}

}
