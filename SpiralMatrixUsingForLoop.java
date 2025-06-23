// Time Complexity : O(m * n) — where m is number of rows and n is number of columns.
// Space Complexity : O(1) — ignoring the output list (res), which is required.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// We use four boundaries: top, bottom, left, and right to simulate a spiral traversal.
// In each iteration, we traverse in four directions:
// left to right (top row), top to bottom (right column),right to left (bottom row), and bottom to top (left column), shrinking the boundaries after each step.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;        // Number of rows
        int n = matrix[0].length;     // Number of columns

        List<Integer> res = new ArrayList<>();

        // Initialize boundaries
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;

        // Continue spiral traversal while boundaries are valid
        while (left <= right && top <= bottom) {

            // Traverse top row from left to right
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++; // move top boundary down

            // Traverse right column from top to bottom
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--; // move right boundary left

            // Traverse bottom row from right to left (only if top hasn't crossed bottom)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--; // move bottom boundary up
            }

            // Traverse left column from bottom to top (only if left hasn't crossed right)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++; // move left boundary right
            }
        }

        return res;
    }
}