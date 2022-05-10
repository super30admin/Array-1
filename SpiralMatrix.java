import java.util.ArrayList;
import java.util.List;

//Time Complexity: O(m * n)
//space Complexity: O(1)
//Leetcode; yes.
public class SpiralMatrix {
        public List<Integer> spiralOrder(int[][] matrix) {
            if (matrix == null || matrix[0].length == 0) {
                return new ArrayList<>();
            }

            List<Integer> result = new ArrayList<>();
            int rows = matrix.length;
            int cols = matrix[0].length;
            int total = rows * cols;
            int r = 0, c = 0;
            int top = 0;
            int left = 0;
            int right = cols -1;
            int bottom = rows -1;
            while (result.size() < total) {

                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
                if (top  <= bottom) {
                    for (int i = right; i >= left; i--) {
                        result.add(matrix[bottom][i]);
                    }
                    bottom--;
                }
                if (left <= right) {
                    for (int i = bottom; i >=top; i--) {
                        result.add(matrix[i][left]);
                    }
                    left++;
                }
            }

            return result;

        }
}
