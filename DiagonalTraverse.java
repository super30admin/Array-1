// Time Complexity : O(mn) , m * n is the length of 2D input array
// Space Complexity : O(1), no additional space apart from input and returning array
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english: using boundary conditions of direction to increment row and column
// accordingly to match a diagonal traversal

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        // base case
        if (mat == null || mat.length == 0) {
            return new int[] {};
        }

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int r = 0, c = 0;
        int idx = 0;
        int dir = 1; // 1 -> upward, -1 -> downward
        result[0] = mat[r][c];
        while (idx < m*n && r < m && c < n) {
            result[idx] = mat[r][c];
            if ( dir == 1) { // going up
                if (c == n-1) {
                    dir = -1;
                    r++;
                } else if( r == 0) {
                    dir = -1;
                    c++;
                } else {
                    r--;
                    c++;
                }

            } else { // going down
                if (r == m-1) {
                    dir = 1;
                    c++;

                } else if (c == 0) {
                    dir = 1;
                    r++;
                } else {
                    r++;
                    c--;
                }
            }
            idx++;

        }
        return result;
    }
}