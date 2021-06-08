import java.util.ArrayList;
import java.util.List;

/**
 * @author Vishal Puri
 * // Time Complexity : O(n)
 * // Space Complexity : O(1)
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this :
 */

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return null;
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        List<Integer> out = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                out.add(matrix[top][i]);
            top++;
            if (top <= bottom && left <= right) {
                for (int i = top; i <= bottom; i++)
                    out.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom && left <= right) {
                for (int i = right; i >= left; i--)
                    out.add(matrix[bottom][i]);
            }
            bottom--;
            if (top <= bottom && left <= right) {
                for (int i = bottom; i >= top; i--) {
                    out.add(matrix[i][left]);
                }
            }
            left++;
        }
        return out;
    }
}
