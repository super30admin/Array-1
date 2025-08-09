// Time Complexity : O(m*n)   (We visit every element once)
// Space Complexity: O(m*n)   (result array to store all elements in diagonal order)
// Did this code successfully run on Leetcode? : Yes
// Any problem you faced while coding this : No

// Approach:
// 1. Use two pointers r (row) and c (column) starting at (0,0).
// 2. Traverse all elements while maintaining direction dir:
//    - When dir == true, move up-right diagonally.
//    - When dir == false, move down-left diagonally.
// 3. Handle boundary conditions to switch directions and move along edges properly.
// 4. Store elements in the result array as we traverse.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int r = 0, c = 0;
        boolean dir = true; // true = moving up-right, false = moving down-left

        for (int i = 0; i < m * n; i++) {
            result[i] = mat[r][c];

            if (dir) { // moving up-right
                if (r == 0 && c != n - 1) {
                    c++;
                    dir = false;
                } else if (c == n - 1) {
                    r++;
                    dir = false;
                } else {
                    r--;
                    c++;
                }
            } else { // moving down-left
                if (c == 0 && r != m - 1) {
                    r++;
                    dir = true;
                } else if (r == m - 1) {
                    c++;
                    dir = true;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}
