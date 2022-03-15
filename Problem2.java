// Time Complexity : O(m*n) where m is the numbers of rows and n is the number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// 1. Define a direction
// 2. Change the direction based on the boundary conditions
// 3. Print the array

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] res = new int[m * n];
        int i = 0, j = 0, index = 0;
        boolean dir = true;

        while (index < m * n) {
            res[index] = mat[i][j];
            if (dir) {
                if (j == n - 1) {
                    dir = false;
                    i += 1;
                } else if (i == 0) {
                    dir = false;
                    j += 1;
                } else {
                    i -= 1;
                    j += 1;
                }
            } else {
                if (i == m - 1) {
                    dir = true;
                    j += 1;
                } else if (j == 0) {
                    dir = true;
                    i += 1;
                } else {
                    j -= 1;
                    i += 1;
                }
            }

            index += 1;
        }
        return res;
    }
}