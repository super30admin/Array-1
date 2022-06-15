// Time Complexity: O(m+n)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: Yes, Took reference for one level deep condition

import java.util.List;
import java.util.ArrayList;

public class spiralOrder {

    public static List<Integer> getSpiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int r = matrix.length; // Row
        int c = matrix[0].length; // Column

        int left = 0;
        int right = r - 1;
        int top = 0;
        int bottom = c - 1;

        while (left <= right && top <= bottom) {

            // Top row traversal
            for (int k = left; k <= right; k++) {
                result.add(matrix[top][k]);
            }
            top++;

            // right column traversal
            for (int k = top; k <= bottom; k++) {
                result.add(matrix[k][right]);
            }
            right--;

            // Handling case when pointer is inside one level
            if (top <= bottom) {
                // Bottom Row traversal
                for (int k = right; k >= left; k--) {
                    result.add(matrix[bottom][k]);
                }
            }
            bottom--;

            // Handling case when pointer is inside one level
            if (left <= right) {
                // Left column traversal
                for (int k = bottom; k >= top; k--) {
                    result.add(matrix[k][left]);
                }
            }
            left++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println(getSpiralOrder(matrix));
    }
}
