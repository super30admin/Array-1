import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(m*n)
// Space Complexity : O(1) since the result arraylist itself is expected as the output.
// Did this code successfully run on Leetcode : yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }

        int m = matrix.length; // no. of rows
        int n = matrix[0].length; // no. of columns
        int top = 0; // top starts at first row
        int bottom = m - 1; // bottom starts at last row
        int left = 0; // left starts at first column
        int right = n - 1; // right starts at last column

        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {
            // top row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // right column
            if (left <= right) {
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }

            // bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }

        return result;

    }
}