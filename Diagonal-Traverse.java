// Approach:
// Traverse a 2D matrix in a diagonal zig-zag manner starting from top-left.
// Use a boolean flag `down` to switch between moving up-right and down-left.
// Carefully handle boundaries when reaching matrix edges to shift direction.

// Time Complexity :O(m * n) - Every element is visited exactly once
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];
        int idx = 0;

        // Handle edge cases when matrix has only 1 row or 1 column
        if (m == 1 && n == 1) {
            ans[idx] = mat[0][0];
            return ans;
        } else if (m == 1) {
            for (int i = 0; i < n; i++) {
                ans[idx++] = mat[0][i];
            }
            return ans;
        } else if (n == 1) {
            for (int i = 0; i < m; i++) {
                ans[idx++] = mat[i][0];
            }
            return ans;
        }

        // Start from position (0, 0)
        ans[idx++] = mat[0][0];
        boolean down = true; // true = going down-left, false = going up-right
        int i = 0, j = 1;

        while (i != m && j != n) {
            if (down) {
                // Move down-left along the diagonal
                while (i < m && j >= 0) {
                    ans[idx++] = mat[i][j];
                    i++;
                    j--;
                }

                // Adjust boundaries after down-left movement
                if (i >= m) {
                    i--;        // Step back in bounds
                    j += 2;     // Move right by 2 to enter new diagonal
                } else {
                    j++;        // Move to the next column
                }
                down = false;    // Change direction
            } else {
                // Move up-right along the diagonal
                while (i >= 0 && j < n) {
                    ans[idx++] = mat[i][j];
                    i--;
                    j++;
                }

                // Adjust boundaries after up-right movement
                if (j >= n) {
                    i += 2;      // Move down by 2
                    j--;         // Step back in bounds
                } else {
                    i++;         // Move to next row
                }
                down = true;     // Change direction
            }
        }

        return ans;
    }
}
