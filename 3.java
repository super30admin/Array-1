//Space and Time: O(m*n)
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return output;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Move right
            for (int j = left; j <= right; j++) {
                output.add(matrix[top][j]);
            }
            top++;

            // Move down
            for (int i = top; i <= bottom; i++) {
                output.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                // Move left
                for (int j = right; j >= left; j--) {
                    output.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                // Move up
                for (int i = bottom; i >= top; i--) {
                    output.add(matrix[i][left]);
                }
                left++;
            }
        }

        return output;
    }
}
