import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> resultList = new ArrayList<>();
            int left = 0;
            int right = matrix[0].length - 1;
            int top = 0;
            int bottom = matrix.length - 1;
            while (left <= right && top <= bottom) {
                // Top Row
                for (int j = left; j <= right; j++) {
                    resultList.add(matrix[top][j]);
                }
                top++;

                // Right Col
                // top bottom handled by loop
                for (int i = top; i <= bottom; i++) {
                    resultList.add(matrix[i][right]);
                }
                right--;

                // Bottom Row
                // right left handled by loop
                if (top <= bottom) {
                    for (int j = right; j >= left; j--) {
                        resultList.add(matrix[bottom][j]);
                    }
                    bottom--;
                }

                // Left Col
                // top bottom handled by loop
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        resultList.add(matrix[i][left]);
                    }
                    left++;
                }
            }
            return resultList;
        }
    }
}
