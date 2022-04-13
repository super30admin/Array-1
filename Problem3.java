import java.util.ArrayList;
import java.util.List;

//Time Complexity O(n)
// Space Complexity O(1)

public class Problem3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        int right = n - 1;
        int bottom = m - 1;
        int top = 0;
        int left = 0;
        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {
            //left to right
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;
            //top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            //right to left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            //bottom to top
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
