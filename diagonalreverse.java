// Time Complexity :O(m*n)
// Space Complexity :O(m*n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int i = 0;
        int j = 0;
        boolean dir = true;
        int[] result = new int[m * n];
        for (int idx = 0; idx < m * n; idx++) {
            result[idx] = mat[i][j];
            if (dir) {
                if (i == 0 && j != n - 1) {
                    j++;
                    dir = false;
                } else if (j == n - 1) {
                    i++;
                    dir = false;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (j == 0 && i != m - 1) {
                    i++;
                    dir = true;
                } else if (i == m - 1) {
                    j++;
                    dir = true;
                } else {
                    j--;
                    i++;
                }
            }
        }
        return result;
    }
}
