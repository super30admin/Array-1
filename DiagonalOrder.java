//https://leetcode.com/problems/diagonal-traverse/
/*
Time: O(m*n) where m=rows and n=columns
Space: O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class DiagonalOrder {

    public static int[] findDiagonalorder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m * n];
        int index = 0, row = 0, col = 0;
        boolean up = true;

        while (row < m && col < n) {
            if (up) {
                while (row > 0 && col < n - 1) {
                    result[index++] = matrix[row][col];
                    row--;
                    col++;
                }
                result[index++] = matrix[row][col];
                if (col == n - 1)
                    row++;
                else
                    col++;

            }

            else {

                while (col > 0 && row < n - 1) {
                    result[index++] = matrix[row][col];
                    col--;
                    row++;
                }
                result[index++] = matrix[row][col];
                if (row == m - 1)
                    col++;
                else
                    row++;

            }

            up = !up;
        }

        return result;
    }

}
