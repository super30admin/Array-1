import java.util.ArrayList;
import java.util.List;

// Time: O(rows * columns)
// Space: O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        // Initialize directions
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;
        while (top <= bottom && left <= right) {
            if (top <= bottom && left <= right) {
                // move right
                for (int i = left; i <= right; i ++) {
                    result.add(matrix[top][i]);
                }
                top ++;
            }
            if (top <= bottom && left <= right) {
                // move down
                for (int i = top; i <= bottom; i ++) {
                    result.add(matrix[i][right]);
                }
                right --;
            }
            if (top <= bottom && left <= right) {
                // move left
                for (int i = right; i >= left; i --) {
                    result.add(matrix[bottom][i]);
                }
                bottom --;
            }
            if (top <= bottom && left <= right) {
                // move up
                for (int i = bottom; i >= top; i --) {
                    result.add(matrix[i][left]);
                }
                left ++;
            }
        }
        return result;
    }
}