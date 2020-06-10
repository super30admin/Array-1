// Time Complexity : O(m*n). m is the length of the array. n is the length of the first row(column length)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> resultArrayList = new ArrayList();
		if (matrix == null || matrix.length == 0)
			return resultArrayList;
        
		int top = 0, left = 0, right = matrix[0].length - 1, bottom = matrix.length - 1;
		while (top <= bottom && left <= right) {
			for (int i = left; i <=right; i++) {
				resultArrayList.add(matrix[top][i]);
			}
			top++;

			for (int i = top; i <=bottom; i++) {
				resultArrayList.add(matrix[i][right]);
			}
			right--;

			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					resultArrayList.add(matrix[bottom][i]);
				}

			}
			bottom--;

			if (left <= right) {

				for (int i = bottom; i >= top; i--) {

					resultArrayList.add(matrix[i][left]);

				}

			}

			left++;

		}
		return resultArrayList;
    }
}
