import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    // Time: O(m*n), Space: O(1)
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, bottom = matrix.length-1, left = 0, right = matrix[0].length-1;
        List<Integer> ans = new ArrayList();

        while (top <= bottom && left <= right) {
            // move right
            if (top <= bottom && left <= right)
                for (int i = left; i <= right; i++) {
                    ans.add(matrix[top][i]);
                }
            top++;
            // move down
            if (top <= bottom && left <= right)
                for (int i = top; i <= bottom; i++) {
                    ans.add(matrix[i][right]);
                }
            right--;
            // move left
            if (top <= bottom && left <= right)
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
            bottom--;
            // move up
            if (top <= bottom && left <= right)
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
            left++;
        }
        return ans;
    }
}
