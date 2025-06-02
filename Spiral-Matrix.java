// Approach:
// Traverse the matrix in spiral order by maintaining four boundaries:
// top, bottom, left, right. At each step, move in one direction and
// shrink the boundary accordingly until all elements are traversed.

// Time Complexity : O(m * n) - All elements are visited once
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        // Edge case: empty matrix
        if (matrix.length == 0) return res;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        // Continue while boundaries are valid
        while (top <= bottom && left <= right) {
            // Traverse from left to right on the top row
            for (int j = left; j <= right; j++)
                res.add(matrix[top][j]);
            top++; // Move top boundary down

            // Traverse from top to bottom on the right column
            for (int i = top; i <= bottom; i++)
                res.add(matrix[i][right]);
            right--; // Move right boundary left

            // Traverse from right to left on the bottom row
            if (top <= bottom) {
                for (int j = right; j >= left; j--)
                    res.add(matrix[bottom][j]);
                bottom--; // Move bottom boundary up
            }

            // Traverse from bottom to top on the left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    res.add(matrix[i][left]);
                left++; // Move left boundary right
            }
        }

        return res;
    }
}
