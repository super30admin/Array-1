// Time Complexity : O(mn) as we traverse through whole matrix
// Space Complexity : O(1) No extra space is used
// Did this code successfully run on Leetcode : Yes

import java.util.*;

public class spiralMatrixTraverse {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = n - 1, bottom = m - 1, top = 0;
        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {
            // traversing on the row from left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // traversing on the col from top to bottom on the right side of matrix
            if (top <= bottom && left <= right) {
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
            }
            right--;

            // traversing on the row from right to left
            if (top <= bottom && left <= right) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;

            // traversing on the col from bottom to top
            if (top <= bottom && left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }

        return result;
    }

    public static void main(String[] args) {
        spiralMatrixTraverse smt = new spiralMatrixTraverse();
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(smt.spiralOrder(matrix).toString());
    }
}
