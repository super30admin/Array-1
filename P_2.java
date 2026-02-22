// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Start from top-left and move diagonally across the matrix.
// Alternate between moving up-right and down-left.
// Change direction whenever a boundary is reached.


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; //row
        int n = mat[0].length; //col

        int[] result = new int[m * n];
        int r = 0;
        int c = 0;

        boolean dir = true;

        for (int i = 0; i < m * n; i++) {
            result[i] = mat[r][c];
            if (dir) {
                if (c == n - 1) {
                    r++;
                    dir = false;
                } else if (r == 0) {
                    c++;
                    dir = false;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == m - 1) {
                    c++;
                    dir = true;
                } else if (c == 0) {
                    r++;
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