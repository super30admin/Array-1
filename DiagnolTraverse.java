// Time Complexity : O(n) n is the number of elements in the matrix.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: we check for boundaries while moving in two directions in the matrix to print the elemnts. 

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length, i = 0, j = 0;
        boolean dir = true;
        int[] result = new int[m * n];
        if (mat == null || mat.length == 0)
            return result;
        for (int k = 0; k < result.length; k++) {
            result[k] = mat[i][j];
            if (dir) {
                if (j == n - 1) {
                    i++;
                    dir = false;
                } else if (i == 0) {
                    j++;
                    dir = false;
                } else {
                    i--;
                    j++;
                }

            } else {
                if (i == m - 1) {
                    j++;
                    dir = true;
                } else if (j == 0) {
                    i++;
                    dir = true;
                } else {
                    i++;
                    j--;
                }

            }
        }
        return result;
    }
}
