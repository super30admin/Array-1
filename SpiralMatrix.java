// Time Complexity : O(m * n), where m = number of rows, n = number of columns
// Space Complexity : O(1) excluding the output list, as we are only using pointers
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// We initialize 4 pointers to define the current boundaries of the matrix.
// We traverse the matrix in the order: left to right, top to bottom, right to left, bottom to top.
// After each directional pass, we move the corresponding boundary inward and repeat until done.

import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;
        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;

        List<Integer> list = new ArrayList<>();

        // Traverse the matrix layer by layer in spiral order
        while (left <= right && top <= bottom) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            // Traverse from right to left, if there are still rows left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse from bottom to top, if there are still columns left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }

    // Main method to test the spiralOrder method
    public static void main(String[] args) {
        SpiralMatrix sm = new SpiralMatrix();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> result = sm.spiralOrder(matrix);
        System.out.println("Spiral Order: " + result);
    }
}