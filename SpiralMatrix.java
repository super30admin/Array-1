// Time Complexity: O(m*n)
// Space Complexity: O(m*n)
// Runs on LeetCode: YES

import java.util.ArrayList;
import java.util.List;
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;
        List<Integer> result = new ArrayList<Integer>();

        while (left <= right && top <= bottom) {

            if (left <= right && top <= bottom) {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
            }

            if (left <= right && top <= bottom) {
                for (int j = top; j <= bottom; j++) {
                    result.add(matrix[j][right]);
                }
                right--;
            }

            if (left <= right && top <= bottom) {
                for (int k = right; k >= left; k--) {
                    result.add(matrix[bottom][k]);
                }
                bottom--;
            }

            if (left <= right && top <= bottom) {
                for (int l = bottom; l >= top; l--) {
                    result.add(matrix[l][left]);
                }
                left++;
            }

        }
        return result;
    }
}