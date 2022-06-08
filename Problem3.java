import java.util.ArrayList;
import java.util.List;

class Problem3 {
    // Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        List<Integer> res = new ArrayList<>();

        while (left <= right && top <= bottom) {
            for (int j = left; j <= right; j++) {
                res.add(matrix[top][j]);
            }
            top++;

            if (top > bottom) {
                break;
            }

            for (int j = top; j <= bottom; j++) {
                res.add(matrix[j][right]);
            }

            right--;

            if (left > right) {
                break;
            }

            for (int j = right; j >= left; j--) {
                res.add(matrix[bottom][j]);
            }
            bottom--;

            if (top > bottom) {
                break;
            }

            for (int j = bottom; j >= top; j--) {
                res.add(matrix[j][left]);
            }
            left++;
        }

        return res;

    }
}