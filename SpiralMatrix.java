// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Approach - We define four pointers to set the left, right, top and bottom boundaries and navigate in the spiral manner

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;

        int left = 0;
        int right = c - 1;
        int top = 0;
        int bottom = r - 1;

        while (left <= right && top <= bottom) {

            // Move from left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }

            top++;

            // Move from Top to Bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }

            right--;

            if (top <= bottom) {
                // Move from right to left
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                // Move from bottom to up
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}