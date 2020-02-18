// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes

// Used up and down direction for determining the row and column. If direction is up then we increment column and decrement row. Similarly if we are moving down then increment row and decrement column. Corner cases include id column, row are edges then we change the direction 

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int row = 0, col = 0, direction = 1;

        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m * n];

        int i = 0;
        while (i < m * n) {
            result[i] = matrix[row][col];

            if (direction == 1) {

                if (col == n - 1) {
                    row++;
                    direction = -1;
                } else if (row == 0) {
                    col++;
                    direction = -1;
                } else {
                    row--;
                    col++;
                }

            } else {

                if (row == m - 1) {
                    col++;
                    direction = 1;
                } else if (col == 0) {
                    row++;
                    direction = 1;
                } else {
                    row++;
                    col--;
                }

            }
            i++;
        }

        return result;
    }
}