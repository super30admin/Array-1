import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) return new ArrayList<>();
        
        int n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Traverse from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse from bottom to top
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
