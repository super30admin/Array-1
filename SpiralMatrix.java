// Time Complexity : O(m*n)  (Each element is visited once)
// Space Complexity: O(m*n)  (Output list stores all elements)
// Did this code successfully run on Leetcode? : Yes
// Any problem you faced while coding this : No)

// Approach:
// 1. Use four pointers: top, bottom, left, right to track current edges.
// 2. Traverse top row (left to right), then right column (top to bottom),
//    then bottom row (right to left), then left column (bottom to top).
// 3. After traversing each side, move the pointers inward.
// 4. Repeat until top > bottom or left > right.

import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Traverse bottom row if still valid
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;  // decrement bottom
            }

            // Traverse left column if still valid
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
