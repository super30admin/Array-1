// Time Complexity : O(m*n)
// Space Complexity : O(1) since the result array itself is expected as the output.
// Did this code successfully run on Leetcode : yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[] {};
        }

        int m = mat.length; // no.of rows
        int n = mat[0].length; // no. of columns

        int index = 0;
        int[] result = new int[m * n]; // result with the length of total no. of elements.

        int row = 0; // always start at row=0 &col=0 , frist element.
        int col = 0;
        int dir = 1; // 1=upward, -1=downward

        while (index < m * n) {
            result[index] = mat[row][col];
            index++;
            if (dir == 1) { // upward direction
                if (col == n - 1) { // stopping condition 1.
                    dir = -1;
                    row++;
                } else if (row == 0) // stopping condition 2.
                {
                    dir = -1;
                    col++;
                } else { // general case
                    row--;
                    col++;
                }
            } else { // downward direction
                if (row == m - 1) { // stopping condition 1.
                    dir = 1;
                    col++;
                } else if (col == 0) { // stopping condition 2.
                    dir = 1;
                    row++;
                } else { // general case.
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}