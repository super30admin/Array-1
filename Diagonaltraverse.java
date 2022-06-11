// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Keep two directions up and down. Starting of the 2D matrix you go up if the row is 0 then you increment the column if not decrement the row and increment column. If its the nth column then jusr increment the row and change the direction to down. Same approach for the direction down but just change the row and column accordingly.

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int result[] = new int[m * n];
        int i = 0;
        int j = 0;
        int idx = 0;
        int dir = 1;
        while (idx < m * n) {
            result[idx] = mat[i][j];
            idx++;
            if (dir == 1) {
                if (i == 0 && j != n - 1) {
                    j++;
                    dir = -1;
                } else if (j == n - 1) {
                    i++;
                    dir = -1;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (j == 0 && i != m - 1) {
                    i++;
                    dir = 1;
                } else if (i == m - 1) {
                    j++;
                    dir = 1;
                } else {
                    j--;
                    i++;
                }
            }
        }
        return result;
    }
}