// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Approach

// We make use of direction to solve
// based on what direction we are going we increment/ decrement the pointers
// as we traverse and store the value in the result and return it

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0)
            return null;
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m * n];
        int dir = 1;
        int i = 0, index = 0, j = 0;

        while (index < m * n) {
            result[index] = mat[i][j];
            index++;
            if (dir == 1) {
                if (j == n - 1) {
                    dir = -1;
                    i++;
                } else if (i == 0) {
                    dir = -1;
                    j++;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (i == m - 1) {
                    dir = 1;
                    j++;
                } else if (j == 0) {
                    dir = 1;
                    i++;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}