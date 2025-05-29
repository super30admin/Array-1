/*
Time Complexity : O(m*n)
Space Complexity : O(m*n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
*/

import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        int size = r * c;
        List<Integer> result = new ArrayList<>();
        int count = 0;

        int top = 0;
        int left = 0;
        int right = c - 1;
        int bottom = r - 1;

        while (result.size() < size) {
            // top
            for (int j = left; j <= right && result.size() < size; j++) {
                result.add(matrix[top][j]);
                count++;
            }
            top++;

            // right
            for (int i = top; i <= bottom && result.size() < size; i++) {
                result.add(matrix[i][right]);
                count++;
            }
            right--;

            // bottom
            for (int j = right; j >= left && result.size() < size; j--) {
                result.add(matrix[bottom][j]);
                count++;
            }
            bottom--;

            // left
            for (int i = bottom; i >= top && result.size() < size; i--) {
                result.add(matrix[i][left]);
                count++;
            }
            left++;

        }

        return result;
    }
}

/// space complexity for recursion -> min(r,c)/2
