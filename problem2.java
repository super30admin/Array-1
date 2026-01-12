// Time Complexity : O(m*n)
// Space Complexity : O(1)  (only output array used)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Only tricky part is direction change and boundary handling.


// Your code here along with comments explaining your approach in three sentences only
// I move diagonally up-right and down-left alternatively using direction flag.
// Whenever I hit a boundary, I shift to the next valid cell (right or down) and flip direction.
// I continue until I collect all m*n elements.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int[] ans = new int[m * n];
        int r = 0, c = 0;
        int dir = 1; // 1 means up-right, -1 means down-left
        int idx = 0;

        while (idx < m * n) {

            ans[idx++] = mat[r][c];

            // moving up-right
            if (dir == 1) {
                if (c == n - 1) {        // hit right wall
                    r++;
                    dir = -1;
                } else if (r == 0) {     // hit top wall
                    c++;
                    dir = -1;
                } else {
                    r--;
                    c++;
                }
            }
            // moving down-left
            else {
                if (r == m - 1) {        // hit bottom wall
                    c++;
                    dir = 1;
                } else if (c == 0) {     // hit left wall
                    r++;
                    dir = 1;
                } else {
                    r++;
                    c--;
                }
            }
        }

        return ans;
    }
}