// Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0)
            return new int[0];

        int m = matrix.length;
        int n = matrix[0].length;

        int[] result = new int[m*n];

        int row = 0, col = 0;
        int dir = 1;
        int i = 0;

        while (i < result.length) {
            result[i] = matrix[row][col];
            i++;

            if (dir == 1) {
                if (col == n - 1) {
                    dir = -1;
                    row++;
                }
                else if (row == 0) {
                    dir = -1;
                    col++;
                }
                else {
                    row--;
                    col++;
                }
            }
            else {
                if (row == m - 1) {
                    dir = 1;
                    col++;
                }
                else if (col == 0) {
                    dir = 1;
                    row++;
                }
                else {
                    row++;
                    col--;
                }
            }
        }

        return result;
    }
}
