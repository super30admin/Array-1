// Time Complexity : O(MN)
// Space Complexity : O(MN)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int[] ans = new int[m * n];

        int row = 0;
        int col = 0;
        int z = 0;

        boolean up = true;

        while(row < m && col < n) {

            if(up) {

                while(row > 0 && col < n - 1) {
                    ans[z++] = mat[row--][col++];
                }

                // Hit the first row  or last column
                ans[z++] = mat[row][col];

                // This is Imp
                // Always put extreme condition first
                if (col == n-1) row++;
                else col++; // If last col then move to next row

            } else {
                // If moving in down direction
                while(row < m - 1 && col > 0) {
                    ans[z++] = mat[row++][col--];
                }
                // you reached last row or first col
                ans[z++] = mat[row][col];
                if(row == m-1) col++;
                else row++;
            }

            up = !up;
        }

        return ans;

    }
}