import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(m x n)
// Space Complexity : O(m x n)
// Did this code successfully run on Leetcode : Yes

// We perform traversal of in order of: 
// top row => right column => bottom row => left column
// We do this in iterative way and 
// in each iteration we move our boundry points (top, right, bottom,left) 1 step closer to the center of matrix
// As we do iterative approch we need to check boundry conditions before every traversal
class Solution3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return null;

        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, right = n - 1, bottom = m - 1, left = 0;

        while (top <= bottom && left <= right) {
            // top row traversal
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            if (left <= right) {
                // right column traversal
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }

            if (top <= bottom) {
                // bottom row traversal
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                // left column traversal
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}