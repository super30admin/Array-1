// Time Complexity :O(M*N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

// Your code here  with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return new int[0];

        int m = matrix.length;
        int n = matrix[0].length;

        int[] result = new int[m * n];
        int row = 0;
        int col = 0;
        int d = 1;

        for (int i = 0; i < m * n; i++) {
            result[i] = matrix[row][col];
            row -= d;
            col += d;
            // if out of bottom change direction
            if (row >= m) {
                row = m - 1;
                col += 2;
                d = -d;
            }
            // if out of right change direction
            if (col >= n) {
                col = n - 1;
                row += 2;
                d = -d;
            }
            // if out of top change direction
            if (row < 0) {
                row = 0;
                d = -d;
            }
            // if out of left change direction
            if (col < 0) {
                col = 0;
                d = -d;
            }
        }

        return result;
    }
}